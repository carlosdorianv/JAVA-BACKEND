// ACTIVIDAD 15
// Realiza un algoritmo para calcular la media de los n�meros pares e impares. Se ingresar�n diez n�meros.
Proceso Actividad15
    Definir numero, sumaPares, sumaImpares, contadorPares, contadorImpares Como Entero
    sumaPares <- 0
    sumaImpares <- 0
    contadorPares <- 0
    contadorImpares <- 0
	
    Para i Desde 1 Hasta 10 Hacer
        Escribir "Ingrese un n�mero:"
        Leer numero
		
        // Clasificar el n�mero
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
        Escribir "Promedio de n�meros pares:", sumaPares / contadorPares
    Sino
        Escribir "No se ingresaron n�meros pares."
    Fin Si
	
    Si contadorImpares > 0 Entonces
        Escribir "Promedio de n�meros impares:", sumaImpares / contadorImpares
    Sino
        Escribir "No se ingresaron n�meros impares."
    Fin Si
Fin Proceso