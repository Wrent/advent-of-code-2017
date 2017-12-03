package com.akucera.codeadvent.advent03;

public enum Direction {
    LEFT,
    RIGHT,
    TOP,
    DOWN;

    public Coord move(Coord coord) {
        switch (this) {
            case LEFT:
                return new Coord(coord.x - 1, coord.y);
            case TOP:
                return new Coord(coord.x, coord.y + 1);
            case DOWN:
                return new Coord(coord.x, coord.y - 1);
            case RIGHT:
                return new Coord(coord.x + 1, coord.y);
        }
        throw new RuntimeException();
    }

    public Direction onLeft() {
        switch (this) {
            case LEFT:
                return DOWN;
            case TOP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case RIGHT:
                return TOP;
        }
        throw new RuntimeException();
    }
}
