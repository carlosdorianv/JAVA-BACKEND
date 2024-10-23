import java.util.Arrays;

public class Actividad3 {
    public static void main(String[] args) {


        int[] array1 = {1, 2, 3, 4, 4};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        boolean x = Arrays.equals(array1,array3);
        System.out.println(""+x);

        if (Arrays.equals(array1, array2)) {
            System.out.println("array1 y array2 son iguales.");
        } else {
            System.out.println("array1 y array2 son diferentes.");
    }




        if (Arrays.equals(array1, array3)) {
            System.out.println("array1 y array3 son iguales.");
        } else {
            System.out.println("array1 y array3 son diferentes.");
        }
    }
}
