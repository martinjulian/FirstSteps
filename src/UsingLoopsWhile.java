import javax.swing.*;


public class UsingLoopsWhile {
    public static void main (String[] args){

        final String password = "hola";
        String key1="";

        while(!password.equals(key1)){
            key1 = JOptionPane.showInputDialog("ingrese la contraseña");
            if (!password.equals(key1)){
                System.out.println("contraseña incorrecta");
            }
        }
    System.out.println("acceso permitido");
    }
}
