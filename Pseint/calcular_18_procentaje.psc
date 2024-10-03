Algoritmo calcular_18_procentaje
		//Definmimos el jugador y el porcentaje
		Definir jugador Como Real
		Definir porcentaje Como Real
		
		// Solicitar al usuario que ingrese el número del jugador
		Escribir "Ingrese el número del jugador: "
		Leer jugador
		
		// Verificar si el número del jugador es mayor que 10
		Si jugador > 10 Entonces
			// Calcular el 18% del número del jugador
			porcentaje = jugador * 0.18
			// Mostrar el resultado
			Escribir "El 18% del número del jugador es: ", porcentaje
		FinSi
FinAlgoritmo
