import java.util.Scanner;

public class Actividad3 {

//    Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando
//    el métdo random() de la clase Math. Puedes utilizar el métdo floor() para redondear el número
//     aleatorio hacia abajo.

    public int generarNumeroAleatorio() {
        int numero = 0;  // Inicializar la variable
        try {
            numero = (int) Math.floor(Math.random() * 355) + 1;
        } catch (Exception e) {
            System.out.println("Error generando el número aleatorio: " + e.getMessage());
            System.exit(1);
        }return numero;
    }
    public void mostrarNumeroAleatorio(int numero){
       try{
           System.out.println("Número aleatorio generado: " + numero);
       } catch (RuntimeException e) {
           System.out.println("Error al mostar numero aleatorio " + e.getMessage());
           System.exit(1);
       }
        // Mostrar el número aleatorio en pantalla
    }
    public void procesarActividad3(Scanner scanner){
        int numero = generarNumeroAleatorio();
        mostrarNumeroAleatorio(numero);
    }
}
