package com.alexsimo.samples.ordering;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.base.Strings;
import com.google.common.collect.Ordering;

import java.util.Collections;
import java.util.List;

public class CustomOrdering {
    public static void main(String[] args) {

        Ordering<Person> orderBySuffix = new Ordering<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSuffix().compareTo(p2.getSuffix());
            }
        };
        List<Person> persons = PersonRepository.instance().getByLimit(50);
        Collections.sort(persons, orderBySuffix);
        Printer.print(persons);
    }


}
