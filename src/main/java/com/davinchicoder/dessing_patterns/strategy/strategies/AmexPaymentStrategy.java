package com.davinchicoder.dessing_patterns.strategy.strategies;

import com.davinchicoder.dessing_patterns.strategy.PaymentInterface;
import com.davinchicoder.dessing_patterns.strategy.PaymentType;

public class AmexPaymentStrategy implements PaymentInterface {
    @Override
    public void paid() {
        System.out.println("Paid with Amex");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.AMEX;
    }
}
