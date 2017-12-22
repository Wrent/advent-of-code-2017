package com.akucera.codeadvent.advent18;

public class SetFromRegister extends Instruction {
    private final String fromRegister;

    public SetFromRegister(String register, String fromRegister) {
        super(register);
        this.fromRegister = fromRegister;
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(fromRegister);
        state.setToRegister(getRegister(), Long);
    }

    @Override
    public void print() {
        System.out.println("set " + getRegister() + " " + fromRegister);
    }
}
