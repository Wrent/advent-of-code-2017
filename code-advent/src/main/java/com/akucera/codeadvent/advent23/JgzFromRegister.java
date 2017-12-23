package com.akucera.codeadvent.advent23;

public class JgzFromRegister extends Instruction {
    private final String fromRegister;

    public JgzFromRegister(String register, String fromRegister) {
        super(register);
        this.fromRegister = fromRegister;
    }

    @Override
    public void apply(CoprocessorState state) {
        Long Long = state.readRegister(getRegister());
        Long jumpSize = state.readRegister(fromRegister);
        if (Long > 0) {
            state.jump(jumpSize);
        }
    }

    @Override
    public void print() {
        System.out.println("jgz " + getRegister() + " " + fromRegister);
    }
}
