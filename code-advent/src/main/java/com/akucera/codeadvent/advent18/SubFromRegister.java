package com.akucera.codeadvent.advent18;

public class SubFromRegister extends Instruction {
    private final String fromRegister;

    public SubFromRegister(String register, String fromRegister) {
        super(register);
        this.fromRegister = fromRegister;
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(fromRegister);
        Long val = state.readRegister(getRegister());
        state.setToRegister(getRegister(), Long + val);
    }

    @Override
    public void print() {
        System.out.println("add " + getRegister() + " " + fromRegister);
    }
}
