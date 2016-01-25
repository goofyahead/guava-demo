package com.alexsimo.samples.optional;

import com.google.common.base.Optional;

public class OptionalSample {

    private static Optional<String> name = Optional.of("Alex");
    private static Optional<Integer> age = Optional.absent();
    private static Optional<String> car = Optional.fromNullable(null);


    public static void main(String[] args) {

        System.out.println(String.format("Name exists: %s", name.isPresent()));
        System.out.println(String.format("Age or default: %s", age.or(0)));
        System.out.println(String.format("Car: %s", car.toString()));

    }

}
