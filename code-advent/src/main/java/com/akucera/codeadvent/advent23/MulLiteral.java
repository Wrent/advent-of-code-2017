package com.akucera.codeadvent.advent23;

public class MulLiteral extends Instruction {
    private final Long literal;

    public MulLiteral(String register, Long literal) {
        super(register);
        this.literal = literal;
    }

    @Override
    public void apply(CoprocessorState state) {
        Long Long = state.readRegister(getRegister());
        state.setToRegister(getRegister(), Long * literal);
        state.mulCnt++;
    }

    @Override
    public void print() {
        System.out.println("mul " + getRegister() + " " + literal);
    }
}
