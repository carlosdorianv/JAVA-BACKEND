import java.util.Scanner;

public class Actividad1 {

//    Escribe un programa que  pida al usuario un número entero y muestra en pantalla
//    su valor absoluto utilizando el métdo abs() de la clase Math.

    public int ingresoNumero(Scanner scanner){
        int numero = 0;
        try{
            System.out.println("Ingrese su numero entero");
            numero = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Numero ingresado no valido revise que sea entero " + e.getMessage());
            System.exit(1);
        }return numero;
    }

    public int absNumero (int numero){
        int absN = 0;
        try{
            absN = Math.abs(numero);
        } catch (RuntimeException e) {
            System.out.println("No se pudo hacer la transformacion del numero"+ e.getMessage());
        }return absN;
    }
    public void mostrarNumero(int absN, int numero){
        System.out.println("El valor absoluto de: "+numero+" es: "+absN);
    }
    public void procesarActividad1(Scanner scanner){
        int numero = ingresoNumero(scanner);
        int absN = absNumero(numero);
        mostrarNumero(absN,numero);
    }


}
