package com.akucera.codeadvent.advent11;

public class SouthWest implements Instruction {
    @Override
    public Position move(Position position) {
        return new Position(position.x - 1, position.y - 1);
    }
}
