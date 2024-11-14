// 1. Calcular el promedio de una secuencia de números ingresados hasta -1.
// 2. Guardar el archivo como "Actividad7".

Algoritmo Actividad7
    Definir numero, suma Como Real
    Definir contador Como Entero
    suma = 0
    contador = 0
	
    Escribir "Ingresa números para calcular el promedio. Finaliza con -1."
	
    Mientras Verdadero Hacer
        Leer numero
        Si numero = -1 Entonces
		
        Fin Si
		
        suma = suma + numero
        contador = contador + 1
    Fin Mientras
	
    Si contador > 0 Entonces
        Escribir "El promedio es: ", suma / contador
    Sino
        Escribir "No se ingresaron números para calcular el promedio."
    Fin Si
FinAlgoritmo
