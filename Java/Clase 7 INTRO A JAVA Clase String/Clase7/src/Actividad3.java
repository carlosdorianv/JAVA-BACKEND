import java.util.Scanner;

public class Actividad3 {

//    Escribe un programa que solicite al usuario ingresar una frase y dos números enteros,
//    que representen un índice inicial y un índice final. Utiliza el
//    métdo substring() de la clase String para extraer la subcadena que se encuentra entre los índices
//    ingresados por el usuario, y muestra la subcadena resultante en pantalla.

    public String ingresarFrase() {
        String frase = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa una frase: ");
            frase = scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Ocurrió un error al ingresar la frase: " + e.getMessage());
            System.exit(1);
        }
        return frase;
    }

    public int ingresarIndiceI() {
        int indicei = 0;
        try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa el índice inicial: ");
                indicei = scanner.nextInt();

            }catch (Exception e){
                System.out.println("Hay problemas con el indice inicial" + e.getMessage());
                System.exit(1);
            }
        return indicei;
    }

    public int ingresarIndiceF(){
        int indiceF = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa el índice final: ");
            indiceF = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Hay problemas con el indice final" + e.getMessage());
            System.exit(1);
        }
        return indiceF;
    }

    public String extraerSubcadena(String frase, int indiceI, int indiceF) {
        String subCadena = null;
        try {
            subCadena = frase.substring(indiceI, indiceF);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Los índices están fuera de los límites de la frase." + e.getMessage());
            System.exit(1);
        } catch (NullPointerException e) {
            System.out.println("La frase no puede ser nula." + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al extraer la subcadena: " + e.getMessage());
            System.exit(1);
        }
        return subCadena;
    }

    public void mostrarSubcadena(String subCadena) {
        try {
            System.out.println("La subcadena resultante es: " + subCadena);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al mostrar la subcadena: " + e.getMessage());
            System.exit(1);
        }
    }
}
