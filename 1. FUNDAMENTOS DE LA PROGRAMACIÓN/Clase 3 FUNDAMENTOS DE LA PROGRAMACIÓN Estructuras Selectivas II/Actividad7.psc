// 1. Determinar si un a�o es bisiesto.
// 2. Utilizar la funci�n mod para realizar la verificaci�n.
// 3. Guardar el archivo como "Actividad7".

Algoritmo Actividad7
    Definir ano Como Entero
    Escribir "Ingresa un a�o: "
    Leer ano
	
    Si (ano mod 4 = 0 Y ano mod 100 <> 0) O (ano mod 400 = 0) Entonces
        Escribir "El a�o es bisiesto."
    Sino
        Escribir "El a�o no es bisiesto."
    Fin Si
FinAlgoritmo
