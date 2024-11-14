import java.util.Scanner;

public class Actividad4 {

//    El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario
//    y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente las
//    herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un array de 3 enteros
        int[] numeros = {3, 7, 9}; // Ejemplo de números en el array

        // Solicitar al usuario un número
        System.out.print("Ingresa un número para buscar: ");
        int numeroBuscado = scanner.nextInt();

        // Comprobar si el número está presente
        boolean encontrado = (numeros[0] == numeroBuscado) || (numeros[1] == numeroBuscado) || (numeros[2] == numeroBuscado);

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El número está en el array.");
        } else {
            System.out.println("El número NO está en el array.");
        }
    }

}
