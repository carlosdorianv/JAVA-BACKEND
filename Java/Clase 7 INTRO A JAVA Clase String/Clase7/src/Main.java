import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try{
        Scanner scanner = new Scanner(System.in);
        //Actividad 1
        Actividad1 actividad1 = new Actividad1();
        try {
            actividad1.procesarActividad1(scanner);
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado actividad 1: " + e.getMessage());
            System.exit(1);
        }

        //Actividad 2
        Actividad2 actividad2 = new Actividad2();
        try {
            actividad2.procesarActividad2(scanner);
        } catch (RuntimeException e) {
            System.out.println("Ocurrio un error inesperado actividad 2: " + e.getMessage());
            System.exit(1);
        }
        //Actividad 3
        Actividad3 actividad3 = new Actividad3();
        try {
            actividad3.procesarActividad3(scanner);
        } catch (RuntimeException e) {
            System.out.println("Ocurrio un error inesperado actividad 3: " + e.getMessage());
            System.exit(1);
        }
        //Actividad 4
        Actividad4 actividad4 = new Actividad4();
        try{
            actividad4.procesarActividad4(scanner);
        }catch (RuntimeException e){
            System.out.println("Ocurrio un error inesperado actividad 4:" + e.getMessage());
            System.exit(1);
        }

        //Actividad 5
        Actividad5 actividad5 = new Actividad5();
        try{
            actividad5.procesarActividad5(scanner);
        }catch(RuntimeException e){
            System.out.println("Ocurrio un error inesperado actividad 5: " + e.getMessage());
        }

        //Actividad 6
        Actividad6 actividad6 = new Actividad6();
        try{
            actividad6.procesarActividad6(scanner);
        }catch(RuntimeException e){
            System.out.println("Ocurrio un error inesperado actividad 6: "+ e.getMessage());
        }

        //Actividad 7
        Actividad7 actividad7 = new Actividad7();
        try{
            actividad7.procesarActividad7(scanner);
        }catch(RuntimeException e){
            System.out.println("Ocurrio un error inesperado actividad 7: "+ e.getMessage());
        }

        //Actividad 8
        Actividad8 actividad8 = new Actividad8();
        try{
            actividad8.procesarActividad8(scanner);
        }catch(RuntimeException e){
            System.out.println("Ocurrio un error inesperado actividad 8: "+ e.getMessage());
        }
        //Actividad 9
        Actividad9 actividad9 = new Actividad9();
        try{
            actividad9.procesarActividad9(scanner);
        }catch(RuntimeException e){
            System.out.println("Ocurrio un error inesperado actividad 9: "+ e.getMessage());
        }

        scanner.close();
        }catch (Exception e){
            System.out.println("Hay problemas con toda la Clase 7");
            System.exit(1);
            }


    }
}
