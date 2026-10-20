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

}
