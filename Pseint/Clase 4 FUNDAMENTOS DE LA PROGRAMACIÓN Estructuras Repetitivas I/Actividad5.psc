// 1. Programa que solicita c�digo de usuario y contrase�a.
// 2. Guardar el archivo como "Actividad5".

Algoritmo Actividad5
    Definir codigoUsuario, contrasena Como Entero
    codigoUsuario = 0
    contrasena = 0
	
    Mientras codigoUsuario <> 1024 O contrasena <> 4567 Hacer
        Escribir "Ingresa tu c�digo de usuario (debe ser mayor que cero): "
        Leer codigoUsuario
        Escribir "Ingresa tu contrase�a (n�mero entero positivo): "
        Leer contrasena
		
        Si codigoUsuario <> 1024 O contrasena <> 4567 Entonces
            Escribir "C�digo o contrase�a incorrectos. Int�ntalo de nuevo."
        Fin Si
    Fin Mientras
	
    Escribir "Datos correctos. Acceso permitido."
FinAlgoritmo
