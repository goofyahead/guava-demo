package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;

import java.util.Collection;
import java.util.List;

import static com.google.common.base.Functions.*;
import static com.google.common.collect.Collections2.*;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class BasicTransformSample {
    public static void main(String[] args) {

        Function<Person, Person> emailToUpper = person -> {
            person.setEmail(person.getEmail().toUpperCase());
            return person;
        };

        Function<Person, String> toUsername = person -> {
            String[] chunks = person.getEmail().split("@");
            return chunks[0];
        };

        List<Person> people = getPeople();
        Collection<String> usernames = transform(people, compose(toUsername, emailToUpper));


    }

    private static List<Person> getPeople() {
        return PersonRepository.instance().getByLimit(100);
    }
}
