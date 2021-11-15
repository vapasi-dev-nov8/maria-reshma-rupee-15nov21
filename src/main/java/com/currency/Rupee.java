package com.currency;

import java.util.Objects;

public class Rupee {

    private int value;

    public Rupee(int value) {
        this.value = value;
    }

    public Rupee add(Rupee rupee){
         return new Rupee(this.value + rupee.value);
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
