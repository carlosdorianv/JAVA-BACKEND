import java.util.Scanner;

public class Actividad3 {

    // Métdo para generar un número aleatorio en el rango de 1 a 355 utilizando Math.random() y Math.floor()
    public int generarNumeroAleatorio() {
        int numero = 0;
        try {
            numero = (int) Math.floor(Math.random() * 355) + 1;  // Genera número entre 1 y 355
        } catch (Exception e) {
            System.out.println("Error generando el número aleatorio: " + e.getMessage());
        }
        return numero;
    }

    // Métdo para mostrar el número aleatorio generado
    public void mostrarNumeroAleatorio(int numero) {
        try {
            System.out.println("Número aleatorio generado: " + numero);
        } catch (RuntimeException e) {
            System.out.println("Error al mostrar el número aleatorio: " + e.getMessage());
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad3() {
        Scanner scanner = new Scanner(System.in);
        try {
            int numero = generarNumeroAleatorio();
            mostrarNumeroAleatorio(numero);
        } finally {
            // Cerramos el scanner en el finally para asegurar que siempre se cierre
            scanner.close();
        }
    }
}
