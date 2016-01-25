package com.alexsimo.samples.joinersplitter;

import com.google.common.base.Splitter;

import java.util.Map;

public class JoinerSplitterSample {

    static String fruits = "orange,   apple,   banana,   strawberry,   mango";
    static String contacts = "alex:123;bob:321;ana:333;daniel:890;victor:456";

    public static void main(String args[]) {

        Iterable<String> splitter = Splitter.on(",").split(fruits);
        for (String f : splitter) {
            System.out.println(f);
        }

        Splitter.MapSplitter mapSplitter = Splitter.on(";").withKeyValueSeparator(":");
        Map<String, String> descompose = mapSplitter.split(contacts);
        for (Map.Entry<String, String> f : descompose.entrySet()) {
            System.out.println(String.format("%s -> %s", f.getKey(), f.getValue()));
        }

    }
}
