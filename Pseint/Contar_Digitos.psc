Proceso Contar_Digitos
    // Declaraci�n de variables
    Definir numero, contador Como Entero
    Definir temporal Como Entero
	
    // Inicializamos el contador de d�gitos en 0
    contador = 0
	
    // Solicitamos al usuario que ingrese un n�mero entero
    Escribir "Ingrese un n�mero entero: "
    Leer numero
	
    // Copiamos el valor del n�mero a una variable temporal para no modificar el original
    temporal = Abs(numero)  // Usamos el valor absoluto para evitar problemas con n�meros negativos
	
    // Bucle para contar la cantidad de d�gitos
    Mientras temporal > 0 Hacer
        temporal = trunc(temporal / 10)  // Dividimos el n�mero por 10 y truncamos el resultado
        contador = contador + 1  // Incrementamos el contador de d�gitos
    Fin Mientras
	
    // Si el n�mero ingresado es 0, el contador debe ser 1
    Si numero = 0 Entonces
        contador = 1
    Fin Si
	
    // Mostrar el resultado
    Escribir "El n�mero tiene ", contador, " d�gitos."
FinProceso
