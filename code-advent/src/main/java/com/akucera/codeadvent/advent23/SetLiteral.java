package com.akucera.codeadvent.advent23;


public class SetLiteral extends Instruction {
    private final Long literal;

    public SetLiteral(String register, Long literal) {
        super(register);
        this.literal = literal;
    }

    @Override
    public void apply(CoprocessorState state) {
        state.setToRegister(getRegister(), literal);
    }

    @Override
    public void print() {
        System.out.println("set " + getRegister() + " " + literal);
    }
}
