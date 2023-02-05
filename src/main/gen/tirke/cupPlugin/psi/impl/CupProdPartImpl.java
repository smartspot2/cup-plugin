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

public class CupProdPartImpl extends ASTWrapperPsiElement implements CupProdPart {

  public CupProdPartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CupVisitor visitor) {
    visitor.visitProdPart(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CupVisitor) accept((CupVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CupJavaCode getJavaCode() {
    return findChildByClass(CupJavaCode.class);
  }

  @Override
  @Nullable
  public CupLabelId getLabelId() {
    return findChildByClass(CupLabelId.class);
  }

  @Override
  @Nullable
  public CupSymbolId getSymbolId() {
    return findChildByClass(CupSymbolId.class);
  }

}
