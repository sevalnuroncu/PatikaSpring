package com.patikadev.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {
    public String surum(String data) {
        return "QualifierMultiple ENUM UCUNCU: patron2"+ data;
    }
}
