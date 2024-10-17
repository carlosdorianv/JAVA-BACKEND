// 1. Leer tres números que representen una fecha (día, mes, año).
// 2. Verificar si la fecha es válida.
// 3. Si es válida, imprimirla con el nombre del mes.
// 4. Guardar el archivo como "Actividad5".

Algoritmo Actividad5
    Definir dia, mes, ano Como Entero
    Definir nombreMes Como Cadena
	
    Escribir "Ingresa el día: "
    Leer dia
    Escribir "Ingresa el mes: "
    Leer mes
    Escribir "Ingresa el año: "
    Leer ano
	
    Si mes < 1 O mes > 12 O dia < 1 O dia > 31 Entonces
        Escribir "Fecha inválida."
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
        Escribir dia, " de ", nombreMes, " de ", año
    Fin Si
FinAlgoritmo
