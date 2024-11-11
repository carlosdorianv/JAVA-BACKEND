import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Actividad1

        Persona persona1 = new Persona("Maria", 27);

        persona1.imprimirDatos();

        Persona persona2 = new Persona("Jose", 25);

        persona2.imprimirDatos();

        //Actividad 2

        Auto auto1 = new Auto("Toyota ", "Prado ",2024);

        auto1.mostrar();

        Auto auto2 = new Auto("Renault ", "Stepway ");

        auto2.mostrar();

        Auto auto3 = new Auto("BMW ");

        auto3.mostrar();

        Auto auto4 = new Auto();

        auto4.mostrar();

        //Actividad 3

        System.out.println("Ingresa 1 Para crear un nuevo rectangulo" + "\n Ingresa 2 para Obtener el Area" + "\n Ingresa 3 para obtener el perimetro"+ "\n Ingresa 4 para obtener la cantidad de rectangulos creados" + "\n Ingresa 5 para salir");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        Rectangulo rectangulo = new Rectangulo();
        switch(x){
            case 1 :
                System.out.println("Ingrese la base del rectangulo");
                int y = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese la altura del rectangulo");
                int z = Integer.parseInt(sc.nextLine());
                rectangulo.alto = z;
                rectangulo.ancho = y;
            case 2 :
                rectangulo.imprimirArea();
            case 3:
                rectangulo.imprimirPerimetro();
            case 4:
                rectangulo.mostrarContador();
            case 5:
                break;

        }

    }
}