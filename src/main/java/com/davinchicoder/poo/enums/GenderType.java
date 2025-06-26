package com.davinchicoder.poo.enums;

public enum GenderType {
    MALE("M"),
    FEMALE("F");

    private final String name;

    GenderType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static GenderType fromName(String name) {
        for (GenderType gender : GenderType.values()) {
            if (gender.getName().equals(name)) {
                return gender;
            }
        }
        return null;
    }
}
