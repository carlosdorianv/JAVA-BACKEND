Algoritmo Actividad12
    Definir nombre Como Caracter
    Definir notaPractical Como Real
    Definir notaProblemas Como Real
    Definir notaTeorica Como Real
    Definir notaFinal Como Real
    Definir contador Como Entero
    contador <- 0
	
    Mientras Verdadero Hacer
        Escribir "Ingrese el nombre del alumno (o deje vacío para terminar):"
        Leer nombre
        Si nombre = "" Entonces
        Fin Si
		
        // Solicitar notas
        Repetir
            Escribir "Ingrese la nota práctica (0-10):"
            Leer notaPractical
            Si notaPractical < 0 O notaPractical > 10 Entonces
                Escribir "Error: La nota debe estar entre 0 y 10."
            Fin Si
        Hasta Que notaPractical >= 0 Y notaPractical <= 10
		
        Repetir
            Escribir "Ingrese la nota de problemas (0-10):"
            Leer notaProblemas
            Si notaProblemas < 0 O notaProblemas > 10 Entonces
                Escribir "Error: La nota debe estar entre 0 y 10."
            Fin Si
        Hasta Que notaProblemas >= 0 Y notaProblemas <= 10
		
        Repetir
            Escribir "Ingrese la nota teórica (0-10):"
            Leer notaTeorica
            Si notaTeorica < 0 O notaTeorica > 10 Entonces
                Escribir "Error: La nota debe estar entre 0 y 10."
            Fin Si
        Hasta Que notaTeorica >= 0 Y notaTeorica <= 10
		
        // Calcular la nota final
        notaFinal <- (notaPractical * 0.1) + (notaProblemas * 0.5) + (notaTeorica * 0.4)
        Escribir "La nota final de ", nombre, " es: ", notaFinal
        contador <- contador + 1
    Fin Mientras
	
    Escribir "Total de alumnos procesados: ", contador
Fin Algoritmo
