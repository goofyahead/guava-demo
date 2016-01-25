package com.alexsimo.samples.string;

import static com.google.common.base.Strings.*;

public class NullToEmptySample {

    static String value = "Lorem ipsum magicus macabrus exceltios";

    public static void main(String[] args) {

        String maybeNull = null;
        System.out.println(emptyToNull(maybeNull));
        System.out.println(nullToEmpty(maybeNull).length());
        System.out.println("Is null or empty? "+ isNullOrEmpty(value));

    }
}