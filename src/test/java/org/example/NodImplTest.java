package org.example;

import org.junit.Assert;
import org.junit.Test;

public class NodImplTest {
    @Test
    public void testCalculate() {
        NodImpl nod = new NodImpl();


        Assert.assertEquals(5, nod.calculate(5, 5));


        Assert.assertEquals(3, nod.calculate(6, 9));
    }
}
