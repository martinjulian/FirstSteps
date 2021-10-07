import javax.swing.*;
public class DataInput {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("introduce tu nombre");
        int age = Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad"));

        System.out.println("su nombre es "+name+" y el año que viene tendras "+(age+1)+" años");
    }
}
