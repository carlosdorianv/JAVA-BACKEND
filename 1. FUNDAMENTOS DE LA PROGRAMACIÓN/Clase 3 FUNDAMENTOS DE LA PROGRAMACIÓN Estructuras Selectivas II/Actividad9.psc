// 1. Determinar la nota eliminada y el promedio de trabajos pr�cticos.
// 2. Guardar el archivo como "Actividad9".

Algoritmo Actividad9
    Definir nota1, nota2, nota3, nota4 Como Real
    Definir notaEliminada Como Real
    Definir promedio Como Real
	
    Escribir "Ingresa la nota 1: "
    Leer nota1
    Escribir "Ingresa la nota 2: "
    Leer nota2
    Escribir "Ingresa la nota 3: "
    Leer nota3
    Escribir "Ingresa la nota 4: "
    Leer nota4
	
    // Encontrar la nota m�s baja
    notaEliminada = nota1
    Si nota2 < notaEliminada Entonces
        notaEliminada = nota2
    Fin Si
    Si nota3 < notaEliminada Entonces
        notaEliminada = nota3
    Fin Si
    Si nota4 < notaEliminada Entonces
        notaEliminada = nota4
    Fin Si
	
    // Calcular el promedio de las tres notas m�s altas
    promedio = (nota1 + nota2 + nota3 + nota4 - notaEliminada) / 3
	
    Escribir "La nota eliminada es: ", notaEliminada
    Escribir "El promedio de los trabajos pr�cticos es: ", promedio
FinAlgoritmo
