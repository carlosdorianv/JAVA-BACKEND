// 1. Sumar n�meros hasta que supere un l�mite positivo.
// 2. Guardar el archivo como "Actividad3".

Algoritmo Actividad3
    Definir limite, suma Como Real
    suma = 0
	
    Escribir "Ingresa un l�mite positivo: "
    Leer limite
	
    Mientras suma <= limite Hacer
        Definir numero Como Real
        Escribir "Ingresa un n�mero: "
        Leer numero
        suma = suma + numero
    Fin Mientras
	
    Escribir "La suma de los n�meros es: ", suma
FinAlgoritmo
