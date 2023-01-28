package com.patikadev.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {
    public String surum(String data) {
        return "QualifierMultiple ENUM BIRINCI: patron2"+ data;
    }
}
