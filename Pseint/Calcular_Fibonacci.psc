//Crea una funci�n que devuelva el t�rmino n de la sucesi�n de Fibonacci. La sucesi�n de Fibonacci es:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ... donde cada n�mero se calcula sumando los dos anteriores.
Algoritmo Calcular_Fibonacci
	Definir n Como Entero
	Definir resultado Como Entero
	
	Escribir "Ingrese el valor de n:"
	Leer n
	
	resultado <- Fibonacci(n)
	
	Escribir "El t�rmino ", n, " de la sucesi�n de Fibonacci es: ", resultado
FinAlgoritmo

Funcion resultado = Fibonacci(n)
	Definir resultado Como Entero
	
	Si n=0 Entonces
		resultado<- 0
	SiNo
		Si n=1 Entonces
			resultado <- 1
		SiNo
			resultado <- Fibonacci(n-1) + Fibonacci(n-2)
		FinSi
		
	FinSi
	
FinFuncion