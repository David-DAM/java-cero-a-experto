package com.davinchicoder.dessing_patterns.strategy.strategies;

import com.davinchicoder.dessing_patterns.strategy.PaymentInterface;
import com.davinchicoder.dessing_patterns.strategy.PaymentType;

public class MastercadPaymentStrategy implements PaymentInterface {
    @Override
    public void paid() {
        System.out.println("Paid with Mastercard");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.MASTERCARD;
    }
}
