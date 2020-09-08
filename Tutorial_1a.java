package com.company;

import java.util.Scanner;

public class Tutorial_1a {

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        String choice = "";
        int card1;
        int card2;
        int newCard;
        int total;

        card1 = (int)(Math.random()*10) +1;
        card2 = (int)(Math.random()*10) +1;
        total = card1+card2;
        System.out.println("You have drawn " +card1+ " and " + card2);
        System.out.println("Do you want to draw another card y/n?");
        choice = kboard.next();

        while (choice.equalsIgnoreCase("y")) {
            newCard = (int) (Math.random() * 10) + 1;
            System.out.print("You have drawn a " + newCard);
            total += newCard;
            System.out.println("\nYour total is " + total);
            System.out.println("Do you want to draw another card y/n?");
            choice = kboard.next();
        }
        if(total>19 && total<=21){
            System.out.println("You have won with a total of " +total);
        }
        else {
            System.out.println(("You have lost with a total of " +total));
        }
    }
}
