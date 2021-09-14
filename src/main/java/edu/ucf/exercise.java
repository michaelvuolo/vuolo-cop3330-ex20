/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // init tax variable
        double tax = 0.0;

        // record values
        System.out.print("What is the order amount? ");
        int order_amount = input.nextInt();
        System.out.print("What state do you live in? ");
        String state = input.next();

        if (state.equals("Wisconsin")) {
            // ask for county
            System.out.print("What county do you live in? ");
            String county = input.next();

            // calculate tax based on county
            if (county.equals("Eau Claire"))
                tax = (order_amount * 0.055);
            else if (county.equals("Dunn"))
                tax = (order_amount * 0.054);
            else
                tax = (order_amount * 0.05);
        }
        else if (state.equals("Illinois"))
            tax = (order_amount * 0.08);

        // output multistate sales tax
        System.out.print("The tax is $" + String.format("%.2f", tax) + "\nThe total is $" + String.format("%.2f", (order_amount + tax)) + ".");
    }
}
