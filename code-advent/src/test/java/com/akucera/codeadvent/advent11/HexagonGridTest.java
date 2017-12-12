package com.akucera.codeadvent.advent11;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HexagonGridTest {

    private HexagonGrid hexagonGrid;

    @Before
    public void setUp() throws Exception {
        hexagonGrid = new HexagonGrid();
    }

    @Test
    public void testProvidedData() throws Exception {
        assertThat(hexagonGrid.getShortestPath("ne,ne,ne"), is(3));
        assertThat(hexagonGrid.getShortestPath("ne,ne,sw,sw"), is(0));
        assertThat(hexagonGrid.getShortestPath("ne,ne,s,s"), is(2));
        assertThat(hexagonGrid.getShortestPath("se,sw,se,sw,sw"), is(3));
    }
}
