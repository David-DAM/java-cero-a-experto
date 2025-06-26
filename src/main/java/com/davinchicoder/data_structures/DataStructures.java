package com.davinchicoder.data_structures;

public class DataStructures {


    public String toUpperCase(String message) {

        return message.toUpperCase();
    }

    public Integer plusOneTo(Integer number, Integer target) {

        if (number == target) {
            return number;
        }

        return plusOneTo(number + 1, target);
    }


}
