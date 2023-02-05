package tirke.cupPlugin.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import tirke.cupPlugin.psi.CupTypes;
import static tirke.cupPlugin.psi.CupTypes.*;

%%

%{
  int postponedMarkedPos = -1;

      public CupLexer() {
        this((java.io.Reader)null);
      }

      private IElementType formJavaCode() {
          zzStartRead = postponedMarkedPos;
          postponedMarkedPos = -1;
          return JAVA;
      }
%}

%public
%class CupLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state JAVA_CODE

LineTerminator = \r|\n|\r\n
WhiteSpace = [ \t]
AnySpace = {LineTerminator} | {WhiteSpace} | [\f]

IDENTIFIER=[a-zA-Z_0-9]+
LINE_COMMENT="//".*
BLOCK_COMMENT="/*" ~"*/"

%%
<YYINITIAL> {

  "|"                  { return BAR; }
  "::="                { return CCEQ; }
  ":"                  { return COLON; }
  ","                  { return COMMA; }
  "<"                  { return LEFTI; }
  ">"                  { return RIGHTI; }
  "{:"                 { postponedMarkedPos = zzEndRead;
                         yybegin(JAVA_CODE);
                         return LEFTCUPBRACES; }
  ":}"                 { return RIGHTCUPBRACES; }
  "."                  { return DOT; }
  "?"                  { return QM; }
  ";"                  { return SEMI; }
  "*"                  { return STAR; }
  "class"              { return CLASS; }
  "extends"            { return EXTENDS; }
  "import"             { return IMPORT; }
  "package"            { return PACKAGE; }
  "static"             { return STATIC; }
  "super"              { return SUPER; }
  "action"             { return ACTION; }
  "code"               { return CODE; }
  "init"               { return INIT; }
  "parser"             { return PARSER; }
  "scan"               { return SCAN; }
  "start"              { return START; }
  "with"               { return WITH; }
  "non"                { return NON; }
  "nonterminal"        { return NONTERMINAL; }
  "terminal"           { return TERMINAL; }
  "left"               { return LEFT; }
  "nonassoc"           { return NONASSOC; }
  "%prec"              { return PERCENT_PREC; }
  "precedence"         { return PRECED; }
  "right"              { return RIGHT; }

  {IDENTIFIER}         { return IDENTIFIER; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }

  {AnySpace}           { return WHITE_SPACE; }
  [^]                  { return BAD_CHARACTER; }
}

<JAVA_CODE> {
  ":}"                 { yybegin(YYINITIAL);
                         yypushback(2);  // leave :} out of code
                         return formJavaCode(); }
  [^]                  {  }
}
