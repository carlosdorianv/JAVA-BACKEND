Algoritmo Actividad11

// 1. Solicitar al usuario ingresar las anotaciones de los últimos 3 partidos.
// 2. Verificar si la suma de las anotaciones está entre 1 y 10.


Definir gol1, gol2, gol3, sumaGoles Como Entero
Definir resultadoValido Como Logico
Escribir "Ingresa las anotaciones del primer partido: "
Leer gol1
Escribir "Ingresa las anotaciones del segundo partido: "
Leer gol2
Escribir "Ingresa las anotaciones del tercer partido: "
Leer gol3
sumaGoles = gol1 + gol2 + gol3
resultadoValido = sumaGoles >= 1 Y sumaGoles <= 10
Si resultadoValido Entonces
	Escribir "Los resultados son correctos."
SiNo
	Escribir "Los resultados no son correctos."
FinSi
FinAlgoritmo
