package com.akucera.codeadvent.advent18;


public class AddLiteral extends Instruction {
    private final Long literal;

    public AddLiteral(String register, Long literal) {
        super(register);
        this.literal = literal;
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(getRegister());
        state.setToRegister(getRegister(), Long + literal);
    }

    @Override
    public void print() {
        System.out.println("add " + getRegister() + " " + literal);
    }
}
