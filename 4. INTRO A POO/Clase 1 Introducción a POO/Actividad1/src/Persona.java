public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }
    public void imprimirDatos() {
        System.out.println("El nombre es "+ nombre + " La edad es: " + edad);
    }

}
