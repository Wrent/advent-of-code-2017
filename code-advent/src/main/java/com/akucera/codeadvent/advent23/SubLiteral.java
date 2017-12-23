package com.akucera.codeadvent.advent23;


public class SubLiteral extends Instruction {
    private final Long literal;

    public SubLiteral(String register, Long literal) {
        super(register);
        this.literal = literal;
    }

    @Override
    public void apply(CoprocessorState state) {
        Long Long = state.readRegister(getRegister());
        state.setToRegister(getRegister(), Long - literal);
    }

    @Override
    public void print() {
        System.out.println("sub " + getRegister() + " " + literal);
    }
}
