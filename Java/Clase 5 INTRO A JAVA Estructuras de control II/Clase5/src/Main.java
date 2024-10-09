import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Actividad1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una calificacion de 1 a 5");
        int numA1 = scanner.nextInt();
        Actividad1 actividad1 = new Actividad1();
        actividad1.A1Switch(numA1);
    }
}