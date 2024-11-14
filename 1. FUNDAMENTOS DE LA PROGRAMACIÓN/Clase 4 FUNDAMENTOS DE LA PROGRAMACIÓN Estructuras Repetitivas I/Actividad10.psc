// 1. Programa para calcular los sueldos semanales del personal seg�n su modalidad de salario.
// 2. Guardar el archivo como "Actividad10".

Algoritmo Actividad10
    Definir tipoContrato Como Caracter
    Definir sueldoBase Como Real
    Definir horasTrabajadas Como Entero
    Definir ventasRealizadas Como Real
    Definir sueldoFinal Como Real
    Definir comision Como Real
    Definir horasExtras Como Real
	
    Mientras Verdadero Hacer
        Escribir "Selecciona el tipo de contrato: "
        Escribir "a. Salario por Comisi�n"
        Escribir "b. Salario Fijo + Comisi�n"
        Escribir "c. Salario Fijo"
        Escribir "d. Salir"
        Leer tipoContrato
		
        Segun tipoContrato Hacer
            Caso 'a':
                Escribir "Ingresa el monto total de las ventas realizadas en la semana: "
                Leer ventasRealizadas
                sueldoFinal = ventasRealizadas * 0.40
                Escribir "El sueldo semanal por comisi�n es: ", sueldoFinal
				
            Caso 'b':
                Escribir "Ingresa el valor que se paga por hora: "
                Leer sueldoBase
                Escribir "Ingresa la cantidad de horas trabajadas en la semana: "
                Leer horasTrabajadas
                Escribir "Ingresa el monto total de las ventas en la semana: "
                Leer ventasRealizadas
				
                // C�lculo de la comisi�n
                comision = ventasRealizadas * 0.25
                // C�lculo del sueldo por horas trabajadas
                sueldoFinal = (sueldoBase * horasTrabajadas) + comision
                Escribir "El sueldo semanal (fijo + comisi�n) es: ", sueldoFinal
				
            Caso 'c':
                Escribir "Ingresa el valor que se paga por hora: "
                Leer sueldoBase
                Escribir "Ingresa la cantidad de horas trabajadas en la semana: "
                Leer horasTrabajadas
				
                // C�lculo de sueldo fijo con horas extras
                Si horasTrabajadas > 40 Entonces
                    horasExtras = horasTrabajadas - 40
                    sueldoFinal = (sueldoBase * 40) + (horasExtras * sueldoBase * 1.5)
                Sino
                    sueldoFinal = sueldoBase * horasTrabajadas
                FinSi
                Escribir "El sueldo semanal fijo es: ", sueldoFinal
				
            Caso 'd':
                Escribir "Saliendo del programa."
                Romper
				
            De Otro Modo:
                Escribir "Opci�n no v�lida, por favor intente de nuevo."
        Fin Segun
    Fin Mientras
FinAlgoritmo
