parser grammar Pl2compilerParser;

options {
	tokenVocab = Pl2compilerLexer;
	language = Java;
}

prog: (libreria|expr|asignacion|crearfuncion)+;
libreria: (palabraclaveincluirlibreria nombrepaquete separadoroperaciones)+;
asignacion: ((tipovariable? nombrevariable (operadorasignacion expr)?)
            | (tipovariable nombrevariable (separadoroperadores nombrevariable)*)) separadoroperaciones?;
variable: tipovariable? nombrevariable operadorasignacion expr;
condicion: operadoraperturaparentesis expresionlogica operadorcierreparentesis;
operacionswitch: cabeceraswitch cuerposwitch;
cabeceraswitch: palabrareservadaaperturaswitch operadoraperturaparentesis expr operadorcierreparentesis;
cuerposwitch: (palabrareservadacase expr separadordospuntos cuerpo (palabrareservadabreak separadoroperaciones)?)+ (palabrareservadadefault separadordospuntos cuerpo (palabrareservadabreak separadoroperaciones)?) palabrareservadacierrewitch; 
condicionales: palabraclavecondiciones ((condicion)
            | (condicion (operadorcondicionalpuertalogica condicion)*))? palabraclavethen? cuerpo palabraclaveendif?;
funcionwhile: palabraclavebuclewhile operadoraperturaparentesis (expr|expresionlogica) operadorcierreparentesis cuerpo;
//funcionfor: palabraclavebuclefor operadoraperturaparentesis (variable|nombrevariable) (separadoroperaciones expresionlogica) (separadoroperaciones variable|nombrevariable (operadoraritmeticosuma1 |operadoraritmeticoresta1)) operadorcierreparentesis cuerpo;
funcionfor: palabraclavebuclefor nombrevariable palabraclaveinciovalorfor (nombrevariable|numeros) palabraclavefinvalorfor (nombrevariable|numeros) (palabraclavesaltoelementofor (nombrevariable|numeros))? palabraclavehacerfor cuerpo palabraclaveendbuclefor;
cuerpo: (palabraclaveinicio*  codigo+ palabraclavefin*)+;
cuerpo2: (palabraclaveinicio codigo* palabraclavefin)+;
llamarfuncion: ((nombrefuncion operadoraperturaparentesis parametros? operadorcierreparentesis separadoroperaciones?) | funcionfor | funcionwhile | condicionales| operacionswitch);
codigo: (funcionwhile|funcionfor|operacionswitch|asignacion|llamarfuncion|devolver|cuerpo2)+;
crearfuncion: cabecerafuncion cuerpo;
devolver: palabraclavefunciondevolver operadoraperturaparentesis (llamarfuncion|expr)? operadorcierreparentesis separadoroperaciones; 
retorno : tipovariable;

cabecerafuncion:  palabraclavecreacionfuncion (nombrefuncion|palabraclavefuncionmain) operadoraperturaparentesis parametros? operadorcierreparentesis separadordospuntos retorno;
expr:	expr (operadoraritmeticoproducto|operadoraritmeticodivision) expr
    |	expr (operadoraritmeticosuma|operadoraritmeticoresta) expr
    |   llamarfuncion
    |	numeros
    |   nombrevariable
    |   cadena  (operadoraritmeticosuma expr)*
    |	operadoraperturaparentesis expr operadorcierreparentesis
    ;
expresionlogica: (expr|palabraclavebooleano) ((operadorlogico|operadorcondicionalpuertalogica) (expr|palabraclavebooleano|expresionlogica))+
                | palabraclavebooleano;

nombrefuncion: ID;
nombrevariable: ID | CASE;
nombrepaquete: ID;
operadorasignacion: ASIGN;
parametros:  parametro (separadoroperadores parametro)* ;
parametro: tipovariable? expr;
operadoraritmeticoproducto: PRODUCT;
operadoraritmeticodivision: DIVISION;
operadoraritmeticosuma: ADD;
operadoraritmeticoresta: MINUS;
operadoraritmeticosuma1: INCREMENTOEN1;
operadoraritmeticoresta1: DECREMENTOEN1;

operadorlogico: MENORQUE|MAYORQUE|IGUALQUE|DISTINTOQUE;
operadorcondicionalpuertalogica: PUERTALOGICAAND | PUERTALOGICAOR;
cadena: CADENA;
separadoroperaciones: PC;
separadoroperadores: COMA;
separadordospuntos: DOSPUNTOS;
operadoraperturaparentesis: PL;
operadorcierreparentesis: PR;
tipovariable: STRING|NUMERO|VOID;
comentarios: COMENTARIO_LINEA
            | COMENTARIO_LINEA2
            | COMENTARIO_BLOQUE
            | COMENTARIO_DOCUMENTACION
            ;
entero: DIGITO+;
flotante: FLOTANTE;
numeros: entero | flotante;

//Keywords:
palabraclavebooleano: BOOLEAN;
palabraclavebuclefor: FOR;
palabraclaveendbuclefor: ENDFOR;
palabraclaveinciovalorfor: FROM;
palabraclavesaltoelementofor: STEP;
palabraclavefinvalorfor: TO;
palabraclavehacerfor: DO;
palabraclavebuclewhile: WHILE;
palabrareservadaaperturaswitch: SWITCH;
palabrareservadacierrewitch: ENDSWITCH;
palabrareservadacase: CASE;
palabrareservadabreak: BREAK;
palabrareservadadefault: DEFAULT;
palabraclavecondiciones: CONDICIONES;
palabraclavethen: THEN;
palabraclaveendif: ENDIF;
palabraclaveincluirlibreria: INCLUDE;
palabraclavecreacionfuncion: FUNCTION;
palabraclavefuncionmain: MAIN;
palabraclavefunciondevolver: DEVOLVER;
palabraclaveinicio: BEGIN;
palabraclavefin: END;