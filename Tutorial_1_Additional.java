import java.util.Scanner;

public class Tutorial_1_Additional {

    static Scanner kboard = new Scanner(System.in); // Scanner used in multiple methods

    public static void statistic(int gamesWon, int gamesPlayed) { // Method to calculate win percent

        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Games won: " + gamesWon);
        int winPercent = gamesWon * 100 / gamesPlayed;
        System.out.println("Percentage of games won: " + winPercent + "%");
    }// end method

    public static void totalCards(int[][] cardsDrawn) { // Method to print out each card and the number of times it was drawn

        System.out.println("Frequency of each card drawn");

        for (int i = 1; i < cardsDrawn.length; i++) {// loops number of times equal to length of cards drawn array so 10
            System.out.println("Number of time card number " + i + " was drawn: " + cardsDrawn[i][0]);
        }
        System.out.println();
    }// end method

    public static int getRandomNumber() { // Method generates random number from 1-10
        return ((int) (Math.random() * 10) + 1);
    }// end method

    public static int getRandomNumberDealer() {// Method generates random number for dealer from 16-21 (modify to draw Cards)
        return ((int) (Math.random() * (6) + 16));
    }// end method

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
            totalCardsDrawn[cardsDrawn[x]][0] = totalCardsDrawn[cardsDrawn[x]][0] + 1;
        } // add new card to total cards drawn count so x=the card that was drawn and +1 is added to the "sub array"

        System.out.println();
        return (totalCardsDrawn); // Returns the total card drawn array within array, first index is card number second
    } // end method               // index is the number of time that card was drawn

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
                }// end if
                System.out.println("Do you want to draw another card y/n?");
                choice = kboard.next();
            } // end while
            if (choice.equalsIgnoreCase("n")) {
                if (total > dealer) {
                    System.out.println("You have won with a total of " + total + " Dealer has " + dealer);
                    gamesWon++; // track games one
                } else {
                    System.out.println("You have lost with a total of " + total + " Dealer has " + dealer);
                }
                totalCards = cardsDrawn(cardsDrawn, totalCardsDrawn);
            }// end if
            if (gamesPlayed < 5) {
                System.out.println("Number of games played " + gamesPlayed + ", do you want to play again y/n?");
                choice = kboard.next();
                if (choice.equalsIgnoreCase("y")) { // loop to play another game and record games played
                    gamesPlayed++;
                    PlayGame = true; // set to true to remain in do/while loop
                }// end if
            } else {
                System.out.println("You have played " + gamesPlayed + " games thats the max, Bye!");
                break;
            }// end if/else
        } while (PlayGame);// Game will loop if boolean PlayGame is true

        statistic(gamesWon, gamesPlayed);//call method statistics to calculate win percent pass gamesWon and games played total
        totalCards(totalCards);//call method total number of cards drawn for all games and pass array of cards already drawn
    }// end main method
}// end class


