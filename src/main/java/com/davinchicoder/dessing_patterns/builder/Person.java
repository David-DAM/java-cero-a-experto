package com.davinchicoder.dessing_patterns.builder;

public class Person {

    String name;
    int age;
    String email;
    String password;
    String phone;
    String address;
    String city;
    String state;
    String country;

    public Person() {

    }

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.password = builder.password;
        this.phone = builder.phone;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class PersonBuilder {

        String name;
        int age;
        String email;
        String password;
        String phone;
        String address;
        String city;
        String state;
        String country;

        public PersonBuilder() {

        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
