import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[][] myNumbers = new int[10][2];
        myNumbers[5][1] = 7;

        System.out.println(Arrays.deepToString(myNumbers));

        int[] test = new int[10];
        System.out.println(Arrays.toString(test));
    }

    public static void totalCards(int cardsDrawn[]){

        int[][] myNumbers = new int [11][1]; // needs to be 11 as cards go to 10

        // System.out.println(Arrays.deepToString(myNumbers));
        for (int i = 1; i < myNumbers.length; i++){
            System.out.println("Number of time card number "+i+" was drawn: "+myNumbers[i][0]);
        }
        System.out.println();
    }
}








