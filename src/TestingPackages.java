import java.util.*;


public class TestingPackages {
    public static void main(String[] args){

        Scanner entry = new Scanner(System.in);

        System.out.println("introduce tu nombre");

        String name =entry.nextLine();

        System.out.println("introduce tu edad");

        int age = entry.nextInt();

        System.out.println("Hola " + name + " el año que viene tendras "+(age+1) + " años");
    }
}
