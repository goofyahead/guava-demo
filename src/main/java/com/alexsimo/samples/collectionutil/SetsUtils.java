package com.alexsimo.samples.collectionutil;

import com.google.common.collect.ImmutableSet;

import java.util.List;
import java.util.Set;

import static com.google.common.collect.Sets.cartesianProduct;
import static com.google.common.collect.Sets.powerSet;

public class SetsUtils {
    public static void main(String[] args) {
        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<String> fruits = ImmutableSet.of("apple", "orange", "banana");

        Set<List<String>> product = cartesianProduct(animals, fruits);

        Set<Set<String>> animalSets = powerSet(animals);

    }
}
