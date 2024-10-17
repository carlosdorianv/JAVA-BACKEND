// 1. Determinar si un año es bisiesto.
// 2. Utilizar la función mod para realizar la verificación.
// 3. Guardar el archivo como "Actividad7".

Algoritmo Actividad7
    Definir ano Como Entero
    Escribir "Ingresa un año: "
    Leer ano
	
    Si (ano mod 4 = 0 Y ano mod 100 <> 0) O (ano mod 400 = 0) Entonces
        Escribir "El año es bisiesto."
    Sino
        Escribir "El año no es bisiesto."
    Fin Si
FinAlgoritmo
