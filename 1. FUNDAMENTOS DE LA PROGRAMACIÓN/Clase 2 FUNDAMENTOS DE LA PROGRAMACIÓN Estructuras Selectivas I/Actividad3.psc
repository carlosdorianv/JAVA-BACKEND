Algoritmo Actividad3

// 1. Solicitar al usuario ingresar su nombre de usuario y contrase�a.
// 2. Verificar si el nombre de usuario es "admin" y la contrase�a es "1234".
// 3. Si ambas son correctas, mostrar mensaje de bienvenida.

Definir usuario, contra Como Cadena
Escribir "Ingresa tu nombre de usuario: "
Leer usuario
Escribir "Ingresa tu contrase�a: "
Leer contra
Si usuario = "admin" Y contra = "1234" Entonces
	Escribir "Bienvenido."
SiNo
	Escribir "Usuario o contrase�a incorrectos."
FinSi
FinAlgoritmo
