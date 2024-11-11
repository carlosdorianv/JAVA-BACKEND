public class Auto {

    String marca;
    String modelo;
    int year;

    public Auto(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Auto(String marca) {
        this.marca = marca;
    }
    public Auto() {
    }

    public void mostrar() {
        System.out.println("Marca: " + marca + "Modelo: " + modelo + "Year: " + year);
    }
}
