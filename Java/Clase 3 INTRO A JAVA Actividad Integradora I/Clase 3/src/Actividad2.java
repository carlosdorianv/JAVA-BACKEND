
import java.util.Scanner;
public class Actividad2 {

//    Después de analizar el funcionamiento del programa requerido en el video proporcionado,
//    tu tarea es escribir el código necesario para cumplir con los siguientes puntos:
//    Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
//    Declara una variable para almacenar el resultado de la operación.
//    Permite al usuario elegir qué operación quiere realizar.
//    Muestra el resultado de la operación en la consola.

    public void mainMenu() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner2.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner2.nextDouble();

        // Mostrar las opciones de operación
        System.out.println("Elige la operación que deseas realizar:");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");

        System.out.print("Ingresa el número de la operación (1-4): ");
        int opcion = scanner2.nextInt();


        double resultado;

        switch (opcion) {
            case 1:  // Sumar
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:  // Restar
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:  // Multiplicar
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:  // Dividir
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;

            default:
                throw new IllegalStateException("Opcion Invalida: " + opcion);

        }
    }
}
