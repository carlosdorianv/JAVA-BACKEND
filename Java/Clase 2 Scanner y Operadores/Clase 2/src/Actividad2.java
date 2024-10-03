import java.util.Scanner;

public class Actividad2 {

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
