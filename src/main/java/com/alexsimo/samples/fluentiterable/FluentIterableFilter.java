package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.Collections;
import java.util.List;

public class FluentIterableFilter {

    private static Predicate<Person> startsWithA = new Predicate<Person>() {
        @Override
        public boolean apply(Person person) {
            return person.getName().startsWith("A");
        }
    };

    public static void main(String[] args) {

        List<Person> persons = PersonRepository.instance().getByLimit(50);

        Iterable<Person> filtered = FluentIterable.from(persons)
                .filter(startsWithA);

        Printer.print(Lists.newArrayList(filtered));
    }
}
