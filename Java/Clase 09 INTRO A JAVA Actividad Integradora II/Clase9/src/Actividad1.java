import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {

//    Escribe un programa que cumpla con las siguientes condiciones:
//
//   1. Solicita al usuario ingresar una temperatura y una unidad de medida:
//
//                          Celsius (C) o Fahrenheit (F).
//
//   2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
//
//                  De Celsius a Fahrenheit	        De Fahrenheit a Celsius
//                  [°F] = ([°C] × 9 ⁄ 5) + 32	    [°C] = ([°F] − 32) × 5 ⁄ 9
//
//   3. El programa debe manejar al menos las siguientes situaciones:
//
//      Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
//
//      Si ingresa una temperatura no válida, mostrará un mensaje de error.

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            float temperatura = 0;

            try {
                System.out.print("Ingrese la temperatura: ");
                temperatura = scan.nextFloat();
                System.out.print("Ingrese la unidad de medida (C/F): ");
                char unidadDeMedida = scan.next().toUpperCase().charAt(0);
                float nuevaTemperatura = 0;

                switch (unidadDeMedida) {
                    case 'C':
                        nuevaTemperatura = (temperatura * 9 / 5) + 32;
                        System.out.println(
                                temperatura + " grados Celsius equivale a " + nuevaTemperatura + " grados Fahrenheit.");
                        break;
                    case 'F':
                        nuevaTemperatura = (temperatura - 32) * 5 / 9;
                        System.out.println(
                                temperatura + " grados Fahrenheit equivale a " + nuevaTemperatura + " grados Celsius.");
                        break;

                    default:
                        System.out.println("Error: Unidad de medida no válida.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Temperatura no válida. " + e.getMessage());
            }

            scan.close();
        }
    }