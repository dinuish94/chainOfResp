package com.company;

import java.util.Scanner;

public class Main {

    private Notes c1;

    public Main() {
        // initialize the chain
        this.c1 = new TwoThousand();
        Notes c2 = new Thousand();
        Notes c3 = new FiveHundred();

        // set the chain of responsibility
        c1.setNextNote(c2);
        c2.setNextNote(c3);
    }2

    public static void main(String[] args) {
        Main atmDispenser = new Main();
        while (true){
            int amount = 0;
            System.out.println("Enter amount to dispense: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
//            if (amount % 10 != 0) {
//                System.out.println("Amount should be in multiple of 10s.");
//                return;
//            }
            // process the request
            atmDispenser.c1.HowMany(amount);
        }
    }
}
