Algoritmo Paridad
	
	Definir num1 Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese un numero para verificar su paridad"
	Leer num1
	resultado = EsImpar(num1)
	Escribir "El numero ingresado es impar?: ", resultado
	
FinAlgoritmo

Funcion varFuncion = EsImpar(num1)
	Definir varFuncion Como Logico
	
	Si num1 % 2 = 0 Entonces
		varFuncion = Falso
	SiNo
		varFuncion = Verdadero
	FinSi
FinFuncion