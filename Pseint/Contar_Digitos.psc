Proceso Contar_Digitos
    // Declaración de variables
    Definir numero, contador Como Entero
    Definir temporal Como Entero
	
    // Inicializamos el contador de dígitos en 0
    contador = 0
	
    // Solicitamos al usuario que ingrese un número entero
    Escribir "Ingrese un número entero: "
    Leer numero
	
    // Copiamos el valor del número a una variable temporal para no modificar el original
    temporal = Abs(numero)  // Usamos el valor absoluto para evitar problemas con números negativos
	
    // Bucle para contar la cantidad de dígitos
    Mientras temporal > 0 Hacer
        temporal = trunc(temporal / 10)  // Dividimos el número por 10 y truncamos el resultado
        contador = contador + 1  // Incrementamos el contador de dígitos
    Fin Mientras
	
    // Si el número ingresado es 0, el contador debe ser 1
    Si numero = 0 Entonces
        contador = 1
    Fin Si
	
    // Mostrar el resultado
    Escribir "El número tiene ", contador, " dígitos."
FinProceso
