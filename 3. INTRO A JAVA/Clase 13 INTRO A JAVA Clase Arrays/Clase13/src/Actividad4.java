import java.util.Arrays;
import java.util.Scanner;

    public class Actividad4 {
        public static void main(String[] args) {


            int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            System.out.println("Arreglo original:");

            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Índice " + i + ": " + arreglo[i]);
            }

            Scanner scanner = new Scanner(System.in);


            int indiceInicial, indiceFinal;
            while (true) {
                System.out.print("Introduce el índice inicial: ");
                indiceInicial = scanner.nextInt();
                System.out.print("Introduce el índice final: ");
                indiceFinal = scanner.nextInt();

                if (indiceInicial < 0 || indiceFinal >= arreglo.length) {
                    System.out.println("Error: Los índices deben estar dentro del rango válido (0 a " + (arreglo.length - 1) + ").");
                } else if (indiceInicial > indiceFinal) {
                    System.out.println("Error: El índice inicial debe ser menor o igual al índice final.");
                } else {
                    break;
                }
            }
            int[] nuevoArreglo = Arrays.copyOfRange(arreglo, indiceInicial, indiceFinal + 1);

            for (int i = 0; i < nuevoArreglo.length; i++) {
                System.out.println("Índice " + i + ": " + nuevoArreglo[i]);
            }

        }
    }