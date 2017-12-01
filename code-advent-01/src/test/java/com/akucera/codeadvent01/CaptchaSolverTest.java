package com.akucera.codeadvent01;

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
}
