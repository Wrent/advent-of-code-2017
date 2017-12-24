package com.akucera.codeadvent.advent24;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MagneticBridgeTest {
    private MagneticBridge magneticBridge = new MagneticBridge();

    @Before
    public void setUp() throws Exception {
        magneticBridge = new MagneticBridge();
    }

    @Test
    public void testProvided() {
        String input = "0/2\n" +
                "2/2\n" +
                "2/3\n" +
                "3/4\n" +
                "3/5\n" +
                "0/1\n" +
                "10/1\n" +
                "9/10";

        assertThat(magneticBridge.getStrongestStrength(input), is(31));
    }

    @Test
    public void testLongest() {
        String input = "0/2\n" +
                "2/2\n" +
                "2/3\n" +
                "3/4\n" +
                "3/5\n" +
                "0/1\n" +
                "10/1\n" +
                "9/10";

        assertThat(magneticBridge.getLongestStrength(input), is(19));
    }
}
