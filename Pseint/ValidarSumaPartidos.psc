Proceso ValidarSumaPartidos
    Definir partido1, partido2, partido3 Como Entero
    Definir suma Como Entero
    Definir esValido Como Logico
	
    // Leer los resultados de los partidos
    Escribir "Ingrese el resultado del primer partido:"
    Leer partido1
    Escribir "Ingrese el resultado del segundo partido:"
    Leer partido2
    Escribir "Ingrese el resultado del tercer partido:"
    Leer partido3
	
    // Calcular la suma de los resultados
    suma = partido1 + partido2 + partido3
	
    // Validar la suma
    Si suma >= 1 Y suma <= 10 Entonces
        esValido = Verdadero
    Sino
        esValido = Falso
    FinSi
	
    // Mostrar si los resultados son correctos
    Si esValido Entonces
        Escribir "Los resultados son correctos"
    Sino
        Escribir "Los resultados no son correctos"
    FinSi
FinProceso
