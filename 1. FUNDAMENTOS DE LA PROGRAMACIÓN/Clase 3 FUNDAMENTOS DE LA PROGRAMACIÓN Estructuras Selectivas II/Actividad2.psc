// 1. Desarrollar un programa que simule un men� de opciones para realizar operaciones aritm�ticas.
// 2. Solicitar dos valores num�ricos enteros y la operaci�n deseada.
// 3. Realizar la operaci�n y mostrar el resultado.
// 4. Guardar el archivo como "Actividad2".

Algoritmo Actividad2
    Definir num1, num2 Como Entero
    Definir operacion Como Caracter
    Escribir "Ingresa el primer n�mero: "
    Leer num1
    Escribir "Ingresa el segundo n�mero: "
    Leer num2
    Escribir "Elige la operaci�n: S (Suma), R (Resta), M (Multiplicaci�n), D (Divisi�n): "
    Leer operacion
	
    Segun operacion Hacer
        'S': Escribir "Resultado: ", num1 + num2
        'R': Escribir "Resultado: ", num1 - num2
        'M': Escribir "Resultado: ", num1 * num2
        'D': Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
			Sino
                Escribir "Error: Divisi�n por cero."
			Fin Si
        De Otro Modo: Escribir "Operaci�n no v�lida."
    Fin Segun
FinAlgoritmo
