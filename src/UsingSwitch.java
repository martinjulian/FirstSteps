import javax.swing.*;
import java.util.Scanner;

public class UsingSwitch {
    public static void main(String[] args){
        Scanner entry= new Scanner(System.in);
        System.out.println("elige una opcion \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
        int figure =entry.nextInt();
        switch (figure){
            case 1:
                int  side = Integer.parseInt(JOptionPane.showInputDialog("ingrese medida del lado"));
                System.out.println("el area del cuadrado es "+ Math.pow(side,2));
                break;

            case 2:
                int  base = Integer.parseInt(JOptionPane.showInputDialog("ingrese medida de la base"));
                int  height = Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura"));
                System.out.println("el area del rectangulo es "+ +(base*height));
            break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("ingrese medida de la base"));
                height = Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura"));
                System.out.println("el area del triangulo es "+ +(base*height)/2);
            break;

            case 4:
            int radio = Integer.parseInt(JOptionPane.showInputDialog("ingrese medida del radio"));
                System.out.print("el area del circulo es " );
                System.out.printf("1%.2f",Math.PI*Math.pow(radio,2));
            break;

            default:
                System.out.println("la opcion no es correcta" );
        }
    }
}
