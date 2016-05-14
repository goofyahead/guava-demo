package com.alexsimo.samples.collectionutil;

import com.alexsimo.domain.entity.Person;
import com.alexsimo.domain.repository.PersonRepository;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.alexsimo.domain.repository.PersonRepository.instance;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class ListsUtil {
    public static void main(String[] args) {

        List<Person> list = Lists.newArrayList();


        Map<Integer, Person> map = Maps.newLinkedHashMap();


        Set<Person> set = Sets.newHashSet(instance().getByLimit(50));


        List<String> elements = Lists.newArrayList("alpha", "beta", "gamma");


    }
}
