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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rupee rupee = (Rupee) object;
        return value == rupee.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }



}
