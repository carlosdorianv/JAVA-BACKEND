import java.util.Scanner;

public class Actividad6 {

//    Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior.
//    Luego, utiliza el métdo random() de la clase Math para generar y mostrar en pantalla un número aleatorio
//    dentro del rango especificado por los límites ingresados.

    public int ingresarLimiteInferior(Scanner scanner){
        int limiteInferior = 0;
        try{
            System.out.print("Ingresa el límite inferior: ");
            limiteInferior = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Problemas ingresando el limite inferior" + e.getMessage());
        }return limiteInferior;
    }
    public int ingresarLimiteSuperior(Scanner scanner){
        int limiteSuperior = 0;
        try{
            System.out.print("Ingresa el límite superior: ");
            limiteSuperior = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Problemas ingresando el limite superior " + e.getMessage());
        }return limiteSuperior;
    }
    public int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
        int numeroAleatorio = 0;
        try {
            if (limiteInferior >= limiteSuperior) {
                System.out.println("Error: El límite inferior debe ser menor que el límite superior.");
                System.exit(1);
            }
            numeroAleatorio = (int)(Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar números válidos.");
        } return numeroAleatorio;
    }
    public void mostrarNumeroAleatorio(int limiteInferior, int limiteSuperior, int numeroAleatorio){
        System.out.println("Número aleatorio generado entre " + limiteInferior + " y " + limiteSuperior + ": " + numeroAleatorio);
    }
    public void procesarActividad6(Scanner scanner){
        int limiteInferior = ingresarLimiteInferior(scanner);
        int limiteSuperior = ingresarLimiteSuperior(scanner);
        int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
        mostrarNumeroAleatorio(limiteInferior,limiteSuperior,numeroAleatorio);
    }
}
