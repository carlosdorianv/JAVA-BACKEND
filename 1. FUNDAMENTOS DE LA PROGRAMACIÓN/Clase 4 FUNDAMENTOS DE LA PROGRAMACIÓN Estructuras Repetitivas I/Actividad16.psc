
// ACTIVIDAD 16
// Implementa un programa que calcule la suma de los N primeros n�meros pares.
Proceso Actividad16
    Definir N, suma, contador Como Entero
    suma <- 0
    contador <- 0
	
    Escribir "Ingrese la cantidad de n�meros pares a sumar (N):"
    Leer N
	
    Mientras contador < N Hacer
        contador <- contador + 1
        suma <- suma + (contador * 2)  // Se suman los n�meros pares: 2, 4, 6, ...
    Fin Mientras
	
    Escribir "La suma de los primeros", N, "n�meros pares es:", suma
Fin Proceso
