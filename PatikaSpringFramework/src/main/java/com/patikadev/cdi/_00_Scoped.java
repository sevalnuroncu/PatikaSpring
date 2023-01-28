package com.patikadev.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

@Named
//@ApplicationScoped //Bütün uygulama boyunca çalışır
//@RequestScoped //1 istek boyunca
//@SessionScoped //1 kullanıcı için yaşar ancak logout
//@Dependent// bukalemun
//@ConversationScoped //belli istek boyunca yaşar
//@SessionScoped//Bean 1 instance olmasını sağlamak için
public class _00_Scoped{ //implements Serializable {
}
