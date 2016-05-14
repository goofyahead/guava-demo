package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Stopwatch;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static com.google.common.collect.FluentIterable.*;

public class FluentIterableTransform {

    private static Function<Person, PersonDto> personToPersonDto = person -> {
        PersonDto dto = new PersonDto();
        dto.fullname = person.getFirstName().concat(" ").concat(person.getLastName());
        dto.email = person.getEmail();
        return dto;
    };
    private static Consumer<PersonDto>
            printer = personDto -> System.out.println(personDto.fullname);

    private static class PersonDto {
        String fullname;
        String email;
    }

    public static void main(String[] args) {

        Stopwatch stopwatch = Stopwatch.createStarted();

        List<Person> persons = PersonRepository.instance().getByLimit(50);

        Iterable<PersonDto> personDtos = from(persons).transform(personToPersonDto);

        from(personDtos).forEach(printer);

        long nanos = stopwatch.elapsed(TimeUnit.NANOSECONDS);
    }
}

