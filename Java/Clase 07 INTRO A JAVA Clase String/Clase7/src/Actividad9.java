import java.util.Scanner;

public class Actividad9 {

//    En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud,
//    pero esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará el métdo length() de la clase
//    String y se realizará un proceso adicional para excluir los espacios de la cuenta

    public String ingresarCadena(Scanner scanner) {
        String cadena = null;
        try {
            System.out.println("Una cadena para contar");
            cadena = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Fallo al ingresar la cadena: " + e.getMessage());
            System.exit(1);
        }
        return cadena;
    }
    public int calcularLongitudSinEspacios(String cadena){
        String nCadena = null;
        int espacios = 0;
        try{
          nCadena=cadena.replace(" ","");
          espacios = nCadena.length();
        }catch (Exception e){
            System.out.println("Hay un error al momento de sacar la longitud: "+e.getMessage());
            System.exit(1);
        }
        return espacios;
    }
    public void mostrarliongitud(int espacios){
        try{
            System.out.println("La longitud de la cadena sin espacios es: "+espacios);
        }catch (Exception e ){
            System.out.println("El error al mostrar la longitu es: "+e.getMessage());
            System.exit(1);
        }
    }
    public void procesarActividad9(Scanner scanner){
        String cadena = ingresarCadena(scanner);
        int longitud = calcularLongitudSinEspacios(cadena);
        mostrarliongitud(longitud);
    }

}





