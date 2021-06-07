/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex05;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        String numOne = myApp.stringOne();
        String numTwo = myApp.stringTwo();

        // Convert to numbers
        int newNumOne = Integer.parseInt(numOne);
        int newNumTwo = Integer.parseInt(numTwo);

        // Calculations
        int add = myApp.addition(newNumOne, newNumTwo);
        int subtract = myApp.subtraction(newNumOne, newNumTwo);
        int multiply = myApp.multiplication(newNumOne, newNumTwo);
        int divide = myApp.division(newNumOne, newNumTwo);

        // Output
        String generateOutput = myApp.concatenation(numOne, numTwo, add, subtract, multiply, divide);
        myApp.output(generateOutput);
    }

    public String stringOne() {
        System.out.print("What is your first number? ");

        return in.nextLine();
    }

    public String stringTwo() {
        System.out.print("What is your second number? ");
        return in.nextLine();
    }

    public int addition(int newNumOne, int newNumTwo) {
        return newNumOne + newNumTwo;
    }

    public int subtraction(int newNumOne, int newNumTwo) {
        return newNumOne - newNumTwo;
    }

    public int multiplication(int newNumOne, int newNumTwo) {
        return newNumOne * newNumTwo;
    }

    public int division(int newNumOne, int newNumTwo) {
        return newNumOne / newNumTwo;
    }

    public String concatenation(String newNumOne, String newNumTwo, int add, int subtract, int multiply, int divide) {
        return String.format("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d", newNumOne, newNumTwo, add,
                newNumOne, newNumTwo, subtract, newNumOne, newNumTwo, multiply, newNumOne, newNumTwo, divide );
    }

    public void output(String outputGenerator) {
        System.out.print(outputGenerator);
    }
}
