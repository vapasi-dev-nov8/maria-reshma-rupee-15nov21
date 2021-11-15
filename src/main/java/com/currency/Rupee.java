package com.currency;

import java.util.Objects;

public class Rupee {

    private int value;

    public Rupee() {
        super();
    }

    public Rupee(int value) {
        this.value = value;
    }

    public Rupee add(Rupee rupee1, Rupee rupee2){
         return new Rupee(rupee1.value + rupee2.value);
    }

    public int getValue(){
        return this.value;
    }

}
