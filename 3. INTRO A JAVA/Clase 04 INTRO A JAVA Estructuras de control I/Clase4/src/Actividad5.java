public class Actividad5 {

//    En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto
//    y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, se aplicará
//    un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio
//    original sin descuento.

    public void desc(double pre){
        double tot;
       if (pre >= 100){
           tot = pre - (pre*0.1);
           //pre *= 0.9;
           System.out.println("El precio final es "+tot+" Se quitaron "+pre*0.1+" de descuento");
       }else{
           System.out.println("No se le aplicara descuento");
       }
    }
}
