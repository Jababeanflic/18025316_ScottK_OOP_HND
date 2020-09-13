import java.util.Scanner;

public class Tutorial_1_Additional {

    static Scanner kboard = new Scanner(System.in);

    public static void statistic(int gamesWon, int gamesPlayed) {

        System.out.println("Games played: "+gamesPlayed);
        System.out.println("Games won: "+gamesWon);
        int winPercent = gamesWon*100/gamesPlayed;
        System.out.println("Percentage of games won: " +winPercent+ "%");
    }

    public static void totalCards(int[][] cardsDrawn) {

        System.out.println("Frequency of each card drawn");

        for (int i = 1; i < cardsDrawn.length; i++) {
            System.out.println("Number of time card number " + i + " was drawn: " + cardsDrawn[i][0]);
        }
        System.out.println();
    }

    public static int getRandomNumber() {
        return ((int) (Math.random() * 10) + 1);
    }

    public static int getRandomNumberDealer() {
        return ((int) (Math.random() * (6) + 16));
    }

    public static int[][] cardsDrawn(int[] cardsDrawn, int[][] totalCardsDrawn) // Method to store which cards were drawn
    {
        System.out.print("Cards drawn: ");
        for (int x = 0; x < 10; x++) {
            if (cardsDrawn[x] != 0)
                if (x == 0)
                    System.out.print(cardsDrawn[x]);
                else {
                    System.out.print("," + cardsDrawn[x]);
                }
            totalCardsDrawn[cardsDrawn[x]][0] = totalCardsDrawn[cardsDrawn[x]][0] + 1; // add new card to total cards drawn count
        }

        System.out.println();
        return (totalCardsDrawn);
    }

    public static void main(String[] args) {

        int[][] totalCardsDrawn = new int[11][1]; // needs to be 11 as cards go to 10
        String choice;
        boolean PlayGame;
        int card1;
        int card2;
        int newCard;
        int total;
        int dealer;
        int cardCount = 2;
        int gamesPlayed = 1; //To record number of games played
        int gamesWon = 0;
        int[][] totalCards = new int[0][];


        do {  // Player can choose to play again
            PlayGame = false; // stops infinite loop
            int[] cardsDrawn = new int[10]; // moved inside loop to reset the array
            card1 = getRandomNumber();
            cardsDrawn[0] = card1;
            card2 = getRandomNumber();
            cardsDrawn[1] = card2;
            dealer = getRandomNumberDealer();
            total = card1 + card2;
            System.out.println("You have drawn " + card1 + " and " + card2);
            System.out.println("Your total is " + total);
            System.out.println("Do you want to draw another card y/n?");
            choice = kboard.next();

            while (choice.equalsIgnoreCase("y")) {
                newCard = getRandomNumber();
                cardsDrawn[cardCount++] = newCard;
                System.out.print("You have drawn a " + newCard);
                total += newCard;
                System.out.println("\nYour total is " + total);
                if (total > 21) {
                    System.out.println("Your bust!");
                    totalCards = cardsDrawn(cardsDrawn, totalCardsDrawn);
                    break; // Ends the game and program
                }
                System.out.println("Do you want to draw another card y/n?");
                choice = kboard.next();
            }
            if (choice.equalsIgnoreCase("n")) {
                if (total > dealer) {
                    System.out.println("You have won with a total of " + total + " Dealer has " + dealer);
                    gamesWon++; // track games one
                } else {
                    System.out.println("You have lost with a total of " + total + " Dealer has " + dealer);
                }
                totalCards = cardsDrawn(cardsDrawn, totalCardsDrawn);
            }
            if (gamesPlayed < 5) {
                System.out.println("Number of games played " + gamesPlayed + ", do you want to play again y/n?");
                choice = kboard.next();
                if (choice.equalsIgnoreCase("y")) { // loop to play another game and record games played
                    gamesPlayed++;
                    PlayGame = true; // set to true to remain in do/while loop
                }
            } else {
                System.out.println("You have played " + gamesPlayed + " games thats the max, Bye!");
                break;
            }
        } while (PlayGame);

        statistic(gamesWon, gamesPlayed); // call method statistics to calculate win percent pass gamesWon and games played total
        totalCards(totalCards); //call method total number of cards drawn for all games and pass array of cards already drawn
    }
}


