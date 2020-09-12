public class Player {

    int g = 0; // variable for guess

    public void guess(String Player){
        g = (int)(Math.random()*10) +1;
        System.out.println(Player+ " has guessed " +g);
    }
}

