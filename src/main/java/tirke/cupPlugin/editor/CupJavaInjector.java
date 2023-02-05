package tirke.cupPlugin.editor;

import com.intellij.lang.injection.MultiHostInjector;
import com.intellij.lang.injection.MultiHostRegistrar;
import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.util.containers.JBIterable;
import org.jetbrains.annotations.NotNull;
import tirke.cupPlugin.options.CupSettings;
import tirke.cupPlugin.psi.impl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CupJavaInjector implements MultiHostInjector {
    private final CupSettings settings = CupSettings.getInstance();

    @Override
    public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement context) {
        if (!settings.ENABLE_JAVA_INJECTION) return;
        if (!(context instanceof CupJavaImpl)) return;

        PsiFile file = context.getContainingFile();

        registrar.startInjecting(JavaLanguage.INSTANCE);

        // look at initial declarations for package name and imports

        JBIterable<PsiElement> initialDeclarations = SyntaxTraverser.psiTraverser(file)
                .filter(element -> element instanceof CupPackageDeclarationImpl || element instanceof CupImportDeclarationImpl)
                .traverse();

        for (PsiElement host : initialDeclarations) {
            // package and imports
            if (!(host instanceof PsiLanguageInjectionHost)) return;
            registrar.addPlace(null, null, (PsiLanguageInjectionHost) host, new TextRange(0, host.getTextLength()));
        }

        // categorize rest of code blocks

        JBIterable<CupJavaImpl> codeblocks = SyntaxTraverser.psiTraverser(file).filter(CupJavaImpl.class);

        CupJavaImpl parserCode = null;
        CupJavaImpl actionCode = null;
        // TODO: scan with, init with
        List<CupJavaImpl> productions = new ArrayList<>();

        for (CupJavaImpl host : codeblocks) {
            PsiElement hostParent = host.getParent();  // java_code
            PsiElement hostGrandparent = hostParent.getParent();
            if (hostGrandparent instanceof CupParserCodeImpl) {
                parserCode = host;
            } else if (hostGrandparent instanceof CupActionCodeImpl) {
                actionCode = host;
            } else if (hostGrandparent instanceof CupProdPartImpl) {
                productions.add(host);
            }
        }

        // keep track of what to prepend, if any previous blocks aren't there
        StringBuilder runningPrefix = new StringBuilder();

        // look at parser class methods
        runningPrefix.append("public class Parser extends java_cup.runtime.lr_parser {\n");
        if (parserCode != null) {
            registrar.addPlace(
                    runningPrefix.toString(), null,
                    parserCode,
                    new TextRange(0, parserCode.getTextLength())
            );
            runningPrefix.setLength(0);
        }

        // look at action class methods
        runningPrefix.append("class ParserActions {\n");
        if (actionCode != null) {
            registrar.addPlace(
                    runningPrefix.toString(),
                    null,
                    actionCode,
                    new TextRange(0, actionCode.getTextLength())
            );
            runningPrefix.setLength(0);
        }

        // look at rules
        runningPrefix.append("/** @noinspection ALL*/");
        runningPrefix.append("public final void action_code(int CUP$act_num) {\n");
        runningPrefix.append("Object RESULT = null;\n");
        runningPrefix.append("switch (CUP$act_num) {\n");
        int ruleCount = 0;  // keep track of current index, as we need to close everything in the last rule
        for (CupJavaImpl host : productions) {
            ruleCount++;

            runningPrefix.append("case ").append(ruleCount).append(":\n{\n");

            StringBuilder suffix = new StringBuilder("\n}\n");  // close case block
            if (ruleCount == productions.size()) {
                suffix.append("}\n");  // switch
                suffix.append("}\n");  // close method
                suffix.append("}\n");  // close action class
                suffix.append("}\n");  // close parser class
            }

            registrar.addPlace(
                    runningPrefix.toString(), suffix.toString(),
                    host, new TextRange(0, host.getTextLength())
            );
            runningPrefix.setLength(0);
        }

        registrar.doneInjecting();
    }

    @Override
    public @NotNull List<? extends Class<? extends PsiElement>> elementsToInjectIn() {
        return Collections.singletonList(CupJavaImpl.class);
    }
}
