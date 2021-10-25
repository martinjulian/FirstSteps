package poo;

import java.util.Objects;

public class Car {
    private int wheels;
    private int length;
    private int width;
    private int platformWeigth;
    private int motor;
    private String color;
    private int totalWeigth;
    private boolean leatherSeats;
    private boolean airConditioner;

    public Car() { //metodo constructor estado inicial del objeto
        wheels = 4;
        length = 2000;
        width = 100;
        platformWeigth = 500;
        motor = 1600;


    }

    public String tellMeGeneralData() { //getter nos devuelve el valor de una propiedad
        return "la plataforma del vehiculo tiene " + wheels + " ruedas" +
                ". Mide " + length / 1000 + " metros con un ancho de " + width + " cm"
                + " y un peso de plataforma de " + platformWeigth + " kg";
    }

    public void setColor(String carColor) { //setter modifica el valor de una propiedad
        color = carColor;
    }

    public String tellMeColor() { //getter devuelve
        return "el color del coche es " + color;

    }

    public void setLeatherSeats(String leatherSeats) {//setter modifica
        if (leatherSeats.equalsIgnoreCase( "si")) {

            this.leatherSeats = true;
        } else {
            this.leatherSeats = false;
        }

    }

    public String tellMeSeats() { //getter  nos devuelve un valor
        if (leatherSeats == true) {
            return "el coche tiene asientos de cuero";
        } else {
            return "el coche tiene asientos de serie";
        }

    }

    public void setAirConditioner(String airConditioner) { //setter modifica
        if (airConditioner.equalsIgnoreCase("si")) {
            this.airConditioner = true;
        } else {
            this.airConditioner = false;

        }
    }

    public String tellMeAirConditioner() { //getter devuelve
        if (airConditioner == true) {
            return "el coche tiene aire acondicionado";
        } else {
            return "el coche no tiene aire acondicionado";
        }
    }

    public String tellMeTotalWeigth() { //metodo setter + getter a la vez(poco recomendable)
        int bodyWeight = 500;
        totalWeigth = platformWeigth + bodyWeight;

        if (leatherSeats == true) {
            totalWeigth = totalWeigth + 50;
        }
        if (airConditioner == true) {
            totalWeigth = totalWeigth + 20;
        }
        return "el peso del coche es " + totalWeigth + " kg";


    }

    public int price() { //getter devuelve
        int finalPrice = 10000;

        if (leatherSeats == true) {
            finalPrice += 2000;
        }
        if (airConditioner == true){
            finalPrice+=1500;

        }
        return finalPrice;
    }

}



