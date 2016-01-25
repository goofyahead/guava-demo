package com.alexsimo.samples.object;


import com.google.common.base.Objects;

public class CheckForNullSample {

    static String canBeNull = null;

    public static void main(String[] args) {

        // if both null --> thows IllegalArgumentException
        String value = Objects.firstNonNull(canBeNull, "defaultValue");
        System.out.println("Value: " + value);
    }
}
