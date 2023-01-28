package com.patikadev.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {
    public String surum(String data) {
        return "patron1"+ data;
    }
}
