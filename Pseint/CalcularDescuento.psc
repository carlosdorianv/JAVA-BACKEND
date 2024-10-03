Proceso CalcularDescuento
    Definir mes Como Cadena
    Definir importe Como Real
    Definir total Como Real
	
    // Solicitar el mes y el importe de la compra
    Escribir "Ingrese el mes de la compra:"
    Leer mes
    Escribir "Ingrese el importe de la compra:"
    Leer importe
	
    // Verificar el mes y aplicar el descuento si corresponde
    Si mes = "septiembre" O mes = "octubre" O mes = "noviembre" Entonces
        total = importe * 0.9
    Sino
        total = importe
    FinSi
	
    Escribir "El monto total a cobrar es: ", total
FinProceso
