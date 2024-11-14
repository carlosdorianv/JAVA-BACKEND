public class Actividad4 {

//    En este ejercicio, escribirás un programa que pida al usuario una contraseña y
//    verificará si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta,
//    se mostrará un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado".

    public void validPass(String str1){
        String pass = "Carlos";
        if (str1.equals(pass)){
            System.out.println("Welcome");
        }else{
            System.out.println("Incorrect Password");
        }
    }

}
