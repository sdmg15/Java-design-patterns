package com.factory;

/**
 * Created by sdmg15 on 18/03/17.
 */
public class FactoryClass {

    public static Computer getComputer(String c, String ram, String hdd, String dd){
        if("PC".equalsIgnoreCase(c)) return  new PC(ram,hdd,dd);
        else if("Server".equalsIgnoreCase(c)) return new Server(ram,hdd,dd);

        return null;
    }
}
