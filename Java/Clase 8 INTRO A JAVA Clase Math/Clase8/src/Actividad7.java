import java.util.Scanner;
public class Actividad7 {

//    Escribe un programa que cumpla con las siguientes condiciones:
//    Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
//    Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
//    Utiliza el métdo Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.
//    Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
//    Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.

// Métdo para analizar raíz cuadrada y primalidad de un número aleatorio

    public int ingresoNumero(Scanner scanner){
        int numero = 0;
        try{
            System.out.println("Ingrese su numero entero entre 1 y 30");
            numero = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Numero ingresado no valido revise que sea entero " + e.getMessage());
            System.exit(1);
        }return numero;
    }

    private boolean esNumeroPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public void analizarNumero(int numero) {

        try {
            if (numero < 1 || numero > 30) {
                System.out.println("Error: El número debe estar entre 1 y 30.");
                System.exit(1);
            }else{
                int numeroAleatorio = (int)(Math.random() * numero) + 1;
            }
            double raizCuadrada = Math.sqrt(numero);
            boolean esPrimo = esNumeroPrimo(numero);

            System.out.println("Número aleatorio generado: " + numero);
            System.out.println("Raíz cuadrada: " + raizCuadrada);
            System.out.println("¿Es primo? " + (esPrimo ? "Sí" : "No"));
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número válido.");
            System.exit(1);
        }
    }
    public void procesarActividad7 (Scanner scanner){
        int numero = ingresoNumero(scanner);
        analizarNumero(numero);
    }

}
