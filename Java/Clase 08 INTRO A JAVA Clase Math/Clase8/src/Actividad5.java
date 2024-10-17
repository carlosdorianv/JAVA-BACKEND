import java.util.Scanner;

public class Actividad5 {

    // Métdo para ingresar un número por parte del usuario
    public double ingresoNumero(Scanner scanner) {
        double numero = 0;
        try {
            System.out.println("Ingrese su número:");
            numero = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Número ingresado no válido: " + e.getMessage());
            scanner.next();  // Limpiar la entrada inválida
        }
        return numero;
    }

    // Métdo para calcular la raíz cuadrada utilizando Math.sqrt(), pero solo si el número no es negativo
    public double calcularRaiz(double numero) {
        double raizCuadrada = -1;
        try {
            // Verificar si el número es negativo
            if (numero < 0) {
                System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                raizCuadrada = Math.sqrt(numero);
            }
        } catch (Exception e) {
            System.out.println("Error: No se pudo calcular la raíz cuadrada. Detalles: " + e.getMessage());
        }
        return raizCuadrada;
    }

    // Métdo para mostrar el resultado
    public void mostrarNumero(double raizCuadrada, double numero) {
        if(raizCuadrada != -1){
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }
    }

    // Métdo principal que coordina la ejecución de la actividad
    public void procesarActividad5() {
        Scanner scanner = new Scanner(System.in);
        try {
            double numero = ingresoNumero(scanner);  // Ingresar el número
            double raizCuadrada = calcularRaiz(numero);  // Calcular la raíz cuadrada
            mostrarNumero(raizCuadrada, numero);  // Mostrar el resultado
        } catch (Exception e) {
            System.out.println("Error inesperado actividad 5: " + e.getMessage());
        }finally {
            // Cerramos el scanner en el bloque finally para asegurar que siempre se cierre
            scanner.close();
        }
    }
}
