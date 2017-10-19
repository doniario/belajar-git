package com.jody.employee;

import com.jody.employee.name.Jody;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class JodyTest {
    @Test
    public void testTHPMaret() throws Exception {
        Jody maret = new Jody(new BigDecimal(4000000), 20);
        Assert.assertEquals(new BigDecimal(6000000), maret.getTakeHomePay());
    }
}
