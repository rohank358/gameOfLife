package com.ria.example;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;


class GameOfLifeTest {

    @Test
    void givenACell_withOneNeighbourAlive_diesInNextIteration(){
        Cell cell = new Cell(true, Collections.singletonList(new Cell(true)));

        boolean actual = GameOfLife.getNextState(cell);

        assertFalse(actual);

    }
}
