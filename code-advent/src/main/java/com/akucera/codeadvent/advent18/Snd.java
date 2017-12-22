package com.akucera.codeadvent.advent18;

public class Snd extends Instruction {

    public Snd(String register) {
        super(register);
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(getRegister());
        state.addToPlayed(Long);

        if (state.getId() == 0L) {
            SendReceiveQueue.getInstance().writeSecond(Long);
        } else {
            SendReceiveQueue.getInstance().writeFirst(Long);
        }
    }

    @Override
    public void print() {
        System.out.println("snd " + getRegister() + " ");
    }
}

