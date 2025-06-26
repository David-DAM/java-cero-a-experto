package com.davinchicoder.poo.model;

import com.davinchicoder.poo.anotations.InfoAutor;
import com.davinchicoder.poo.contracts.PersonInterface;
import com.davinchicoder.poo.enums.GenderType;

import java.util.Objects;

@InfoAutor(nombre = "davinchicoder", email = "davinchicoder@gmail.com")
public class Father extends Human implements PersonInterface {

    public Father(String name) {
        this.name = name;
        this.gender = GenderType.MALE;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return Objects.equals(name, father.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void jump() {
        System.out.println("Jumping");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
