import java.util.Scanner;

public class Actividad6 {

//    Escribe un programa que solicite al usuario ingresar una frase y dos caracteres.
//    Utiliza el métdo replace() de la clase String para reemplazar todas las ocurrencias del primer carácter con
//     el segundo carácter en la frase ingresada por el usuario. Muestra la frase resultante en pantalla.

    public String ingresarCadena(Scanner scanner){
        String cadena = null;
        try{
            System.out.println("Ingrese su cadena de caracteres");
            cadena = scanner.nextLine();
        }catch (Exception e){
            System.out.println("Fallo al ingresar la cadena: "+e.getMessage());
        }return cadena;
    }

    public char ingresarCaracter1(Scanner scanner) {
        char caracter1 = 0;
        try {
            System.out.println("Ingrese el caracter a cambiar");
            caracter1 = scanner.next().charAt(0);
        } catch (Exception e) {
            System.out.println("El problema con el caracter inicial es: " + e.getMessage());
            System.exit(1);
        }
        return caracter1;
    }
    public char ingresarCaracter2(Scanner scanner) {
        char caracter2 = 0;
        try {
            System.out.println("Ingrese el caracter por el que vamos a cambiar");
            caracter2 = scanner.next().charAt(0);
        } catch (Exception e) {
            System.out.println("El problema con el caractter que vamos a cambiar es: " + e.getMessage());
            System.exit(1);
        }
        return caracter2;
    }
    public String nuevaCadena(String cadena, char caracter1, char caracter2) {
        String nCadena = null;
        try {
            nCadena = cadena.replace(caracter1, caracter2);
        }   catch (Exception e){
            System.out.println("Hubo un problema al completar la busqueda");
            System.exit(1);
        }
        return nCadena;
    }
    public void mostrarNuevaCadena(String nCadena){
        try{
            System.out.println(nCadena);
        } catch (RuntimeException e) {
            System.out.println("Hubo un problema al mostrar la cadena" + e.getMessage());
            System.exit(1);
        }
    }
    public void procesarActividad6(Scanner scanner){
        String cadena = ingresarCadena(scanner);
        char caracter1 = ingresarCaracter1(scanner);
        char caracter2 = ingresarCaracter2(scanner);
        String nCadena = nuevaCadena(cadena,caracter1,caracter2);
        mostrarNuevaCadena(nCadena);
    }
}

