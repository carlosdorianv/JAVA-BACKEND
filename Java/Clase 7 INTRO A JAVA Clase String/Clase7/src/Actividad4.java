import java.util.Scanner;

public class Actividad4 {

//    Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter ingresado
//    se encuentra en la palabra utilizando el métdo indexOf() de la clase String. Muestra un mensaje adecuado en
//     pantalla indicando si el carácter se encuentra o no en la palabra.

    public String ingresearCadena(Scanner scanner) {
        String cadena = null;
        try {
            System.out.println("Ingrese la cadena");
            cadena = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("El problema con la cadena es: " + e.getMessage());
            System.exit(1);
        }
        return cadena;
    }

    public char ingresarCaracter(Scanner scanner) {
        char caracter = 0;
        try {
            System.out.println("Ingrese el indice");
            caracter = scanner.next().charAt(0);
        } catch (Exception e) {
            System.out.println("El problema con el indice es: " + e.getMessage());
            System.exit(1);
        }
        return caracter;
    }

    public void busqueda(String cadena, char caracter) {
        try {
            int index = cadena.indexOf(caracter);
            if (index != -1){
                System.out.println("La letra" +"'"+caracter+"'"+ "se encuenta en la pocision " +"'"+(index+1)+"'");
            }else {
                System.out.println("La letra no se encuentra en la cadena");
            }
        }   catch (Exception e){
            System.out.println("Hubo un problema al completar la busqueda");
            System.exit(1);
        }
    }
    public void procesarActividad4(Scanner scanner){
        String cadena = ingresearCadena(scanner);
        char caracter = ingresarCaracter(scanner);
        busqueda(cadena, caracter);
    }
}
