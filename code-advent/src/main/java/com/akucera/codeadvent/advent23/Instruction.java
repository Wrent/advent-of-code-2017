package com.akucera.codeadvent.advent23;

public abstract class Instruction {
    private final String register;

    public Instruction(String register) {
        this.register = register;
    }

    public String getRegister() {
        return register;
    }

    public abstract void apply(CoprocessorState state);

    public abstract void print();
}
