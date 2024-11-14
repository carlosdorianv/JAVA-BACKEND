// 1. Contar números dentro de un intervalo definido por el usuario.
// 2. Guardar el archivo como "Actividad9".

Algoritmo Actividad9
    Definir minimo, maximo, numero Como Entero
    Definir contador Como Entero
    contador = 0
	
    Escribir "Ingresa el número mínimo: "
    Leer minimo
    Escribir "Ingresa el número máximo: "
    Leer maximo
	
    Mientras Verdadero Hacer
        Escribir "Ingresa un número dentro del intervalo: "
        Leer numero
		
        Si numero < minimo O numero > maximo Entonces
            
        Fin Si
		
        contador = contador + 1
    Fin Mientras
	
    Escribir "Cantidad de números ingresados dentro del intervalo: ", contador
FinAlgoritmo
