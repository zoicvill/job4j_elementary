package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax10to20() {
        int res = Max.max(10,20);
        assertThat(res, is(20));

    }
}