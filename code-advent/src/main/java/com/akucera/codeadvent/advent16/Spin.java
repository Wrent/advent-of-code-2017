package com.akucera.codeadvent.advent16;

/**
 * Created by akucera on 16.12.17.
 */
public class Spin implements Command {
    private final int cnt;

    public Spin(String command) {
        this.cnt = Integer.parseInt(command.substring(1));
    }

    @Override
    public char[] apply(char[] programs) {
        int size = programs.length;
        char[] newChars = new char[size];

        int j = 0;
        for (int i = size - cnt; i < size; i++) {
            newChars[j] = programs[i];
            j++;
        }
        for (int i = 0; i < size - cnt; i++) {
            newChars[j] = programs[i];
            j++;
        }
        return newChars;
    }
}
