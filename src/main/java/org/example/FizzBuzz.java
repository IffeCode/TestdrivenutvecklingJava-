package org.example;

public class FizzBuzz {
    public String fizzBuzz(int fizzBussNumber) {

        if (fizzBussNumber % 3 == 0 && fizzBussNumber % 5 == 0) {
            return "FizzBuzz";
        }
        if (fizzBussNumber % 3 == 0) {
            return "Fizz";
        }
        if (fizzBussNumber % 5 == 0) {
            return "Buzz";
        }


        return Integer.toString(fizzBussNumber);
    }



}
