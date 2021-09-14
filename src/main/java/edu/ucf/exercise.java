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

        // record values
        System.out.print("Enter your weight (lbs): ");
        float weight = input.nextFloat();
        System.out.print("Enter your height (in.): ");
        float height = input.nextFloat();

        // calculate BMI
        float bmi = (weight / (height * height)) * 703;

        // output based on bmi
        if (bmi >= 18.5 && bmi <= 25)
            System.out.print("Your BMI is " + String.format("%.1f", bmi) + ".\nYou are within the ideal weight range.");
        else if (bmi > 25)
            System.out.print("Your BMI is " + String.format("%.1f", bmi) + ".\nYou are overweight. You should see your doctor.");
        else if (bmi < 18.5)
            System.out.print("Your BMI is " + String.format("%.1f", bmi) + ".\nYou are underweight. You should see your doctor.");
    }
}
