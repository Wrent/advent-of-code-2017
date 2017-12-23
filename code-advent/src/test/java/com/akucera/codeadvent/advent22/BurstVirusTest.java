package com.akucera.codeadvent.advent22;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BurstVirusTest {
    private BurstVirus burstVirus;

    @Before
    public void setUp() throws Exception {
        burstVirus = new BurstVirus();
    }

    @Test
    public void testProvided() {
        String input = "..#\n" +
                "#..\n" +
                "...";

        assertThat(burstVirus.countInfectingBursts(input, 10000), is(5587));
    }

    @Test
    public void testEvolved() {
        String input = "..#\n" +
                "#..\n" +
                "...";

        assertThat(burstVirus.countInfectingBurstsEvolved(input, 100), is(26L));
        assertThat(burstVirus.countInfectingBurstsEvolved(input, 10000000), is(2511944L));
    }
}
