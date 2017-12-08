package com.akucera.codeadvent.advent08;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RegisterInstructionsTest {

    private RegisterInstructions registerInstructions;

    @Before
    public void setUp() throws Exception {
        registerInstructions = new RegisterInstructions();
    }

    @Test
    public void testProvidedInstructions() throws Exception {
        String input = "b inc 5 if a > 1\n" +
                "a inc 1 if b < 5\n" +
                "c dec -10 if a >= 1\n" +
                "c inc -20 if c == 10";

        assertThat(registerInstructions.getHighestRegisterValue(input), is(1));
    }

    @Test
    public void testProvidedInstructionsHighestValue() throws Exception {
        String input = "b inc 5 if a > 1\n" +
                "a inc 1 if b < 5\n" +
                "c dec -10 if a >= 1\n" +
                "c inc -20 if c == 10";

        assertThat(registerInstructions.getHighestHeldValue(input), is(10));
    }
}
