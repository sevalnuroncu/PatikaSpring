package com.patikadev.iocsiz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="cdisizCalısan")
@ApplicationScoped
public class Calisan {
    private Patron patron;

    public Calisan() {
        patron=new Patron();
    }
    public String getData(String data){
        return patron.surum(data);
    }
}
