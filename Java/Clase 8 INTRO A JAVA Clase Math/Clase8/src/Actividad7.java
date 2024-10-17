import java.util.Scanner;

public class Actividad7 {

    // Métdo para ingresar un número entre 1 y 30
    public int ingresoNumero(Scanner scanner) {
        int numero = 0;
        boolean numeroValido = false;  // Bandera para controlar el ciclo
        while (!numeroValido) {
            try {
                System.out.println("Ingrese su número entero entre 1 y 30:");
                numero = scanner.nextInt();

                if (numero >= 1 && numero <= 30) {
                    numeroValido = true;  // Salir del ciclo si el número es válido
                } else {
                    System.out.println("Error: El número debe estar entre 1 y 30.");
                }
            } catch (Exception e) {
                System.out.println("Número ingresado no válido, revise que sea entero. " + e.getMessage());
                scanner.next();  // Limpiar la entrada inválida
            }
        }
        return numero;
    }

    // Métdo para verificar si un número es primo
    private boolean esNumeroPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Métdo para analizar número aleatorio y su raíz cuadrada
    public void analizarNumero(int numeroLimite) {
        try {
            // Generar número aleatorio entre 1 y numeroLimite
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;
            double raizCuadrada = Math.sqrt(numeroAleatorio);
            boolean esPrimo = esNumeroPrimo(numeroAleatorio);

            // Mostrar los resultados
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
            System.out.println("Raíz cuadrada: " + raizCuadrada);
            System.out.println("¿Es primo? " + (esPrimo ? "Sí" : "No"));

        } catch (Exception e) {
            System.out.println("Error procesando el número aleatorio: " + e.getMessage());
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad7(Scanner scanner) {
        int numero = ingresoNumero(scanner);  // Ingresar número válido entre 1 y 30
        analizarNumero(numero);  // Analizar número aleatorio generado
    }


}
