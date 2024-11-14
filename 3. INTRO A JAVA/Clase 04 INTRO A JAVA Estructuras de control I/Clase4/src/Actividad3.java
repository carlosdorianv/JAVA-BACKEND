public class Actividad3 {

//    En esta actividad, escribirás un programa que solicite al usuario un
//    número y determine si es divisible por 5, por 3, por ambos o por ninguno.
//    El resultado se mostrará en pantalla.

    public void divisible(double numA3){
        if ((numA3 % 3 == 0) && (numA3 % 5 == 0)){
            System.out.println("El numero "+numA3+" Es divisible por 5 y por 3");
        }else if (numA3 % 5 == 0) {
            System.out.println("El numero "+numA3+" Es divisible por 5");
        } else if (numA3 % 3 == 0) {
            System.out.println("El numero "+numA3+" Es divisible por 3 ");
        } else  {
            System.out.println("El numero no es ni divisible por 5 ni por 3");
        }

    }
}
