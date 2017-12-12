package com.akucera.codeadvent.advent11;

public class NorthEast implements Instruction {
    @Override
    public Position move(Position position) {
        return new Position(position.x + 1, position.y + 1);
    }
}
