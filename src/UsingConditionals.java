import java.util.Scanner;

public class UsingConditionals {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("ingrese su edad");
        int edad = entry.nextInt();

        if (edad < 18) {
            System.out.println("usted es menor de edad");
        } else if (edad < 40) {
            System.out.println("usted es un joven adulto");

        } else if (edad < 65) {
            System.out.println("usted es un anciano");
        }else{
            System.out.println("cuidate");
        }
    }
}


