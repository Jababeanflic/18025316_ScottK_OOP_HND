package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello you");


        String[] stringArray = {"The", "cat", "sat", "on", "the", "mat"};
        int counter = 0;

        while (counter < stringArray.length) {
            if (stringArray[counter].equals("cat")) {
                System.out.println("The array has a cat.");
                counter = stringArray.length;
            }
            counter = counter + 1;
        }
    }
}

// Some array test code



