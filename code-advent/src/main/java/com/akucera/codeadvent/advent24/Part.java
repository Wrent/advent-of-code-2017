package com.akucera.codeadvent.advent24;

public class Part {
    int portA;
    int portB;

    public Part(int portA, int portB) {
        this.portA = portA;
        this.portB = portB;
    }

    int getVal() {
        return portA + portB;
    }

    public int getOther(int val) {
        if (portB == val) {
            return portA;
        } else {
            return portB;
        }
    }
}
