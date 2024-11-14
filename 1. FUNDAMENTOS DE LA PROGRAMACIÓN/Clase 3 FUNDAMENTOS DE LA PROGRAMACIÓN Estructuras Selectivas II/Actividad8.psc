// 1. Calcular el monto total por la compra de manzanas.
// 2. Definir una tabla de descuentos y calcular el total.
// 3. Guardar el archivo como "Actividad8".

Algoritmo Actividad8
    Definir cantidad Como Entero
    Definir precioPorKilo Como Real
    Definir total Como Real
	
    Escribir "Ingresa la cantidad de kilos de manzanas: "
    Leer cantidad
	
    Si cantidad < 5 Entonces
        precioPorKilo = 3.00
    Sino Si cantidad < 10 Entonces
			precioPorKilo = 2.50
		Sino
			precioPorKilo = 2.00
		Fin Si
		
		total = cantidad * precioPorKilo
		Escribir "El total a pagar es: ", total
	Fin Si
FinAlgoritmo
