Proceso VerificarParesImpares
    Definir num1, num2 Como Entero
	
    // Leer los dos n�meros enteros
    Escribir "Ingrese el primer n�mero entero:"
    Leer num1
    Escribir "Ingrese el segundo n�mero entero:"
    Leer num2
	
    // Verificar si ambos n�meros son pares
    Si (num1 mod 2 = 0) Y (num2 mod 2 = 0) Entonces
        Escribir "Ambos n�meros son pares"
    Sino
        Escribir "Los n�meros no son pares, o uno de ellos no es par"
    FinSi
FinProceso
