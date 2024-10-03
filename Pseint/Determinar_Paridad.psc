Algoritmo Determinar_Paridad
    Definir x Como Entero
	
    // Solicitar al usuario que ingrese un número entero
    Escribir "Ingrese un número entero: "
    Leer x
	
    // Verificar si el número es par usando la función mod
    Si x mod 2 = 0 Entonces
        Escribir "El número es par."
    Sino
        Escribir "El número es impar."
    FinSi
	
FinAlgoritmo