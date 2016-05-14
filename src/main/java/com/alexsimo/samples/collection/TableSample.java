package com.alexsimo.samples.collection;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class TableSample {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Andy", "Carol", "Ben"};

        // Table of names
        Table<Character, Integer, String> table = HashBasedTable.create();

        // First letter is a row key, length is a column key
        for (String name : names) {
            table.put(name.charAt(0), name.length(), name);
        }

        // Value corresponding to the given row and column keys
        table.get('A', 5); // -> Alice
        table.get('B', 3); // -> Ben

        // Set of column keys that have one or more values in the table
        table.columnKeySet(); // -> [4, 5, 3]

        // View of all mappings that have the given row key
        table.row('A'); // -> {4=Andy, 5=Alice}

    }
}
