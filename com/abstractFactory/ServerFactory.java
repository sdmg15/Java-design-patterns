package com.factory;

/**
 * Created by sdmg15 on 21/03/17.
 */
public class ServerFactory implements AbstractFactory{


    private String ram;
    private  String hdd;

    private  String cpu;


    public ServerFactory(String r, String h, String c){
        this.ram = r;
        this.hdd = h;
        this.cpu = c;
    }

    public Computer createComputer(){
        return  new Server(ram,hdd,cpu);
    }
}
