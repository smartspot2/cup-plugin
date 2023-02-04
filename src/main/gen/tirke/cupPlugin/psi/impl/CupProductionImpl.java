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

public class CupProductionImpl extends ASTWrapperPsiElement implements CupProduction {

  public CupProductionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CupVisitor visitor) {
    visitor.visitProduction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CupVisitor) accept((CupVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CupRhs> getRhsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CupRhs.class);
  }

  @Override
  @NotNull
  public CupSymbolId getSymbolId() {
    return findNotNullChildByClass(CupSymbolId.class);
  }

}
