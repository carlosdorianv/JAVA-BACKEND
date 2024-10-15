public class Avion {

    double peso;
    int cantCombustible;
    double alturaDeVuelo;
    String identificador, nombre;

    public Avion(String nombre, double peso, int cantCombustible, double alturaDeVuelo, String identificador) {

        this.nombre = nombre;
        this.peso = peso;
        this.cantCombustible = cantCombustible;
        this.alturaDeVuelo = alturaDeVuelo;
        this.identificador = identificador;

        System.out.println("El nombre del avion es: "+ nombre + "\n" + "Su numero de identificacion es: "
                 +identificador +"\n" + "El avion pesa: " + peso  + "\n" + "El avion tiene : " + cantCombustible +
                "\n" + "El avion vuela hasta: " + alturaDeVuelo);
    }
}
