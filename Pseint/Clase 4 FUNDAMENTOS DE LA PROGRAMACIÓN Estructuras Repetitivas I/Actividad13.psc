// ACTIVIDAD 13
// Escribe un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin convertirlo a cadena.
Proceso Actividad13
    Definir numero, contador Como Entero
    contador <- 0
	
    Escribir "Ingrese un n�mero entero positivo:"
    Leer numero
	
    // Validar que el n�mero sea positivo
    Mientras numero <= 0 Hacer
        Escribir "Por favor, ingrese un n�mero positivo:"
        Leer numero
    Fin Mientras
	
    // Contar d�gitos
    Mientras numero > 0 Hacer
        numero <- numero / 10
        contador <- contador + 1
    Fin Mientras
	
    Escribir "El n�mero de d�gitos es:", contador
Fin Proceso