import java.util.Scanner;

public class Actividad2 {

//    Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos
//    el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que
//    el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla.
//    Si no se produce ninguna excepción, muestra el resultado de la resta.
public double ingresarNumero1(Scanner scanner){
    double numero1 = 0;
    try{
        System.out.println("Ingrese el numero 1 ");
        numero1 = scanner.nextDouble();
    }catch (Exception e){
        System.out.println("No se pudo ingresar el numero 1"+ e.getMessage());
        System.exit(1);
    }
    return numero1;
}
    public double ingresarNumero2(Scanner scanner){
        double numero2 = 0;
        try{
            System.out.println("Ingrese el numero 2 ");
            numero2 = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("No se pudo ingresar el numero 2 " + e.getMessage());
            System.exit(1);
        }
        return numero2;
    }
    public double resultado(double numero1, double numero2){
        double resultado = 0;
        try{
            resultado = numero1-numero2;
        } catch (ArithmeticException e) {
            System.out.println("Hay problemas con la resta: "+ e.getMessage());
        }return resultado;
    }
    public void mostrarResultado(double resultado){
        try{
            System.out.println("El resultado de resta es : " + resultado);
        } catch (Exception e) {
            System.out.println("Hubo un erro al mostrar el resultado " + e.getMessage());
        }
    }
    public void procesarActividad2(Scanner scanner){
        double numero1 = ingresarNumero1(scanner);
        double numero2 = ingresarNumero2(scanner);
        double resultado = resultado(numero1, numero2);
        mostrarResultado(resultado);
    }

}
