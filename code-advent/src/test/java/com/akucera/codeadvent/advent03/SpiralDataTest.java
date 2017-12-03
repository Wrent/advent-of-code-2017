package com.akucera.codeadvent.advent03;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
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

    @Test
    public void testGreaterThanSum() throws Exception {
        assertThat(spiralData.greaterThanSum(1), is(2));
        assertThat(spiralData.greaterThanSum(2), is(4));
        assertThat(spiralData.greaterThanSum(5), is(10));
        assertThat(spiralData.greaterThanSum(7), is(10));
        assertThat(spiralData.greaterThanSum(142), is(147));
        assertThat(spiralData.greaterThanSum(800), is(806));
    }
}
