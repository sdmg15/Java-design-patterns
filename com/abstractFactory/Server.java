package com.factory;

/**
 * Created by sdmg15 on 18/03/17.
 */
public class Server extends Computer{
    private String ram;
    private String cpu;
    private String hdd;


    public Server(String ram,String hdd, String cpu){
        this.ram = ram;
        this.hdd= hdd;
        this.cpu = cpu;
    }
    public String getRam(){
        return  this.ram;
    }
    public String getCpu(){
        return this.cpu;
    }

    public String getHdd(){
        return  this.hdd;
    }
}
