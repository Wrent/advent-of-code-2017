package com.akucera.codeadvent.advent11;

public class South implements Instruction {
    @Override
    public Position move(Position position) {
        return new Position(position.x, position.y - 2);
    }
}
