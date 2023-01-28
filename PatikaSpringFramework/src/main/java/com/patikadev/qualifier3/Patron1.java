package com.patikadev.qualifier3;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {
    public String surum(String data) {
        return "default data: patron1: "+ data;
    }
}
