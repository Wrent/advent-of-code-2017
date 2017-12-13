package com.akucera.codeadvent.advent12;

import java.util.*;

/**
 * Created by akucera on 12.12.17.
 */
public class PipeCommunication {
    private Map<Integer, Program> programs;
    private Set<Integer> found ;

    public int countProgramsWithZero(String input) {
        init(input);


        processProgram(programs.get(0));

        return found.size();
    }

    private void processProgram(Program program) {
        if (found.contains(program.getId())) {
            return;
        }

        found.add(program.getId());
        program.getConnected().forEach(id -> processProgram(getProgram(id)));
    }

    private void processLine(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);
        int id = Integer.parseInt(tokenizer.nextToken());
        tokenizer.nextToken();

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            if (token.charAt(token.length() - 1) == ',') {
                token = token.substring(0, token.length() - 1);
            }
            int connection = Integer.parseInt(token);

            addConnection(id, connection);
        }
    }

    private void addConnection(int id, int connection) {
        Program first = getProgram(id);
        Program second = getProgram(connection);

        first.connect(connection);
        second.connect(id);
    }

    private Program getProgram(int id) {
        if (programs.containsKey(id)) {
            return programs.get(id);
        } else {
            Program program = new Program(id);
            programs.put(id, program);
            return program;
        }
    }

    public int countNumberOfGroups(String input) {
        init(input);

        int count = 0;
        for (Program program : programs.values()) {
            if (program.getColor() == -1) {
                processProgramForGroupCount(program, count);
                count++;
                found = new HashSet<>();
            }
        }

        return count;
    }

    private void processProgramForGroupCount(Program program, int count) {
        if (found.contains(program.getId())) {
            return;
        }
        program.setColor(count);
        found.add(program.getId());
        program.getConnected().forEach(id -> processProgramForGroupCount(getProgram(id), count));
    }

    private void init(String input) {
        programs = new HashMap<>();
        found = new HashSet<>();

        String[] lines = input.split("\n");

        for (String line : lines) {
            processLine(line);
        }
    }
}
