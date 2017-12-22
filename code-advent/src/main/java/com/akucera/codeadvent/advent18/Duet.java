package com.akucera.codeadvent.advent18;

import java.util.List;

public class Duet {
    public Long getFirstRecoveredFrequency(String input) {
        DuetState state = new DuetState(input);

        while (state.hasNext()) {
            state.doInstruction();
            if (state.canFinish()) {
                break;
            }
        }

        return state.getFirstReceived();
    }

    public Object getNumberOfSends(String input) {
        DuetState state0 = new DuetState(input, 0L);
        DuetState state1 = new DuetState(input, 1L);

        while(!isDeadlock(state0, state1)) {
            state0.doInstruction();
            state1.doInstruction();
        }

        return SendReceiveQueue.getInstance().getFirstWrites();
    }

    private boolean isDeadlock(DuetState a, DuetState b) {
        return a.isStopped() && b.isStopped();
    }
}
