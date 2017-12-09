package com.akucera.codeadvent.advent09;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GarbageStreamTest {

    private GarbageStream stream;

    @Before
    public void setUp() throws Exception {
        stream = new GarbageStream();
    }

    @Test
    public void testProvidedData() throws Exception {
        assertThat(stream.getScoreOfGroups("{}"), is(1));
        assertThat(stream.getScoreOfGroups("{{{}}}"), is(6));
        assertThat(stream.getScoreOfGroups("{{{},{},{{}}}}"), is(16));
        assertThat(stream.getScoreOfGroups("{<a>,<a>,<a>,<a>}"), is(1));
        assertThat(stream.getScoreOfGroups("{{<ab>},{<ab>},{<ab>},{<ab>}}"), is(9));
        assertThat(stream.getScoreOfGroups("{{<a!>},{<a!>},{<a!>},{<ab>}}"), is(3));
    }

    @Test
    public void testRemoveGarbage() throws Exception {
        assertThat(stream.countGarbage("<>"), is(0));
        assertThat(stream.countGarbage("<random characters>"), is(17));
        assertThat(stream.countGarbage("<<<<>"), is(3));
        assertThat(stream.countGarbage("<{!>}>"), is(2));
        assertThat(stream.countGarbage("<!!>"), is(0));
        assertThat(stream.countGarbage("<!!!>>"), is(0));
        assertThat(stream.countGarbage("<{o\"i!a,<{i<a>"), is(10));
    }
}
