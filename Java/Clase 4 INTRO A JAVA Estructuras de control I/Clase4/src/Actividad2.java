public class Actividad2 {

//    En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
//    Si la puntuación está entre 90 y 100, se mostrará "A".
//    Si la puntuación está entre 80 y 89, se mostrará "B".
//    Si la puntuación está entre 70 y 79, se mostrará "C".
//    Si la puntuación está entre 60 y 69, se mostrará "D".
//    Si la puntuación es menor a 60, se mostrará "F".
//    Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
//    El programa mostrará en la consola el valor de la calificación obtenida.
//    Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta.

    public void nota(double numA2){
        if (numA2 < 0 ){
            System.out.println("El numero "+numA2+" Es menor a 0 y no es valido");
        }else if (numA2 > 100){
            System.out.println("El numero "+numA2+" Es mayo a 100 y no es valido");
        }else if (numA2 >= 90){
            System.out.println("Felicidades tienes una A");
        }
        else if (numA2 >= 80 && numA2 <=89){
            System.out.println("Felicidades tienes una B");
        }
        else if (numA2 >= 70 && numA2 <=79){
            System.out.println("Felicidades tienes una C");
        }
        else if (numA2 >= 60 && numA2 <=69){
            System.out.println("Felicidades tienes una D");
        }else if (numA2 < 60 ){
            System.out.println("Felicidades tienes una F :(");
        }
    }
}
