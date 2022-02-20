package com.example.test.payments;

public class PaymentProcessor  {
    
    private PaymentGatewey paymentGatewey;

    public PaymentProcessor(PaymentGatewey paymentGatewey) {
        this.paymentGatewey = paymentGatewey;
    }

    public boolean makePayment(double amount){
       PaymentResponse response = paymentGatewey.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == PaymentResponse.PaymentStatus.OK;
    }
}