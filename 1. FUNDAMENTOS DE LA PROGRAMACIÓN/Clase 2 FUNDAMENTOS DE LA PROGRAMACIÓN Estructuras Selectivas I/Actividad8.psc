Algoritmo Actividad8
// 
// 1. Solicitar al usuario ingresar un n�mero de tres cifras.
// 2. Verificar si el n�mero es capic�a.
// 3. Mostrar el resultado en pantalla.
// 4. Guardar el archivo como "Actividad1".

Definir numero, centena, decena, unidad Como Entero
Escribir "Ingresa un n�mero de tres cifras: "
Leer numero
centena = numero / 100
decena = (numero / 10) % 10
unidad = numero % 10
Si centena = unidad Entonces
	Escribir "El n�mero es capic�a."
SiNo
	Escribir "El n�mero no es capic�a."
FinSi
FinAlgoritmo
