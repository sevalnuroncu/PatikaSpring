package com.patikadev.qualifier2;

@QualifierMultiple
public class Patron2 implements PatronInterface {
    public String surum(String data) {
        return "QualifierMultiple1: patron2"+ data;
    }
}
