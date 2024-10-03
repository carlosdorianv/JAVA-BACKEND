Algoritmo Actividad3
	Definir n, eleccion, i, decision Como Entero
	definir arreglo, arreglo2,arreglo3, diferencia Como Real
	
	
	Escribir "Escoje el tipo de vector"
	leer decision
	Segun decision Hacer
		1:
			Definir vector Como entero
		2:
			Definir vector Como real
			
	FinSegun
	
	
	Escribir "Ingrese el tamaño del arreglo:"
	Leer n
	
	Dimension arreglo[n]
	dimension arreglo2[n]
	dimension arreglo3[n]
	
	
	Escribir "Seleccione el tipo de inicialización del arreglo:"
	Escribir "1 - Generar datos aleatorios"
	Escribir "2 - Ingresar valores manualmente"
	Leer eleccion
	
	Segun eleccion Hacer
		1:
			LlenarArregloAleatorio(arreglo, n, arreglo2,arreglo3)
		2:
			LlenarArregloManual(arreglo, n)
	FinSegun
	
	para i = 0 hasta n-1 Hacer
		escribir arreglo[i]
	FinPara
	
	CalcularDiferencia(arreglo,n,diferencia)
	
	Escribir "La diferencia entre el valor más pequeño y el valor más grande del arreglo es: ", diferencia
FinAlgoritmo

SubProceso LlenarArregloAleatorio(arreglo Por Referencia, n, arreglo2 Por Referencia, arreglo3 Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		arreglo2[i] = aleatorio(0,10)
		arreglo[i] = aleatorio(0,100)
		
		arreglo3[i] = arreglo[i] / arreglo2[i]
		
	FinPara
	
	para i = 0 hasta n-1 con paso 1 Hacer
		escribir arreglo3[i]
	FinPara
	
	
FinSubProceso

SubProceso LlenarArregloManual(arreglo Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese un valor para la posición ", i + 1, ":"
		Leer arreglo[i]
	FinPara
FinSubProceso

Funcion CalcularDiferencia(arreglo Por Referencia, n, diferencia Por Referencia)
	Definir min, max, i Como real
	min = arreglo[0]
	max = arreglo[0]
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Si arreglo[i] < min Entonces
			min = arreglo[i]
		FinSi
		Si arreglo[i] > max Entonces
			max = arreglo[i]
		FinSi
	FinPara
	
	diferencia = max - min
FinFuncion