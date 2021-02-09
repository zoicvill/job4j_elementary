package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EqLastTest {

    @Test
    public void yes() {
        int[] left = {1, 2, 3};
        int[] right = {7, 8, 3};
        assertThat(EqLast.check(left, right), is(true));
    }

    @Test
    public void no() {
        int[] left = {1, 2, 7};
        int[] right = {7, 8, 3};
        assertThat(EqLast.check(left, right), is(false));
    }


}