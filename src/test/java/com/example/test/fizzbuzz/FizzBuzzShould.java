package com.example.test.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzShould {
    @Test
    public void fizz_when_divisible_by_3() {
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void buzz_when_divisible_by_5() {
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void fizzbuzz_when_divisible_by_3_and_divisible_by_5() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void number_when_is_not_divisible_by_3_and_is_not_divisible_by_5() {
        Assert.assertEquals("2", FizzBuzz.fizzBuzz(2));
        Assert.assertEquals("16", FizzBuzz.fizzBuzz(16));
    }
}