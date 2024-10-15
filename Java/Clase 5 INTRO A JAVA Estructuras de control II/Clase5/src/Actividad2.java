import java.util.Scanner;

public class Actividad2 {

//    En esta actividad, desarrollarás un programa que solicitará al usuario ingresar
//    una calificación numérica del 1 al 5. Luego, mostrará en pantalla la calificación
//    correspondiente en letras, utilizando la siguiente escala:
//            1: "Muy deficiente"
//            2: "Deficiente"
//            3: "Suficiente"
//            4: "Notable"
//            5: "Sobresaliente"

    public int ingresarCalificacion(Scanner scanner){
        int numA1 = 0;
        try{
            System.out.println("Ingrese la calificiacion de 1 a 5 (Entera)");
            numA1 = scanner.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Error al ingresar la calificacion: "+e.getMessage());
        }
        return numA1;
    }

    public void a1Switch(int numA1){
        switch (numA1) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Calificación no válida. Debes ingresar un número del 1 al 5 (Entero).");
        }
    }
    public void procesarActividad2(Scanner scanner){
        int numA1 = ingresarCalificacion(scanner);
        a1Switch(numA1);
    }
}
