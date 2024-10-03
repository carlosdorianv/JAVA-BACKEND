//Crea una función que devuelva el término n de la sucesión de Fibonacci. La sucesión de Fibonacci es:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ... donde cada número se calcula sumando los dos anteriores.
Algoritmo Calcular_Fibonacci
	Definir n Como Entero
	Definir resultado Como Entero
	
	Escribir "Ingrese el valor de n:"
	Leer n
	
	resultado <- Fibonacci(n)
	
	Escribir "El término ", n, " de la sucesión de Fibonacci es: ", resultado
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