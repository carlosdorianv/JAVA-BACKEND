// ACTIVIDAD 14
// Escribe un programa que solicite al usuario ingresar números enteros hasta que se introduzca el número 0. 
// Al finalizar, el programa deberá mostrar el número máximo ingresado, el mínimo y el promedio de todos ellos.
Proceso Actividad14
    Definir numero, numeroMaximo, numeroMinimo, suma Como Entero
    Definir contador Como Entero
    numeroMaximo <- 0
    numeroMinimo <- 99999  // Valor alto inicial
    suma <- 0
    contador <- 0
	
    Escribir "Ingrese números enteros (0 para finalizar):"
    Leer numero
	
    Mientras numero <> 0 Hacer
        // Actualizar número máximo
        Si numero > numeroMaximo Entonces
            numeroMaximo <- numero
        Fin Si
		
        // Actualizar número mínimo
        Si numero < numeroMinimo Entonces
            numeroMinimo <- numero
        Fin Si
		
        suma <- suma + numero
        contador <- contador + 1
        Leer numero
    Fin Mientras
	
    Si contador > 0 Entonces
        Escribir "Número máximo:", numeroMaximo
        Escribir "Número mínimo:", numeroMinimo
        Escribir "Promedio:", suma / contador
    Sino
        Escribir "No se ingresaron números."
    Fin Si
Fin Proceso