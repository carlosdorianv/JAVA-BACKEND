// 1. Validar si una nota está entre 0 y 10.
// 2. Guardar el archivo como "Actividad2".

Algoritmo Actividad2
    Definir nota Como Real
	
    Hacer
        Escribir "Ingresa una nota (0-10): "
        Leer nota
        Si nota < 0 O nota > 10 Entonces
            Escribir "Nota no válida. Intenta de nuevo."
        Fin Si
		Mientras nota < 0 O nota > 10
			
			Escribir "Nota válida: ", nota
FinAlgoritmo
