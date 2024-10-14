import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Actividad 1
        Actividad1 actividad1 = new Actividad1();
        try {
            String cadena = actividad1.ingresarTexto();
            int longitud = actividad1.obtenerLongitud(cadena);
            actividad1.mostrarLongitud(longitud);
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado actividad 1: " + e.getMessage());
            System.exit(1);
        }

        //Actividad 2
        Actividad2 actividad2 = new Actividad2();
        try {
            String nombre = actividad2.ingresarNombre();
            String apellido = actividad2.ingresarApellido();
            String nombreCompleto = actividad2.concatenarNombreCompleto(nombre, apellido);
            actividad2.mostrarNombreCompleto(nombreCompleto);
        } catch (RuntimeException e) {
            System.out.println("Ocurrio un error inesperado actividad 2: " + e.getMessage());
            System.exit(1);
        }
        //Actividad 3
        Actividad3 actividad3 = new Actividad3();
        try {
            String frase = actividad3.ingresarFrase();
            int indiceI = actividad3.ingresarIndiceI();
            int indiceF = actividad3.ingresarIndiceF();
            String subCadena = actividad3.extraerSubcadena(frase, indiceI, indiceF);
            actividad3.mostrarSubcadena(subCadena);
        } catch (RuntimeException e) {
            System.out.println("Ocurrio un error inesperado actividad 3: " + e.getMessage());
            System.exit(1);
        }


    }
}
