package com.patternObsTest;

/**
 * Created by sdmg15 on 17/03/17.
 */
public enum valLength {

    Val1(24),
    Val2(23),
    val3(45);
    public int val;

    valLength(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }

    @Override
    public String toString() {
        return "I'm an Enum !";
    }
}
