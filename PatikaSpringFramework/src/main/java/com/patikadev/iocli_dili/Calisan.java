package com.patikadev.iocli_dili;

import lombok.AllArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value="ioclidiliCalısan")
@ApplicationScoped
@AllArgsConstructor
public class Calisan {
    @Inject
    private PatronInterface patronInterface;


    public Calisan() {
        //patronInterface=new Patron();
         }
    public String getData(String data){
        return patronInterface.surum(data);
    }
}
