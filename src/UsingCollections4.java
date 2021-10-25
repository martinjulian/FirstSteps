public class UsingCollections4 {
    public static void main(String[] args){
        int[][] bidimencionalArray = new int[4][5];
/*        bidimencionalArray[0][0] = 15;
        bidimencionalArray[0][1] = 12;
        bidimencionalArray[0][2] = 45;
        bidimencionalArray[0][3] = 1;
        bidimencionalArray[0][4] = 32;

        bidimencionalArray[1][0] = 5;
        bidimencionalArray[1][1] = 2;
        bidimencionalArray[1][2] = 4;
        bidimencionalArray[1][3] = 14;
        bidimencionalArray[1][4] = 62;

        bidimencionalArray[2][0] = 54;
        bidimencionalArray[2][1] = 32;
        bidimencionalArray[2][2] = 57;
        bidimencionalArray[2][3] = 54;
        bidimencionalArray[2][4] = 45;

        bidimencionalArray[3][0] = 41;
        bidimencionalArray[3][1] = 25;
        bidimencionalArray[3][2] = 2;
        bidimencionalArray[3][3] = 57;
        bidimencionalArray[3][4] = 11;*/
        int [][] matrix ={
                {10,15,12,16,34},
                {21,31,45,16,35},
                {75,95,64,15,32},
                {31,15,48,95,61},
        };
/*
        for(int i = 0; i < 4; i++){
            System.out.println();
            for (int j = 0; j < 5; j++){
                System.out.print(matrix[i][j] + " ");

            }

        }*/
    for (int[] fila:matrix){
        System.out.println();
        for (int z:fila){
            System.out.print(z + " ");
        }
    }
    }
}
