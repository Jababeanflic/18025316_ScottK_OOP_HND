public class NumberToGuess {

    int Number = 0; // variable for guess
    int g =0;

    public void NumberGuess(){
        Number = (int)(Math.random()*10) +1;
        System.out.println("I'm thinking of number " +Number);  // Method to make random number to guess
    }

    public void guess(String Player){
        g = (int)(Math.random()*10) +1;
        System.out.println(Player+ " has guessed " +g);        // Method to make random number that player guess
    }
}

