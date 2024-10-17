// 1. Obtener el grado de eficiencia de un operario.
// 2. Evaluar las condiciones de producción de tornillos defectuosos y no defectuosos.
// 3. Mostrar el grado de eficiencia correspondiente.
// 4. Guardar el archivo como "Actividad4".

Algoritmo Actividad4
    Definir tornillosDefectuosos, tornillosNoDefectuosos Como Entero
    Definir gradoEficiencia Como Entero
	
    Escribir "Ingrese la cantidad de tornillos defectuosos: "
    Leer tornillosDefectuosos
    Escribir "Ingrese la cantidad de tornillos no defectuosos: "
    Leer tornillosNoDefectuosos
	
    Si tornillosDefectuosos >= 200 Y tornillosNoDefectuosos <= 10000 Entonces
        gradoEficiencia = 5
    Sino Si tornillosDefectuosos < 200 Y tornillosNoDefectuosos > 10000 Entonces
			gradoEficiencia = 8
		Sino Si tornillosDefectuosos < 200 Entonces
				gradoEficiencia = 6
			Sino
				gradoEficiencia = 7
			Fin Si
			
			Escribir "El grado de eficiencia del operario es: ", gradoEficiencia
		Fin Si
	Fin Si
FinAlgoritmo
