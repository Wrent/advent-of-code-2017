package com.akucera.codeadvent.advent06;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MemoryBlocksTest {

    private MemoryBlocks memoryBlocks;

    @Before
    public void setUp() throws Exception {
        memoryBlocks = new MemoryBlocks();
    }

    @Test
    public void testMemoryBlocksProvidedData() throws Exception {
        String input = "0\t2\t7\t0";
        assertThat(memoryBlocks.countBlockJumps(input), is(5));
    }

    @Test
    public void testSizeOfLoopProvidedData() throws Exception {
        String input = "0\t2\t7\t0";
        assertThat(memoryBlocks.countLoopSize(input), is(4));
    }
}
