package com.alexsimo.samples.ordering;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.List;

public class ChainOrderings {
    public static void main(String[] args) {

        Ordering<Person> bySuffix = new Ordering<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSuffix().compareTo(p2.getSuffix());
            }
        };
        Ordering<Person> byNameLength = new Ordering<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Ints.compare(p1.getName().length(), p2.getName().length());
            }
        };

        List<Person> persons = PersonRepository.instance().getByLimit(50);
        Collections.sort(persons, byNameLength.compound(bySuffix));
        Printer.print(persons);
    }


}
