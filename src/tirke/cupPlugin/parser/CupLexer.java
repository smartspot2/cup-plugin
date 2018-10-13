/* The following code was generated by JFlex 1.4.3 on 05/04/16 02:02 */

package tirke.cupPlugin.parser;

import static tirke.cupPlugin.psi.CupTypes.ACTION;
import static tirke.cupPlugin.psi.CupTypes.BAR;
import static tirke.cupPlugin.psi.CupTypes.BLOCK_COMMENT;
import static tirke.cupPlugin.psi.CupTypes.CCEQ;
import static tirke.cupPlugin.psi.CupTypes.CLASS;
import static tirke.cupPlugin.psi.CupTypes.CODE;
import static tirke.cupPlugin.psi.CupTypes.COLON;
import static tirke.cupPlugin.psi.CupTypes.COMMA;
import static tirke.cupPlugin.psi.CupTypes.DOT;
import static tirke.cupPlugin.psi.CupTypes.EXTENDS;
import static tirke.cupPlugin.psi.CupTypes.IDENTIFIER;
import static tirke.cupPlugin.psi.CupTypes.IMPORT;
import static tirke.cupPlugin.psi.CupTypes.INIT;
import static tirke.cupPlugin.psi.CupTypes.JAVA;
import static tirke.cupPlugin.psi.CupTypes.JAVA_CODE;
import static tirke.cupPlugin.psi.CupTypes.LEFT;
import static tirke.cupPlugin.psi.CupTypes.LEFTCUPBRACES;
import static tirke.cupPlugin.psi.CupTypes.LEFTI;
import static tirke.cupPlugin.psi.CupTypes.LINE_COMMENT;
import static tirke.cupPlugin.psi.CupTypes.NON;
import static tirke.cupPlugin.psi.CupTypes.NONASSOC;
import static tirke.cupPlugin.psi.CupTypes.NONTERMINAL;
import static tirke.cupPlugin.psi.CupTypes.PACKAGE;
import static tirke.cupPlugin.psi.CupTypes.PARSER;
import static tirke.cupPlugin.psi.CupTypes.PERCENT_PREC;
import static tirke.cupPlugin.psi.CupTypes.PRECED;
import static tirke.cupPlugin.psi.CupTypes.QM;
import static tirke.cupPlugin.psi.CupTypes.RIGHT;
import static tirke.cupPlugin.psi.CupTypes.RIGHTCUPBRACES;
import static tirke.cupPlugin.psi.CupTypes.RIGHTI;
import static tirke.cupPlugin.psi.CupTypes.SCAN;
import static tirke.cupPlugin.psi.CupTypes.SEMI;
import static tirke.cupPlugin.psi.CupTypes.STAR;
import static tirke.cupPlugin.psi.CupTypes.START;
import static tirke.cupPlugin.psi.CupTypes.STATIC;
import static tirke.cupPlugin.psi.CupTypes.SUPER;
import static tirke.cupPlugin.psi.CupTypes.TERMINAL;
import static tirke.cupPlugin.psi.CupTypes.WITH;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 05/04/16 02:02 from the specification file
 * <tt>/Users/Tirke/Downloads/MyPro/Cup support/src/tirke/cupPlugin/parser/CupLexer.flex</tt>
 */
public class CupLexer implements FlexLexer {

  /**
   * lexical states
   */
  public static final int YYINITIAL = 0;
  public static final int OPT_JAVA_CODE = 2;
  /**
   * initial size of the lookahead buffer
   */
  private static final int ZZ_BUFFERSIZE = 16384;
  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   * at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
      0, 0, 1, 1
  };

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
      "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\4\0\1\46" +
          "\4\0\1\6\1\0\1\12\1\0\1\15\1\5\12\4\1\10\1\16" +
          "\1\20\1\11\1\21\1\17\1\0\1\50\1\4\1\53\1\55\1\56" +
          "\4\4\1\47\4\4\1\54\6\4\1\51\4\4\4\0\1\52\1\0" +
          "\1\24\1\4\1\22\1\41\1\36\1\45\1\35\1\44\1\26\1\4" +
          "\1\34\1\23\1\27\1\40\1\31\1\30\1\4\1\32\1\25\1\33" +
          "\1\42\1\4\1\43\1\37\2\4\1\13\1\7\1\14\uff82\0";

  /**
   * Translates characters to character classes
   */
  private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);
  private static final String ZZ_ACTION_PACKED_0 =
      "\2\0\1\1\2\2\1\3\1\1\1\4\1\5\1\6" +
          "\1\7\1\1\1\10\1\11\1\12\1\13\1\14\13\3" +
          "\1\1\1\3\2\15\1\16\2\0\1\17\1\20\20\3" +
          "\1\0\1\3\1\21\1\0\1\22\17\3\1\23\1\3" +
          "\1\0\1\3\1\24\1\3\1\25\1\26\1\3\1\27" +
          "\4\3\1\30\10\3\1\31\1\0\1\3\1\32\1\3" +
          "\1\33\1\3\1\34\4\3\1\35\4\3\1\36\1\3" +
          "\1\37\1\40\1\41\1\3\1\42\6\3\1\43\2\3" +
          "\1\44\4\3\1\45\1\46\4\3\1\47\1\50\1\3" +
          "\1\51";
  /**
   * Translates DFA states to action switch labels.
   */
  private static final int[] ZZ_ACTION = zzUnpackAction();
  private static final String ZZ_ROWMAP_PACKED_0 =
      "\0\0\0\57\0\136\0\215\0\136\0\274\0\353\0\136" +
          "\0\136\0\u011a\0\136\0\u0149\0\136\0\136\0\136\0\136" +
          "\0\136\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292" +
          "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\136\0\u03db" +
          "\0\u040a\0\u0439\0\u0468\0\136\0\136\0\u0497\0\u04c6\0\u04f5" +
          "\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d" +
          "\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\136" +
          "\0\u07e5\0\136\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff" +
          "\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77" +
          "\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\136\0\u0b91\0\274" +
          "\0\274\0\u0bc0\0\274\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c\0\274" +
          "\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4" +
          "\0\274\0\u0e23\0\u0e52\0\274\0\u0e81\0\274\0\u0eb0\0\274" +
          "\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\274\0\u0f9b\0\u0fca\0\u0ff9" +
          "\0\u1028\0\136\0\u1057\0\274\0\274\0\274\0\u1086\0\274" +
          "\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\274\0\u11cf" +
          "\0\u11fe\0\274\0\u122d\0\u125c\0\u128b\0\u12ba\0\274\0\274" +
          "\0\u12e9\0\u1318\0\u1347\0\u1376\0\274\0\274\0\u13a5\0\274";
  /**
   * Translates a state to a row index in the transition table
   */
  private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
  private static final String ZZ_TRANS_PACKED_0 =
      "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\12" +
          "\1\3\1\13\1\14\1\3\1\15\1\16\1\17\1\20" +
          "\1\21\1\22\1\23\1\24\1\25\1\26\1\6\1\27" +
          "\1\6\1\30\1\31\2\6\1\32\1\6\1\33\2\6" +
          "\1\34\2\6\1\35\1\36\7\6\10\37\1\40\46\37" +
          "\61\0\1\5\60\0\1\6\15\0\24\6\1\0\10\6" +
          "\5\0\1\41\1\42\60\0\1\43\3\0\1\44\52\0" +
          "\1\45\52\0\1\6\15\0\1\6\1\46\5\6\1\47" +
          "\14\6\1\0\10\6\4\0\1\6\15\0\14\6\1\50" +
          "\7\6\1\0\10\6\4\0\1\6\15\0\1\51\23\6" +
          "\1\0\10\6\4\0\1\6\15\0\1\52\10\6\1\53" +
          "\6\6\1\54\3\6\1\0\10\6\4\0\1\6\15\0" +
          "\5\6\1\55\10\6\1\56\5\6\1\0\10\6\4\0" +
          "\1\6\15\0\2\6\1\57\5\6\1\60\13\6\1\0" +
          "\10\6\4\0\1\6\15\0\4\6\1\61\17\6\1\0" +
          "\10\6\4\0\1\6\15\0\14\6\1\62\7\6\1\0" +
          "\10\6\4\0\1\6\15\0\15\6\1\63\6\6\1\0" +
          "\10\6\4\0\1\6\15\0\7\6\1\64\14\6\1\0" +
          "\10\6\4\0\1\6\15\0\4\6\1\65\17\6\1\0" +
          "\10\6\30\0\1\66\32\0\1\6\15\0\24\6\1\0" +
          "\1\6\1\67\6\6\14\0\1\70\42\0\2\41\1\0" +
          "\54\41\6\42\1\71\50\42\11\0\1\72\51\0\1\6" +
          "\15\0\2\6\1\73\21\6\1\0\10\6\4\0\1\6" +
          "\15\0\17\6\1\74\4\6\1\0\10\6\4\0\1\6" +
          "\15\0\23\6\1\75\1\0\10\6\4\0\1\6\15\0" +
          "\11\6\1\76\12\6\1\0\10\6\4\0\1\6\15\0" +
          "\2\6\1\77\21\6\1\0\10\6\4\0\1\6\15\0" +
          "\2\6\1\100\21\6\1\0\10\6\4\0\1\6\15\0" +
          "\6\6\1\101\15\6\1\0\10\6\4\0\1\6\15\0" +
          "\6\6\1\102\15\6\1\0\10\6\4\0\1\6\15\0" +
          "\4\6\1\103\17\6\1\0\10\6\4\0\1\6\15\0" +
          "\1\104\7\6\1\105\13\6\1\0\10\6\4\0\1\6" +
          "\15\0\14\6\1\106\7\6\1\0\10\6\4\0\1\6" +
          "\15\0\13\6\1\107\10\6\1\0\10\6\4\0\1\6" +
          "\15\0\10\6\1\110\13\6\1\0\10\6\4\0\1\6" +
          "\15\0\11\6\1\111\12\6\1\0\10\6\4\0\1\6" +
          "\15\0\16\6\1\112\5\6\1\0\10\6\4\0\1\6" +
          "\15\0\11\6\1\113\12\6\1\0\10\6\32\0\1\114" +
          "\30\0\1\6\15\0\24\6\1\0\2\6\1\115\5\6" +
          "\5\42\1\116\1\71\50\42\4\0\1\6\15\0\3\6" +
          "\1\117\20\6\1\0\10\6\4\0\1\6\15\0\14\6" +
          "\1\120\7\6\1\0\10\6\4\0\1\6\15\0\11\6" +
          "\1\121\12\6\1\0\10\6\4\0\1\6\15\0\4\6" +
          "\1\122\17\6\1\0\10\6\4\0\1\6\15\0\16\6" +
          "\1\123\5\6\1\0\10\6\4\0\1\6\15\0\10\6" +
          "\1\124\1\125\12\6\1\0\10\6\4\0\1\6\15\0" +
          "\14\6\1\126\7\6\1\0\10\6\4\0\1\6\15\0" +
          "\7\6\1\127\14\6\1\0\10\6\4\0\1\6\15\0" +
          "\11\6\1\130\12\6\1\0\10\6\4\0\1\6\15\0" +
          "\12\6\1\131\11\6\1\0\10\6\4\0\1\6\15\0" +
          "\3\6\1\132\20\6\1\0\10\6\4\0\1\6\15\0" +
          "\1\133\23\6\1\0\10\6\4\0\1\6\15\0\22\6" +
          "\1\134\1\6\1\0\10\6\4\0\1\6\15\0\5\6" +
          "\1\135\16\6\1\0\10\6\4\0\1\6\15\0\14\6" +
          "\1\136\7\6\1\0\10\6\4\0\1\6\15\0\2\6" +
          "\1\137\6\6\1\140\12\6\1\0\10\6\4\0\1\6" +
          "\15\0\22\6\1\141\1\6\1\0\10\6\36\0\1\142" +
          "\24\0\1\6\15\0\24\6\1\0\1\6\1\143\6\6" +
          "\4\0\1\6\15\0\3\6\1\144\20\6\1\0\10\6" +
          "\4\0\1\6\15\0\7\6\1\145\14\6\1\0\10\6" +
          "\4\0\1\6\15\0\11\6\1\146\12\6\1\0\10\6" +
          "\4\0\1\6\15\0\4\6\1\147\17\6\1\0\10\6" +
          "\4\0\1\6\15\0\10\6\1\150\13\6\1\0\10\6" +
          "\4\0\1\6\15\0\10\6\1\151\13\6\1\0\10\6" +
          "\4\0\1\6\15\0\2\6\1\152\21\6\1\0\10\6" +
          "\4\0\1\6\15\0\14\6\1\153\7\6\1\0\10\6" +
          "\4\0\1\6\15\0\14\6\1\154\7\6\1\0\10\6" +
          "\4\0\1\6\15\0\11\6\1\155\12\6\1\0\10\6" +
          "\4\0\1\6\15\0\4\6\1\156\17\6\1\0\10\6" +
          "\4\0\1\6\15\0\16\6\1\157\5\6\1\0\10\6" +
          "\4\0\1\6\15\0\3\6\1\160\20\6\1\0\10\6" +
          "\4\0\1\6\15\0\14\6\1\161\7\6\1\0\10\6" +
          "\22\0\1\162\40\0\1\6\15\0\24\6\1\0\3\6" +
          "\1\163\4\6\4\0\1\6\15\0\16\6\1\164\5\6" +
          "\1\0\10\6\4\0\1\6\15\0\1\165\23\6\1\0" +
          "\10\6\4\0\1\6\15\0\11\6\1\166\12\6\1\0" +
          "\10\6\4\0\1\6\15\0\13\6\1\167\10\6\1\0" +
          "\10\6\4\0\1\6\15\0\10\6\1\170\13\6\1\0" +
          "\10\6\4\0\1\6\15\0\17\6\1\171\4\6\1\0" +
          "\10\6\4\0\1\6\15\0\16\6\1\172\5\6\1\0" +
          "\10\6\4\0\1\6\15\0\17\6\1\173\4\6\1\0" +
          "\10\6\4\0\1\6\15\0\3\6\1\174\20\6\1\0" +
          "\10\6\4\0\1\6\15\0\10\6\1\175\13\6\1\0" +
          "\10\6\4\0\1\6\15\0\24\6\1\0\4\6\1\176" +
          "\3\6\4\0\1\6\15\0\14\6\1\177\7\6\1\0" +
          "\10\6\4\0\1\6\15\0\14\6\1\200\7\6\1\0" +
          "\10\6\4\0\1\6\15\0\2\6\1\201\21\6\1\0" +
          "\10\6\4\0\1\6\15\0\3\6\1\202\20\6\1\0" +
          "\10\6\4\0\1\6\15\0\7\6\1\203\14\6\1\0" +
          "\10\6\4\0\1\6\15\0\5\6\1\204\16\6\1\0" +
          "\10\6\4\0\1\6\15\0\24\6\1\0\5\6\1\205" +
          "\2\6\4\0\1\6\15\0\16\6\1\206\5\6\1\0" +
          "\10\6\4\0\1\6\15\0\1\6\1\207\22\6\1\0" +
          "\10\6\4\0\1\6\15\0\1\210\23\6\1\0\10\6" +
          "\4\0\1\6\15\0\4\6\1\211\17\6\1\0\10\6" +
          "\4\0\1\6\15\0\24\6\1\0\6\6\1\212\1\6" +
          "\4\0\1\6\15\0\1\213\23\6\1\0\10\6\4\0" +
          "\1\6\15\0\16\6\1\214\5\6\1\0\10\6\4\0" +
          "\1\6\15\0\24\6\1\0\7\6\1\215\4\0\1\6" +
          "\15\0\14\6\1\216\7\6\1\0\10\6\4\0\1\6" +
          "\15\0\2\6\1\217\21\6\1\0\10\6\4\0\1\6" +
          "\15\0\1\6\1\220\22\6\1\0\10\6";
  /**
   * The transition table of the DFA
   */
  private static final int[] ZZ_TRANS = zzUnpackTrans();
  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
      "Unkown internal scanner error",
      "Error: could not match input",
      "Error: pushback value was too large"
  };
  private static final String ZZ_ATTRIBUTE_PACKED_0 =
      "\2\0\1\11\1\1\1\11\2\1\2\11\1\1\1\11" +
          "\1\1\5\11\15\1\1\11\2\1\2\0\2\11\20\1" +
          "\1\0\1\1\1\11\1\0\1\11\21\1\1\0\1\1" +
          "\1\11\23\1\1\0\17\1\1\11\36\1";
  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
  private static java.io.Reader zzReader = null; // Fake
  /**
   * the current state of the DFA
   */
  private int zzState;
  /**
   * the current lexical state
   */
  private int zzLexicalState = YYINITIAL;
  /**
   * this buffer contains the current text to be matched and is
   * the source of the yytext() string
   */
  private CharSequence zzBuffer = "";
  /**
   * this buffer may contains the current text array to be matched when it is cheap to acquire it
   */
  private char[] zzBufferArray;
  /**
   * the textposition at the last accepting state
   */
  private int zzMarkedPos;
  /**
   * the textposition at the last state to be included in yytext
   */
  private int zzPushbackPos;
  /**
   * the current text position in the buffer
   */
  private int zzCurrentPos;
  /**
   * startRead marks the beginning of the yytext() string in the buffer
   */
  private int zzStartRead;
  /**
   * endRead marks the last character in the buffer, that has been read
   * from input
   */
  private int zzEndRead;
  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;
  /**
   * zzAtEOF == true <=> the scanner is at the EOF
   */
  private boolean zzAtEOF;
  /**
   * denotes if the user-EOF-code has already been executed
   */
  private boolean zzEOFDone;

  /**
   * Creates a new scanner
   *
   * @param in the java.io.Reader to read input from.
   */
  public CupLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  private static int[] zzUnpackAction() {
    int[] result = new int[144];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do {
        result[j++] = value;
      } while (--count > 0);
    }
    return j;
  }

  private static int[] zzUnpackRowMap() {
    int[] result = new int[144];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int[] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  private static int[] zzUnpackTrans() {
    int[] result = new int[5076];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do {
        result[j++] = value;
      } while (--count > 0);
    }
    return j;
  }

  private static int[] zzUnpackAttribute() {
    int[] result = new int[144];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do {
        result[j++] = value;
      } while (--count > 0);
    }
    return j;
  }

  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed the packed character translation table
   * @return the unpacked character translation table
   */
  private static char[] zzUnpackCMap(String packed) {
    char[] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 138) {
      int count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do {
        map[j++] = value;
      } while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return <code>false</code>, iff there was new input.
   * @throws java.io.IOException if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   * A value from 0 to yylength()-1.
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead + pos]
        : zzBuffer.charAt(zzStartRead + pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos - zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param errorCode the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number the number of characters to be read again.
   * This number must not be greater than yylength()!
   */
  public void yypushback(int number) {
    if (number > yylength()) {
      zzScanError(ZZ_PUSHBACK_2BIG);
    }

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return the next token
   * @throws java.io.IOException if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char[] zzCMapL = ZZ_CMAP;

    int[] zzTransL = ZZ_TRANS;
    int[] zzRowMapL = ZZ_ROWMAP;
    int[] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      zzForAction:
      {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]
                : zzBufferL.charAt(zzCurrentPosL++));
          } else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          } else {
            // store back cached positions
            zzCurrentPos = zzCurrentPosL;
            zzMarkedPos = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL = zzCurrentPos;
            zzMarkedPosL = zzMarkedPos;
            zzBufferL = zzBuffer;
            zzEndReadL = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            } else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]
                  : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
          if (zzNext == -1) {
            break zzForAction;
          }
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ((zzAttributes & 1) == 1) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ((zzAttributes & 8) == 8) {
              break zzForAction;
            }
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: {
          return STAR;
        }
        case 42:
          break;
        case 31: {
          return ACTION;
        }
        case 43:
          break;
        case 2: {
          return TokenType.WHITE_SPACE;
        }
        case 44:
          break;
        case 41: {
          return NONTERMINAL;
        }
        case 45:
          break;
        case 21: {
          return CODE;
        }
        case 46:
          break;
        case 37: {
          return TERMINAL;
        }
        case 47:
          break;
        case 18: {
          return CCEQ;
        }
        case 48:
          break;
        case 23: {
          return SCAN;
        }
        case 49:
          break;
        case 7: {
          return COMMA;
        }
        case 50:
          break;
        case 8: {
          return DOT;
        }
        case 51:
          break;
        case 13: {
          yybegin(OPT_JAVA_CODE);
          return JAVA;
        }
        case 52:
          break;
        case 9: {
          return SEMI;
        }
        case 53:
          break;
        case 39: {
          return JAVA_CODE;
        }
        case 54:
          break;
        case 12: {
          return RIGHTI;
        }
        case 55:
          break;
        case 11: {
          return LEFTI;
        }
        case 56:
          break;
        case 19: {
          return NON;
        }
        case 57:
          break;
        case 25: {
          return WITH;
        }
        case 58:
          break;
        case 16: {
          yybegin(OPT_JAVA_CODE);
          return LEFTCUPBRACES;
        }
        case 59:
          break;
        case 6: {
          return COLON;
        }
        case 60:
          break;
        case 20: {
          return BLOCK_COMMENT;
        }
        case 61:
          break;
        case 33: {
          return IMPORT;
        }
        case 62:
          break;
        case 15: {
          return RIGHTCUPBRACES;
        }
        case 63:
          break;
        case 36: {
          return EXTENDS;
        }
        case 64:
          break;
        case 27: {
          return START;
        }
        case 65:
          break;
        case 22: {
          return LEFT;
        }
        case 66:
          break;
        case 28: {
          return SUPER;
        }
        case 67:
          break;
        case 34: {
          return PARSER;
        }
        case 68:
          break;
        case 14: {
          return LINE_COMMENT;
        }
        case 69:
          break;
        case 1: {
          return TokenType.BAD_CHARACTER;
        }
        case 70:
          break;
        case 29: {
          return RIGHT;
        }
        case 71:
          break;
        case 26: {
          return CLASS;
        }
        case 72:
          break;
        case 24: {
          return INIT;
        }
        case 73:
          break;
        case 17: {
          yybegin(YYINITIAL);
          yypushback(yylength());
        }
        case 74:
          break;
        case 35: {
          return PACKAGE;
        }
        case 75:
          break;
        case 30: {
          return PERCENT_PREC;
        }
        case 76:
          break;
        case 10: {
          return QM;
        }
        case 77:
          break;
        case 5: {
          return BAR;
        }
        case 78:
          break;
        case 32: {
          return STATIC;
        }
        case 79:
          break;
        case 3: {
          return IDENTIFIER;
        }
        case 80:
          break;
        case 38: {
          return NONASSOC;
        }
        case 81:
          break;
        case 40: {
          return PRECED;
        }
        case 82:
          break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          } else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
