package com.akucera.codeadvent.advent20;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParticlesTest {

    private Particles particles;

    @Before
    public void setUp() throws Exception {
//        particles = new Particles();
    }



    @Test
    public void testMatcher() {
        Particle particle = new Particle("p=<-1085,-2438,-3723>, v=<49,-7,148>, a=<0,10,2>", 0);
        assertThat(particle.getPosition().x, is(-1085L));
        assertThat(particle.getVelocity().z, is(148L));
        assertThat(particle.getAcceleration().y, is(10L));
    }
}
