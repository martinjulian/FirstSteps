import javax.swing.*;

public class UsingLoops5 {
    public static void main(String[] args){
        boolean dot = false;
        String mail = JOptionPane.showInputDialog("ingrese su mail");
        int attemps = 0;
        for (int i = 0; i<mail.length(); i++){

            if (mail.charAt(i) == '@'){
            attemps++;

            }
            if(mail.charAt(i) == '.'){
                dot = true;
            }
        }
        if (attemps == 1 && dot == true) {
            System.out.println("es correcto");

        }else {
            System.out.println("no es correcto");
        }
    }
}
