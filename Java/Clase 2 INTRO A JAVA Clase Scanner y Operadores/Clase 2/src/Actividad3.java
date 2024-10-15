import java.util.Scanner;

public class Actividad3 {
//
//    En este ejercicio, usarás los operadores de comparación y lógicos en Java. Interactuarás con el usuario para
//    comparar dos números ingresados y evaluar diversas condiciones utilizando operadores como mayor que,
//    distinto que y divisible por dos. De esta manera, comprenderás cómo funcionan y cuál es su sintaxis,
//    así como su aplicación en la lógica de programación.
//    Además, realizarás comparaciones adicionales utilizando operadores lógicos para evaluar condiciones combinadas.
//    Al finalizar el ejercicio, podrás determinar si se cumplen ciertas condiciones lógicas establecidas.

//   1. Pide al usuario que ingrese dos números, y:
//    A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. Debería verse así:
//    B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
//    C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.

//   2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
//    A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
//    B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.

    public void compararNumeros(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo número (" + num2 + ").");
        } else {
            System.out.println("El primer número (" + num1 + ") NO es mayor que el segundo número (" + num2 + ").");
        }

        if (num1 != num2) {
            System.out.println("El primer número (" + num1 + ") es distinto del segundo número (" + num2 + ").");
        } else {
            System.out.println("El primer número (" + num1 + ") es igual al segundo número (" + num2 + ").");
        }

        if (num1 % 2 == 0) {
            System.out.println("El primer número (" + num1 + ") es divisible por 2.");
        } else {
            System.out.println("El primer número (" + num1 + ") NO es divisible por 2.");
        }
    }

    public void validarNumeros(int num1, int num2, int num3, int num4) {
        // A. Validar si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4
        if (num1 > num2 && num3 > num4) {
            System.out.println("El número 1 (" + num1 + ") es mayor que el número 2 (" + num2 + ") y el número 3 (" + num3 + ") es mayor que el número 4 (" + num4 + ").");
        } else {
            System.out.println("La condición de que número 1 sea mayor que número 2 y número 3 mayor que número 4 NO se cumple.");
        }

        // B. Validar si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4
        if (num1 > num2 || num3 > num4) {
            System.out.println("El número 1 es mayor que el número 2 o el número 3 es mayor que el número 4.");
        } else {
            System.out.println("Ni el número 1 es mayor que el número 2 ni el número 3 es mayor que el número 4.");
        }
        //ternario !!!
        //cerrar siempre el scanner
        //Obsydian
    }
}
