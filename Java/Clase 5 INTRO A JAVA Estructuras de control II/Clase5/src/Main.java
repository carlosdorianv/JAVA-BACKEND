import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la actividad que desea abordar");
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    try{
                        //Actividad1
                       scanner = new Scanner(System.in);
                       Actividad1 actividad1 = new Actividad1();
                       actividad1.procesarActividad1(scanner);
                    } catch (RuntimeException e) {
                        System.out.println("Fallo al actividad 1 "+e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        //Actividad2
                        scanner = new Scanner(System.in);
                        Actividad2 actividad2 = new Actividad2();
                        actividad2.procesarActividad2(scanner);
                        } catch (RuntimeException e) {
                            System.out.println("Fallo al actividad 2 "+e.getMessage());
                        }
                    break;
                case 3:
                    try{
                        //Actividad3
                        scanner = new Scanner(System.in);
                        Actividad3 actividad3 = new Actividad3();
                        actividad3.procesarActividad3(scanner);
                    } catch (RuntimeException e) {
                        System.out.println("Fallo al actividad 3 "+e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        //Actividad4
                        scanner = new Scanner(System.in);
                        Actividad4 actividad4 = new Actividad4();
                        actividad4.procesarActividad4(scanner);
                    } catch (RuntimeException e) {
                        System.out.println("Fallo al actividad 4 "+e.getMessage());
                    }
                    break;
                case 5:
                    try{
                        //Actividad5
                        scanner = new Scanner(System.in);
                        Actividad5 actividad5 = new Actividad5();
                        actividad5.procesarActividad5(scanner);
                    } catch (RuntimeException e) {
                        System.out.println("Fallo al actividad 5 "+e.getMessage());
                    }
                    break;
                case 6:
                    try{
                        //Actividad6
                        scanner = new Scanner(System.in);
                        Actividad6 actividad6 = new Actividad6();
                        actividad6.procesarActividad6(scanner);
                    } catch (RuntimeException e) {
                        System.out.println("Fallo al actividad 5 "+e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        }catch (Exception e){
            System.out.println("Coloque un numero Entero el erro es: " + e.getMessage());
        }


    }
}