Algoritmo OperacionesAritmeticas
    // Este algoritmo permite al usuario elegir una operación aritmética básica
    // (suma, resta, multiplicación, división) e ingresa dos valores enteros.
	
    Definir num1, num2 Como Entero
	Definir resultado Como Real
    Definir operacion Como Caracter
	
    Escribir "Ingresa el primer número: "
    Leer num1
    Escribir "Ingresa el segundo número: "
    Leer num2
    Escribir "Selecciona la operación deseada:"
    Escribir "+ para Suma"
    Escribir "R para Resta"
    Escribir "M para Multiplicación"
    Escribir "D para División"

    Leer operacion
	
    Segun operacion Hacer
		//ASCII
        "+": 
            resultado = num1 + num2
            Escribir "El resultado de la suma es: ", resultado
        "R": 
            resultado = num1 - num2
            Escribir "El resultado de la resta es: ", resultado
        "M": 
            resultado = num1 * num2
            Escribir "El resultado de la multiplicación es: ", resultado
        "D": 
            Si num2 =! 0 Entonces
                resultado = num1 / num2
                Escribir "El resultado de la división es: ", resultado
            Sino
                Escribir "Error: No se puede dividir por cero."
            FinSi
    FinSegun
FinAlgoritmo
