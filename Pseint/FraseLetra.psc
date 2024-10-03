Algoritmo FraseLetra
	
	Definir frase como Cadena
	Definir letra Como Caracter
	
	Escribir "Ingrese una frase"
	Leer frase
	
	Escribir "Ingrese una lentra que quiera contar"
	Leer letra
	
	//Esto asegura que el conteo sea insensible a si las letras en la frase o la letra buscada son mayúsculas o minúsculas
	frase = ConvertirMays(frase)
	letra = ConvertirMays(letra)
	
	Escribir "La letra ", letra, " aparece ", ContarLetra(frase, letra), " vez/veces."
FinAlgoritmo

//Esta función cuenta cuántas veces aparece la letra en la frase.
Funcion varContador = ContarLetra(frase, letra)
	Definir varContador,i Como Entero
	varContador = 0
	
	//Recorre cada posición en la frase.
	Para i=0 hasta Longitud(frase) - 1 con paso 1 Hacer
		//Verifica si el carácter en la posición i de la frase coincide con letra.
		Si Subcadena(frase, i,i) = letra Entonces
			//La variable varContador se inicializa en 0 y se incrementa cada vez que se encuentra una coincidencia de la letra en la frase.
			varContador = varContador + 1
		FinSi
	FinPara
FinFuncion

//ConvertirMays(letra) convierte el carácter letra a mayúscula utilizando la función Mayusculas(letra).
Funcion letraMayusc = ConvertirMays(letra)
	Definir letraMayusc Como Caracter
	letraMayusc = Mayusculas(letra)
FinFuncion