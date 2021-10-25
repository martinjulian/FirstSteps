import java.util.Scanner;

public class UsingLoops2 {
    public static void main(String[] args) {
        Scanner attempts = new Scanner(System.in);
        double randomNumber = (int) (Math.random() * 10);
        int key1;
        int attemps = 0;
        do {
            attemps++;
            System.out.println("ingrese un numero entre 0 y 10");
            key1 = attempts.nextInt();
            if (randomNumber > key1) {
                System.out.println("mas alto, ingrese otro numero");
            } else if (randomNumber < key1) {
                System.out.println("mas bajo, ingrese otro numero");
            }

        }while (randomNumber != key1);
        System.out.println("ganaste, te ha tomado " + attemps + " intentos!");
    }
}
