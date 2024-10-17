import java.util.Scanner;

public class Actividad2 {

    // Métdo para ingresar un número decimal por parte del usuario
    public double ingresoNumero(Scanner scanner) {
        double numero = 0;
        try {
            System.out.println("Ingrese su número racional:");
            numero = scanner.nextDouble();  // Cambiado de nextInt() a nextDouble() para admitir decimales
        } catch (Exception e) {
            System.out.println("El número ingresado no es válido: " + e.getMessage());
        }
        return numero;
    }

    // Métdo para redondear el número utilizando el método Math.round()
    public double rndNumero(double numero) {
        double rndN = 0;
        try {
            rndN = Math.round(numero);
        } catch (RuntimeException e) {
            System.out.println("No se pudo hacer la transformación del número: " + e.getMessage());
        }
        return rndN;
    }

    // Métdo para mostrar el número redondeado
    public void mostrarNumero(double rndN, double numero) {
        try {
            System.out.println("El valor redondeado de: " + numero + " es: " + rndN);
        } catch (Exception e) {
            System.out.println("Error al mostrar el resultado: " + e.getMessage());
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad2() {
        Scanner scanner = new Scanner(System.in);
        try {
            double numero = ingresoNumero(scanner);
            double rndN = rndNumero(numero);
            mostrarNumero(rndN, numero);
        } finally {
            // Cerramos el scanner en el finally para asegurar que siempre se cierre
            scanner.close();
        }
    }
}
