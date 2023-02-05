// This is a generated file. Not intended for manual editing.
package tirke.cupPlugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;

public class CupVisitor extends PsiElementVisitor {

  public void visitActionCode(@NotNull CupActionCode o) {
    visitPsiElement(o);
  }

  public void visitClassNameDeclaration(@NotNull CupClassNameDeclaration o) {
    visitPsiElement(o);
  }

  public void visitCodeParts(@NotNull CupCodeParts o) {
    visitPsiElement(o);
  }

  public void visitImportDeclaration(@NotNull CupImportDeclaration o) {
    visitPsiLanguageInjectionHost(o);
  }

  public void visitInitCode(@NotNull CupInitCode o) {
    visitPsiElement(o);
  }

  public void visitInitialDeclaration(@NotNull CupInitialDeclaration o) {
    visitPsiElement(o);
  }

  public void visitJavaCode(@NotNull CupJavaCode o) {
    visitPsiElement(o);
  }

  public void visitJavaRaw(@NotNull CupJavaRaw o) {
    visitPsiLanguageInjectionHost(o);
  }

  public void visitLabelId(@NotNull CupLabelId o) {
    visitPsiElement(o);
  }

  public void visitPackageDeclaration(@NotNull CupPackageDeclaration o) {
    visitPsiLanguageInjectionHost(o);
  }

  public void visitParserCode(@NotNull CupParserCode o) {
    visitPsiElement(o);
  }

  public void visitPrecedences(@NotNull CupPrecedences o) {
    visitPsiElement(o);
  }

  public void visitProdPart(@NotNull CupProdPart o) {
    visitPsiElement(o);
  }

  public void visitProduction(@NotNull CupProduction o) {
    visitPsiElement(o);
  }

  public void visitQualifiedName(@NotNull CupQualifiedName o) {
    visitPsiElement(o);
  }

  public void visitRhs(@NotNull CupRhs o) {
    visitPsiElement(o);
  }

  public void visitScanCode(@NotNull CupScanCode o) {
    visitPsiElement(o);
  }

  public void visitStartWith(@NotNull CupStartWith o) {
    visitPsiElement(o);
  }

  public void visitSymbolDefinition(@NotNull CupSymbolDefinition o) {
    visitNamedElement(o);
  }

  public void visitSymbolId(@NotNull CupSymbolId o) {
    visitPsiElement(o);
  }

  public void visitSymbols(@NotNull CupSymbols o) {
    visitPsiElement(o);
  }

  public void visitTermNameList(@NotNull CupTermNameList o) {
    visitPsiElement(o);
  }

  public void visitTypeArgument(@NotNull CupTypeArgument o) {
    visitPsiElement(o);
  }

  public void visitTypeArguments(@NotNull CupTypeArguments o) {
    visitPsiElement(o);
  }

  public void visitTypeId(@NotNull CupTypeId o) {
    visitPsiElement(o);
  }

  public void visitPsiLanguageInjectionHost(@NotNull PsiLanguageInjectionHost o) {
    visitElement(o);
  }

  public void visitNamedElement(@NotNull CupNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
