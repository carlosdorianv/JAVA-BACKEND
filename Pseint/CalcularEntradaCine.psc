Proceso CalcularEntradaCine
    Definir edad Como Entero
    Definir costo Como Real
	
    // Leer la edad de la persona
    Escribir "Ingrese su edad:"
    Leer edad
	
    // Calcular el costo de la entrada
    costo = 5
	
    Si edad < 12 Entonces
        costo = costo * 0.7
    FinSi
	
    Escribir "El costo de la entrada es: ", costo
FinProceso
