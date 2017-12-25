package com.akucera.codeadvent.advent25;

public interface State {
    State getNext(TuringMachine turingMachine);
}
