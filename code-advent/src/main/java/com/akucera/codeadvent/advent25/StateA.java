package com.akucera.codeadvent.advent25;

public class StateA implements State {
    @Override
    public State getNext(TuringMachine turingMachine) {
        if (!turingMachine.readCurrent()) {
            turingMachine.writeToCurrent(true);
            turingMachine.moveRight();
            return new StateB();
        } else {
            turingMachine.writeToCurrent(false);
            turingMachine.moveRight();
            return new StateF();
        }
    }
}
