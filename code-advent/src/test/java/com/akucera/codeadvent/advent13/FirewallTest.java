package com.akucera.codeadvent.advent13;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akucera on 13.12.17.
 */
public class FirewallTest {
    private Firewall firewall;

    @Before
    public void setUp() throws Exception {
        String input = "0: 3\n" +
                "1: 2\n" +
                "4: 4\n" +
                "6: 4";
        firewall = new Firewall(input);

    }

    @Test
    public void testProvided() throws Exception {
        assertThat(firewall.countSeverity(0), is(24));
    }

    @Test
    public void testDelay() throws Exception {
        assertThat(firewall.countMinimalDelay(), is(10));
    }
}


