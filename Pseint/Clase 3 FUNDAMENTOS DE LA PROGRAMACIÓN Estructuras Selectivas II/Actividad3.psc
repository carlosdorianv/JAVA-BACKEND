// 1. Tomar la orden de bebida para el desayuno.
// 2. Preguntar si el usuario quiere té o café.
// 3. Si elige café, preguntar si lo quiere solo o cortado y con qué tipo de leche.
// 4. Si elige té, preguntar si desea rodajas de limón.
// 5. Mostrar el mensaje final acorde a la selección del usuario.
// 6. Guardar el archivo como "Actividad3".

Algoritmo Actividad3
    Definir bebida Como Cadena
    Definir tipoCafe Como Cadena
    Definir leche Como Cadena
    Definir rodajasLimon Como Caracter
	
    Escribir "¿Qué bebida deseas? (Té/Café): "
    Leer bebida
	
    Si bebida = "Cafe" Entonces
        Escribir "¿Lo quieres solo o cortado? (S/C): "
        Leer tipoCafe
        Si tipoCafe = "C" Entonces
            Escribir "¿Con leche animal o vegetal? (A/V): "
            Leer leche
            Escribir "Has elegido café cortado con leche ", leche
        Sino
            Escribir "Has elegido café solo"
        Fin Si
    Sino Si bebida = "Té" Entonces
			Escribir "¿Deseas rodajas de limón? (S/N): "
			Leer rodajasLimonn
			Si rodajasLimón = "S" Entonces
				Escribir "Has elegido té con rodajas de limón"
			Sino
				Escribir "Has elegido té sin rodajas de limón"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
