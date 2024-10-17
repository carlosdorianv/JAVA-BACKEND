// 1. Leer tres n�meros que representen una fecha (d�a, mes, a�o).
// 2. Verificar si la fecha es v�lida.
// 3. Si es v�lida, imprimirla con el nombre del mes.
// 4. Guardar el archivo como "Actividad5".

Algoritmo Actividad5
    Definir dia, mes, ano Como Entero
    Definir nombreMes Como Cadena
	
    Escribir "Ingresa el d�a: "
    Leer dia
    Escribir "Ingresa el mes: "
    Leer mes
    Escribir "Ingresa el a�o: "
    Leer ano
	
    Si mes < 1 O mes > 12 O dia < 1 O dia > 31 Entonces
        Escribir "Fecha inv�lida."
    Sino
        Segun mes Hacer
            1: nombreMes = "enero"
            2: nombreMes = "febrero"
            3: nombreMes = "marzo"
            4: nombreMes = "abril"
            5: nombreMes = "mayo"
            6: nombreMes = "junio"
            7: nombreMes = "julio"
            8: nombreMes = "agosto"
            9: nombreMes = "septiembre"
            10: nombreMes = "octubre"
            11: nombreMes = "noviembre"
            12: nombreMes = "diciembre"
        Fin Segun
        Escribir dia, " de ", nombreMes, " de ", a�o
    Fin Si
FinAlgoritmo
