import java.util.Scanner;

public class Actividad6 {

    // Métdo para ingresar el límite inferior
    public int ingresarLimiteInferior(Scanner scanner) {
        int limiteInferior = 0;
        try {
            System.out.print("Ingresa el límite inferior: ");
            limiteInferior = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Problemas ingresando el límite inferior. " + e.getMessage());
            scanner.next();  // Limpiar la entrada inválida
        }
        return limiteInferior;
    }

    // Métdo para ingresar el límite superior
    public int ingresarLimiteSuperior(Scanner scanner) {
        int limiteSuperior = 0;
        try {
            System.out.print("Ingresa el límite superior: ");
            limiteSuperior = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Problemas ingresando el límite superior. " + e.getMessage());
            scanner.next();  // Limpiar la entrada inválida
        }
        return limiteSuperior;
    }

    // Métdo para generar un número aleatorio dentro del rango especificado
    public int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
        int numeroAleatorio = 0;
        try {
            if (limiteInferior >= limiteSuperior) {
                System.out.println("Error: El límite inferior debe ser menor que el límite superior.");
            } else {
                numeroAleatorio = (int)(Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
            }
        } catch (Exception e) {
            System.out.println("Error al generar el número aleatorio: " + e.getMessage());
        }
        return numeroAleatorio;
    }

    // Métdo para mostrar el número aleatorio generado
    public void mostrarNumeroAleatorio(int limiteInferior, int limiteSuperior, int numeroAleatorio) {
        if (limiteInferior < limiteSuperior) {
            System.out.println("Número aleatorio generado entre " + limiteInferior + " y " + limiteSuperior + ": " + numeroAleatorio);
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad6() {
        Scanner scanner = new Scanner(System.in);
        try {
            int limiteInferior = ingresarLimiteInferior(scanner);  // Ingresar límite inferior
            int limiteSuperior = ingresarLimiteSuperior(scanner);  // Ingresar límite superior
            int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);  // Generar número aleatorio
            mostrarNumeroAleatorio(limiteInferior, limiteSuperior, numeroAleatorio);  // Mostrar el número aleatorio
        } finally {
            // Cerramos el scanner en el bloque finally para asegurar que siempre se cierre
            scanner.close();
        }
    }
}
