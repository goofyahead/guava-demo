package com.alexsimo.domain.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class State {

    private String abbreviation;
    private boolean expanded;

    public State(String abbreviation, boolean expanded) {
        super();
        this.abbreviation = abbreviation;
        this.expanded = expanded;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public boolean isExpanded() {
        return expanded;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("abbreviation", abbreviation)
                .add("expanded", expanded)
                .toString();
    }

}