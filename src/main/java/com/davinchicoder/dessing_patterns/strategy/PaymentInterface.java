package com.davinchicoder.dessing_patterns.strategy;

public interface PaymentInterface {

    void paid();

    PaymentType getPaymentType();
}
