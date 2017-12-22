package com.akucera.codeadvent.advent18;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DuetTest {

    private Duet duet;

    @Before
    public void setUp() throws Exception {
        duet = new Duet();
    }

    @Test
    public void testDuet() {
        String input = "set a 1\n" +
                "add a 2\n" +
                "mul a a\n" +
                "mod a 5\n" +
                "snd a\n" +
                "set a 0\n" +
                "rcv a\n" +
                "jgz a -1\n" +
                "set a 1\n" +
                "jgz a -2";
        assertThat(duet.getFirstRecoveredFrequency(input), is(4L));
    }

    @Test
    public void testMultiThread() {
        String input = "snd b\n" +
                "snd a\n" +
                "snd p\n" +
                "rcv a\n" +
                "rcv b\n" +
                "rcv c\n" +
                "rcv d";
        assertThat(duet.getNumberOfSends(input), is(3L));
    }
}
