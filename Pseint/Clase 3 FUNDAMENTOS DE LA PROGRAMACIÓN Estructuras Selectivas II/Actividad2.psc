// 1. Desarrollar un programa que simule un menú de opciones para realizar operaciones aritméticas.
// 2. Solicitar dos valores numéricos enteros y la operación deseada.
// 3. Realizar la operación y mostrar el resultado.
// 4. Guardar el archivo como "Actividad2".

Algoritmo Actividad2
    Definir num1, num2 Como Entero
    Definir operacion Como Caracter
    Escribir "Ingresa el primer número: "
    Leer num1
    Escribir "Ingresa el segundo número: "
    Leer num2
    Escribir "Elige la operación: S (Suma), R (Resta), M (Multiplicación), D (División): "
    Leer operacion
	
    Segun operacion Hacer
        'S': Escribir "Resultado: ", num1 + num2
        'R': Escribir "Resultado: ", num1 - num2
        'M': Escribir "Resultado: ", num1 * num2
        'D': Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
			Sino
                Escribir "Error: División por cero."
			Fin Si
        De Otro Modo: Escribir "Operación no válida."
    Fin Segun
FinAlgoritmo
