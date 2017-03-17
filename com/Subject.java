/**
 * Created by sdmg15 on 08/03/17.
 */
package com.patternObsTest;

public class Subject implements  Jsubject {

    public Jobservers[] tab;

    private int length;

    public void setLength(valLEngth val){
        this.length = val.getVal();
        this.noty();
    }

    public int getLength(){ return  this.length;}

    @Override
    public void attach(Jobservers[] obs){

        this.tab = obs;
    }

    public void detach(int i){
        this.tab[i]= new Observer();
    }

    public void noty(){

        for(int i = 0; i < this.tab.length; i++){
            System.out.println(this.tab[i].update(this));
        }

    }
}
