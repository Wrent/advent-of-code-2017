package com.akucera.codeadvent.advent03;

import org.springframework.stereotype.Component;

@Component
public class SpiralData {



    public int calculatePath(int pos) {
        int radius = calculateRadius(pos);
        int distanceFromRowCenter = calculateDistanceFromRowCenter(pos, radius);

        return radius + distanceFromRowCenter;
    }

    protected int calculateDistanceFromRowCenter(int pos, int radius) {
        int topCircleNumber = (int) Math.pow(1 + 2*radius, 2);
        int topRowNumber = getTopRowNumber(pos, topCircleNumber, radius);
        if (topRowNumber == 1) {
            return 0;
        }
        int middleRowNumber = topRowNumber - radius;


        return Math.abs(middleRowNumber - pos);
    }

    private int getTopRowNumber(int pos, int topCircleNumber, int radius) {
        int val = topCircleNumber;
        while (val - 2*radius > pos) {
            val -= 2*radius;
        }
        return val;
    }

    protected int calculateRadius(int pos) {
        int i = 1;
        int j = 0;

        while (Math.pow(i, 2) < pos) {
            i += 2;
            j++;
        }
        return j;
    }


    public int greaterThanSum(int input) {
       int[][] array = new int[225][225];
       for (int i = 0; i < 225; i++) {
           for (int j = 0; j < 225; j++) {
               array[i][j] = 0;
           }
       }
       int val = 1;
       Coord coord = new Coord(112, 112);
       Direction direction = Direction.RIGHT;
       array[coord.x][coord.y] = val;

       while (true) {
           coord = direction.move(coord);
           direction = changeDirection(direction, coord, array);
           val = calculateVal(coord, array);
           array[coord.x][coord.y] = val;

           if (val > input) {
               return val;
           }
       }
    }

    private int calculateVal(Coord coord, int[][] array) {
        return array[coord.x - 1][coord.y - 1] +
                array[coord.x - 1][coord.y] +
                array[coord.x - 1][coord.y + 1] +
                array[coord.x][coord.y + 1] +
                array[coord.x][coord.y - 1] +
                array[coord.x + 1][coord.y] +
                array[coord.x + 1][coord.y - 1] +
                array[coord.x + 1][coord.y + 1];
    }

    private Direction changeDirection(Direction direction, Coord coord, int[][] array) {
        //check if we should change direction already
        Direction onLeft = direction.onLeft();
        Coord coordOnLeft = onLeft.move(coord);
        if (array[coordOnLeft.x][coordOnLeft.y] == 0) {
            return onLeft;
        }
        else {
            return direction;
        }
    }
}
