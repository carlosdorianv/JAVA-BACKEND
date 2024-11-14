// 17. Programa un juego en el que la computadora elija un número aleatorio entre 1 y 10.
Algoritmo Actividad17
    Definir n, x Como Entero
    n <- Aleatorio(1, 10)  // La computadora elige un número entre 1 y 10
	
    Repetir
        Escribir "Adivina el número entre 1 y 10: "
        Leer x
		
        Si x < n Entonces
            Escribir "El número secreto es mayor que ", x
        Sino
            Si x > n Entonces
                Escribir "El número secreto es menor que ", x
            Sino
                Escribir "¡Felicidades! Adivinaste el número ", n
            FinSi
        FinSi
    Hasta Que x = n
FinAlgoritmo
