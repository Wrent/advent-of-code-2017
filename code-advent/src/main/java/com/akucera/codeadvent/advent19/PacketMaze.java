package com.akucera.codeadvent.advent19;


import com.akucera.codeadvent.advent11.Position;

public class PacketMaze {

    private String letters;
    private int steps = 1;

    public PacketMaze(String input) {
        String[] lines = input.split("\n");
        Pos pos = getStartPos(lines[0]);
        Direction direction = Direction.SOUTH;

        letters = "";

        while (true) {
            if (pos.isLetter(lines)) {
                letters = letters + pos.getChar(lines);
            }
            Pos next = direction.move(pos);
            if (next.isRoad(lines)) {
                pos = next;
                steps++;
            } else {
                direction = pos.turn(direction, lines);
                if (direction == null) {
                    break;
                }
            }
        }
    }

    public String getLetters() {
        return letters;
    }

    public int countSteps() {
        return steps;
    }

    private Pos getStartPos(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '|') {
                return new Pos(0, i);
            }
        }
        return null;
    }

    public enum Direction {
        SOUTH {
            @Override
            Pos move(Pos pos) {
                return new Pos(pos.row + 1, pos.col);
            }

            @Override
            public Direction turnRight() {
                return WEST;
            }

            @Override
            public Direction turnLeft() {
                return EAST;
            }

            @Override
            public Position move(Position current) {
                return new Position(current.x, current.y + 1);
            }
        },
        NORTH {
            @Override
            Pos move(Pos pos) {
                return new Pos(pos.row - 1, pos.col);
            }

            @Override
            public Direction turnRight() {
                return EAST;
            }

            @Override
            public Direction turnLeft() {
                return WEST;
            }

            @Override
            public Position move(Position current) {
                return new Position(current.x, current.y - 1);
            }
        },
        EAST {
            @Override
            Pos move(Pos pos) {
                return new Pos(pos.row, pos.col + 1);
            }

            @Override
            public Direction turnRight() {
                return SOUTH;
            }

            @Override
            public Direction turnLeft() {
                return NORTH;
            }

            @Override
            public Position move(Position current) {
                return new Position(current.x + 1, current.y);
            }
        },
        WEST {
            @Override
            Pos move(Pos pos) {
                return new Pos(pos.row, pos.col - 1);
            }

            @Override
            public Direction turnRight() {
                return NORTH;
            }

            @Override
            public Direction turnLeft() {
                return SOUTH;
            }

            @Override
            public Position move(Position current) {
                return new Position(current.x - 1, current.y);
            }
        };

        abstract Pos move(Pos pos);

        public static Direction getOpposite(Direction direction) {
            switch (direction) {
                case SOUTH:
                    return NORTH;
                case EAST:
                    return WEST;
                case NORTH:
                    return SOUTH;
                case WEST:
                    return EAST;
            }
            return null;
        }

        public abstract Direction turnRight();

        public abstract Direction turnLeft();

        public abstract Position move(Position current);
    }

    public static class Pos {
        public int row;
        public int col;

        public Pos(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public boolean isRoad(String[] lines) {
            Character c = getChar(lines);
            if (c == null) {
                return false;
            }
            return c == '|' || c == '-' || c == '+' || isLetter(lines);
        }

        public Character getChar(String[] lines) {
            if (row < 0 || row >= lines.length || col < 0 || col >= lines[row].length()) {
                return null;
            }
            char c = lines[row].charAt(col);
            return c;
        }

        public boolean isLetter(String[] lines) {
            Character c = getChar(lines);
            if (c == null) {
                return false;
            }
            return c != '+' && c != '|' && c != '-' && c != ' ';
        }

        public Direction turn(Direction direction, String[] lines) {
            Direction[] values = Direction.values();

            for (Direction d : values) {
                if (d.equals(direction) || d.equals(Direction.getOpposite(direction))) {
                    continue;
                }
                Pos next = d.move(this);
                if (next.isRoad(lines)) {
                    return d;
                }
            }
            return null;
        }
    }
}
