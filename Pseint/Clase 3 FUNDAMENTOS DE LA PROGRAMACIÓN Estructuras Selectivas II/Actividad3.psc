// 1. Tomar la orden de bebida para el desayuno.
// 2. Preguntar si el usuario quiere t� o caf�.
// 3. Si elige caf�, preguntar si lo quiere solo o cortado y con qu� tipo de leche.
// 4. Si elige t�, preguntar si desea rodajas de lim�n.
// 5. Mostrar el mensaje final acorde a la selecci�n del usuario.
// 6. Guardar el archivo como "Actividad3".

Algoritmo Actividad3
    Definir bebida Como Cadena
    Definir tipoCafe Como Cadena
    Definir leche Como Cadena
    Definir rodajasLimon Como Caracter
	
    Escribir "�Qu� bebida deseas? (T�/Caf�): "
    Leer bebida
	
    Si bebida = "Cafe" Entonces
        Escribir "�Lo quieres solo o cortado? (S/C): "
        Leer tipoCafe
        Si tipoCafe = "C" Entonces
            Escribir "�Con leche animal o vegetal? (A/V): "
            Leer leche
            Escribir "Has elegido caf� cortado con leche ", leche
        Sino
            Escribir "Has elegido caf� solo"
        Fin Si
    Sino Si bebida = "T�" Entonces
			Escribir "�Deseas rodajas de lim�n? (S/N): "
			Leer rodajasLimonn
			Si rodajasLim�n = "S" Entonces
				Escribir "Has elegido t� con rodajas de lim�n"
			Sino
				Escribir "Has elegido t� sin rodajas de lim�n"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
