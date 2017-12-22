package com.akucera.codeadvent.advent18;

public class ModFromRegister extends Instruction {
    private final String fromRegister;

    public ModFromRegister(String register, String fromRegister) {
        super(register);
        this.fromRegister = fromRegister;
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(fromRegister);
        Long val = state.readRegister(getRegister());
        state.setToRegister(getRegister(), val % Long);
    }

    @Override
    public void print() {
        System.out.println("mod " + getRegister() + " " + fromRegister);
    }
}
