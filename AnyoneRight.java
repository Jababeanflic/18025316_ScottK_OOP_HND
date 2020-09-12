public class AnyoneRight {


    public static void WhosRight(int p1, int p2, int p3, int AI){
        Boolean p1Correct = false;
        Boolean p2Correct = false;     // variables created for true or false answer
        Boolean p3Correct = false;

        if (p1 == AI){
            p1Correct = true;
        }
        if (p2 == AI){
            p2Correct = true;
        }
        if (p3 == AI){
            p3Correct = true;
        }
        if (p1Correct || p2Correct || p3Correct){
            System.out.println("WINNER");
            System.out.println("Player 1 got it right? " +p1Correct);
            System.out.println("Player 2 got it right? " +p2Correct);
            System.out.println("Player 3 got it right? " +p3Correct);
            System.out.println("Game Over");
            System.exit(0);
        } else {
            System.out.println("Lets try again");
        }


    }
}
