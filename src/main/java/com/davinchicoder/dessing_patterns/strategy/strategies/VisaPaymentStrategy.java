package com.davinchicoder.dessing_patterns.strategy.strategies;

import com.davinchicoder.dessing_patterns.strategy.PaymentInterface;
import com.davinchicoder.dessing_patterns.strategy.PaymentType;

public class VisaPaymentStrategy implements PaymentInterface {
    @Override
    public void paid() {
        System.out.println("Paid with Visa");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.VISA;
    }
}
