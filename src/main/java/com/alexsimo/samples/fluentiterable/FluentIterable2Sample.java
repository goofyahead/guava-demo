package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.entity.State;
import com.alexsimo.domain.repository.PersonRepository;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class FluentIterable2Sample {
    public static void main(String[] args) {

        Predicate<Person> isNotNull = Predicates.notNull();
        Predicate<Object> isPerson = Predicates.instanceOf(Person.class);
        Predicate<Person> nameStartsWithA = person -> person.getName().toLowerCase().startsWith("a");
        Predicate<Person> hasCar = person -> person.getCar().isPresent();

        Function<Person, String> toCarName = person -> person.getCar().get().getName();

        ImmutableList<Person> people = ImmutableList.copyOf(getPeople());

        List<String> cars = FluentIterable
                .from(people)
                .filter(isNotNull)
                .filter(isPerson)
                .filter(nameStartsWithA)
                .filter(hasCar)
                .transform(toCarName)
                .toList();
    }

    private static List<Person> getPeople() {
        return PersonRepository.instance().getByLimit(100);
    }
}
