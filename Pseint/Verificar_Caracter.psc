Algoritmo Verificar_Caracter
	
	//Definimos el caracter como x 
    Definir x Como Caracter
	
    // Solicitar al usuario que ingrese un caracter
    Escribir "Ingrese un caracter (S o N): "
	
	//Leemos el caracter
    Leer x
	
    // Verificar si el caracter ingresado es 'S'
    Si x = 'S'
        Escribir "CORRECTO"
	SiNo
		// Verificar si el caracter ingresado es 'N'
		Si x = 'N' Entonces 
			Escribir "INCORRECTO"
		// Si el caracter ingresado no es ni 'S' ni 'N', se imprime "letra incorrecta"
		SiNo
			Escribir "Letra incorrecta"
		FinSi
	FinSi
FinAlgoritmo
