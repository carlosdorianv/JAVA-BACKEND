Proceso VerificarParesImpares
    Definir num1, num2 Como Entero
	
    // Leer los dos números enteros
    Escribir "Ingrese el primer número entero:"
    Leer num1
    Escribir "Ingrese el segundo número entero:"
    Leer num2
	
    // Verificar si ambos números son pares
    Si (num1 mod 2 = 0) Y (num2 mod 2 = 0) Entonces
        Escribir "Ambos números son pares"
    Sino
        Escribir "Los números no son pares, o uno de ellos no es par"
    FinSi
FinProceso
