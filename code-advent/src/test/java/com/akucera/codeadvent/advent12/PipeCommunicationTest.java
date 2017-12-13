package com.akucera.codeadvent.advent12;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akucera on 12.12.17.
 */
public class PipeCommunicationTest {

    private PipeCommunication pipeCommunication;

    @Before
    public void setUp() throws Exception {
        pipeCommunication = new PipeCommunication();
    }

    @Test
    public void testProvided() throws Exception {
        String input = "0 <-> 2\n" +
                "1 <-> 1\n" +
                "2 <-> 0, 3, 4\n" +
                "3 <-> 2, 4\n" +
                "4 <-> 2, 3, 6\n" +
                "5 <-> 6\n" +
                "6 <-> 4, 5";
        assertThat(pipeCommunication.countProgramsWithZero(input), is(6));

    }

    @Test
    public void testNumberOfGroups() throws Exception {
        String input = "0 <-> 2\n" +
                "1 <-> 1\n" +
                "2 <-> 0, 3, 4\n" +
                "3 <-> 2, 4\n" +
                "4 <-> 2, 3, 6\n" +
                "5 <-> 6\n" +
                "6 <-> 4, 5";
        assertThat(pipeCommunication.countNumberOfGroups(input), is(2));

    }
}
