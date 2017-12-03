package com.akucera.codeadvent.advent01;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class CaptchaSolverTest {

    private CaptchaSolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new CaptchaSolver();
    }

    @Test
    public void testProvidedValues() throws Exception {
        assertThat(solver.solve("1122"), is(3));
        assertThat(solver.solve("1111"), is(4));
        assertThat(solver.solve("1234"), is(0));
        assertThat(solver.solve("91212129"), is(9));
    }

    @Test
    public void testProvidedValuesForHalfway() throws Exception {
        assertThat(solver.solveHalfWay("1212"), is(6));
        assertThat(solver.solveHalfWay("1221"), is(0));
        assertThat(solver.solveHalfWay("123425"), is(4));
        assertThat(solver.solveHalfWay("123123"), is(12));
        assertThat(solver.solveHalfWay("12131415"), is(4));
    }
}
