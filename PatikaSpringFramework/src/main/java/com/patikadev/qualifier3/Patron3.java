package com.patikadev.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {
    public String surum(String data) {
        return "QualifierMultiple ENUM IKINCI: patron2"+ data;
    }
}
