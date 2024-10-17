import java.util.Scanner;
public class Actividad5 {


    public class CopiarArray {

//        Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados.
//        Posteriormente,
//        genera una copia del mismo con una extensión de 2 elementos adicionales.
//        Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
//        Finalmente, muestra por consola el contenido del nuevo array.
//        Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando
//        el uso de bucles en el proceso.


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Crear un array inicial de 3 enteros
            int[] numerosOriginal = {10, 20, 30};

            // Crear una copia del array con 2 espacios más
            int[] numerosCopia = new int[5];
            numerosCopia[0] = numerosOriginal[0];
            numerosCopia[1] = numerosOriginal[1];
            numerosCopia[2] = numerosOriginal[2];

            // Solicitar al usuario 2 nuevos números
            System.out.print("Ingresa dos nuevos números: ");
            numerosCopia[3] = scanner.nextInt();
            numerosCopia[4] = scanner.nextInt();

            // Mostrar el contenido del nuevo array
            System.out.println("El nuevo array es: ");
            System.out.println(numerosCopia[0] + " " + numerosCopia[1] + " " + numerosCopia[2] + " " + numerosCopia[3] + " " + numerosCopia[4]);
        }
    }

}
