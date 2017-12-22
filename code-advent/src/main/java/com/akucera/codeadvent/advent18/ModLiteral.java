package com.akucera.codeadvent.advent18;

public class ModLiteral extends Instruction {
    private final Long literal;

    public ModLiteral(String register, Long literal) {
        super(register);
        this.literal = literal;
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(getRegister());
        state.setToRegister(getRegister(), Long % literal);
    }

    @Override
    public void print() {
        System.out.println("mod " + getRegister() + " " + literal);
    }
}
