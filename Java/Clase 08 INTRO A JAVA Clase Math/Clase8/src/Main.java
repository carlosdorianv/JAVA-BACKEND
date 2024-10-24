import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la actividad que desea ejecutar");
            int x = scanner.nextInt();
            switch(x){
                case 1:
                    //Actividad 1
                    Actividad1 actividad1 = new Actividad1();
                    try {
                        actividad1.procesarActividad1();
                    } catch (Exception e) {
                        System.out.println("Error inesperado actividad 1: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 2:
                    //Actividad 2
                    Actividad2 actividad2 = new Actividad2();
                    try {
                        actividad2.procesarActividad2();
                    } catch (Exception e) {
                        System.out.println("Error inesperado actividad 2: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 3:
                    //Actividad 3
                    Actividad3 actividad3 = new Actividad3();
                    try {
                        actividad3.procesarActividad3();
                    } catch (Exception e) {
                        System.out.println("Error inesperado actividad 3: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 4:
                    //Actividad 4
                    Actividad4 actividad4 = new Actividad4();
                    try {
                        actividad4.procesarActividad4();
                    } catch (Exception e) {
                        System.out.println("Error inesperado actividad 4: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 5:
                    //Actividad 5
                    Actividad5 actividad5 = new Actividad5();
                    actividad5.procesarActividad5();
                    break;
                case 6:
                    //Actividad 6
                    Actividad6 actividad6 = new Actividad6();
                    try {
                        actividad6.procesarActividad6();
                    } catch (Exception e) {
                        System.out.println("Error inesperado actividad 6: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 7:
                    //Actividad 7
                    Actividad7 actividad7 = new Actividad7();
                    try {
                        actividad7.procesarActividad7(scanner);
                    } catch (Exception e) {
                        System.out.println("Error inesperado actividad 7: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Ingrese el numero correcto");

            }
        }catch (Exception e){
            System.out.println("Hay problemas con toda la Clase 8");
            System.exit(1);
        }
    }
}
