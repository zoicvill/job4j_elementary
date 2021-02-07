package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenTestmax() {
        int res = MultiMax.max(10, 59, 68);
        assertThat(res, is(68));
    }

    @Test
    public void whenTestmax1() {
        int res = MultiMax.max(105, 56, 23);
        assertThat(res, is(105));
    }

    @Test
    public void whenTestmax2() {
        int res = MultiMax.max(32, 34, 34);
        assertThat(res, is(34));
    }

    @Test
    public void whenTestmax3() {
        int res = MultiMax.max(10, 20, 5);
        assertThat(res, is(20));
    }
}