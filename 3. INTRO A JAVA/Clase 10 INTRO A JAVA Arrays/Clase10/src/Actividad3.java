import java.util.Scanner;

public class Actividad3 {

//    Escribe un programa en el cual se cree una variable de tipo array que contenga cinco elementos de tipo entero,
//    ingresados por el usuario. El programa debe buscar el máximo e imprimir por consola el resultado utilizando
//    solamente las herramientas adquiridas hasta el momento.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Crear un array de 5 enteros
            int[] numeros = new int[5];
            //array[0] = (int) scanner.nextLine().charAt(0);
            // Ingresar los 5 elementos desde el usuario
            System.out.println("Ingresa 5 números enteros: ");
            numeros[0] = scanner.nextInt();
            numeros[1] = scanner.nextInt();
            numeros[2] = scanner.nextInt();
            numeros[3] = scanner.nextInt();
            numeros[4] = scanner.nextInt();

            // Encontrar el máximo manualmente
            int maximo = numeros[0];
            if (numeros[1] > maximo)
                maximo = numeros[1];
            if (numeros[2] > maximo)
                maximo = numeros[2];
            if (numeros[3] > maximo)
                maximo = numeros[3];
            if (numeros[4] > maximo)
                maximo = numeros[4];

            // Mostrar el resultado
            System.out.println("El número máximo es: " + maximo);
        }
    }

