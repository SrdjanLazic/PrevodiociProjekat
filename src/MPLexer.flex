// import section
import java_cup.runtime.*;


%%


// declaration section
%class MPLexer
%cup
%line
%column

%eofval{
	return new Symbol( sym.EOF );
%eofval}


//states
%state COMMENT

// macros
slovo = [a-zA-Z]
cifra = [0-9]
znak = [\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\[\]\\\^\_\`\{\}\~]
binarni = [0-1]+
oktalni = [0-7]+
decimalni = 0|[1-9][{cifra}]*
heksadecimalni = [{cifra}A-Fa-f]+
int = 2#{binarni} | 8#{oktalni} | 10#{decimalni} | 16#{heksadecimalni} | #{heksadecimalni} | {decimalni}
real = {cifra}+\.({cifra}+)?(E[\+-]?{cifra}+)?
character = '{znak}' | '{slovo}' | '{cifra}'

%%
// rules section
\/\*\*			{ yybegin( COMMENT ); }
<COMMENT>\*\/	{ yybegin( YYINITIAL ); }
<COMMENT>.		{ ; }

[\t\r\n ]		{ ; }

//operators
"+"				{ return new Symbol( sym.ADD ); }
"*"				{ return new Symbol( sym.MUL );  }
"/"				{ return new Symbol( sym.DIV );  }
"-"				{ return new Symbol( sym.SUB );  }

//separators
";"				{ return new Symbol( sym.SEMICOLON );   }
","				{ return new Symbol( sym.COMMA );  }
"="				{ return new Symbol( sym.ASSIGN );  }
"("				{ return new Symbol( sym.LROUND ); }
")"				{ return new Symbol( sym.RROUND ); }
"{"				{ return new Symbol( sym.LCURLY ); }
"}"				{ return new Symbol( sym.RCURLY ); }
"["				{ return new Symbol( sym.LSQUARE );}
"]"				{ return new Symbol( sym.RSQUARE ); }


//keywords
"main"		    { return new Symbol( sym.MAIN );	}
"char"			{ return new Symbol( sym.CHAR );	}
"int"		    { return new Symbol( sym.INTEGER );	}
"real"			{ return new Symbol( sym.REAL );	}
"read"			{ return new Symbol( sym.READ );	}
"write"			{ return new Symbol( sym.WRITE );	}
"for"			{ return new Symbol( sym.FOR );	}
"in"			{ return new Symbol( sym.IN );	}

//id-s
{slovo}({slovo}|{cifra})*	{ return new Symbol( sym.ID ); }

//constants
{int} | {real} | {character} { return new Symbol( sym.CONST ); }


//error symbol
.		{ System.out.println( "ERROR: " + yytext() ); }

