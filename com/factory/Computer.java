package com.factory;

/**
 * Created by sdmg15 on 18/03/17.
 */
public abstract class Computer {


    public abstract String getRam();
    public abstract String getCpu();
    public abstract String getHdd();

    @Override

    public String toString(){
        return "Config :: RAM = " + this.getRam() + " CPU = " + this.getCpu() + " HDD = " + this.getHdd();
    }

}
