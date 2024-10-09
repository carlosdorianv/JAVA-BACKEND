public class Actividad1 {

//    En esta actividad, desarrollarás un programa que solicitará al usuario ingresar
//    una calificación numérica del 1 al 5. Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
//            1: "Muy deficiente"
//            2: "Deficiente"
//            3: "Suficiente"
//            4: "Notable"
//            5: "Sobresaliente"

    public void A1Switch(int numA1){
        switch (numA1) {
            case 1 -> System.out.println("Lunes dia habil");
            case 2 -> System.out.println("Martes dia habil");
            case 3 -> System.out.println("Miercoles dia habil");
            case 4 -> System.out.println("Jueves dia habil");
            case 5 -> System.out.println("Viernes dia habil");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Calificación no válida. Debes ingresar un número del 1 al 5.");
        }
    }
}
