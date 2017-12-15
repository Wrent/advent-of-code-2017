package com.akucera.codeadvent.advent15;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akucera on 15.12.17.
 */
public class GeneratorsTest {

    private Generators generators;

    @Before
    public void setUp() throws Exception {
        generators = new Generators();

    }

    @Test
    public void testProvided() throws Exception {
        assertThat(generators.getFinalCount("65", "8921"), is(588));

    }

    @Test
    public void testPicky() throws Exception {
        assertThat(generators.getPickyCount("65", "8921"), is(309));


    }
}
