import static java.lang.System.*;

public class OperatorsDeclarations {
    public static void main (String[] args){
        final double inches = 2.54;

        double cm =6;

        double result =cm/inches;


        out.println("en " + cm + " cm hay " + result + " pulgadas");
        out.printf("%1.2f",result);
    }
}
