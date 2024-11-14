// 1. Sumar números hasta que supere un límite positivo.
// 2. Guardar el archivo como "Actividad3".

Algoritmo Actividad3
    Definir limite, suma Como Real
    suma = 0
	
    Escribir "Ingresa un límite positivo: "
    Leer limite
	
    Mientras suma <= limite Hacer
        Definir numero Como Real
        Escribir "Ingresa un número: "
        Leer numero
        suma = suma + numero
    Fin Mientras
	
    Escribir "La suma de los números es: ", suma
FinAlgoritmo
