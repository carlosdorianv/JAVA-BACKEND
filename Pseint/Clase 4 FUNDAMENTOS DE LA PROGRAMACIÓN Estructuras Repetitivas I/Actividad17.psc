// 17. Programa un juego en el que la computadora elija un n�mero aleatorio entre 1 y 10.
Algoritmo Actividad17
    Definir n, x Como Entero
    n <- Aleatorio(1, 10)  // La computadora elige un n�mero entre 1 y 10
	
    Repetir
        Escribir "Adivina el n�mero entre 1 y 10: "
        Leer x
		
        Si x < n Entonces
            Escribir "El n�mero secreto es mayor que ", x
        Sino
            Si x > n Entonces
                Escribir "El n�mero secreto es menor que ", x
            Sino
                Escribir "�Felicidades! Adivinaste el n�mero ", n
            FinSi
        FinSi
    Hasta Que x = n
FinAlgoritmo
