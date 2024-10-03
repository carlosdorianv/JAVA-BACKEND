//Condicionales simples en PSeInt: Un condicional simple en PSeInt es una estructura 
//de control que permite ejecutar un bloque de 
//instrucciones solo si se cumple una condici�n espec�fica. Si la condici�n es 
//verdadera, se ejecuta el bloque de c�digo dentro del condicional; si es falsa, 
//el programa contin�a con la siguiente instrucci�n fuera del condicional. Este 
//tipo de estructura se utiliza para tomar decisiones en el flujo de un programa y 
//se representa generalmente con la palabra clave Si...Entonces en PSeInt.
Algoritmo esMayor
	Definir x Como Real
	Escribir "Ingrese un numero"
	Leer x
	Si x > 10 Entonces
		Escribir "X es mayor que 10"
	SiNo
		Escribir "X es menor que 10"
	FinSi
FinAlgoritmo
