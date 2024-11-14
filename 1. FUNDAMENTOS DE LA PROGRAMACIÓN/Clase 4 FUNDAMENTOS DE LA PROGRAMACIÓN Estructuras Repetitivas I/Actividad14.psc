// ACTIVIDAD 14
// Escribe un programa que solicite al usuario ingresar n�meros enteros hasta que se introduzca el n�mero 0. 
// Al finalizar, el programa deber� mostrar el n�mero m�ximo ingresado, el m�nimo y el promedio de todos ellos.
Proceso Actividad14
    Definir numero, numeroMaximo, numeroMinimo, suma Como Entero
    Definir contador Como Entero
    numeroMaximo <- 0
    numeroMinimo <- 99999  // Valor alto inicial
    suma <- 0
    contador <- 0
	
    Escribir "Ingrese n�meros enteros (0 para finalizar):"
    Leer numero
	
    Mientras numero <> 0 Hacer
        // Actualizar n�mero m�ximo
        Si numero > numeroMaximo Entonces
            numeroMaximo <- numero
        Fin Si
		
        // Actualizar n�mero m�nimo
        Si numero < numeroMinimo Entonces
            numeroMinimo <- numero
        Fin Si
		
        suma <- suma + numero
        contador <- contador + 1
        Leer numero
    Fin Mientras
	
    Si contador > 0 Entonces
        Escribir "N�mero m�ximo:", numeroMaximo
        Escribir "N�mero m�nimo:", numeroMinimo
        Escribir "Promedio:", suma / contador
    Sino
        Escribir "No se ingresaron n�meros."
    Fin Si
Fin Proceso