package com.akucera.codeadvent.advent21;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ComputerArtTest {
    private ComputerArt computerArt;

    @Before
    public void setUp() throws Exception {
        computerArt = new ComputerArt();
    }

    @Test
    public void testProvided() {
        String input = "../.# => ##./#../...\n" +
                ".#./..#/### => #..#/..../..../#..#";

        assertThat(computerArt.countPixelsOn(input, 2), is(12));
    }
}
