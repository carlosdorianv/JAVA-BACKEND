Algoritmo Actividad12

// 1. Solicitar al usuario ingresar el nombre de un equipo de fútbol.
// 2. Verificar si la primera letra es 'A'.
// 3. Mostrar el mensaje correspondiente.

Definir nombreEquipo Como Cadena
Escribir "Ingresa el nombre de tu equipo de fútbol: "
Leer nombreEquipo
Si Subcadena(nombreEquipo, 1, 1) = "A" Entonces
	Escribir "CORRECTO"
SiNo
	Escribir "INCORRECTO"
FinSi
FinAlgoritmo
