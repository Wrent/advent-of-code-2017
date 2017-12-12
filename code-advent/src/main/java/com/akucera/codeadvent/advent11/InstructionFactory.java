package com.akucera.codeadvent.advent11;

public class InstructionFactory {
    public static Instruction getInstruction(String i) {
        switch (i) {
            case "n":
                return new North();
            case "ne":
                return new NorthEast();
            case "nw":
                return new NorthWest();
            case "s":
                return new South();
            case "se":
                return new SouthEast();
            case "sw":
                return new SouthWest();
        }
        throw new RuntimeException();
    }
}
