package com.akucera.codeadvent.advent25;

public class StateB implements State {
    @Override
    public State getNext(TuringMachine turingMachine) {
        if (!turingMachine.readCurrent()) {
            turingMachine.writeToCurrent(false);
            turingMachine.moveLeft();
            return new StateB();
        } else {
            turingMachine.writeToCurrent(true);
            turingMachine.moveLeft();
            return new StateC();
        }
    }
}
