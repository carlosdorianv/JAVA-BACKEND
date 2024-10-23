import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Actividad1 {

//    Escribe un programa en el que declares una variable de tipo array que contenga
//    10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre
//    1 y 100, imprime por consola el arreglo inicial y luego ordenalo en forma
//    descendente utilizando el métdo Arrays.sort(). Finalmente, imprime
//     los elementos ordenados en la consola.



    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo inicial:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());

//  Arrays.sort(array);
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }

        System.out.println("Arreglo ordenado en forma descendente:");
        System.out.println(Arrays.toString(array));



    }
}
