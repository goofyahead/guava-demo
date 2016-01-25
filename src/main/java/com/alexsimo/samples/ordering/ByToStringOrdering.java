package com.alexsimo.samples.ordering;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.Collections;
import java.util.List;

public class ByToStringOrdering {
    public static void main(String[] args) {

        List<Person> persons = PersonRepository.instance().getByLimit(50);

        Ordering toString = Ordering.usingToString();

        Collections.sort(persons, toString);

        Printer.print(persons);
    }
}
