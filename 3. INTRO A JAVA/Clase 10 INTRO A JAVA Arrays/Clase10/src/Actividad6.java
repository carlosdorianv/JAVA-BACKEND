public class Actividad6 {

//    Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero.
//    El programa debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por
//    consola utilizando solo las herramientas aprendidas hasta el momento.

    public static void main(String[] args) {
        // Crear un array de 6 enteros
        int[] numeros = {4, 7, 10, 5, 2, 9};

        // Contar números pares manualmente
        int contadorPares = 0;
        if (numeros[0] % 2 == 0) contadorPares++;
        if (numeros[1] % 2 == 0) contadorPares++;
        if (numeros[2] % 2 == 0) contadorPares++;
        if (numeros[3] % 2 == 0) contadorPares++;
        if (numeros[4] % 2 == 0) contadorPares++;
        if (numeros[5] % 2 == 0) contadorPares++;

        // Mostrar el resultado
        System.out.println("Hay " + contadorPares + " números pares en el array.");
    }
}
