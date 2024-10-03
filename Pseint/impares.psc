Algoritmo impares
	Definir num Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingresa tu numero: "
	Leer num
	
	resultado = digitosImpares(num)
	
	Si resultado == Verdadero Entonces
		Escribir "Todos los digitos son impares"
	SiNo
		Escribir "No todos los numeros son impares"
	FinSi
	
FinAlgoritmo

funcion varResultado = digitosImpares (num)
	Definir digito Como Entero
	Definir es_impar Como Logico
	es_impar = Verdadero
	Definir varResultado Como logico
	
	Mientras num > 0 Hacer
		digito <- num Mod 10 // Obtiene el último dígito
		Si (digito Mod 2 = 0) Entonces
			es_impar <- Falso // El dígito es par, por lo tanto, no todos son impares
		FinSi
		num <- Trunc(num / 10) // Elimina el último dígito
	FinMientras
	
	varResultado = es_impar
FinFuncion