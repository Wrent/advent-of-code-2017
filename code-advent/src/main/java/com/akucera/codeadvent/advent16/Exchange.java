package com.akucera.codeadvent.advent16;

/**
 * Created by akucera on 16.12.17.
 */
public class Exchange implements Command {
    private final int first;
    private final int second;


    public Exchange(String command) {
        command = command.substring(1);

        String[] positions = command.split("/");
        first = Integer.parseInt(positions[0]);
        second = Integer.parseInt(positions[1]);
    }

    @Override
    public char[] apply(char[] programs) {
        return ProgramsDance.exchange(programs, first, second);
    }
}
