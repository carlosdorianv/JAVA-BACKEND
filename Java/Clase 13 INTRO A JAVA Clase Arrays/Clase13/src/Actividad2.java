import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        Arrays.sort(array);

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(array));



        System.out.print("Introduce el valor que deseas buscar: ");
        int valorBuscado = scanner.nextInt();


        int indice = Arrays.binarySearch(array, valorBuscado);


        if (indice >= 0) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El valor " + valorBuscado + " no está presente en el arreglo.");
        }

        scanner.close();
    }
}
