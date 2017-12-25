package com.akucera.codeadvent.advent25;

public class StateC implements State {
    @Override
    public State getNext(TuringMachine turingMachine) {
        if (!turingMachine.readCurrent()) {
            turingMachine.writeToCurrent(true);
            turingMachine.moveLeft();
            return new StateD();
        } else {
            turingMachine.writeToCurrent(false);
            turingMachine.moveRight();
            return new StateC();
        }
    }
}
