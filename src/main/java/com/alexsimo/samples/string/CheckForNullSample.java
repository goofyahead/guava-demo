package com.alexsimo.samples.string;

import com.google.common.base.Charsets;

import java.util.Arrays;

public class CheckForNullSample {

    static String value = "Lorem ipsum magicus macabrus exceltios";

    public static void main(String[] args) {

        String rebuild = getStringBytes();
        System.out.println(rebuild);

    }

    private static String getStringBytes() {
        return Arrays.toString(value.getBytes(Charsets.UTF_8));
    }
}