package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTestClass {

    @Test
    public void shouldReturnRupeeThirtyWhenAddingTwoRupeeObjects(){
        Rupee rupeeTen = new Rupee(10);
        Rupee rupeeTwenty = new Rupee(20);

        assertEquals(new Rupee(30),rupeeTen.add(rupeeTwenty));
    }

    @Test
    public void shouldReturnRupeeFiftyWhenAddingTwoRupeeObjects(){
        Rupee rupeeTen = new Rupee(10);
        Rupee rupeeForty = new Rupee(40);

        assertEquals(new Rupee(50),rupeeTen.add(rupeeForty));
    }

    @Test
    public void shouldReturnTrueWhenComparedRupeeObjectsEqual(){
        Rupee firstRupeeObject = new Rupee(10);
        Rupee secondRupeeObject = new Rupee(10);

        assertTrue(firstRupeeObject.equals(secondRupeeObject));
    }

    @Test
    public void shouldReturnFalseWhenComparedRupeeObjectsNotEqual(){
        Rupee firstRupeeObject = new Rupee(10);
        Rupee secondRupeeObject = new Rupee(50);

        assertFalse(firstRupeeObject.equals(secondRupeeObject));
        assertFalse(firstRupeeObject.equals(null));
    }

}
