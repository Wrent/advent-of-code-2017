package com.akucera.codeadvent.advent23;

public class MulFromRegister extends Instruction {
    private final String fromRegister;

    public MulFromRegister(String register, String fromRegister) {
        super(register);
        this.fromRegister = fromRegister;
    }

    @Override
    public void apply(CoprocessorState state) {
        Long Long = state.readRegister(fromRegister);
        Long val = state.readRegister(getRegister());
        state.setToRegister(getRegister(), Long * val);
        state.mulCnt++;
    }

    @Override
    public void print() {
        System.out.println("mul " + getRegister() + " " + fromRegister);
    }
}
