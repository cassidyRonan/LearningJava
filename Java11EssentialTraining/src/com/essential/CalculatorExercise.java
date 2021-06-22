package com.essential;

import java.util.Scanner;

public class CalculatorExercise {

    public static void main(String[] args) {
        //Challenge, take in two numeric values, first value is divided by second and print out value
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        double value1 = userInput.nextDouble();

        System.out.print("Enter a numeric value: ");
        double value2 = userInput.nextDouble();

        double ans = value1 / value2;

        System.out.println("Answer: " + ans);


    }
}
