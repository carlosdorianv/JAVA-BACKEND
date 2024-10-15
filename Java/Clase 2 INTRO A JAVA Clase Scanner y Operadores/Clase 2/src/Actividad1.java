import java.util.Scanner;

public class Actividad1 {

//    Para entender mejor el concepto de esta clase, practicarás con los siguientes ejercicios:
//
//    Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
//    Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
//    Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.

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
