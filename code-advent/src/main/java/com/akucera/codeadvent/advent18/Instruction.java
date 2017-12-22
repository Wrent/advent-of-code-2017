package com.akucera.codeadvent.advent18;

import java.util.Set;

public abstract class Instruction {
    private final String register;

    public Instruction(String register) {
        this.register = register;
    }

    public String getRegister() {
        return register;
    }

    public abstract void apply(DuetState state);

    public abstract void print();
}
