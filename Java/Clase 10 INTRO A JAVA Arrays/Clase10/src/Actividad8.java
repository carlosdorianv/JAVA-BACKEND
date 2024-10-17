import java.util.Arrays;
import java.util.Scanner;
public class Actividad8 {

//    Desarrolla un programa que pida al usuario ingresar 4 nombres.
//    Estos nombres serán ordenados alfabéticamente y posteriormente impresos en la consola.
//    Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un array de 4 nombres
        String[] nombres = new String[4];

        // Solicitar nombres al usuario
        System.out.println("Ingresa 4 nombres: ");
        nombres[0] = scanner.nextLine();
        nombres[1] = scanner.nextLine();
        nombres[2] = scanner.nextLine();
        nombres[3] = scanner.nextLine();

        // Ordenar los nombres alfabéticamente
        Arrays.sort(nombres);

        // Mostrar los nombres ordenados
        System.out.println("Nombres ordenados alfabéticamente: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
