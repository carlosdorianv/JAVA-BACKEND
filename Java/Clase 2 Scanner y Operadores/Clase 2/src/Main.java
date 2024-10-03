import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Actividad 1
            Actividad1 actividad1 = new Actividad1();
            actividad1.pedirDatos();
            actividad1.mostrarDatos();
            //Actividad 2
            Actividad2 actividad2 = new Actividad2();
            actividad2.operacionesPredeterminadas();
            actividad2.sumarNumerosUsuario();
            //Actividad 3
            Scanner scanner = new Scanner(System.in);
            System.out.print("Por favor, ingresa el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Por favor, ingresa el segundo número: ");
            int num2 = scanner.nextInt();
            Actividad3 actividad3 = new Actividad3();
            actividad3.compararNumeros(num1, num2);
            System.out.print("Por favor, ingresa el tercer número: ");
            int num3 = scanner.nextInt();
            System.out.print("Por favor, ingresa el cuarto número: ");
            int num4 = scanner.nextInt();
            actividad3.validarNumeros(num1,num2,num3,num4);

        }
    }






