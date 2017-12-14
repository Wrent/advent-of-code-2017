package com.akucera.codeadvent.advent14;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akucera on 14.12.17.
 */
public class DiskDefragmenterTest {

    private DiskDefragmenter diskDefragmenter;

    @Before
    public void setUp() throws Exception {
        diskDefragmenter = new DiskDefragmenter();

    }

    @Test
    public void testProvided() throws Exception {
        assertThat(diskDefragmenter.countFullBlocks("flqrgnkx"), is(8108));
    }

    @Test
    public void testRegions() throws Exception {
        assertThat(diskDefragmenter.countRegions("flqrgnkx"), is(1242));


    }
}
