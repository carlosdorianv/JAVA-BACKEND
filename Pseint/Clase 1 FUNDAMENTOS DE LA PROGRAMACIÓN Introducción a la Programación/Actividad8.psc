Algoritmo Actividad8

// 1. Solicitar al usuario el salario base del vendedor.
// 2. Solicitar el valor de cada venta realizada en el mes.
// 3. Calcular el 10% de comisión sobre el total de ventas.
// 4. Calcular la remuneración total sumando el salario base y las comisiones.
// 5. Mostrar la remuneración total del vendedor.
	
Definir salarioBase, venta, totalVentas, comision, remuneracionTotal Como Real
Escribir "Ingresa el salario base del vendedor: "
Leer salarioBase
totalVentas = 0
Repetir
	Escribir "Ingresa el valor de una venta (0 para terminar): "
	Leer venta
	totalVentas = totalVentas + venta
Hasta Que venta = 0
comision = totalVentas * 0.10
remuneracionTotal = salarioBase + comision
Escribir "La remuneración total del vendedor es: ", remuneracionTotal
FinAlgoritmo
