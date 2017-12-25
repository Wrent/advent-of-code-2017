package com.akucera.codeadvent.advent25;

public class StateE implements State {
    @Override
    public State getNext(TuringMachine turingMachine) {
        if (!turingMachine.readCurrent()) {
            turingMachine.writeToCurrent(true);
            turingMachine.moveLeft();
            return new StateF();
        } else {
            turingMachine.writeToCurrent(false);
            turingMachine.moveLeft();
            return new StateD();
        }
    }
}
