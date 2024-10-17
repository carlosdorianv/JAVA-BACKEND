Algoritmo Actividad8
// 
// 1. Solicitar al usuario ingresar un número de tres cifras.
// 2. Verificar si el número es capicúa.
// 3. Mostrar el resultado en pantalla.
// 4. Guardar el archivo como "Actividad1".

Definir numero, centena, decena, unidad Como Entero
Escribir "Ingresa un número de tres cifras: "
Leer numero
centena = numero / 100
decena = (numero / 10) % 10
unidad = numero % 10
Si centena = unidad Entonces
	Escribir "El número es capicúa."
SiNo
	Escribir "El número no es capicúa."
FinSi
FinAlgoritmo
