package com.factory;

/**
 * Created by sdmg15 on 21/03/17.
 */
public class ComputerFactory {

    public static Computer getComputer(AbstractFactory fact){
        return fact.createComputer();
    }
}
