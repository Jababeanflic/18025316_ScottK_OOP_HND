import java.util.Arrays;
import java.util.Scanner;

public class Tutorial_1c {
    static Scanner kboard = new Scanner(System.in);

    public static int getRandomNumber() {
        int RandomNumber = (int) (Math.random() * 10) + 1;              // Method to generate random number
        return (RandomNumber);
    }

    public static int getRandomNumberDealer() {
        int RandomNumberDealer = (int) (Math.random() * (6) + 16); // Method to generate number for dealer between 16-21
        return (RandomNumberDealer);
    }

    public static void cardsDrawn(int cardsDrawn[])                // Method to store which cards were drawn
    {
        System.out.print("Cards drawn: ");
        for (int x = 0; x < 5; x++) {
            if (cardsDrawn[x] != 0)
                System.out.print(cardsDrawn[x] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String choice = "";
        int card1;
        int card2;
        int newCard;
        int total;
        int dealer;
        int cardsDrawn[] = new int[5];
        int cardCount = 2;

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
                cardsDrawn(cardsDrawn);
                System.exit(0); // Ends the game and program
            }
            System.out.println("Do you want to draw another card y/n?");
            choice = kboard.next();
        }
        if (choice.equalsIgnoreCase("n")) {
            if (total > dealer) {
                System.out.println("You have won with a total of " + total + " Dealer has " + dealer);
                cardsDrawn(cardsDrawn);
            } else {
                System.out.println("You have lost with a total of " + total + " Dealer has " + dealer);
                cardsDrawn(cardsDrawn);
            }
        }
    }
}
