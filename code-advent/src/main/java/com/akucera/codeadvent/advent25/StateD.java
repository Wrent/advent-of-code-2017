package com.akucera.codeadvent.advent25;

public class StateD implements State {
    @Override
    public State getNext(TuringMachine turingMachine) {
        if (!turingMachine.readCurrent()) {
            turingMachine.writeToCurrent(true);
            turingMachine.moveLeft();
            return new StateE();
        } else {
            turingMachine.writeToCurrent(true);
            turingMachine.moveRight();
            return new StateA();
        }
    }
}
