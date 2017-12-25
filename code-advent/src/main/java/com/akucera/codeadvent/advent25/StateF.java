package com.akucera.codeadvent.advent25;

public class StateF implements State {
    @Override
    public State getNext(TuringMachine turingMachine) {
        if (!turingMachine.readCurrent()) {
            turingMachine.writeToCurrent(true);
            turingMachine.moveRight();
            return new StateA();
        } else {
            turingMachine.writeToCurrent(false);
            turingMachine.moveLeft();
            return new StateE();
        }
    }
}
