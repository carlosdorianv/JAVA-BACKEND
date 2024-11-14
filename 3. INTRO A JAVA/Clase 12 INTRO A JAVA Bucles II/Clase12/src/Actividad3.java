import java.util.Scanner;

public class Actividad3 {

//    Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while.
//    La contraseña correcta es "secreto".
//    Continuará pidiéndote que ingreses la contraseña hasta que sea correcta

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;
        String contrasenaCorrecta = "secreto";

        System.out.println("Por favor, ingresa la contraseña:");

        while (true) {
            contrasena = scanner.nextLine();

            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña correcta. ¡Acceso concedido!");
                break; // Sale del bucle si la contraseña es correcta
            } else {
                System.out.println("Contraseña incorrecta. Intenta de nuevo:");
            }
        }

        scanner.close();
    }
}
