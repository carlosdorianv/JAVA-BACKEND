Algoritmo VerificarCapicua
    // Declarar variables
    Definir numero, cifra1, cifra2, cifra3 Como Entero
	
    // Leer el n�mero de tres cifras
    Escribir "Introduce un n�mero de tres cifras:"
    Leer numero
	
    // Extraer las cifras del n�mero
    cifra1 = trunc( numero / 100 )
    cifra2 = trunc((numero mod 100) / 10)
    cifra3 = numero mod 10
	
    // Verificar si el n�mero es capic�a
    Si cifra1 = cifra3 Entonces
        Escribir "El n�mero es capic�a."
    Sino
        Escribir "El n�mero no es capic�a."
    FinSi
FinAlgoritmo
