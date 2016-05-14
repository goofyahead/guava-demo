package com.alexsimo.samples.collection;

import com.alexsimo.domain.entity.Person;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class BiMapSample {
    public static void main(String[] args) {

        Person p1 = new Person("Alex", "Simonescu");
        Person p2 = new Person("Josh", "Block");

        BiMap<String, Person> emailPerson = HashBiMap.create();
        emailPerson.put("hello@alexsimo.com", p1);
        emailPerson.put("hi@joshblock.com", p2);

        String p1Email = emailPerson.inverse().get(p1);

    }
}
