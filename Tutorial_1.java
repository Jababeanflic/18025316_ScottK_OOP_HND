package com.company;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Tutorial_1 {

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int dealer=18;
        int value=0;
        int total=0;
        String choice ="";
        for (int x=0;x<2;x++){
            value = (int)(Math.random()*10) +1;
            System.out.print(value+" ");
            total += value;
        }
        System.out.println("\nYour total is " +total);
        System.out.println("Do you want to draw another card y/n?");
        choice = kboard.next();

        while (choice.equalsIgnoreCase("y")) {
            value = (int) (Math.random() * 10) + 1;
            System.out.print(value + " ");
            total += value;
            System.out.println("\nYour total is " + total);
            if (total > 21) {
                System.out.println("Your bust!");
                System.exit(0);
            }
            System.out.println("Do you want to draw another card y/n?");
            choice = kboard.next();
        }
            if (choice.equalsIgnoreCase("n")){
                if (total>dealer){
                    System.out.println("You win! dealer has " +dealer+ " You have " +total);
                } else {
                    System.out.println("You loose! dealer has " + dealer + " You have " + total);
                }
        }
    }
}
