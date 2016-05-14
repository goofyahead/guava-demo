package com.alexsimo.samples.charmatcher;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.alexsimo.util.Printer;
import com.google.common.base.CharMatcher;

import java.util.List;

public class CharMatchers {

    private static final int ONE = 0;

    public static void main(String[] args) {
        List<Person> persons = PersonRepository.instance().getByLimit(1);

        Person person = persons.get(ONE);
        StringBuffer sb = new StringBuffer();
        sb.append(person.getSuffix());
        sb.append(" --- ");
        sb.append(person.getName());
        sb.append(" --- ");
        sb.append(person.getPhoneNumber());

        String phone = CharMatcher.DIGIT.retainFrom(sb);

        Printer.print(phone);
    }

}
