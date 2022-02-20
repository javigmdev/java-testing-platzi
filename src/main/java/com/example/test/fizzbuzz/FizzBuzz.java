package com.example.test.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String result = "";
        if(number % 3 == 0) result += "Fizz";
        if(number % 5 == 0) result += "Buzz";
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}