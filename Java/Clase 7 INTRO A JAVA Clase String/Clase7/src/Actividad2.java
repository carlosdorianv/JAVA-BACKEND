import java.util.Scanner;

 public class Actividad2 {

//     Escribe un programa que solicite al usuario ingresar su nombre y apellido por
//     separado, y luego muestre en pantalla el nombre completo utilizando el métdo
//     concat() de la clase String.

        public String ingresarNombre(Scanner scanner) {
            String nombre = null;
            try {
                System.out.print("Ingresa tu nombre: ");
                nombre = scanner.nextLine();

            } catch (Exception e) {
                System.out.println("Ocurrió un error al ingresar el nombre: " + e.getMessage());
                System.exit(1);
            }
            return nombre;
        }

        public String ingresarApellido(Scanner scanner) {
            String apellido = null;
            try {
                System.out.print("Ingresa tu apellido: ");
                apellido = scanner.nextLine();

            } catch (Exception e) {
                System.out.println("Ocurrió un error al ingresar el apellido: " + e.getMessage());
                System.exit(1);
            }
            return apellido;
        }

        public String concatenarNombreCompleto(String nombre, String apellido) {
            String nombreCompleto = null;
            try {
                nombreCompleto = nombre.concat(" ").concat(apellido);
            } catch (NullPointerException e) {
                System.out.println("El nombre o apellido no pueden ser nulos." + e.getMessage());
                System.exit(1);
            }
            return nombreCompleto;
        }

        public void mostrarNombreCompleto(String nombreCompleto) {
            try {
                System.out.println("El nombre completo es: " + nombreCompleto);
            } catch (Exception e) {
                System.out.println("Ocurrió un error al mostrar el nombre completo: " + e.getMessage());
                System.exit(1);
            }
        }
        public void procesarActividad2(Scanner scanner){
            String nombre = ingresarNombre(scanner);
            String apellido = ingresarApellido(scanner);
            String nombreCompleto = concatenarNombreCompleto(nombre, apellido);
            mostrarNombreCompleto(nombreCompleto);
     }
    }


