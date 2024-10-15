import java.util.Scanner;

public class Actividad2 {

//    En esta actividad, practicarás el uso de operaciones aritméticas en Java. A través de la realización de diversas
//    operaciones entre números, fortalecerás tu conocimiento sobre las operaciones básicas disponibles en el lenguaje,
//    como la suma (+), resta (-), multiplicación (*), división (/) y módulo (%).
//    Realizarás operaciones tanto con valores predeterminados como con valores ingresados por el usuario por teclado.
//    Aplica lo aprendido resolviendo los siguientes ejercicios:
//    Declara dos variables, y asígnales un valor a cada una de ellas.
//    Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola.
//    Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado,
//    Ej: La suma de las 2 variables es : “[resultado]”;
//    Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas,
//    realiza la suma de los números y muestra el resultado en la consola.

    private int num1 = 10;
    private int num2 = 5;

    public void operacionesPredeterminadas() {
        System.out.println("Operaciones con valores predeterminados:");
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
        System.out.println("La división de " + num1 + " entre " + num2 + " es: " + (num1 / num2));
        System.out.println("El módulo de " + num1 + " entre " + num2 + " es: " + (num1 % num2));
    }

    public void sumarNumerosUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        scanner.close();
    }
}
