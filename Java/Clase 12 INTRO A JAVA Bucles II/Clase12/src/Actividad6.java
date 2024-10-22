import java.util.Scanner;

public class Actividad6 {

//    Escribe un programa que solicite al usuario ingresar una serie de números enteros.
//    Utiliza un bucle while para contar la cantidad de números pares e impares ingresados hasta
//    que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad de números
//    pares e impares ingresados

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;
        String continuar;

        do {
            System.out.print("Ingresa un número entero (o 'salir' para terminar): ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            } else {
                continuar = scanner.next();
                if (continuar.equalsIgnoreCase("salir")) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
                    scanner.nextLine();
                    continue; 
                }
            }

            System.out.print("¿Deseas ingresar otro número? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);

        scanner.close();
    }
}
