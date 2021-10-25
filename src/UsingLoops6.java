import javax.swing.*;

public class UsingLoops6 {
    public static void main (String[]args){
        long result = 1L;

        int number =Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        for (int i = number;i > 0; i--){
            result=result * i;

        }
        System.out.println("el facotrial de "+ number +" es "+result);
    }
}
