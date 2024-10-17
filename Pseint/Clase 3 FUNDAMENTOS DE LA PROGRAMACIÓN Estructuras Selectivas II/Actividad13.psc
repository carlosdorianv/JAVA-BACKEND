// 1. Solicitar al usuario su edad y determinar su categoría.
// 2. Guardar el archivo como "Actividad13".

Algoritmo Actividad13
    Definir edad Como Entero
    Definir respuesta Como Cadena
	
    Escribir "Ingresa tu edad: "
    Leer edad
	
    Si edad < 13 Entonces
        Escribir "Eres un niño."
        Escribir "¿Te gusta hacer deportes o jugar a los videojuegos? (D/V): "
        Leer respuesta
        Si respuesta = "D" Entonces
            Escribir "¡Genial! A disfrutar de los deportes."
        Sino
            Escribir "¡Qué divertido! A jugar videojuegos."
        Fin Si
    Sino Si edad >= 13 Y edad < 18 Entonces
			Escribir "Eres un adolescente."
		Sino Si edad >= 18 Y edad < 65 Entonces
				Escribir "Eres un adulto."
				Escribir "¿Eres estudiante o trabajador? (E/T): "
				Leer respuesta
				Si respuesta = "E" Entonces
					Escribir "¡Sigue estudiando!"
				Sino
					Escribir "¡Buen trabajo!"
				Fin Si
			Sino
				Escribir "Eres un adulto mayor."
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
