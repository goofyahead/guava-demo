package com.alexsimo.samples.collection;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class ClassToInstanceSample {
    public static void main(String[] args) {
        ClassToInstanceMap<Number> numbers = MutableClassToInstanceMap.create();

        numbers.putInstance(Integer.class, Integer.valueOf(0));
        numbers.putInstance(Double.class, Double.valueOf(1));
        numbers.putInstance(Float.class, Float.valueOf(3));

        double myNum = numbers.getInstance(Double.class);
        System.out.println(myNum);
    }
}
