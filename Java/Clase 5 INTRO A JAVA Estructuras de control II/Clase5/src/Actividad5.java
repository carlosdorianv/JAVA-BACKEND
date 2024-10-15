import java.util.Scanner;

public class Actividad5 {

//    En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana.
//    El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla.
//    Se considera que los días hábiles son del 1 al 5 (de lunes a viernes).
//    Utilizaremos la estructura "switch" para implementar este programa.
//    ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)

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
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un dia hábil");
            case 6:
            case 7:
                System.out.println("No es un dia hábil");
                break;
            default : System.out.println("Dia no valido. Debes ingresar un número del 1 al 7 (Entero).");
        }
    }
    public void procesarActividad5(Scanner scanner){
        int dia = ingresarDiaSemana(scanner);
        diaswitch(dia);
    }
}
