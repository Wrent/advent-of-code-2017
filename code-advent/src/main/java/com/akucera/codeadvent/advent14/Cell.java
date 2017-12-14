package com.akucera.codeadvent.advent14;

/**
 * Created by akucera on 14.12.17.
 */
public class Cell {
    private boolean val;
    private int block = 0;

    public Cell(boolean val) {
        this.val = val;
    }

    public boolean isVal() {
        return val;
    }

    public void setVal(boolean val) {
        this.val = val;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}
