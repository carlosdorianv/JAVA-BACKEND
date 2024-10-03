Proceso ValidarPrimeraLetra
    Definir nombre Como Cadena
	
    // Solicitar el nombre del equipo
    Escribir "Ingrese el nombre del equipo:"
    Leer nombre
	
    // Verificar la primera letra
    Si Subcadena(nombre, 0, 0) = "A" Entonces
        Escribir "CORRECTO"
    Sino
        Escribir "INCORRECTO"
    FinSi
FinProceso