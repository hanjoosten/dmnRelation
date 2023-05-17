package org.example.dmnRelation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum City {
    @JsonProperty("Rome")
    ROME("Rome"),
    @JsonProperty("Napoli")
    NAPOLI("Napoli"),
    @JsonProperty("New York")
    NEWYORK("New York"),
    @JsonProperty("Milano")
    MILANO("Milano"),
    @JsonProperty("Madrid")
    MADRID("Madrid"),
    @JsonProperty("Barcelona")
    BARCELONA("Barcelona");

    // Member to hold the name
    private String string;

    // constructor to set the string
    City(String name) {
        string = name;
    }

    // the toString just returns the given name
    @Override
    public String toString() {
        return string;
    }

}
