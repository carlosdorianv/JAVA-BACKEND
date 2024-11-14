import java.util.Scanner;

public class Actividad7 {
    //    Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al final.
    //    Utiliza el métdo trim() de la clase String para eliminar los espacios en blanco y luego muestra la
    //    frase resultante en pantalla.
    public String ingresarCadena(Scanner scanner) {
        String cadena = null;
        try {
            System.out.println("Ingrese su cadena de caracteres con espacios al final o al inicio");
            cadena = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Fallo al ingresar la cadena: " + e.getMessage());
            System.exit(1);
        }
        return cadena;
    }

    public String cambiarCadena(String cadena) {
        String nCadena = null;
        try {
            nCadena = cadena.trim();
        } catch (Exception e) {
            System.out.println("Fallo al cambiar la cadena" + e.getMessage());
            System.exit(1);
        }
        return nCadena;
    }

    public void mostrarNCadena(String nCadena) {
        try {
            System.out.println(nCadena);
        } catch (RuntimeException e) {
            System.out.println("Hubo un problema al mostrar la cadena" + e.getMessage());
            System.exit(1);
        }
    }

    public void procesarActividad7(Scanner scanner) {
        String cadena = ingresarCadena(scanner);
        String nCadena = cambiarCadena(cadena);
        mostrarNCadena(nCadena);
    }
}
