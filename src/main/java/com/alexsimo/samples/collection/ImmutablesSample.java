package com.alexsimo.samples.collection;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.List;

public class ImmutablesSample {
    public static void main(String[] args) {

        List<Person> persons = PersonRepository.instance().getByLimit(50);

        ImmutableList<Person> immutablePersons = ImmutableList.copyOf(persons);
    }
}
