package com.akucera.codeadvent.advent03;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 147  142  133  122   59
     304    5    4    2   57
     330   10    1    1   54
     351   11   23   25   26
     362  747  806--->   ...

     0 0-0
     1 1-0
     2 1-1
     3 1-2
     4 1-3
     5 1-4
     6 1-5
     7 1-6
     8 1-7
     9 1-8
     10 2-0
     11 2-1
     12 2-2
     13 2-3
     14 2-4
     15 2-5

     */

//
//    public int greaterThanSum(int input) {
//        List<Integer> list = new ArrayList<>();
//        int i = 0;
//        int val = 1;
//        list.add(i++, val);
//
//        while (true) {
//            val = calculateValFor(i, list);
//            list.add(i++, val);
//
//            if (val > input) {
//                return val;
//            }
//        }
//    }
//
//    /**
//     *
//     17  16  15  14  13
//     18   5   4   3  12
//     19   6   1   2  11
//     20   7   8   9  10
//     21  22  23  24  25 ...
//
//     1 .. 3 .. 5 .. 7
//     */
//
//    private int calculateValFor(int i, List<Integer> list) {
//        Coords coords = mapToCoord(i);
//        //only from my current and previous radius
//        //maximum four
//        //and maximum three from the previous radius
//        int sum = 0;
//
//        //previous in my radius
//        if (coords.order > 0) {
//            sum += getValueFor(new Coords(coords.radius, coords.order -1), list);
//        }
//        //orthogonal in previous radius
//        sum += getValueFor(getOrthogonal(coords), list);
//        //two diagonals
//        return sum;
//    }
//
//    /**
//     * 2,7 2,6 2,5 2,4 2,3
//     * 2,8 1,3 1,2 1,1 2,2
//     * 2,9 1,4 0,0 1,0 2,1
//       2,10 1,5 1,6 1,7 2,0
//       2,11 2,12 2,13 2,14 2,15
//     */
//
//    protected Coords getOrthogonal(Coords coords) {
//        int radius = coords.radius - 1;
//        int order = 0;
//        return new Coords(radius, order);
//    }
//
//    private int getValueFor(Coords coords, List<Integer> list) {
//        if (coords == null) {
//            return 0;
//        }
//        Integer integer = list.get(mapToArrayPos(coords));
//        if (integer != null) {
//            return integer;
//        } else {
//            return 0;
//        }
//    }
//
//
//    protected Coords mapToCoord(int pos) {
//        if (pos == 0) {
//            return new Coords(0,0);
//        }
//        if (pos < 10) {
//            int order = pos - 1;
//            return new Coords(1, order);
//        }
//        int radius = calculateRadius(pos);
//        int order = (int) (pos - 1 - Math.pow(1 + 2*(radius -1), 2));
//        return new Coords(radius, order);
//    }
//
//    protected int mapToArrayPos(Coords coords) {
//        if (coords.radius == 0) {
//            return 0;
//        }
//        if (coords.radius == 1) {
//            return (int) (Math.pow(1 + 2*(coords.radius-1), 2) + coords.order);
//        }
//        return (int) (Math.pow(1 + 2*(coords.radius-1), 2) + coords.order + 1);
//    }
//
//    public static class Coords {
//        public int radius;
//        public int order;
//
//        public Coords(int radius, int order) {
//            this.radius = radius;
//            this.order = order;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Coords coords = (Coords) o;
//
//            if (radius != coords.radius) return false;
//            return order == coords.order;
//        }
//
//        @Override
//        public int hashCode() {
//            int result = radius;
//            result = 31 * result + order;
//            return result;
//        }
//
//        @Override
//        public String toString() {
//            return "Coords{" +
//                    "radius=" + radius +
//                    ", order=" + order +
//                    '}';
//        }
//    }
}
