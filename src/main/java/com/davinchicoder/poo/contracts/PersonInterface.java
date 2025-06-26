package com.davinchicoder.poo.contracts;

public interface PersonInterface {

    void jump();

    void run();

    default void walk() {
        System.out.println("I'm walking");
    }
}
