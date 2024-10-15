import java.util.Scanner;

public class Actividad6 {

//    Implementando el uso de la estructura "switch expression",
//    solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
//
//    Opción 1: "Circulo"
//    Opción 2: "Rectangulo"
//
//    Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área
//    o el perímetro de cada figura:
//
//    Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
//    Para el Rectángulo: Solicita el valor de la base y de la altura.
//
//    Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área
//    o el perímetro de dicha figura.
//    Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado.

    public int ingresarFiguraGeometrica(Scanner scanner){
        int fig = 0;
        try{
            System.out.println("Ingrese una figura geometrica");
            System.out.println("1 ----> Circulo");
            System.out.println("2 ----> Rectangulo");
            fig = scanner.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Error al ingresar el tipo de figura: "+e.getMessage());
        }
        return fig;
    }
    public int ingresarOpcion(Scanner scanner){
        int opc = 0;
        try{
            System.out.println("Ingrese una opcion");
            System.out.println("1 ----> Area");
            System.out.println("2 ----> Perimetro");
            opc = scanner.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Error al ingresar la opcion de figura: "+e.getMessage());
        }
        return opc;
    }
    public void figuraSwitch(int fig,int opc, Scanner scanner){
        try{
            switch (fig) {
                case 1 -> {
                    switch (opc){
                        case 1:
                            String figu = "Circulo";
                            double radio = ingresoRadio(scanner);
                            double area = areaCirculo(radio);
                            mostrarArea(figu,area);
                            break;
                        case 2:
                            String figu2 = "Circulo";
                            double radio2 = ingresoRadio(scanner);
                            double perimetro = perimetroCirculo(radio2);
                            mostrarPerimetro(figu2,perimetro);
                            break;

                        default:
                            System.out.println("Opcion no valida ingresar 1 para area, 2 para perimetro");
                            break;
                    }
                }

                case 2 -> {
                    switch (opc){
                        case 1:
                            String figu = "Rectangulo";
                            double base = ingresoBase(scanner);
                            double altura = ingresoAltura(scanner);
                            double area = areaRectangulo(base, altura);
                            mostrarArea(figu, area);
                            break;
                        case 2:
                            String figu2 = "Rectangulo";
                            double base2 = ingresoBase(scanner);
                            double altura2 = ingresoAltura(scanner);
                            double perimetro = perimetroRectangulo(base2,altura2);
                            mostrarPerimetro(figu2, perimetro);
                            break;
                        default:
                            System.out.println("Opcion no valida ingresar 1 para area, 2 para perimetro");
                            break;
                    }
                }
                default -> System.out.println("Figura geometrica no valida. Debes ingresar un número del 1 al 3 (Entero).");
            }
        }catch (Exception e){
            System.out.println("Problema en el switch de figuras: " + e.getMessage());
        }

    }
    public double ingresoRadio(Scanner scanner){
        double radio = 0;
        try{
            System.out.println("Ingrese el radio del circulo");
            radio = scanner.nextDouble();
        }catch(Exception e){
            System.out.println("El error al recoger el radio es: "+ e.getMessage());
        }return radio;
    }
    public double ingresoBase(Scanner scanner){
        double base = 0;
        try{
            System.out.println("Ingrese la base del rectangulo");
            base = scanner.nextDouble();
        }catch(Exception e){
            System.out.println("El error al recoger la base del rectangulo es: "+ e.getMessage());
        }return base;
    }
    public double ingresoAltura(Scanner scanner){
        double altura = 0;
        try{
            System.out.println("Ingrese la altura del rectangulo");
            altura = scanner.nextDouble();
        }catch(Exception e){
            System.out.println("El error al recoger la altura del rectangulo es: "+ e.getMessage());
        }return altura;
    }
    public double areaCirculo(double radio){
        double area = 0;
        try{
            area = (radio*radio) * 3.1416;
        }catch (Exception e){
            System.out.println("El error al allar el area del circulo es: "+ e.getMessage());
        }return area;
    }
    public double perimetroCirculo(double radio){
        double perimetro = 0;
        try{
            perimetro = (radio*2) * 3.1416;
        }catch (Exception e){
            System.out.println("El error al allar el perimetro del ciculo es: "+ e.getMessage());
        }return perimetro;
    }

    public double areaRectangulo(double base, double altura){
        double area = 0;
        try{
            area = base*altura;
        }catch (Exception e){
            System.out.println("El error al calcular el area del rectangulo es: "+ e.getMessage());
        }return area;
    }
    public double perimetroRectangulo(double base, double altura){
        double perimetro = 0;
        try{
            perimetro = (base+altura)*2;
        }catch (Exception e){
            System.out.println("El error al calcular el perimetro del rectangulo es: "+ e.getMessage());
        }return perimetro;
    }

    public void mostrarArea(String figu, double area){
        try {
            System.out.println("Su "+figu+" tiene un area de: "+area);
        }catch (Exception e){
            System.out.println("Problema al mostrar el area el error es: "+e.getMessage());
        }
    }
    public void mostrarPerimetro(String figu, double perimetro){
        try {
            System.out.println("Su "+figu+" tiene un perimetro de: "+perimetro);
        }catch (Exception e){
            System.out.println("Problema al mostrar el perimetro el error es: "+e.getMessage());
        }
    }
    public void procesarActividad6(Scanner scanner){
        int fig = ingresarFiguraGeometrica(scanner);
        int opc = ingresarOpcion(scanner);
        figuraSwitch(fig,opc,scanner);

    }
}

