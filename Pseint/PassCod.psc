Algoritmo PassCod
    // Definir las variables 'codigo' y 'contrasena' como enteros
    Definir codigo, pass Como Entero
	
    // Iniciar un bucle que se repetirá hasta que se ingresen el código y la contraseña correctos
    Repetir
        // Solicitar al usuario que ingrese su código de usuario
        Escribir "Ingrese su codigo de usuario:"
        Leer codigo
        
        // Solicitar al usuario que ingrese su contraseña
        Escribir "Ingrese su contraseña"
        Leer pass
		// El bucle se repite mientras el código no sea 1024 o la contraseña no sea 4567
    Mientras Que (codigo <> 1024) o (pass <> 4567)
	
    // Una vez que se ingresan el código y la contraseña correctos, se muestra este mensaje
    Escribir "Usted ingresó la contraseña y número de usuario correctos"
FinAlgoritmo
