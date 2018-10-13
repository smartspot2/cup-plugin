package tirke.cupPlugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import tirke.cupPlugin.CupLanguage;

/**
 * Created by Tirke on 14/02/2016
 */
public class CupTokenType extends IElementType {

  public CupTokenType(@NotNull @NonNls String debugName) {
    super(debugName, CupLanguage.INSTANCE);
  }
}
