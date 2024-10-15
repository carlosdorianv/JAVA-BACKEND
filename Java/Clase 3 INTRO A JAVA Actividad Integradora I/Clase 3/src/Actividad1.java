import java.util.Scanner;

public class Actividad1 {

//    Después de analizar el funcionamiento del programa requerido en el video proporcionado, tu tarea es escribir el
//    código necesario para cumplir con los siguientes puntos:
//    Solicita al usuario que ingrese un número y almacena este valor en una variable.
//    Desarrolla un programa que determine si el número ingresado es par o impar.
//    Muestra el resultado en la consola.
//    Recuerda utilizar el operador ternario para simplificar la lógica del programa y optimizar su escritura.

    private int num;

    public void parInpar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        num = scanner.nextInt();
        String resultado = (num % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);
    }
}

