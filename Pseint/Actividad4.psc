Algoritmo Actividad4
	Definir vector Como Logico
	dimension vector[5]
	definir variable como logico
	Definir i Como Entero
	i=1
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
        Repetir
            Escribir "Ingrese valor l�gico (verdadero o falso) para la posici�n ", i, ": "
            Leer variable
			Hasta Que variable = Verdadero O variable = Falso
				Si variable = Verdadero Entonces vector[i] = Verdadero
				SiNo vector[i] = Falso
			Escribir "Ingrese una variable valida"
        FinSi
    FinPara
	
	
	Escribir "El vector original es:"
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Escribir "Posici�n ", i + 1, ": ", vector[i]
	FinPara
	
	
	
FinAlgoritmo