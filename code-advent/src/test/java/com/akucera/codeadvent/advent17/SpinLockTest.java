package com.akucera.codeadvent.advent17;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akucera on 17.12.17.
 */
public class SpinLockTest {

    private SpinLock spinLock;

    @Before
    public void setUp() throws Exception {
        spinLock = new SpinLock();

    }

    @Test
    public void testProvided() throws Exception {
        assertThat(spinLock.getNext(10, 3), is(5));

    }
}
