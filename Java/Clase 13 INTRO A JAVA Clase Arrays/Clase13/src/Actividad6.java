import java.util.Scanner;
import java.util.Arrays;

public class Actividad6 {

//    Rellenando un arreglo de manera personalizada
//    Escribe un programa en Java que realice lo siguiente:
//    Solicita al usuario un tamaño para un arreglo.
//    Luego, pídele que ingrese un número con el que desea rellenar el array.
//    Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
//    El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.
//    Asegúrate de validar lo siguiente:
//    La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
//    Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar
//    pidiendo al usuario nuevos números e índices para rellenar el arreglo.
//    El índice siempre debe ser menor que el tamaño total del arreglo.
//    Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que
//    el último índice ingresado; a su vez, se debe rellenar el array con el nuevo número desde el índice anterior
//    hasta el nuevo índice.
//    Por último, el programa debe imprimir por consola el arreglo completo.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        int lastIndexFilled = 0;


        while (lastIndexFilled < size) {

            System.out.println("Ingrese el número con el que desea rellenar el arreglo: ");
            int number = scanner.nextInt();


            int index;
            do {
                System.out.println("Ingrese el índice hasta el cual desea rellenar (mayor que " + lastIndexFilled + " y menor que " + size + "): ");
                index = scanner.nextInt();
            } while (index <= lastIndexFilled || index >= size);


            Arrays.fill(array, lastIndexFilled, index, number);


            lastIndexFilled = index;
        }


        System.out.println("Arreglo final: " + Arrays.toString(array));
    }
}
