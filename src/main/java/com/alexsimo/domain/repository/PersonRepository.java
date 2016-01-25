package com.alexsimo.domain.repository;

import com.alexsimo.domain.entity.Person;

public class PersonRepository extends Repository<Person> {

    private static PersonRepository instance;

    public static PersonRepository instance() {
        if (null == instance) {
            instance = new PersonRepository(new FakeDataSource());
        }
        return instance;
    }

    public PersonRepository(DataSource<Person> dataSource) {
        super(dataSource);
    }
}
