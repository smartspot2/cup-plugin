// This is a generated file. Not intended for manual editing.
package tirke.cupPlugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import tirke.cupPlugin.psi.impl.*;

public interface CupTypes {

  IElementType ACTION_CODE = new CupElementType("ACTION_CODE");
  IElementType CLASS_NAME_DECLARATION = new CupElementType("CLASS_NAME_DECLARATION");
  IElementType CODE_PARTS = new CupElementType("CODE_PARTS");
  IElementType IMPORT_DECLARATION = new CupElementType("IMPORT_DECLARATION");
  IElementType INITIAL_DECLARATION = new CupElementType("INITIAL_DECLARATION");
  IElementType INIT_CODE = new CupElementType("INIT_CODE");
  IElementType JAVA_CODE = new CupElementType("JAVA_CODE");
  IElementType JAVA_RAW = new CupElementType("JAVA_RAW");
  IElementType LABEL_ID = new CupElementType("LABEL_ID");
  IElementType PACKAGE_DECLARATION = new CupElementType("PACKAGE_DECLARATION");
  IElementType PARSER_CODE = new CupElementType("PARSER_CODE");
  IElementType PRECEDENCES = new CupElementType("PRECEDENCES");
  IElementType PRODUCTION = new CupElementType("PRODUCTION");
  IElementType PROD_PART = new CupElementType("PROD_PART");
  IElementType QUALIFIED_NAME = new CupElementType("QUALIFIED_NAME");
  IElementType RHS = new CupElementType("RHS");
  IElementType SCAN_CODE = new CupElementType("SCAN_CODE");
  IElementType START_WITH = new CupElementType("START_WITH");
  IElementType SYMBOLS = new CupElementType("SYMBOLS");
  IElementType SYMBOL_DEFINITION = new CupElementType("SYMBOL_DEFINITION");
  IElementType SYMBOL_ID = new CupElementType("SYMBOL_ID");
  IElementType TERM_NAME_LIST = new CupElementType("TERM_NAME_LIST");
  IElementType TYPE_ARGUMENT = new CupElementType("TYPE_ARGUMENT");
  IElementType TYPE_ARGUMENTS = new CupElementType("TYPE_ARGUMENTS");
  IElementType TYPE_ID = new CupElementType("TYPE_ID");

  IElementType ACTION = new CupTokenType("action");
  IElementType BAR = new CupTokenType("|");
  IElementType BLOCK_COMMENT = new CupTokenType("block_comment");
  IElementType CCEQ = new CupTokenType("::=");
  IElementType CLASS = new CupTokenType("class");
  IElementType CODE = new CupTokenType("code");
  IElementType COLON = new CupTokenType(":");
  IElementType COMMA = new CupTokenType(",");
  IElementType DOT = new CupTokenType(".");
  IElementType EXTENDS = new CupTokenType("extends");
  IElementType IDENTIFIER = new CupTokenType("identifier");
  IElementType IMPORT = new CupTokenType("import");
  IElementType INIT = new CupTokenType("init");
  IElementType JAVA = new CupTokenType("java");
  IElementType LEFT = new CupTokenType("left");
  IElementType LEFTCUPBRACES = new CupTokenType("{:");
  IElementType LEFTI = new CupTokenType("<");
  IElementType LINE_COMMENT = new CupTokenType("line_comment");
  IElementType NON = new CupTokenType("non");
  IElementType NONASSOC = new CupTokenType("nonassoc");
  IElementType NONTERMINAL = new CupTokenType("nonterminal");
  IElementType PACKAGE = new CupTokenType("package");
  IElementType PARSER = new CupTokenType("parser");
  IElementType PERCENT_PREC = new CupTokenType("%prec");
  IElementType PRECED = new CupTokenType("precedence");
  IElementType QM = new CupTokenType("?");
  IElementType RIGHT = new CupTokenType("right");
  IElementType RIGHTCUPBRACES = new CupTokenType(":}");
  IElementType RIGHTI = new CupTokenType(">");
  IElementType SCAN = new CupTokenType("scan");
  IElementType SEMI = new CupTokenType(";");
  IElementType STAR = new CupTokenType("*");
  IElementType START = new CupTokenType("start");
  IElementType STATIC = new CupTokenType("static");
  IElementType SUPER = new CupTokenType("super");
  IElementType TERMINAL = new CupTokenType("terminal");
  IElementType WITH = new CupTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTION_CODE) {
        return new CupActionCodeImpl(node);
      }
      else if (type == CLASS_NAME_DECLARATION) {
        return new CupClassNameDeclarationImpl(node);
      }
      else if (type == CODE_PARTS) {
        return new CupCodePartsImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new CupImportDeclarationImpl(node);
      }
      else if (type == INITIAL_DECLARATION) {
        return new CupInitialDeclarationImpl(node);
      }
      else if (type == INIT_CODE) {
        return new CupInitCodeImpl(node);
      }
      else if (type == JAVA_CODE) {
        return new CupJavaCodeImpl(node);
      }
      else if (type == JAVA_RAW) {
        return new CupJavaRawImpl(node);
      }
      else if (type == LABEL_ID) {
        return new CupLabelIdImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new CupPackageDeclarationImpl(node);
      }
      else if (type == PARSER_CODE) {
        return new CupParserCodeImpl(node);
      }
      else if (type == PRECEDENCES) {
        return new CupPrecedencesImpl(node);
      }
      else if (type == PRODUCTION) {
        return new CupProductionImpl(node);
      }
      else if (type == PROD_PART) {
        return new CupProdPartImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new CupQualifiedNameImpl(node);
      }
      else if (type == RHS) {
        return new CupRhsImpl(node);
      }
      else if (type == SCAN_CODE) {
        return new CupScanCodeImpl(node);
      }
      else if (type == START_WITH) {
        return new CupStartWithImpl(node);
      }
      else if (type == SYMBOLS) {
        return new CupSymbolsImpl(node);
      }
      else if (type == SYMBOL_DEFINITION) {
        return new CupSymbolDefinitionImpl(node);
      }
      else if (type == SYMBOL_ID) {
        return new CupSymbolIdImpl(node);
      }
      else if (type == TERM_NAME_LIST) {
        return new CupTermNameListImpl(node);
      }
      else if (type == TYPE_ARGUMENT) {
        return new CupTypeArgumentImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new CupTypeArgumentsImpl(node);
      }
      else if (type == TYPE_ID) {
        return new CupTypeIdImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
