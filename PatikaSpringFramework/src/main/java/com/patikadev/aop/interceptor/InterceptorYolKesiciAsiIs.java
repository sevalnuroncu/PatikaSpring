package com.patikadev.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsiIs {
    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("ilk hali: "+context.getMethod().getName());

        //kullanıcı giriş yapmış mı
        boolean isLogin=false; //Yol kesici bileşenimiz
        Object isContinue=null; //Eğer yol kesilmezse devam edecek
        if (isLogin){
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın");
            return null;
        }else{
            try {
                isContinue=context.proceed(); //devam etmesini sağlamak
                System.out.println("Sonraki hali "+isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
