Algoritmo InvertirNumeroDosCifras
    // Declaraci�n de variables
    Definir numero, unidad, decena, numeroInvertido Como Real
    
    // Entrada
    Escribir "Ingresa un n�mero de dos cifras:"
    Leer numero
    
    // Verificaci�n de que el n�mero es de dos cifras
        unidad = numero % 10  
        decena = numero % 10  
        numeroInvertido = (unidad * 10) + decena -1
        
        Escribir "El n�mero invertido es: ", numeroInvertido
FinAlgoritmo
