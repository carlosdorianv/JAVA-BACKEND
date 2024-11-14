import java.util.Scanner;

public class Actividad7 {

//    Crea un programa que solicite al usuario ingresar una serie de números enteros positivos.
//    Utiliza un bucle do-while para ir acumulando la suma de los números ingresados.
//    Después de cada entrada de número, pregunta al usuario si desea ingresar otro número.
//    Si el usuario responde afirmativamente, continúa solicitando números; de lo contrario, muestra
//    la suma acumulada de todos los números ingresados y termina el programa.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String respuesta;

        do {

            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();


            suma += numero;

            System.out.print("¿Desea ingresar otro número? (si/no): ");
            respuesta = scanner.next();

            } while (respuesta.equalsIgnoreCase("si"));


            System.out.println("La suma acumulada de los números ingresados es: " + suma);
        }
    }
