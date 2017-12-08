package com.akucera.codeadvent.advent08;

public enum Instruction {
    INC,
    DEC;

    public static Instruction of(String string) {
        switch (string) {
            case "inc":
                return INC;
            case "dec":
                return DEC;
        }
        throw new RuntimeException();
    }

    public Integer run(Integer a, Integer b) {
        switch (this) {
            case INC:
                return a + b;
            case DEC:
                return a - b;
        }
        throw new RuntimeException();
    }
}
