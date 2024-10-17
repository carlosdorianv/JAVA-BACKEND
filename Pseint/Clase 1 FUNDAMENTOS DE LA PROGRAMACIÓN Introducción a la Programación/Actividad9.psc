Algoritmo Actividad9

// 1. Solicitar al usuario ingresar un número de dos cifras.
// 2. Invertir las cifras del número ingresado.
// 3. Mostrar el número invertido en pantalla

Definir numero, decenas, unidades, invertido Como Entero
Escribir "Ingresa un número de dos cifras: "
Leer numero
decenas = numero / 10
unidades = numero % 10
invertido = (unidades * 10) + decenas
Escribir "El número invertido es: ", invertido
FinAlgoritmo
