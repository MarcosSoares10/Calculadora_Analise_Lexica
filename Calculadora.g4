grammar Calculadora;

INTEIRO    : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
POTENCIA    : '^';
ENTER     : '\n';
ESPACO_BRANCO     : [ \t\r]+ -> skip;
IDENTIFICADOR     : [a-zA-Z_][a-zA-Z_0-9]*;


SOMA  : '+';
IGUALDADE : '=';
MENOS : '-';
MULTIPLICACAO  : '*';
DIVISAO   : '/';
P_ESQ  : '(';
P_DIR  : ')';

input
    : setVar ENTER input     # ToSetVar
    | maisoumenos ENTER? EOF # Calculate
    ;

setVar
    : IDENTIFICADOR IGUALDADE maisoumenos #SetVariable
    ;


maisoumenos
    : maisoumenos SOMA  mult_Div  #Soma
    | maisoumenos MENOS  mult_Div #Sub
    | mult_Div                   #ToMult_Div
    ;

mult_Div
    : mult_Div MULTIPLICACAO pow #Multiplicacao
    | mult_Div DIVISAO pow  #Divisao
    | pow                #Potec
    ;

pow
    : unaryMinus (POTENCIA pow)? #Potenc
    ;

unaryMinus
    : MENOS unaryMinus #MudaS
    | atom             #ToAtom
    ;

atom
    : DOUBLE                #Double
    | INTEIRO                   #Int
    | IDENTIFICADOR                    #Variable
    | P_ESQ maisoumenos P_DIR #Braces
    ;
