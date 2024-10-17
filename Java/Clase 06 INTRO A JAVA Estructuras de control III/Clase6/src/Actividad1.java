import java.util.Scanner;

public class Actividad1 {

//    Escribe un programa que pida al usuario que ingrese dos números enteros y realice
//    la división del primer número entre el segundo número.
//    Implementa un bloque "try-catch" para manejar la excepción en caso de que se
//    intente realizar una división por cero. En caso de que ocurra la excepción,
//    muestra un mensaje apropiado en la pantalla.

    public double ingresarDividendo(Scanner scanner){
        double dividendo = 0;
        try{
            System.out.println("Ingrese el dividiendo ");
            dividendo = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("No se pudo ingresar el dividendo"+ e.getMessage());
            System.exit(1);
        }
        return dividendo;
    }
    public double ingresarDivisor(Scanner scanner){
        double divisor = 0;
        try{
            System.out.println("Ingrese el divisor ");
            divisor = scanner.nextDouble();
        }catch (ArithmeticException e){
            System.out.println("No se pudo ingresar el divisor" + e.getMessage());
            System.exit(1);
        }
        return divisor;
    }
    public double resultado(double dividendo, double divisor){
        double resultado = 0;
        try{
            resultado = dividendo/divisor;
        } catch (ArithmeticException e) {
            System.out.println("Hay problemas en la division, elija un numero diferente de 0"+ e.getMessage());
            System.exit(1);

        }return resultado;
    }
    public void mostrarResultado(double resultado){
        try{
            System.out.println("El resultado de su division es: " + resultado);
        } catch (Exception e) {
            System.out.println("Hubo un erro al mostrar el resultado " + e.getMessage());
        }
    }
    public void procesarActividad1(Scanner scanner){
        double dividendo = ingresarDividendo(scanner);
        double divisor = ingresarDivisor(scanner);
        double resultado = resultado(dividendo, divisor);
        mostrarResultado(resultado);
    }
}
