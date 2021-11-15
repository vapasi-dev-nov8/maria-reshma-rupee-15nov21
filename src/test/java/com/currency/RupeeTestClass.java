package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RupeeTestClass {

    @Test
    public void shouldReturnRupeeObjectWhenAddingTwoRupeeObjects(){
        Rupee rupeeTen = new Rupee(10);
        Rupee rupeeTwenty = new Rupee(20);

        Rupee rupeeResult = new Rupee();
        assertEquals(new Rupee(30),rupeeResult.add(rupeeTen,rupeeTwenty));

        Rupee rupeeFifty = new Rupee(50);
        Rupee rupeeThirty = new Rupee(30);

        assertEquals(new Rupee(80),rupeeResult.add(rupeeFifty,rupeeThirty));
    }

    @Test
    public void shouldReturnTrueWhenComparedRupeeObjectsEqual(){
        Rupee firstRupeeObject = new Rupee(10);
        Rupee secondRupeeObject = new Rupee(10);

        assertEquals(true, firstRupeeObject.equals(secondRupeeObject));
    }

    @Test
    public void shouldReturnFalseWhenComparedRupeeObjectsNotEqual(){
        Rupee firstRupeeObject = new Rupee(10);
        Rupee secondRupeeObject = new Rupee(50);

        assertEquals(false, firstRupeeObject.equals(secondRupeeObject));
        assertEquals(false, firstRupeeObject.equals(null));
    }

}
