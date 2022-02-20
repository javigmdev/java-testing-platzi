package com.example.test.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PaymentProcessorTest {
    
    private PaymentGatewey paymentGatewey;
    private PaymentProcessor paymentProcessor;
    
    @Before
    public void setUp(){
        paymentGatewey = Mockito.mock(PaymentGatewey.class);
        paymentProcessor = new PaymentProcessor(paymentGatewey);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(paymentGatewey.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGatewey.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}