Algoritmo CalcularCostoAlquiler
    // Declarar variables
    Definir horas, minutosExtra, litrosNafta, costoTotal Como Real
	
    // Leer el tiempo transcurrido en horas
    Escribir "Ingrese el tiempo transcurrido en horas:"
    Leer horas
	
    // Condición para determinar el costo
    Si horas <= 2 Entonces
        // Costo fijo si se devuelve dentro de las 2 horas
        costoTotal = 400
        Escribir "El costo total es: $", costoTotal, " pesos."
    Sino
        // Calcular los minutos extra después de las 2 horas
        minutosExtra = (horas - 2) * 60
		
        // Leer la cantidad de litros de nafta consumidos
        Escribir "Ingrese la cantidad de litros de nafta consumidos:"
        Leer litrosNafta
		
        // Calcular el costo total
        costoTotal = 400 + (litrosNafta * 40) + (minutosExtra * 5.2)
        Escribir "El costo total es: $", costoTotal, " pesos."
    FinSi
FinAlgoritmo
