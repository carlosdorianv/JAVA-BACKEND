Algoritmo Actividad10

// 1. Solicitar al usuario ingresar una palabra o frase.
// 2. Si tiene 4 caracteres, concatenar un signo de exclamaci�n. Si no, concatenar un signo de interrogaci�n.
// 3. Mostrar el resultado final.


Definir frase Como Cadena
Escribir "Ingresa una palabra o frase: "
Leer frase
Si Longitud(frase) = 4 Entonces
	frase = Concatenar(frase, "!")
SiNo
	frase = Concatenar(frase, "?")
FinSi
Escribir "Frase final: ", frase
FinAlgoritmo
