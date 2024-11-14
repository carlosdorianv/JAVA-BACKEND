import java.util.Random;
import java.util.Scanner;

public class Actividad2 {

    //Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote
    //que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que
    //ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo
    //hagas correctamente.

    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(20) + 1;
        int intento;
        boolean adivinado = false;
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 20. ¿Puedes adivinarlo?");
        try {
            do {
                System.out.print("Introduce tu número: ");
                intento = scanner.nextInt();

                if (intento < numeroAleatorio) {
                    System.out.println("El número es mayor. Intenta de nuevo.");
                } else if (intento > numeroAleatorio) {
                    System.out.println("El número es menor. Intenta de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    adivinado = true;
                }
            } while (!adivinado);

            scanner.close();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
