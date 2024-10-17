import java.util.Scanner;

public class Actividad3 {

//    Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero.
//    Utiliza el métdo Integer.parseInt() para convertir la cadena en un número entero.
//     Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser
//     convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado
//     en la pantalla.

    public String ingresarCadena(Scanner scanner){
        String cadena = null;
        try{
            System.out.println("Una cadena de caracteres que represente un numero entero");
            cadena = scanner.nextLine();
        }catch (Exception e){
            System.out.println("No se pudo ingresar la cadena"+ e.getMessage());
            System.exit(1);
        }
        return cadena;
    }
    public int convertirCadena(String cadena){
        int resultado = 0;
        try{
            resultado = Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            System.out.println("La cadena ingresado no es valida, el error es: " + e.getMessage());
            System.exit(1);
        }return resultado;
    }
    public void mostrarResultado(double resultado){
        try{
            System.out.println("El resultado de la conversion es: " + resultado);
        } catch (Exception e) {
            System.out.println("Hubo un erro al mostrar el resultado " + e.getMessage());
        }
    }
    public void procesarActividad3(Scanner scanner){
        String cadena = ingresarCadena(scanner);
        int resultado = convertirCadena(cadena);
        mostrarResultado(resultado);
    }
}
