public class GuessingGame {
    NumberToGuess p1;
    NumberToGuess p2;  // Player variables declared
    NumberToGuess p3;
    NumberToGuess AI;


    public void startGame() {
        p1 = new NumberToGuess();
        p2 = new NumberToGuess();     // player objects created
        p3 = new NumberToGuess();
        AI = new NumberToGuess();

        int NumberToGuess;
        int p1Guess;
        int p2Guess;    // Variables Created to hold guesses
        int p3Guess;

        while (true) {

            System.out.println("Guess what number I'm thinking of between 1 and 10?");

            p1.guess("Player 1");
            p2.guess("Player 2"); // Calls Player Guess method and passes player name
            p3.guess("Player 3");
            AI.NumberGuess();           // Calls AI Guess method

            p1Guess = p1.g;
            p2Guess = p2.g;
            p3Guess = p3.g;
            NumberToGuess = AI.Number;

            AnyoneRight.WhosRight(p1Guess, p2Guess, p3Guess, NumberToGuess);
        }
    }
}






