import java.util.Scanner;
public class Actividad5 {
//    Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena,
//    pero con todos los caracteres en mayúsculas o minúsculas. Utiliza los métodos toUpperCase() y toLowerCase()
//    de la clase String para realizar la conversión.

    public String ingresarCadena(Scanner scanner){
        String cadena = null;
        try{
            System.out.println("Ingrese su cadena de caracteres");
            cadena = scanner.nextLine();
        }catch (Exception e){
            System.out.println("Fallo al ingresar la cadena: "+e.getMessage());
        }return cadena;
    }
    public void pasarMayusculas(String cadena){
        try{
            String mayuculas = cadena.toUpperCase();
            System.out.println(mayuculas);
        }catch (Exception e){
        System.out.println("El error al mostrar las mayusculas es " +e.getMessage());
        }
    }
    public void pasarMinusculas(String cadena){
        try {
            String minusculas = cadena.toLowerCase();
            System.out.println(minusculas);
        }catch (Exception e){
            System.out.println("El error al mostrar las minusculas es " +e.getMessage());
        }
    }
    public void procesarActividad5(Scanner scanner){
        String cadena = ingresarCadena(scanner);
        pasarMayusculas(cadena);
        pasarMinusculas(cadena);
    }
}
