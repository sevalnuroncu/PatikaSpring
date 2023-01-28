package com.patikadev.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producestuto")
@ApplicationScoped
public class _02_Produces {
    @Produces
    public List<String> getList(){
        List<String> liste=new ArrayList<>();
        liste.add("Html5");
        liste.add("css");
        liste.add("js");
        liste.add("react");
        return liste;




    }
}
