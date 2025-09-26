package com.davinchicoder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

    public void filterAndMapOperations() {
        List<Integer> numbers = createSampleNumbers();

        List<Integer> evenDoubled = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println("Even numbers doubled: " + evenDoubled);
    }

    public void reductionOperations() {
        List<Integer> numbers = createSampleNumbers();

        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Sum: " + sum.orElse(0));
        System.out.println("Product: " + product);
    }

    public void collectingOperations() {
        List<Person> people = createSamplePeople();

        Double averageAge = people.stream()
                .collect(Collectors.averagingLong(Person::getAge));

        List<String> allPhones = people.stream()
                .flatMap(p -> p.getPhones().stream())
                .toList();

        System.out.println("Average age: " + averageAge);
        System.out.println("All phones: " + allPhones);
    }

    public void parallelStreamOperations() {
        List<Integer> numbers = createSampleNumbers();

        long count = numbers.parallelStream()
                .filter(n -> n > 50)
                .count();

        System.out.println("Numbers greater than 50: " + count);
    }

    public void flatMapOperations() {
        List<Person> people = createSamplePeople();

        List<String> allPhoneNumbers = people.stream()
                .flatMap(person -> person.getPhones().stream())
                .toList();

        System.out.println("All phone numbers: " + allPhoneNumbers);
    }

    private List<Integer> createSampleNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private List<Person> createSamplePeople() {
        return Arrays.asList(
                new Person(Arrays.asList("123-456", "789-012"), 25L),
                new Person(Arrays.asList("345-678", "901-234"), 30L),
                new Person(Arrays.asList("567-890", "123-456"), 35L)
        );
    }
}
