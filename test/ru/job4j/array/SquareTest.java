package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int b = 3;
        int[] rts = Square.calculate(b);
        int[] exp = new int[]{0, 1, 4};
        assertThat(rts, is(exp));
    }
    @Test
    public void whenBound5Then014916() {
        int b = 5;
        int[] rts = Square.calculate(b);
        int[] exp = new int[]{0, 1, 4, 9, 16};
        assertThat(rts, is(exp));
    }

}