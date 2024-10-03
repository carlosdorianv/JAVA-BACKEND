import java.util.Scanner;

public class Actividad1 {

    private String nombre;
    private int edad;

    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Por favor, ingresa tu edad: ");
        edad = scanner.nextInt();

    }

    public void mostrarDatos() {
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad + ".");
    }
}
