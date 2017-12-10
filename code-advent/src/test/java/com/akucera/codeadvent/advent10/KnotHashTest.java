package com.akucera.codeadvent.advent10;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akucera on 10.12.17.
 */
public class KnotHashTest {

    private KnotHash knot;

    @Before
    public void setUp() throws Exception {
        knot = new KnotHash();
    }

    @Test
    public void testProvided() throws Exception {
        assertThat(knot.getHash(5, "3, 4, 1, 5"), is(12));

    }

    @Test
    public void testStringHash() throws Exception {
        assertThat(knot.getStringHash(256, ""), is("a2582a3a0e66e6e86e3812dcb672a272"));
        assertThat(knot.getStringHash(256, "AoC 2017"), is("33efeb34ea91902bb2f59c9920caa6cd"));
        assertThat(knot.getStringHash(256, "1,2,3"), is("3efbe78a8d82f29979031a4aa0b16a9d"));
        assertThat(knot.getStringHash(256, "1,2,4"), is("63960835bcdc130f0b66d7ff4f6a5a8e"));
    }
}
