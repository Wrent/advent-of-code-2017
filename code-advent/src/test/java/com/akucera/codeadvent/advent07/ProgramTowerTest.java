package com.akucera.codeadvent.advent07;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProgramTowerTest {

    private ProgramTower programTower;

    @Before
    public void setUp() throws Exception {
        programTower = new ProgramTower();
    }

    @Test
    public void testProvidedData() throws Exception {
        String input = "pbga (66)\n" +
                "xhth (57)\n" +
                "ebii (61)\n" +
                "havc (66)\n" +
                "ktlj (57)\n" +
                "fwft (72) -> ktlj, cntj, xhth\n" +
                "qoyq (66)\n" +
                "padx (45) -> pbga, havc, qoyq\n" +
                "tknk (41) -> ugml, padx, fwft\n" +
                "jptl (61)\n" +
                "ugml (68) -> gyxo, ebii, jptl\n" +
                "gyxo (61)\n" +
                "cntj (57)";
        assertThat(programTower.getBottomProgramName(input), is("tknk"));
    }

    @Test
    public void testRequiredChange() throws Exception {
        testProvidedData();
        assertThat(programTower.getRequiredWeightChange(), is(60));
    }
}
