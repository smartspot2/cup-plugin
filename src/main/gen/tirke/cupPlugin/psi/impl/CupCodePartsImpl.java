// This is a generated file. Not intended for manual editing.
package tirke.cupPlugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static tirke.cupPlugin.psi.CupTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import tirke.cupPlugin.psi.*;

public class CupCodePartsImpl extends ASTWrapperPsiElement implements CupCodeParts {

  public CupCodePartsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CupVisitor visitor) {
    visitor.visitCodeParts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CupVisitor) accept((CupVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CupActionCode getActionCode() {
    return findChildByClass(CupActionCode.class);
  }

  @Override
  @Nullable
  public CupInitCode getInitCode() {
    return findChildByClass(CupInitCode.class);
  }

  @Override
  @Nullable
  public CupParserCode getParserCode() {
    return findChildByClass(CupParserCode.class);
  }

  @Override
  @Nullable
  public CupScanCode getScanCode() {
    return findChildByClass(CupScanCode.class);
  }

}
