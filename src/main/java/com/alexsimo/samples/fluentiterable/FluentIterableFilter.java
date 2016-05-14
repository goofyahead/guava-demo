package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.*;

import java.util.Collections;
import java.util.List;

import static com.google.common.collect.FluentIterable.*;

public class FluentIterableFilter {

    public static void main(String[] args) {

        Predicate<Person> startsWithA = person -> person.getName().startsWith("A");

        List<Person> persons = PersonRepository.instance().getByLimit(50);

        Iterable<Person> filtered = from(persons)
                .filter(startsWithA);

        Printer.print(Lists.newArrayList(filtered));
    }
}
