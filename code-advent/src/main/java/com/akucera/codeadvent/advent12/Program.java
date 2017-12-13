package com.akucera.codeadvent.advent12;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by akucera on 12.12.17.
 */
public class Program {
    private int id;
    private Set<Integer> connected;
    private int color = -1;

    public Program(int id) {
        this.id = id;
        connected = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public Set<Integer> getConnected() {
        return connected;
    }

    public void setConnected(Set<Integer> connected) {
        this.connected = connected;
    }

    public void connect(int id) {
        connected.add(id);
    }
}
