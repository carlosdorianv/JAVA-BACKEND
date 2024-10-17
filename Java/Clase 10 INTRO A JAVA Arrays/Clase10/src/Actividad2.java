import java.util.Scanner;
public class Actividad2 {

//    Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero.
//    Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de
//    forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta
//    el momento

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Crear un array de 4 enteros
            int[] numeros = new int[4];

            // Ingresar los 4 elementos desde el usuario
            System.out.println("Ingresa 4 números enteros: ");
            numeros[0] = scanner.nextInt();
            numeros[1] = scanner.nextInt();
            numeros[2] = scanner.nextInt();
            numeros[3] = scanner.nextInt();

            // Sumar y calcular el promedio
            int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
            double promedio = suma / 4.0;

            // Mostrar el resultado
            System.out.println("La suma es: " + suma);
            System.out.println("El promedio es: " + promedio);
        }
    }


