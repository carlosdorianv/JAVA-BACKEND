Algoritmo Determinar_Paridad
    Definir x Como Entero
	
    // Solicitar al usuario que ingrese un n�mero entero
    Escribir "Ingrese un n�mero entero: "
    Leer x
	
    // Verificar si el n�mero es par usando la funci�n mod
    Si x mod 2 = 0 Entonces
        Escribir "El n�mero es par."
    Sino
        Escribir "El n�mero es impar."
    FinSi
	
FinAlgoritmo