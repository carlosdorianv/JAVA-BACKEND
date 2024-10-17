Algoritmo Actividad9

// 1. Solicitar al usuario ingresar su edad.
// 2. Calcular el precio de la entrada al cine con o sin descuento según la edad.
// 3. Mostrar el precio final en pantalla.


Definir edad, precio Como Real
Escribir "Ingresa tu edad: "
Leer edad
precio = 5
Si edad < 12 Entonces
	precio = precio * 0.70
FinSi
Escribir "El precio de tu entrada es: ", precio
FinAlgoritmo
