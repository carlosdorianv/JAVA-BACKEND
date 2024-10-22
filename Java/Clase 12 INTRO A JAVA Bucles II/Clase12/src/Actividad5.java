import java.util.Scanner;

public class Actividad5 {

//    Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar
//    de ese número utilizando un bucle while. El programa debe seguir solicitando números hasta
//    que el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        try {
            while (true) {
                System.out.print("Ingresa un número entero (0 para salir): ");
                numero = scanner.nextInt();

                if (numero == 0) {
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                }

                System.out.println("Tabla de multiplicar del " + numero + ":");
                int contador = 1;


                while (contador <= 10) {
                    System.out.println(numero + " x " + contador + " = " + (numero * contador));
                    contador++;
                }
                System.out.println();
            }

            scanner.close();

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
}
