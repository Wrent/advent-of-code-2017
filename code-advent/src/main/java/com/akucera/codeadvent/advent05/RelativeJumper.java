package com.akucera.codeadvent.advent05;

import com.akucera.codeadvent.advent04.PassPhraseChecker;

import java.util.ArrayList;
import java.util.List;

public class RelativeJumper {
    public int escapeMaze(String input) {
        List<Integer> jumps = initMaze(input);

        return processJumps(jumps, false);
    }

    public int escapeComplicatedMaze(String input) {
        List<Integer> jumps = initMaze(input);

        return processJumps(jumps, true);
    }

    private List<Integer> initMaze(String input) {
        String[] lines = input.split("\\n");
        List<Integer> jumps = new ArrayList<>();

        for (String line : lines) {
            jumps.add(Integer.parseInt(line));
        }
        return jumps;
    }

    private int processJumps(List<Integer> jumps, boolean isComplex) {
        int next = 0, count = 1;

        while(true) {
            int curr = next;
            next = next + jumps.get(next);

            jumps.set(curr, updateCurrentJump(jumps, curr, isComplex));
            if (next < 0 || next >= jumps.size()) {
                return count;
            } else {
                count++;
            }
        }

    }

    private int updateCurrentJump(List<Integer> jumps, int curr, boolean isComplex) {
        if (isComplex) {
            if (jumps.get(curr) >= 3) {
                return jumps.get(curr) - 1;
            }
        }
        return jumps.get(curr) + 1;
    }
}
