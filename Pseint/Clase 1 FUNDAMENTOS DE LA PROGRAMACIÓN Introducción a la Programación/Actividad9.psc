Algoritmo Actividad9

// 1. Solicitar al usuario ingresar un n�mero de dos cifras.
// 2. Invertir las cifras del n�mero ingresado.
// 3. Mostrar el n�mero invertido en pantalla

Definir numero, decenas, unidades, invertido Como Entero
Escribir "Ingresa un n�mero de dos cifras: "
Leer numero
decenas = numero / 10
unidades = numero % 10
invertido = (unidades * 10) + decenas
Escribir "El n�mero invertido es: ", invertido
FinAlgoritmo
