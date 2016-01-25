package com.alexsimo.samples.ordering;

import com.alexsimo.util.Printer;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.Collections;
import java.util.List;

public class NaturalOrdering {
    public static void main(String[] args) {

        List<Integer> numbers = Lists.newArrayList(12, 34, 87, 19, 31, 12, 13, 16, 99, 101, 86);

        Ordering natural = Ordering.natural();

        Collections.sort(numbers, natural);

        Printer.printNums(numbers);
    }

}
