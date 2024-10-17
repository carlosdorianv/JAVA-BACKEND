// 1. Programa que solicita un número entero positivo y pregunta si desea introducir otro.
// 2. Guardar el archivo como "Actividad6".

Algoritmo Actividad6
    Definir numero Como Entero
    Definir continuar Como Caracter
    Definir suma Como Entero
    suma = 0
	
    Repetir
        Escribir "Ingresa un número entero positivo: "
        Leer numero
        suma = suma + numero
		
        Escribir "¿Deseas ingresar otro número? (s/n): "
        Leer continuar
    Hasta Que continuar = "n" O continuar = "N"
	
    Escribir "La suma de los números ingresados es: ", suma
FinAlgoritmo
