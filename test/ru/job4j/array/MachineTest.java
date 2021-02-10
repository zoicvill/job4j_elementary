package ru.job4j.array;

import org.junit.Test;
import ru.job4j.sort.Machine;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = Machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        int[] expected = {50, 10, 5};
        int[] rsl = Machine.change(100, 35);
        assertThat(rsl, is(expected));
    }
}