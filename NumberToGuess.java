public class NumberToGuess {

    int Number = 0; // variable for guess

    public void NumberGuess(){
        Number = (int)(Math.random()*10) +1;
        System.out.println("I'm thinking of number " +Number);
    }
}
