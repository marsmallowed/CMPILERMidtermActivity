/**
 * Define a grammar called Hello
 */
grammar Hello;
@header {
	package antlr;
}
// LEXER
Num : '-'*[0-9]+;
AddOp : '+';
SubOp : '-';
MultOp : '*';
DivOp : '/';
ModOp : '%';

// PARSER
s :
		expr;
	
expr :
		'(' expr ')'						#ParenExpr
 	|	expr (MultOp | DivOp | ModOp) expr	#MultDivMod
 	|	expr (AddOp | SubOp) expr			#AddSub
 	|	Num									#Unit;



WS : [ \t\n\r]+ -> skip;
