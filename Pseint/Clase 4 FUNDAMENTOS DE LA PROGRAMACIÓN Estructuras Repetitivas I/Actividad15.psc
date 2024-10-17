// ACTIVIDAD 15
// Realiza un algoritmo para calcular la media de los números pares e impares. Se ingresarán diez números.
Proceso Actividad15
    Definir numero, sumaPares, sumaImpares, contadorPares, contadorImpares Como Entero
    sumaPares <- 0
    sumaImpares <- 0
    contadorPares <- 0
    contadorImpares <- 0
	
    Para i Desde 1 Hasta 10 Hacer
        Escribir "Ingrese un número:"
        Leer numero
		
        // Clasificar el número
        Si numero % 2 = 0 Entonces
            sumaPares <- sumaPares + numero
            contadorPares <- contadorPares + 1
        Sino
            sumaImpares <- sumaImpares + numero
            contadorImpares <- contadorImpares + 1
        Fin Si
    Fin Para
	
    // Mostrar resultados
    Si contadorPares > 0 Entonces
        Escribir "Promedio de números pares:", sumaPares / contadorPares
    Sino
        Escribir "No se ingresaron números pares."
    Fin Si
	
    Si contadorImpares > 0 Entonces
        Escribir "Promedio de números impares:", sumaImpares / contadorImpares
    Sino
        Escribir "No se ingresaron números impares."
    Fin Si
Fin Proceso