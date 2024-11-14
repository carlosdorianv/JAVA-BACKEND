public class Rectangulo {

//    Actividad: Trabajando con una figura geométrica

//    Crea una clase llamada Rectangulo
//
//    Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.
//
//    Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y que lleve un registro del
//
//    número total de instancias de 'Rectangulo' creadas.
//
//    Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y
//
//    que incremente en uno el valor de 'contadorRectangulos'.
//
//    Implementa un métdo llamado 'area()' y otro métdo llamado 'perimetro()', responsables de calcular el área y
//
//    el perímetro del rectángulo, respectivamente.
//
//    Implementa un métdo llamado imprimirArea para mostrar el resultado por consola;
//
//    Implementa un métdo llamado imprimirPerimetro para mostrar el resultado por consola;
//
//    Implementa un métdo estático que permita obtener el número total de rectángulos creados hasta el momento.
//
//    Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' y acceder a sus métodos
//
//    para obtener información relevante.

    int ancho;
    int alto;
    static int contador;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        contador ++;
    }
    public Rectangulo() {
    }

    public int area(){
        return ancho * alto;
    }

    public int perimetro(){
        return (ancho + alto)*2;
    }

    public void imprimirArea (){
        System.out.println("El area del rectangulo es: "+area());
    }

    public void imprimirPerimetro(){
        System.out.println("El perimetro es: "+perimetro());
    }

    public void mostrarContador (){
        System.out.println("La cantidad de rectangulos es: "+contador);
    }

}
