Algoritmo Verificar_Dia_Entrenamiento
    Definir dia Como Caracter
	
    // Solicitar al usuario que ingrese un día de la semana
    Escribir "Ingrese un día de la semana en mayúsculas: "
    Leer dia
	
    // Verificar si el día es un día de entrenamiento (lunes a jueves)
    Si dia = "LUNES" O dia = "MARTES" O dia = "MIÉRCOLES" O dia = "JUEVES" Entonces
        Escribir "Es un día de entrenamiento."
    Sino
        Escribir "No es un día de entrenamiento."
    FinSi
	
FinAlgoritmo
