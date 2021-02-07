package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumRes15() {
        int in = Counter.sum(0, 5);
        int res = 15;
        assertThat(res, is(in));
    }

    @Test
    public void whenSumRes55() {
        int in = Counter.sum(1, 10);
        int res = 55;
        assertThat(res, is(in));
    }

    @Test
    public void whenSumRes33() {
        int in = Counter.sum(3, 8);
        int res = 33;
        assertThat(res, is(in));
    }

    @Test
    public void whenSumRes1() {
        int in = Counter.sum(1, 1);
        int res = 1;
        assertThat(res, is(in));
    }

    @Test
    public void whenSumRes15v2() {
        int in = Counter.sum(0, 0);
        int res = 0;
        assertThat(res, is(in));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbers() {
        int rsl = Counter.sumByEven(-2, 2);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}