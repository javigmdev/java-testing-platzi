package com.example.test.discounts;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();
        
        Assert.assertEquals(0, calculator.getTotal(), 0);
    }

    @Test
    public void total_is_the_sum_of_price() {
        PriceCalculator calculator = new PriceCalculator();
        
        calculator.addPrice(2.2);
        calculator.addPrice(15.4);
        
        Assert.assertEquals(17.6, calculator.getTotal(), 0);
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(55.5);
        calculator.addPrice(44.5);
        calculator.addPrice(100);
        
        calculator.setDiscount(25);
        
        Assert.assertEquals(150.0, calculator.getTotal(), 0);
    }
}