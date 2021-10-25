import javax.swing.*;

public class UsingCollections2 {
    public static void main (String[] args){
        String[] countrysgarray = new String[8];
        for (int i = 0; i < 8; i++ )  {
            countrysgarray[i] = JOptionPane.showInputDialog("ingrese un pais");
        }


        /*countrysgarray[0] = "España";
        countrysgarray[1] = "Inglaterra";
        countrysgarray[2] = "Rumania";
        countrysgarray[3] = "Rusia";
        countrysgarray[4] = "Argentina";
        countrysgarray[5] = "Dinamarca";
        countrysgarray[6] = "Venezuela";
        countrysgarray[7] = "peru";*/

        int x = 0 ;

        /*for (int i = 0; i < countrysgarray.length; i++){
            System.out.println("pais " + (i + 1) + " " +countrysgarray[i]);*/
        for(String i:countrysgarray){
            x++;
            System.out.println("pais " + x + " " + i);

        }
    }
}
