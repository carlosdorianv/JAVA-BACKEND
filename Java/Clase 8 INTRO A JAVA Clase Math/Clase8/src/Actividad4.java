import java.util.Scanner;

public class Actividad4 {

//    Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente,
//    y calcula el resultado de elevar la base al exponente utilizando el métdo pow() de la clase Math.
//     Muestra el resultado en pantalla.

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
    public int expNumero (int numero, int numero2){
        int expN = 0;
        try{
            expN = (int) Math.pow(numero,numero2);
        } catch (RuntimeException e) {
            System.out.println("No se pudo hacer la transformacion del numero"+ e.getMessage());
        }return expN;
    }
    public void mostrarNumero(int numero, int numero2, int expN){
        System.out.println("El resultado de elevar: " + numero + " a la " +numero2+ " es: " + expN);
    }
    public void procesarActividad4(Scanner scanner){
        int numero = ingresoNumero(scanner);
        Actividad1 actividad1 = new Actividad1();
        int numero2 = actividad1.ingresoNumero(scanner);
        int expN = expNumero(numero,numero2);
        mostrarNumero(numero, numero2,expN);
    }

}
