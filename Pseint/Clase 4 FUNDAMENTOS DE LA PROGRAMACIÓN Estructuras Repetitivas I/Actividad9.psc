// 1. Contar n�meros dentro de un intervalo definido por el usuario.
// 2. Guardar el archivo como "Actividad9".

Algoritmo Actividad9
    Definir minimo, maximo, numero Como Entero
    Definir contador Como Entero
    contador = 0
	
    Escribir "Ingresa el n�mero m�nimo: "
    Leer minimo
    Escribir "Ingresa el n�mero m�ximo: "
    Leer maximo
	
    Mientras Verdadero Hacer
        Escribir "Ingresa un n�mero dentro del intervalo: "
        Leer numero
		
        Si numero < minimo O numero > maximo Entonces
            
        Fin Si
		
        contador = contador + 1
    Fin Mientras
	
    Escribir "Cantidad de n�meros ingresados dentro del intervalo: ", contador
FinAlgoritmo
