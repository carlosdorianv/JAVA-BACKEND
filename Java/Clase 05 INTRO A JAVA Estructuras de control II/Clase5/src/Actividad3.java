import java.util.Scanner;

public class Actividad3 {

//    En esta actividad, vas a desarrollar un programa que mostrará un menú con las
//    siguientes opciones:
//    Opción 1: "Guardar"
//    Opción 2: "Cargar"
//    Opción 3: "Salir"
//    El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar
//    una opción. Utilizarás la estructura "switch" para implementar este programa y
//    mostrar en pantalla el mensaje correspondiente a la opción seleccionada.

public int ingresarOpcion(Scanner scanner){
    int opcion = 0;
    try{
        System.out.println("Ingrese una Opcion: ");
        System.out.println("1 ----> Guardar");
        System.out.println("2 ----> Cargar");
        System.out.println("3 ----> Salir");
        opcion = scanner.nextInt();
    } catch (RuntimeException e) {
        System.out.println("Error al ingresar la opcion: "+e.getMessage());
    }
    return opcion;
}

    public void opcionSwitch(int opcion){
        switch (opcion) {
            case 1 -> System.out.println("Guardar");
            case 2 -> System.out.println("Cargar");
            case 3 -> System.out.println("Salir");
            default -> System.out.println("Opcion no valida. Debes ingresar un número del 1 al 3 (Entero).");
        }
    }
    public void procesarActividad3(Scanner scanner){
        int opcion = ingresarOpcion(scanner);
        opcionSwitch(opcion);
    }
}
