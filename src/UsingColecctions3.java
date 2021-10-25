public class UsingColecctions3 {
    public static void main (String[] args){
        int[] randomNumbers = new int[25];
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i]=(int)Math.round(Math.random() * 10);
        }
        for (int numbers : randomNumbers) {
            System.out.print(numbers+ ", ");
        }
    }
}
