package com.akucera.codeadvent.advent23;

public class JgzLiteral extends Instruction {
    private final Long literal;

    public JgzLiteral(String register, Long literal) {
        super(register);
        this.literal = literal;
    }

    @Override
    public void apply(CoprocessorState state) {
        Long l;
        if (!getRegister().matches(".*[a-zA-Z]+.*")) {
            l = Long.parseLong(getRegister());
        } else {
            l = state.readRegister(getRegister());
        }
        if (l > 0) {
            state.jump(literal);
        }
    }

    @Override
    public void print() {
        System.out.println("jgz " + getRegister() + " " + literal);
    }
}
