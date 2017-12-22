package com.akucera.codeadvent.advent18;

public class Rcv extends Instruction {

    public Rcv(String register) {
        super(register);
    }

    @Override
    public void apply(DuetState state) {
        Long Long = state.readRegister(getRegister());
        if (Long != 0) {
            state.recover();
        }

        Long read;
        if (state.getId() == 0L) {
            read = SendReceiveQueue.getInstance().readFirst();
        } else {
            read = SendReceiveQueue.getInstance().readSecond();
        }
        state.setToRegister(getRegister(), read);
    }

    @Override
    public void print() {
        System.out.println("rcv " + getRegister());
    }
}
