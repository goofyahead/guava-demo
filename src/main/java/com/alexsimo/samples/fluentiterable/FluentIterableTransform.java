package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Consumer;

public class FluentIterableTransform {

    private static Function<Person, PersonDto> personToPersonDto = new Function<Person, PersonDto>() {
        @Override
        public PersonDto apply(Person person) {
            PersonDto dto = new PersonDto();
            dto.fullname = person.getFirstName().concat(" ").concat(person.getLastName());
            dto.email = person.getEmail();
            return dto;
        }
    };
    private static Consumer<PersonDto>
            printer = new Consumer<PersonDto>() {
        @Override
        public void accept(PersonDto personDto) {
            System.out.println(personDto.fullname);
        }
    };

    private static class PersonDto {
        String fullname;
        String email;
    }

    public static void main(String[] args) {

        List<Person> persons = PersonRepository.instance().getByLimit(50);

        Iterable<PersonDto> personDtos = FluentIterable.from(persons)
                .transform(personToPersonDto);

        FluentIterable.from(personDtos).forEach(printer);
    }
}
