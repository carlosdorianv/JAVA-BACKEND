Proceso ConcatenarSigno
    Definir nombre Como Cadena
    Definir resultado Como Cadena
	
    // Solicitar la entrada del usuario
    Escribir "Ingrese una palabra o frase:"
    Leer nombre
	
    // Verificar la longitud y concatenar el signo apropiado
    Si Longitud(nombre) == 4 Entonces
        resultado = Concatenar(nombre, "!")
    Sino
        resultado = Concatenar(nombre, "?")
    FinSi
	
    Escribir "La frase final es: ", resultado
FinProceso
