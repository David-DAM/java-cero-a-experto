package com.davinchicoder.poo.model;

import com.davinchicoder.poo.contracts.PersonInterface;

public class Son extends Father implements PersonInterface {

    public Son(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Son{ name " + this.getName() + " }";
    }

    @Override
    public void jump() {
        System.out.println("Jumping little");
    }

    @Override
    public void run() {
        System.out.println("Running slowly");
    }
}
