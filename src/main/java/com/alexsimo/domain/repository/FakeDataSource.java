package com.alexsimo.domain.repository;

import com.alexsimo.domain.entity.Address;
import com.alexsimo.domain.entity.Person;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class FakeDataSource implements DataSource<Person> {


    @Override
    public List<Person> getByLimit(int limit) {
        Faker fake = new Faker();
        List<Person> persons = new ArrayList<>(limit);
        for (int i = 0; i < limit; i++) {
            Person p = new Person();
            buildBasicInfo(fake, p);
            p.setAddress(buildAddress(fake));
            persons.add(p);
        }
        return persons;
    }

    private void buildBasicInfo(Faker fake, Person p) {
        p.setName(fake.name().name());
        p.setFirstName(fake.name().firstName());
        p.setLastName(fake.name().lastName());
        p.setSuffix(fake.name().suffix());
        p.setEmail(fake.internet().emailAddress());
        p.setWebsite(fake.internet().url());
        p.setPhoneNumber(fake.phoneNumber().phoneNumber());
    }

    private Address buildAddress(Faker fake) {
        Address a = new Address();
        a.setCountry(fake.address().country());
        a.setLatitude(fake.address().latitude());
        a.setLongitude(fake.address().longitude());
        a.setStreetAddress(fake.address().streetAddress(true));
        a.setZipCode(fake.address().zipCode());
        return a;
    }
}
