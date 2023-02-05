package tirke.cupPlugin.editor;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.AbstractElementManipulator;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CupJavaCodeManipulator extends AbstractElementManipulator<PsiLanguageInjectionHost> {
    @Override
    public @Nullable PsiLanguageInjectionHost handleContentChange(@NotNull PsiLanguageInjectionHost element, @NotNull TextRange range, String newContent) throws IncorrectOperationException {
        String oldText = element.getText();
        String newText = oldText.substring(0, range.getStartOffset()) + newContent + oldText.substring(
                range.getEndOffset());
        return element.updateText(newText);
    }
}
