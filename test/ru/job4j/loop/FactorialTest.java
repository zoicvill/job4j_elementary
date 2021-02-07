package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int res = 120;
        int ont = Factorial.calk(5);
        assertThat(res, is(ont));
    }

    @Test
    public void whenCalculateFactorial() {
        int res = 3628800;
        int ont = Factorial.calk(10);
        assertThat(res, is(ont));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int res = 1;
        int ont = Factorial.calk(0);
        assertThat(res, is(ont));
    }
}