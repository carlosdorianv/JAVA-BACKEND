Proceso AdivinarVocal
	
	Definir vocalSecreta, intento Como Caracter
	Definir numAleatorio Como Entero
	Definir jugarNuevamente Como Caracter
	
	jugarNuevamente = 'S'
	
	Mientras jugarNuevamente <> 'N' Y jugarNuevamente <> 'n' Hacer
		// Generar un número aleatorio entre 1 y 5
		numAleatorio = Aleatorio(1, 5)
		
		
		Segun numAleatorio Hacer
			1: vocalSecreta = 'a'
			2: vocalSecreta = 'e'
			3: vocalSecreta = 'i'
			4: vocalSecreta = 'o'
			5: vocalSecreta = 'u'
		FinSegun
		
		Escribir "Adivina la vocal secreta:"
		Leer intento
		intento = Minusculas(intento)
		escribir intento
		
		Mientras intento <> vocalSecreta Hacer
			Escribir "Incorrecto. Inténtalo de nuevo:"
			Leer intento
			intento = Minusculas(intento)
		FinMientras
		
		Escribir "Correcto. La vocal secreta era ", vocalSecreta, "."
		
		Escribir "¿Quieres jugar de nuevo? (S/N):"
		Leer jugarNuevamente
		
	FinMientras
	
	Escribir "Chau capo!"
	
FinProceso