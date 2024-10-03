Proceso validarNombreEquipo
    Definir nombre Como Caracter
    Definir primeraLetra Como Caracter
    Definir ultimaLetra Como Caracter
	
    Escribir "Ingrese el nombre del equipo: "
    Leer nombre
	
    // Verificar que el nombre no est� vac�o
    Si Longitud(nombre) > 0 Entonces
        primeraLetra = SubCadena(nombre, 0, 0)  // Primera letra del nombre
        ultimaLetra = SubCadena(nombre, Longitud(nombre) - 1,Longitud(nombre) - 1)  // �ltima letra del nombre
        // Comparar la primera y �ltima letra
        Si primeraLetra == ultimaLetra Entonces
            Escribir "CORRECTO"
        Sino
            Escribir "INCORRECTO"
        FinSi
    Sino
        Escribir "El nombre del equipo no puede estar vac�o."
    FinSi
FinProceso
