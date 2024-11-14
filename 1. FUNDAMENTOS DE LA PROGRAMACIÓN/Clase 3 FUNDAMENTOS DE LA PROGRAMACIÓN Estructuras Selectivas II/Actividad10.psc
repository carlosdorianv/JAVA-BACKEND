// 1. Calcular sueldos semanales según modalidades de sueldo.
// 2. Guardar el archivo como "Actividad10".

Algoritmo Actividad10
    Definir opcion Como Entero
    Definir sueldo Como Real
    Definir ventas Como Real
    Definir horasTrabajadas Como Entero
    Definir valorPorHora Como Real
	
    Escribir "Elija una opción: "
    Escribir "1. Salario por Comisión"
    Escribir "2. Salario Fijo + Comisión"
    Escribir "3. Salario Fijo"
    Leer opcion
	
    Segun opcion Hacer
        1: // Salario por Comisión
            Escribir "Ingrese el monto total de las ventas realizadas: "
            Leer ventas
            sueldo = ventas * 0.40
            Escribir "El sueldo semanal es: ", sueldo
			
        2: // Salario Fijo + Comisión
            Escribir "Ingrese el valor que se paga por hora: "
            Leer valorPorHora
            Escribir "Ingrese la cantidad de horas trabajadas: "
            Leer horasTrabajadas
            Escribir "Ingrese el monto total de las ventas: "
            Leer ventas
            
            Si horasTrabajadas > 40 Entonces
                horasTrabajadas = 40 // No se consideran horas extras
            Fin Si
            
            sueldo = (valorPorHora * horasTrabajadas) + (ventas * 0.25)
            Escribir "El sueldo semanal es: ", sueldo
			
        3: // Salario Fijo
            Escribir "Ingrese el valor que se paga por hora: "
            Leer valorPorHora
            Escribir "Ingrese la cantidad de horas trabajadas: "
            Leer horasTrabajadas
            
            Si horasTrabajadas > 40 Entonces
                sueldo = (valorPorHora * 40) + ((horasTrabajadas - 40) * valorPorHora * 1.5)
            Sino
                sueldo = valorPorHora * horasTrabajadas
            Fin Si
            
            Escribir "El sueldo semanal es: ", sueldo
			
        De Otro Modo: Escribir "Opción no válida."
    Fin Segun
FinAlgoritmo
