package com.alexsimo;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Person> persons = PersonRepository.instance().getByLimit(10);
        Printer.print(persons);

    }
}
