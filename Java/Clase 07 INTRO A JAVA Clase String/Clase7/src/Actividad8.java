import java.util.Scanner;

public class Actividad8 {

//    Desarrolla un programa que solicite al usuario ingresar dos palabras.
//    Utiliza el métdo equals() de la clase String para comparar si las dos palabras son iguales.
//    Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.

    public String ingresarPalabra1(Scanner scanner) {
        String palabra1 = null;
        try {
            System.out.println("Ingrese la primera palabra a completar");
            palabra1 = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Fallo al ingresar la cadena: " + e.getMessage());
            System.exit(1);
        }
        return palabra1;
    }
    public String ingresarPalabra2(Scanner scanner) {
        String palabra2 = null;
        try {
            System.out.println("Ingrese la segunda palabra a completar");
            palabra2 = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Fallo al ingresar la cadena: " + e.getMessage());
            System.exit(1);
        }
        return palabra2;
    }
    public boolean comparacionDePalabras(String palabra1, String palabra2){
        boolean xx = false;
        try{
            xx = palabra1.equals(palabra2);
            System.out.println(xx);
        }catch (Exception e){
            System.out.println("Hay un error en la comparacion: "+e.getMessage());
        }
        return xx;
    }
    public void mostrarIguales(boolean xx) {
        try {
            if (xx){
                System.out.println("Son iguales las palabras");
            }else{
                System.out.println("Las palabras no son iguales");
            }
        } catch (RuntimeException e) {
            System.out.println("Hubo un problema al mostrar la cadena" + e.getMessage());
            System.exit(1);
        }
    }
    public void procesarActividad8(Scanner scanner) {
        String palabra1 = ingresarPalabra1(scanner);
        String palabra2 = ingresarPalabra2(scanner);
        boolean xx = comparacionDePalabras(palabra1,palabra2);
        mostrarIguales(xx);
    }
}
