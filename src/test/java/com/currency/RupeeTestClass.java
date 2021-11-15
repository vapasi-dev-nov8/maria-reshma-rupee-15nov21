package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RupeeTestClass {

    @Test
    public void shouldReturnRupeeObjectWhenAddingTwoRupeeObjects(){
        Rupee rupeeTen = new Rupee(10);
        Rupee rupeeTwenty = new Rupee(20);

        Rupee rupeeResult = new Rupee();
        assertEquals(30,rupeeResult.add(rupeeTen,rupeeTwenty).getValue());

        Rupee rupeeFifty = new Rupee(50);
        Rupee rupeeThirty = new Rupee(30);

        assertEquals(80,rupeeResult.add(rupeeFifty,rupeeThirty).getValue());
    }

}
