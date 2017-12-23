package com.akucera.codeadvent.advent22;

import com.akucera.codeadvent.advent11.Position;
import com.akucera.codeadvent.advent19.PacketMaze;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BurstVirus {
    Position current = new Position(0, 0);
    Set<Position> infected = new HashSet<>();
    Map<Position, String> interesting = new HashMap<>();
    PacketMaze.Direction direction = PacketMaze.Direction.NORTH;

    public int countInfectingBursts(String input, int bursts) {
        addInfected(input);

        int cnt = 0;
        for (int i = 0; i < bursts; i++) {
            boolean isInfected = infected.contains(current);
            if (isInfected) {
                direction = direction.turnRight();
                infected.remove(current);
            } else {
                direction = direction.turnLeft();
                infected.add(current);
                cnt++;
            }
            current = direction.move(current);
        }
        return cnt;
    }

    private void addInfected(String input) {
        String[] lines = input.split("\n");
        int middle = lines.length / 2;

        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines.length; j++) {
                if (lines[i].charAt(j) == '#') {
                    Position pos = new Position(j - middle, i - middle);
                    infected.add(pos);
                    interesting.put(pos, "#");
                }
            }
        }
    }

    public long countInfectingBurstsEvolved(String input, int bursts) {
        addInfected(input);

        long cnt = 0;
        for (int i = 0; i < bursts; i++) {
            String state = interesting.get(current);
            if (state == null) {
                //clean
                interesting.put(current, "W");
                direction = direction.turnLeft();
            } else if (state.equals("#")) {
                //infected
                interesting.put(current, "F");
                direction = direction.turnRight();
            } else if (state.equals("W")) {
                //weakened
                interesting.put(current, "#");
                cnt++;
            } else if (state.equals("F")) {
                //flagged
                interesting.remove(current);
                direction = direction.turnLeft().turnLeft();
            }
            current = direction.move(current);
        }
        return cnt;
    }
}
