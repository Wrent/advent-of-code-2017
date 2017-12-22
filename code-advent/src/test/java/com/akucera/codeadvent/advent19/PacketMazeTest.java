package com.akucera.codeadvent.advent19;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PacketMazeTest {

    private PacketMaze packetMaze;

    @Before
    public void setUp() throws Exception {
        String input = "     |          \n" +
                "     |  +--+    \n" +
                "     A  |  C    \n" +
                " F---|----E|--+ \n" +
                "     |  |  |  D \n" +
                "     +B-+  +--+ \n";
        packetMaze = new PacketMaze(input);
    }

    @Test
    public void testProvided() {

        assertThat(packetMaze.getLetters(), is("ABCDEF"));
    }

    @Test
    public void countSteps() {
        assertThat(packetMaze.countSteps(), is(38));
    }
}
