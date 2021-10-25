import javax.swing.*;

public class UssingLoops3 {
    public static void main(String[] args) {
        String gender = "";
        do {
            gender = JOptionPane.showInputDialog("introduce tu genero (h/m)");

        } while (!gender.equalsIgnoreCase("h") && !gender.equalsIgnoreCase("m"));

        int height = Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm"));
        int idealWeight = 0;


        if (gender.equals("H")) {
            idealWeight = height - 110;
            System.out.println("tu peso ideal es " + idealWeight);
        } else if(gender.equals("M")){
            idealWeight = height - 120;
            System.out.println("tu peso ideal es " + idealWeight);

        }
    }
}
