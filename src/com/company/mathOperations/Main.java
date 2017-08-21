package com.company.mathOperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

// requesting user input
        System.out.println("Enter first number: ");
        double operand1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter second number: ");
        double operand2 = Double.parseDouble(scanner.nextLine());
// do the math for the numbers selected
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double divide = operand1 / operand2;
        double multiply = operand1 * operand2;
        double remainder = operand1 % operand2;
        System.out.println("You input: " + operand1 + " and " + operand2);
//pass variables to show results
        showResults(sum, difference, divide, multiply, remainder);
    }

    public static void showResults(double sum, double difference, double divide, double multiply, double remainder) {
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The quotient is: " + divide);
        System.out.println("The product is: " + multiply);
        System.out.println("The modulus is: " + remainder);

    }
}