/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */


package ex05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_includes_strings_and_calculations() {
        App myApp = new App();

        String stringOne = "10";
        String stringTwo = "5";

        int add = 15;
        int subtract = 5;
        int multiply = 50;
        int divide = 2;

        String expectedOutput = """
                10 + 5 = 15
                10 - 5 = 5
                10 * 5 = 50
                10 / 5 = 2""";

        String actualOutput = myApp.concatenation(stringOne, stringTwo, add, subtract, multiply, divide);

        assertEquals(expectedOutput, actualOutput);
    }

}