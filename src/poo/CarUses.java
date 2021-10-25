package poo;

import javax.swing.*;

public class CarUses {
    public static void main(String[] args){
        Car renault = new Car(); //instanciar una clase. ejemplar de clase
        renault.setColor(JOptionPane.showInputDialog("introduce un color para el auto"));
        renault.setLeatherSeats(JOptionPane.showInputDialog("¿el auto lleva asientos de cuero?"));
        renault.setAirConditioner(JOptionPane.showInputDialog("¿el auto lleva aire acondicionado?"));

        System.out.println(renault.tellMeColor());
        System.out.println(renault.tellMeGeneralData());
        System.out.println(renault.tellMeSeats());
        System.out.println(renault.tellMeAirConditioner());
        System.out.println(renault.tellMeTotalWeigth());
        System.out.println("el precio del auto es "+ renault.price());



    }

}
