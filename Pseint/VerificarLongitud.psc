Proceso VerificarLongitud
    Definir nombre Como Cadena
	
    // Solicitar al usuario que ingrese una palabra o frase
    Escribir "Ingrese una palabra o frase de exactamente 6 caracteres:"
    Leer nombre
	
    // Verificar la longitud del texto ingresado
    Si Longitud(nombre) = 6 Entonces
        Escribir "LONGITUD CORRECTA"
    Sino
        Escribir "LONGITUD INCORRECTA"
    FinSi
FinProceso