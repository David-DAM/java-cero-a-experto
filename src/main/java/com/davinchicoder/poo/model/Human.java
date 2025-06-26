package com.davinchicoder.poo.model;

import com.davinchicoder.poo.enums.GenderType;

abstract class Human {
    GenderType gender;
    int height;
    int weight;
    String name;

    void sayHello() {
        System.out.println("Hello my name is ".concat(name));
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }
}
