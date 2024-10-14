import java.util.Scanner;

public class Actividad1 {

//    Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla
//    su longitud utilizando el métdo length() de la clase String.

    public String ingresarTexto() {

        String cadena = "";
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa una cadena de texto: ");
            cadena = scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Ocurrió un error al ingresar el texto: " + e.getMessage());
            System.exit(1);
        }
        return cadena;
    }

    public int obtenerLongitud(String cadena) {
        int longitud = 0;
        try {
            longitud = cadena.length();
        } catch (NullPointerException e) {
            System.out.println("La cadena ingresada es nula.");
            System.exit(1);
        }
        return longitud;
    }

    public void mostrarLongitud(int longitud) {
        try {
            System.out.println("La longitud de la cadena es: " + longitud);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al mostrar la longitud: " + e.getMessage());
            System.exit(1);
        }
    }
}


