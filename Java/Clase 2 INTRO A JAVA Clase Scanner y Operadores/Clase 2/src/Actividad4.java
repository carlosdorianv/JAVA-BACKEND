import java.util.Scanner;

public class Actividad4 {

//    Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable
//    previamente declarada llamada añoNacimiento.
//    Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
//    Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento.
//    Almacena el dato en una variable llamada calculoEdad.
//    Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        final int ANIOACTUAL = 2024;

        int calculoEdad = ANIOACTUAL - añoNacimiento;

        System.out.println("Tu edad actual es: " + calculoEdad + " años");

        if (calculoEdad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }
}
