package com.akucera.codeadvent.advent11;

import java.util.ArrayList;
import java.util.List;

public class HexagonGrid {
    public int getShortestPath(String s) {
        List<Instruction> instructions = getInstructions(s);

        Position position = new Position(0, 0);
        for (Instruction instruction : instructions) {
            position = instruction.move(position);
        }

        return getPositionDistance(position);
    }

    public int getFurthestDistance(String s) {
        List<Instruction> instructions = getInstructions(s);

        Position position = new Position(0, 0);
        int distance = 0;
        for (Instruction instruction : instructions) {
            position = instruction.move(position);
            int calcDistance = getPositionDistance(position);
            if (calcDistance > distance) {
                distance = calcDistance;
            }
        }

        return distance;
    }

    private List<Instruction> getInstructions(String s) {
        String[] input = s.split(",");
        List<Instruction> instructions = new ArrayList<>();
        for (String i : input) {
            instructions.add(InstructionFactory.getInstruction(i));
        }
        return instructions;
    }

    private int getPositionDistance(Position position) {
        int xDiff = Math.abs(position.x);
        int yDiff = Math.abs(position.y) - xDiff;

        return xDiff + yDiff / 2;
    }
}
