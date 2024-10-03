Algoritmo OperacionesAritmeticas
    // Este algoritmo permite al usuario elegir una operaci�n aritm�tica b�sica
    // (suma, resta, multiplicaci�n, divisi�n) e ingresa dos valores enteros.
	
    Definir num1, num2 Como Entero
	Definir resultado Como Real
    Definir operacion Como Caracter
	
    Escribir "Ingresa el primer n�mero: "
    Leer num1
    Escribir "Ingresa el segundo n�mero: "
    Leer num2
    Escribir "Selecciona la operaci�n deseada:"
    Escribir "+ para Suma"
    Escribir "R para Resta"
    Escribir "M para Multiplicaci�n"
    Escribir "D para Divisi�n"

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
            Escribir "El resultado de la multiplicaci�n es: ", resultado
        "D": 
            Si num2 =! 0 Entonces
                resultado = num1 / num2
                Escribir "El resultado de la divisi�n es: ", resultado
            Sino
                Escribir "Error: No se puede dividir por cero."
            FinSi
    FinSegun
FinAlgoritmo
