// 1. Adivinar una vocal secreta.
// 2. Guardar el archivo como "Actividad1".

Algoritmo Actividad1
    Definir vocalSecreta Como Caracter
    Definir vocalIngresada Como Caracter
	
    vocalSecreta = "A" // Se puede cambiar la vocal secreta
	
    Repetir
        Escribir "Intenta adivinar la vocal secreta: "
        Leer vocalIngresada
		
        Si vocalIngresada = vocalSecreta Entonces
            Escribir "¡Correcto! Has adivinado la vocal secreta."
        Sino
            Escribir "Incorrecto, intenta de nuevo."
        Fin Si
    Hasta Que vocalIngresada = vocalSecreta
FinAlgoritmo
