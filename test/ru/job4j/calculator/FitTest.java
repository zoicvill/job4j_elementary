package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double exp = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenWoman180Then80() {
        short in = 180;
        double exp = 80.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(exp, out, 0.01);
    }
}