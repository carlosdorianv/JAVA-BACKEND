import java.util.Scanner;

public class Actividad1 {


    private int num;

    public void parInpar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        num = scanner.nextInt();
        String resultado = (num % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);
    }
}

