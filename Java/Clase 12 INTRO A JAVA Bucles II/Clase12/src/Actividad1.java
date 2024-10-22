import java.util.Scanner;

public class Actividad1 {

    //    Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
    //
    //    Comprar producto.
    //    Realizar devolución.
    //    Ver mis pedidos.
    //    Preguntas frecuentes.
    //    Salir.
    //
    //   Luego, solicita al usuario que elija una opción del menú mostrado en pantalla.
    //   El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa.
    //   En este ejercicio, no es necesario que las opciones del menú realicen acciones reales,
    //   simplemente muestra un mensaje que indique qué opción eligió el usuario.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        try {
            do {
                System.out.println("Menú Interactivo:");
                System.out.println("1. Comprar producto");
                System.out.println("2. Realizar devolución");
                System.out.println("3. Ver mis pedidos");
                System.out.println("4. Preguntas frecuentes");
                System.out.println("5. Salir");
                System.out.print("Elige una opción (1-5): ");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has elegido: Comprar producto.");
                        break;
                    case 2:
                        System.out.println("Has elegido: Realizar devolución.");
                        break;
                    case 3:
                        System.out.println("Has elegido: Ver mis pedidos.");
                        break;
                    case 4:
                        System.out.println("Has elegido: Preguntas frecuentes.");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                }
            } while (opcion != 5);
            scanner.close();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
