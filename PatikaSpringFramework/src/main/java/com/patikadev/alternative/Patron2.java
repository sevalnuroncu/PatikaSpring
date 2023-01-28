package com.patikadev.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements PatronInterface {
    public String surum(String data) {
        return "patron2"+ data;
    }
}
