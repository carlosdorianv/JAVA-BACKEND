import java.util.Scanner;

public class Actividad4 {

//    Mediante una estructura switch, desarrollarás un programa que pida al
//    usuario ingresar un número del 1 al 3 para seleccionar una
//    figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo.
//    Después, solicitará al usuario los datos necesarios para calcular el área de la figura
//    seleccionada. Estos datos serán:
//    Para el círculo: el radio.
//    Para el cuadrado: el lado.
//    Para el triángulo: la base y la altura.
//    Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.

    public int ingresarFiguraGeometrica(Scanner scanner){
        int fig = 0;
        try{
            System.out.println("Ingrese una figura geometrica");
            System.out.println("1 ----> Circulo");
            System.out.println("2 ----> Cuadrado");
            System.out.println("3 ----> Triangulo");
            fig = scanner.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Error al ingresar el tipo de figura: "+e.getMessage());
        }
        return fig;
    }
    public void figuraSwitch(int fig, Scanner scanner){
        switch (fig) {
            case 1 -> {
                String figu = "Circulo";
                double area = areaCirculo(scanner);
                mostrarArea(figu,area);
            }
            case 2 -> {
                String figu = "Cuadrado";
                double area = areaCuadrado(scanner);
                mostrarArea(figu,area);
            }
            case 3 -> {
                String figu = "Triangulo";
                double area = areaTriangulo(scanner);
                mostrarArea(figu,area);
            }
            default -> System.out.println("Figura geometrica no valida. Debes ingresar un número del 1 al 3 (Entero).");
        }
    }
    public double areaCirculo(Scanner scanner){
        double area = 0;
        try{
            System.out.println("Ingrese el radio del circulo");
            double radioC = scanner.nextDouble();
            area = (radioC*radioC) * 3.1416;
        }catch (Exception e){
            System.out.println("El error es: "+ e.getMessage());
        }return area;
    }
    public double areaCuadrado(Scanner scanner){
        double area = 0;
        try{
            System.out.println("Ingrese el lado del cuadrado");
            double ladoC = scanner.nextDouble();
            area = ladoC*ladoC;
        }catch (Exception e){
            System.out.println("El error es: "+ e.getMessage());
        }return area;
    }
    public double areaTriangulo(Scanner scanner){
        double area = 0;
        try{
            System.out.println("Ingrese la base del triangulo");
            double base = scanner.nextDouble();
            System.out.println("Ingrese la altura del triangulo");
            double altura = scanner.nextDouble();
            area = base*altura;
        }catch (Exception e){
            System.out.println("El error es: "+ e.getMessage());
        }return area;
    }
    public void mostrarArea(String figu,double area){
        try {
            System.out.println("Su "+figu+" tiene un area de: "+area);
        }catch (Exception e){
            System.out.println("Problema al mostrar el area el error es: "+e.getMessage());
        }
    }
    public void procesarActividad4(Scanner scanner){
        int fig = ingresarFiguraGeometrica(scanner);
        figuraSwitch(fig,scanner);
    }

}
