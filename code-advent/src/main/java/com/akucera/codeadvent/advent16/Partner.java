package com.akucera.codeadvent.advent16;

/**
 * Created by akucera on 16.12.17.
 */
public class Partner implements Command {
    private final char first;
    private final char second;

    public Partner(String command) {
        first = command.charAt(1);
        second = command.charAt(3);
    }


    @Override
    public char[] apply(char[] programs) {
        int firstPos = getPos(programs, first);
        int secondPos = getPos(programs, second);

        return ProgramsDance.exchange(programs, firstPos, secondPos);
    }

    private int getPos(char[] programs, char first) {
        for (int i = 0; i < programs.length; i++) {
            if (programs[i] == first) {
                return i;
            }
        }
        return -1;
    }
}
