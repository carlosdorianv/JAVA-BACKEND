import java.util.Scanner;

public class Actividad4 {

    // Métdo para ingresar un número entero por parte del usuario
    public int ingresoNumero(Scanner scanner) {
        int numero = 0;
        try {
            System.out.println("Ingrese su número entero:");
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("El número ingresado no es válido. Revise que sea un entero. Error: " + e.getMessage());
            scanner.next();  // Limpiamos la entrada errónea para evitar un loop infinito
        }
        return numero;
    }

    // Métdo para calcular la potencia de un número utilizando Math.pow()
    public int expNumero(int base, int exponente) {
        int expN = 0;
        try {
            expN = (int) Math.pow(base, exponente);  // Elevar base a exponente
        } catch (RuntimeException e) {
            System.out.println("No se pudo hacer la transformación del número: " + e.getMessage());
        }
        return expN;
    }

    // Métdo para mostrar el resultado de elevar un número a otro
    public void mostrarNumero(int base, int exponente, int resultado) {
        try {
            System.out.println("El resultado de elevar " + base + " a la " + exponente + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error al mostrar el resultado: " + e.getMessage());
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad4() {
        Scanner scanner = new Scanner(System.in);
        try {
            int base = ingresoNumero(scanner);  // Ingresar la base
            int exponente = ingresoNumero(scanner);  // Ingresar el exponente
            int resultado = expNumero(base, exponente);  // Calcular la potencia
            mostrarNumero(base, exponente, resultado);  // Mostrar el resultado
        } finally {
            // Cerramos el scanner en el bloque finally para asegurar que siempre se cierre
            scanner.close();
        }
    }
}
