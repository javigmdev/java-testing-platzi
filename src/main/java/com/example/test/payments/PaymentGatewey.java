package com.example.test.payments;

public interface PaymentGatewey {
    
    PaymentResponse requestPayment(PaymentRequest request);
}