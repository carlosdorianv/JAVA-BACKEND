Algoritmo Actividad6
// 
// 1. Solicitar al usuario ingresar la cantidad de litros de combustible cargados.
// 2. Solicitar al usuario ingresar los kilómetros recorridos.
// 3. Calcular el consumo en km/lt.
// 4. Mostrar el consumo en pantalla.
// 5. Guardar el archivo con el nombre "Actividad4".

Definir litros, kilometros, consumo Como Real
Escribir "Ingresa la cantidad de litros de combustible cargados: "
Leer litros
Escribir "Ingresa la cantidad de kilómetros recorridos: "
Leer kilometros
consumo = kilometros / litros
Escribir "El consumo de combustible es: ", consumo, " km/lt"
FinAlgoritmo
