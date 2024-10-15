import java.util.Scanner;

public class Actividad1 {

//    En esta actividad, escribirás un programa que solicite al usuario ingresar un número
//    del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en
//    pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch"
//    para implementar este programa.

    public int ingresarDiaSemana(Scanner scanner){
        int dia = 0;
        try{
            System.out.println("Ingrese un dia de la semana");
            System.out.println("1 ----> Lunes");
            System.out.println("2 ----> Martes");
            System.out.println("3 ----> Miercoles");
            System.out.println("4 ----> Jueves");
            System.out.println("5 ----> Viernes");
            System.out.println("6 ----> Sabado");
            System.out.println("7 ----> Domingo");
            dia = scanner.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Error al ingresar el dia: "+e.getMessage());
        }
        return dia;
    }

    public void diaswitch(int dia){
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia no valido. Debes ingresar un número del 1 al 7 (Entero).");
        }
    }
    public void procesarActividad1(Scanner scanner){
        int dia = ingresarDiaSemana(scanner);
        diaswitch(dia);
    }

}
