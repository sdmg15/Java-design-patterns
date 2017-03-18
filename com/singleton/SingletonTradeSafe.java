package com.singleton;

/**
 * Created by sdmg15 on 18/03/17.
 */
public class SingletonTradeSafe {

    private static SingletonTradeSafe instance;

    private SingletonTradeSafe(){}

    public static synchronized SingletonTradeSafe getInstance(){
        if(instance == null){
            instance = new SingletonTradeSafe();
        }
        return  instance;
    }
}
