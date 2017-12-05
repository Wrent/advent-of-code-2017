package com.akucera.codeadvent.advent05;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RelativeJumperTest {

    private RelativeJumper relativeJumper;

    @Before
    public void setUp() throws Exception {
        relativeJumper = new RelativeJumper();
    }

    @Test
    public void testProvidedValues() throws Exception {
        String input = "0\n3\n0\n1\n-3";
        assertThat(relativeJumper.escapeMaze(input), is(5));
    }

    @Test
    public void testComplicatedValues() throws Exception {
        String input = "0\n3\n0\n1\n-3";
        assertThat(relativeJumper.escapeComplicatedMaze(input), is(10));
    }
}
