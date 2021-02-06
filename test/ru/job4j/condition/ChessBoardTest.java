package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs4() {
        int way = ChessBoard.way(7, 6, 3, 2);
        assertThat(way, is(4));
    }

    @Test
    public void wayIs2() {
        int way = ChessBoard.way(3, 3, 5, 1);
        assertThat(way, is(2));
    }

    @Test
    public void wayIs3False() {
        int way = ChessBoard.way(4, 1, 7, 3);
        assertThat(way, is(3));
    }
}