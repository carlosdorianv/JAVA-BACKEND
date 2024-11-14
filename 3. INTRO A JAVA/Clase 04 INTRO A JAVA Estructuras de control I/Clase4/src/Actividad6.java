public class Actividad6 {

//    Determinación de Edades
//    En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se
//    encuentra. Las categorías son las siguientes:
//    Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
//    Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
//    Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
//    El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.

    public void rangoEdad (int edad){
        if(edad < 0){
            System.out.println("coloca numero correcto");
        } else if ((edad >= 0) && (edad < 18)){
            System.out.println("Eres menor de edad");
        } else if (edad <= 64 ) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    }
}