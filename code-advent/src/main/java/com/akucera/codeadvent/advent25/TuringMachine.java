package com.akucera.codeadvent.advent25;

import java.util.ArrayList;
import java.util.List;

public class TuringMachine {
    private boolean zero = false;
    private List<Boolean> positive = new ArrayList<>();
    private List<Boolean> negative = new ArrayList<>();

    private int pos = 0;

    public TuringMachine() {
        for (int i = 0; i < 100000; i++) {
            positive.add(false);
            negative.add(false);
        }
    }

    public long doIterations(long steps) {
        State state = new StateA();

        for (int i = 0; i < steps; i++) {
            state = state.getNext(this);
        }

        return checksum();
    }

    public void moveRight() {
        this.pos++;
    }

    public void moveLeft() {
        this.pos--;
    }

    public boolean readCurrent() {
        if (pos == 0) {
            return zero;
        } else if (pos > 0) {
            if (positive.size() <= pos) {
                return false;
            }
            return positive.get(pos);
        } else {
            if (negative.size() <= Math.abs(pos)) {
                return false;
            }
            return negative.get(Math.abs(pos));
        }
    }

    public void writeToCurrent(boolean val) {
        if (pos == 0) {
            zero = val;
        } else if (pos > 0) {
            positive.set(pos, val);
        } else {
            negative.set(Math.abs(pos), val);
        }
    }

    private long checksum() {
        long pos = positive.stream().filter(val -> val == true).count();
        long neg = negative.stream().filter(val -> val == true).count();
        if (zero) {
            neg++;
        }
        return pos + neg;
    }
}
