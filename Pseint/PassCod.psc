Algoritmo PassCod
    // Definir las variables 'codigo' y 'contrasena' como enteros
    Definir codigo, pass Como Entero
	
    // Iniciar un bucle que se repetir� hasta que se ingresen el c�digo y la contrase�a correctos
    Repetir
        // Solicitar al usuario que ingrese su c�digo de usuario
        Escribir "Ingrese su codigo de usuario:"
        Leer codigo
        
        // Solicitar al usuario que ingrese su contrase�a
        Escribir "Ingrese su contrase�a"
        Leer pass
		// El bucle se repite mientras el c�digo no sea 1024 o la contrase�a no sea 4567
    Mientras Que (codigo <> 1024) o (pass <> 4567)
	
    // Una vez que se ingresan el c�digo y la contrase�a correctos, se muestra este mensaje
    Escribir "Usted ingres� la contrase�a y n�mero de usuario correctos"
FinAlgoritmo
