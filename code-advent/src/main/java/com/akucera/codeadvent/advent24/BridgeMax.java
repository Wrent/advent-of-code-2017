package com.akucera.codeadvent.advent24;

public class BridgeMax implements Comparable {
    public Integer length;
    public Integer strength;

    public BridgeMax(int length, int strength) {
        this.length = length;
        this.strength = strength;
    }

    @Override
    public int compareTo(Object o) {
        BridgeMax other = (BridgeMax) o;
        int i = length.compareTo(other.length);
        if (i == 0) {
            return strength.compareTo(other.strength);
        }
        return i;
    }
}
