Algoritmo ContarLetraEnFrase
	// Declaración de variables
	Definir frase Como Cadena
	Definir letra Como Caracter
	Definir contador, i Como Entero
	
	// Entrada de datos
	Escribir "Ingresa una frase: "
	Leer frase
	Escribir "Ingresa la letra que deseas contar: "
	Leer letra
	
	// Inicializar el contador
	contador = 0
	
	// Bucle para recorrer la frase
	Para i = 1 Hasta Longitud(frase) Hacer
		// Si la letra actual de la frase es igual a la letra ingresada
		Si SubCadena(frase, i, 1) = letra Entonces
			contador <- contador + 1
		FinSi
	Fin Para
	
	// Mostrar el resultado
Escribir "La letra", letra, " aparece ", contador, " veces en la frase."
FinAlgoritmo
