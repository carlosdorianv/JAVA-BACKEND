Algoritmo calcular_18_procentaje
		//Definmimos el jugador y el porcentaje
		Definir jugador Como Real
		Definir porcentaje Como Real
		
		// Solicitar al usuario que ingrese el n�mero del jugador
		Escribir "Ingrese el n�mero del jugador: "
		Leer jugador
		
		// Verificar si el n�mero del jugador es mayor que 10
		Si jugador > 10 Entonces
			// Calcular el 18% del n�mero del jugador
			porcentaje = jugador * 0.18
			// Mostrar el resultado
			Escribir "El 18% del n�mero del jugador es: ", porcentaje
		FinSi
FinAlgoritmo
