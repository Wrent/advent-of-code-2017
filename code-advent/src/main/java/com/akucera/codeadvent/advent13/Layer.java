package com.akucera.codeadvent.advent13;

/**
 * Created by akucera on 13.12.17.
 */
public class Layer {
    private final int depth;
    private final int range;

    public Layer(int depth, int range) {
        this.depth = depth;
        this.range = range;
    }

    public int getDepth() {
        return depth;
    }

    public int getRange() {
        return range;
    }

    public int getSeverity() {
        return depth * range;
    }

    public boolean isOnTop(int time) {
        int div = 2 + (range - 2) * 2;

        return time % div == 0;
    }
}
