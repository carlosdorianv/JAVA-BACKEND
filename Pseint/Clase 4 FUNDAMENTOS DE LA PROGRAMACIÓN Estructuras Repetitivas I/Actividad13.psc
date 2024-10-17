// ACTIVIDAD 13
// Escribe un programa que calcule cuántos dígitos tiene un número entero positivo sin convertirlo a cadena.
Proceso Actividad13
    Definir numero, contador Como Entero
    contador <- 0
	
    Escribir "Ingrese un número entero positivo:"
    Leer numero
	
    // Validar que el número sea positivo
    Mientras numero <= 0 Hacer
        Escribir "Por favor, ingrese un número positivo:"
        Leer numero
    Fin Mientras
	
    // Contar dígitos
    Mientras numero > 0 Hacer
        numero <- numero / 10
        contador <- contador + 1
    Fin Mientras
	
    Escribir "El número de dígitos es:", contador
Fin Proceso