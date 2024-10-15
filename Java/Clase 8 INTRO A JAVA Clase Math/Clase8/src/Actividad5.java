import java.util.Scanner;
public class Actividad5 {

//    Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada utilizando el
//    métdo sqrt() de la clase Math. Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.

    public double ingresoNumero(Scanner scanner){
        double numero = 0;
        try{
            System.out.println("Ingrese su numero");
            numero = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Numero ingresado no valido " + e.getMessage());
            System.exit(1);
        }return numero;
    }

    public double calcularRaiz(double numero) {
        double raizCuadrada = 0;
        try {
            // Verificar si el número es negativo
            if (numero < 0) {
                System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                System.exit(1);
            } else {
                raizCuadrada = Math.sqrt(numero);
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número válido.");
            System.exit(1);
        }return raizCuadrada;
    }

    public void mostrarNumero(double raizCuadrada, double numero){
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
    public void procesarActividad5(Scanner scanner){
        double numero = ingresoNumero(scanner);
        double raizCuadrada = calcularRaiz(numero);
        mostrarNumero(raizCuadrada,numero);
    }
}
