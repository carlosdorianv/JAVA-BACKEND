import java.util.Scanner;

public class Actividad3 {

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
    }
}
