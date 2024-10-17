import  java.util.Scanner;
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
                    scanner = new Scanner(System.in);
                    try {
                        actividad1.procesarActividad1(scanner);
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado actividad 1: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 2:
                    //Actividad 2
                    Actividad2 actividad2 = new Actividad2();
                    scanner = new Scanner(System.in);
                    try {
                        actividad2.procesarActividad2(scanner);
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado actividad 2: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                case 3:
                    //Actividad 3
                    Actividad3 actividad3 = new Actividad3();
                    scanner = new Scanner(System.in);
                    try {
                        actividad3.procesarActividad3(scanner);
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado actividad 3: " + e.getMessage());
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Ingrese el numero correcto");
            }
            scanner.close();
        }catch (Exception e){
            System.out.println("Hay problemas con toda la Clase 6");
            System.exit(1);
        }

    }
}

