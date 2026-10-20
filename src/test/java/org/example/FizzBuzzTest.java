package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    /*
    1.Write a "fizzBuzz" method that accepts a number as input and retuns it as a String
     */
    @Test
    @DisplayName("Accepts a number and returns it as a String")
    public void returnNumberAsString() {
        FizzBuzz fzbz = new FizzBuzz();

        String result = fzbz.fizzBuzz(1);

        assertEquals("1", result);
    }

    /*
    2. For multiples of three return "Fizz" instead of the number
     */

    @Test
    @DisplayName("For multiples of three return Fizz")
    public void returnFizzForMultiplesOfThree() {
        FizzBuzz fzbz = new FizzBuzz();

        String result = fzbz.fizzBuzz(3);

        assertEquals("Fizz", result);
    }

    /*
    3. For multiples of five return "Buzz"
     */

    @Test
    @DisplayName("For multiples of five return Buzz")
    public void returnBuzzForMultiplesOfFive() {
        FizzBuzz fzbz = new FizzBuzz();

        String result = fzbz.fizzBuzz(5);

        assertEquals("Buzz", result);
    }

    /*
    4. For numbers that are multiples of both three and five return FizzBuzz
     */
    @Test
    @DisplayName("For multiples of three and five return FizzBuzz")
    public void returnFizzBuzzForMultiplesOfThreeAndFive() {
        FizzBuzz fzbz = new FizzBuzz();

        String result = fzbz.fizzBuzz(3*5);
        assertEquals("FizzBuzz", result);
    }

}
