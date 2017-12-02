package com.akucera.codeadvent.advent02;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SpreadsheetChecksumTest {

    private SpreadsheetChecksum checksum;

    @Before
    public void setUp() throws Exception {
        checksum = new SpreadsheetChecksum();
    }

    @Test
    public void testProvidedValues() throws Exception {
        final String provided = "5 1 9 5\n" +
                "7 5 3\n" +
                "2 4 6 8";

        assertThat(checksum.calculateChecksum(provided), is(18));
    }
}
