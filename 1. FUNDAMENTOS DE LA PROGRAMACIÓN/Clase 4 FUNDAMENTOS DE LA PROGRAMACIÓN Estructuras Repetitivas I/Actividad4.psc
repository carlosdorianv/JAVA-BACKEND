// 1. Validar una clave de acceso.
// 2. Guardar el archivo como "Actividad4".

Algoritmo Actividad4
    Definir claveCorrecta Como Cadena
    Definir claveIngresada Como Cadena
    Definir intentos Como Entero
    intentos = 0
    claveCorrecta = "EUREKA"
	
    Mientras intentos < 3 Hacer
        Escribir "Ingresa la clave: "
        Leer claveIngresada
		
        Si claveIngresada = claveCorrecta Entonces
            Escribir "Clave correcta. Acceso al sistema concedido."
            
        Sino
            intentos = intentos + 1
            Escribir "Clave incorrecta. Te quedan ", 3 - intentos, " intentos."
        Fin Si
    Fin Mientras
	
    Si intentos = 3 Entonces
        Escribir "Has agotado los intentos. Acceso denegado."
    Fin Si
FinAlgoritmo
