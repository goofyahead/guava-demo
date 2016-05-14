package com.alexsimo.samples.fluentiterable;

import com.alexsimo.domain.entity.State;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

import static com.google.common.base.Predicates.*;
import static com.google.common.collect.Collections2.*;

/**
 * Created by alexandru.simonescu on 14/5/16.
 */
public class BasicFilterSample {
    public static void main(String[] args) {

        Predicate<State> withI = state -> state.getAbbreviation().startsWith("I");
        Predicate<State> isExpanded = state -> state.isExpanded();

        Collection<State> filtered = filter(states, or(withI, not(isExpanded)));
    }

    private static List<State> states = Lists.newArrayList(
            new State("MT", false),
            new State("ID", false),
            new State("WY", false),
            new State("SD", false),
            new State("NE", false),
            new State("WI", false),
            new State("IN", false),
            new State("TX", false),
            new State("CA", true),
            new State("AZ", true),
            new State("NM", true),
            new State("AR", true),
            new State("IL", true),
            new State("IA", true));
}
