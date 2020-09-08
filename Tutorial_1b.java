package com.company;

import java.util.Scanner;

public class Tutorial_1b {
    static Scanner kboard = new Scanner(System.in);

    public static int getRandomNumber(){
        int RandomNumber = (int)(Math.random()*10) +1;
        return (RandomNumber);
    }

    public static int getRandomNumberDealer(){
        int RandomNumberDealer = (int) (Math.random() * (6) + 16);
        return (RandomNumberDealer);
    }

    public static void main(String[] args) {

        String choice = "";
        int card1;
        int card2;
        int newCard;
        int total;
        int dealer;

        card1 = getRandomNumber();
        card2 = getRandomNumber();
        dealer = getRandomNumberDealer();
        total = card1+card2;
        System.out.println("You have drawn " +card1+ " and " + card2);
        System.out.println("Your total is " + total);
        System.out.println("Do you want to draw another card y/n?");
        choice = kboard.next();

        while (choice.equalsIgnoreCase("y")) {
            newCard = getRandomNumber();
            System.out.print("You have drawn a " + newCard);
            total += newCard;
            System.out.println("\nYour total is " + total);
            System.out.println("Do you want to draw another card y/n?");
            choice = kboard.next();
        }
        if(total>dealer){
            System.out.println("You have won with a total of " +total+ " Dealer has " +dealer);
        }
        else {
            System.out.println("You have lost with a total of " +total+ " Dealer has " +dealer);
        }
    }
}

