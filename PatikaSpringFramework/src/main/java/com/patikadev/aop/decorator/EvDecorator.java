package com.patikadev.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class EvDecorator implements IEv{
    private @Inject @Delegate
    IEv iEv;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator buradaydı!!");
        String dataInformation=iEv.boyama(data);
        if (dataInformation.equals("kodluyoruz")){
            dataInformation=dataInformation.toUpperCase();
        }

        return dataInformation;
    }
}
