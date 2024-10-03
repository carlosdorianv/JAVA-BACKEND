Proceso DeterminarAprobacion
    Definir nota1, nota2, nota3 Como Real
    Definir promedio Como Real
	
    // Leer las tres notas
    Escribir "Ingrese la primera nota:"
    Leer nota1
    Escribir "Ingrese la segunda nota:"
    Leer nota2
    Escribir "Ingrese la tercera nota:"
    Leer nota3
	
    // Calcular el promedio
    promedio = (nota1 + nota2 + nota3) / 3
	
    // Verificar si el alumno aprueba o reprueba
    Si promedio >= 70 Entonces
        Escribir "El alumno aprueba el curso"
    Sino
        Escribir "El alumno reprueba el curso"
    FinSi
FinProceso
