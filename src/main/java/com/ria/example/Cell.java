package com.ria.example;

import java.util.List;


class Cell {
    boolean isAlive;
    List<Cell> aliveNeighbours;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public List<Cell> getAliveNeighbours() {
        return aliveNeighbours;
    }

    public void setAliveNeighbours(List<Cell> aliveNeighbours) {
        this.aliveNeighbours = aliveNeighbours;
    }

    public Cell(boolean isAlive, List<Cell> aliveNeighbours) {
        this.isAlive = isAlive;
        this.aliveNeighbours = aliveNeighbours;
    }

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
