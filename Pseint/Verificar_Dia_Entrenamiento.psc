Algoritmo Verificar_Dia_Entrenamiento
    Definir dia Como Caracter
	
    // Solicitar al usuario que ingrese un d�a de la semana
    Escribir "Ingrese un d�a de la semana en may�sculas: "
    Leer dia
	
    // Verificar si el d�a es un d�a de entrenamiento (lunes a jueves)
    Si dia = "LUNES" O dia = "MARTES" O dia = "MI�RCOLES" O dia = "JUEVES" Entonces
        Escribir "Es un d�a de entrenamiento."
    Sino
        Escribir "No es un d�a de entrenamiento."
    FinSi
	
FinAlgoritmo
