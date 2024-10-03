Algoritmo VerificarCapicua
    // Declarar variables
    Definir numero, cifra1, cifra2, cifra3 Como Entero
	
    // Leer el número de tres cifras
    Escribir "Introduce un número de tres cifras:"
    Leer numero
	
    // Extraer las cifras del número
    cifra1 = trunc( numero / 100 )
    cifra2 = trunc((numero mod 100) / 10)
    cifra3 = numero mod 10
	
    // Verificar si el número es capicúa
    Si cifra1 = cifra3 Entonces
        Escribir "El número es capicúa."
    Sino
        Escribir "El número no es capicúa."
    FinSi
FinAlgoritmo
