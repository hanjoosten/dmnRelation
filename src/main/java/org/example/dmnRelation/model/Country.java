package org.example.dmnRelation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Country {
    @JsonProperty("Italy")
    ITALY("Italy"),
    @JsonProperty("USA")
    USA("USA"),
    @JsonProperty("Spain")
    SPAIN("Spain");

    // Member to hold the name
    private String string;

    // constructor to set the string
    Country(String name) {
        string = name;
    }

    // the toString just returns the given name
    @Override
    public String toString() {
        return string;
    }

}
