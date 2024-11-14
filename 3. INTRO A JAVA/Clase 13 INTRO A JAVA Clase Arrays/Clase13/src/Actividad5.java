import java.util.Scanner;
import java.util.Arrays;

public class Actividad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el número de elementos del arreglo: ");
        int num = scanner.nextInt();


        int[] array = new int[num];


        System.out.println("Ingrese el elemento con el que quiere rellenar el arreglo: ");
        int elemento = scanner.nextInt();


        Arrays.fill(array, elemento);


        System.out.println("Arreglo resultante: " + Arrays.toString(array));
    }
}
