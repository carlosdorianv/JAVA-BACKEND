import java.util.Scanner;

public class Actividad1 {

    // Métdo para ingresar un número entero por parte del usuario
    public int ingresoNumero(Scanner scanner) {
        int numero = 0;
        try {
            System.out.println("Ingrese su número entero:");
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error en el ingreso del número: " + e.getMessage());
            // Aquí no cerramos el scanner para permitir su reutilización
        }
        return numero;
    }

    // Métdo para obtener el valor absoluto del número

    public int absNumero(int numero) {
        int absN = 0;
        try {
            absN = Math.abs(numero);
        } catch (RuntimeException e) {
            System.out.println("Error al calcular el valor absoluto: " + e.getMessage());
        }
        return absN;
    }

    // Métdo para mostrar el valor absoluto
    public void mostrarNumero(int absN, int numero) {
        try {
            System.out.println("El valor absoluto de " + numero + " es: " + absN);
        } catch (Exception e) {
            System.out.println("Error al mostrar el resultado: " + e.getMessage());
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad1() {
        Scanner scanner = new Scanner(System.in);  // Mover el scanner aquí para controlar su ciclo de vida
        try {
            int numero = ingresoNumero(scanner);
            int absN = absNumero(numero);
            mostrarNumero(absN, numero);
        } finally {
            // Cerramos el scanner en el finally para asegurar que siempre se cierre
            scanner.close();
        }
    }
}
