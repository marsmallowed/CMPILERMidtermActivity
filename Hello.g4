/**
 * Define a grammar called Hello
 */
grammar Hello;
@header {
	package antlr;
}
// LEXER
AddOp : '+';
SubOp : '-';
MultOp : '*';
DivOp : '/';
ModOp : '%';

// PARSER

s : expr;
expr : '-' expr								#NegaExpr 
	| '(' expr ')'							#ParenExpr
	| expr (MultOp | DivOp | ModOp) expr	#MultDivMod
	| expr (AddOp | SubOp) expr				#AddSub
	| Num									#Unit
	| '-' Num								#NegaUnit;
	

Num : [0-9]+;
WS : [' '\t'\r''\n']+ -> skip;
