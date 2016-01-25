package com.alexsimo.util;

import com.alexsimo.domain.entity.Person;

import java.util.List;

public class Printer {
    public static void print(String str) {
        System.out.println("=========================================");
        System.out.println(str);
        System.out.println("=========================================");
    }

    public static void print(List<Person> persons) {
        System.out.println("=========================================");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(i + ": " + persons.get(i).toString());
        }
        System.out.println("=========================================");
    }

    public static void printNums(List<Integer> numbers) {
        System.out.println("=========================================");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("=========================================");
    }
}
