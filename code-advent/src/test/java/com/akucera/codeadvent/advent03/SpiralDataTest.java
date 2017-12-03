package com.akucera.codeadvent.advent03;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class SpiralDataTest {

    private SpiralData spiralData;

    @Before
    public void setUp() throws Exception {
        spiralData = new SpiralData();
    }

    @Test
    public void testCalculatePath() throws Exception {
        assertThat(spiralData.calculatePath(1), is(0));
        assertThat(spiralData.calculatePath(12), is(3));
        assertThat(spiralData.calculatePath(23), is(2));
        assertThat(spiralData.calculatePath(1024), is(31));
    }


    @Test
    public void testDistanceFromRowCenter() throws Exception {
        assertThat(spiralData.calculateDistanceFromRowCenter(1, spiralData.calculateRadius(1)), is(0));
        assertThat(spiralData.calculateDistanceFromRowCenter(2, spiralData.calculateRadius(2)), is(0));
        assertThat(spiralData.calculateDistanceFromRowCenter(6, spiralData.calculateRadius(6)), is(0));
        assertThat(spiralData.calculateDistanceFromRowCenter(5, spiralData.calculateRadius(5)), is(1));
        assertThat(spiralData.calculateDistanceFromRowCenter(9, spiralData.calculateRadius(9)), is(1));
        assertThat(spiralData.calculateDistanceFromRowCenter(11, spiralData.calculateRadius(11)), is(0));
        assertThat(spiralData.calculateDistanceFromRowCenter(15, spiralData.calculateRadius(15)), is(0));
        assertThat(spiralData.calculateDistanceFromRowCenter(13, spiralData.calculateRadius(13)), is(2));
        assertThat(spiralData.calculateDistanceFromRowCenter(14, spiralData.calculateRadius(14)), is(1));
        assertThat(spiralData.calculateDistanceFromRowCenter(21, spiralData.calculateRadius(21)), is(2));
        assertThat(spiralData.calculateDistanceFromRowCenter(25, spiralData.calculateRadius(25)), is(2));
    }

//    @Test
//    public void testGetOrthogonal() throws Exception {
//        assertThat(spiralData.getOrthogonal(new SpiralData.Coords(1, 0)), is(new SpiralData.Coords(0,0)));
//        assertThat(spiralData.getOrthogonal(new SpiralData.Coords(1, 2)), is(new SpiralData.Coords(0,0)));
//        assertThat(spiralData.getOrthogonal(new SpiralData.Coords(1, 1)), nullValue());
//        assertThat(spiralData.getOrthogonal(new SpiralData.Coords(2, 0)), is(new SpiralData.Coords(1,8)));
//        assertThat(spiralData.getOrthogonal(new SpiralData.Coords(2, 2)), is(new SpiralData.Coords(1,1)));
//        assertThat(spiralData.getOrthogonal(new SpiralData.Coords(2, 12)), is(new SpiralData.Coords(1,5)));
//    }

    /**
     *
     17  16  15  14  13
     18   5   4   3  12
     19   6   1   2  11
     20   7   8   9  10
     21  22  23  24  25 ...

     1 .. 3 .. 5 .. 7
     */



    @Test
    public void testCalculateRadius() throws Exception {
        assertThat(spiralData.calculateRadius(1), is(0));
        assertThat(spiralData.calculateRadius(2), is(1));
        assertThat(spiralData.calculateRadius(5), is(1));
        assertThat(spiralData.calculateRadius(7), is(1));
        assertThat(spiralData.calculateRadius(9), is(1));
        assertThat(spiralData.calculateRadius(10), is(2));
        assertThat(spiralData.calculateRadius(21), is(2));
        assertThat(spiralData.calculateRadius(25), is(2));
        assertThat(spiralData.calculateRadius(26), is(3));
    }


    /**
     * 147  142  133  122   59
     304    5    4    2   57
     330   10    1    1   54
     351   11   23   25   26
     362  747  806--->   ...
     */
//    @Test
//    public void testGreaterThanSum() throws Exception {
//        assertThat(spiralData.greaterThanSum(1), is(2));
//        assertThat(spiralData.greaterThanSum(2), is(4));
//        assertThat(spiralData.greaterThanSum(5), is(10));
//        assertThat(spiralData.greaterThanSum(7), is(10));
//        assertThat(spiralData.greaterThanSum(142), is(147));
//        assertThat(spiralData.greaterThanSum(800), is(806));
//    }
//
//    /**
//     * 0 0-0
//     1 1-0
//     2 1-1
//     3 1-2
//     4 1-3
//     5 1-4
//     6 1-5
//     7 1-6
//     8 1-7
//     9 1-8
//     10 2-0
//     11 2-1
//     12 2-2
//     13 2-3
//     14 2-4
//     15 2-5
//     */
//
//    @Test
//    public void testMapToArrayPos() throws Exception {
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(0, 0)), is(0));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(1, 0)), is(1));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(1, 1)), is(2));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(1, 4)), is(5));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(1, 8)), is(9));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(2, 3)), is(13));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(2, 5)), is(15));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(2, 15)), is(25));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(3, 0)), is(26));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(3, 23)), is(49));
//        assertThat(spiralData.mapToArrayPos(new SpiralData.Coords(4, 0)), is(50));
//    }
//
//    @Test
//    public void testMapToCoord() throws Exception {
//        assertThat(spiralData.mapToCoord(0), is(new SpiralData.Coords(0, 0)));
//        assertThat(spiralData.mapToCoord(1), is(new SpiralData.Coords(1, 0)));
//        assertThat(spiralData.mapToCoord(5), is(new SpiralData.Coords(1, 4)));
//        assertThat(spiralData.mapToCoord(9), is(new SpiralData.Coords(1, 8)));
//        assertThat(spiralData.mapToCoord(13), is(new SpiralData.Coords(2, 3)));
//        assertThat(spiralData.mapToCoord(25), is(new SpiralData.Coords(2, 15)));
//        assertThat(spiralData.mapToCoord(26), is(new SpiralData.Coords(3, 0)));
//        assertThat(spiralData.mapToCoord(50), is(new SpiralData.Coords(4, 0)));
//    }
}
