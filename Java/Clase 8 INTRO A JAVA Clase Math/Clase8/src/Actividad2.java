import java.util.Scanner;

public class Actividad2 {

//    Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando
//    el métdo round() de la clase Math.

public double ingresoNumero(Scanner scanner){
    double numero = 0;
    try{
        System.out.println("Ingrese su numero racional");
        numero = scanner.nextInt();
    }catch (Exception e){
        System.out.println("Numero ingresado no es valido " + e.getMessage());
        System.exit(1);
    }return numero;
}

    public double rndNumero (double numero){
        double rndN = 0;
        try{
            rndN = Math.round(numero);
        } catch (RuntimeException e) {
            System.out.println("No se pudo hacer la transformacion del numero"+ e.getMessage());
        }return rndN;
    }
    public void mostrarNumero(double rndN, double numero){
        System.out.println("El valor absoluto de: "+numero+" es: "+rndN);
    }
    public void procesarActividad2(Scanner scanner){
        double numero = ingresoNumero(scanner);
        double rndN = rndNumero(numero);
        mostrarNumero(rndN,numero);
    }
}
