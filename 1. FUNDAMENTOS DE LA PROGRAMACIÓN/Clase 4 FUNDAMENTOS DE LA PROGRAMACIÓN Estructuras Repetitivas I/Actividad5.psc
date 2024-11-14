// 1. Programa que solicita código de usuario y contraseña.
// 2. Guardar el archivo como "Actividad5".

Algoritmo Actividad5
    Definir codigoUsuario, contrasena Como Entero
    codigoUsuario = 0
    contrasena = 0
	
    Mientras codigoUsuario <> 1024 O contrasena <> 4567 Hacer
        Escribir "Ingresa tu código de usuario (debe ser mayor que cero): "
        Leer codigoUsuario
        Escribir "Ingresa tu contraseña (número entero positivo): "
        Leer contrasena
		
        Si codigoUsuario <> 1024 O contrasena <> 4567 Entonces
            Escribir "Código o contraseña incorrectos. Inténtalo de nuevo."
        Fin Si
    Fin Mientras
	
    Escribir "Datos correctos. Acceso permitido."
FinAlgoritmo
