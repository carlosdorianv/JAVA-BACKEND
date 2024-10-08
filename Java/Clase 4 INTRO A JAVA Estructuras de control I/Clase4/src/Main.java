import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Actividad 1
        System.out.println("Ingrese un numero");
        double numA1 = scanner.nextDouble() ;
        Actividad1 actividad1 = new Actividad1();
        actividad1.esMayor(numA1);
        //Actividad 2
        System.out.println("Ingrese un numero de nota");
        double numA2 = scanner.nextDouble() ;
        Actividad2 actividad2 = new Actividad2();
        actividad2.nota(numA2);
        //Actividad 3
        System.out.println("Ingrese un numero ");
        double numA3 = scanner.nextDouble();
        Actividad3 actividad3 = new Actividad3();
        actividad3.divisible(numA3);
        //Actividad 4
        System.out.println("Ingrese su clave ");
        String str1 = scanner.nextLine();
        Actividad4 actividad4 = new Actividad4();
        actividad4.validPass(str1);
        //Actividad 5
        System.out.println("Ingrese el precio del producto ");
        double pre = scanner.nextDouble();
        Actividad5 actividad5 = new Actividad5();
        actividad5.desc(pre);
        //Actividad 6
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        Actividad6 actividad6 = new Actividad6();
        actividad6.rangoEdad(edad);

        scanner.close();
    }
}