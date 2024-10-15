import java.util.Scanner;

public class Actividad5 {

//    Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.
//    Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y
//    alturaRectangulo, respectivamente.
//    Calcula y almacena el perímetro del rectángulo utilizando la fórmula:

//    Perímetro = 2 × base + 2 × altura.

//    Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
//    Calcula y almacena el área del rectángulo utilizando la fórmula:

//    Área = base × altura.

//    Muestra el resultado del área por consola junto con un mensaje adecuado.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();

        System.out.print("Ingresa el valor de la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();


        double perimetroRectangulo = 2 * baseRectangulo + 2 * alturaRectangulo;

        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);

        double areaRectangulo = baseRectangulo * alturaRectangulo;

        System.out.println("El área del rectángulo es: " + areaRectangulo);

        scanner.close();
    }
}
