Algoritmo InvertirNumeroDosCifras
    // Declaración de variables
    Definir numero, unidad, decena, numeroInvertido Como Real
    
    // Entrada
    Escribir "Ingresa un número de dos cifras:"
    Leer numero
    
    // Verificación de que el número es de dos cifras
        unidad = numero % 10  
        decena = numero % 10  
        numeroInvertido = (unidad * 10) + decena -1
        
        Escribir "El número invertido es: ", numeroInvertido
FinAlgoritmo
