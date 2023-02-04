// This is a generated file. Not intended for manual editing.
package tirke.cupPlugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CupInitialDeclaration extends PsiElement {

  @Nullable
  CupClassNameDeclaration getClassNameDeclaration();

  @NotNull
  List<CupImportDeclaration> getImportDeclarationList();

  @Nullable
  CupPackageDeclaration getPackageDeclaration();

}
