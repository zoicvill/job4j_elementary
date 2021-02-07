package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(1000);
        assertThat(count, is(168));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}