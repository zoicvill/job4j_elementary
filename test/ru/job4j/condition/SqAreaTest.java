package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6toK2() {
        int exp = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, exp, 0.01);

    }

    @Test
    public void whenP15tok5() {
        int exp = 5;
        int p = 15;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(exp, out, 0.01);

    }
}