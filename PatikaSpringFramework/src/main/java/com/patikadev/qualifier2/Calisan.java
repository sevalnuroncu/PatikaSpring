package com.patikadev.qualifier2;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value="qualifierCdi")
@ApplicationScoped
public class Calisan {
    /*@Inject
    private PatronInterface patronInterface;*/

    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;


    /*public Calisan() {
        patronInterface=new Patron1();
         }*/
    public String getData(String data){
        return patronInterface.surum(data);
    }
}
