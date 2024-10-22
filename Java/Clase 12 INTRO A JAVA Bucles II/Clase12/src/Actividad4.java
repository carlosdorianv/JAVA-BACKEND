import java.util.Scanner;

public class Actividad4 {

//    Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular
//    la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos.
//    El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras de números negativos.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        int numeroAbsoluto = Math.abs(numero);
        try {
            if (numeroAbsoluto == 0) {
                contador = 1;
            } else {
                while (numeroAbsoluto > 0) {
                    numeroAbsoluto /= 10;
                    contador++;
                }
            }
            System.out.println("El número " + numero + " tiene " + contador + " dígito(s)");
            scanner.close();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
