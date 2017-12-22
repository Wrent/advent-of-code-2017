package com.akucera.codeadvent.advent20;

import java.util.*;

public class Particles {
    private Set<Particle> particles = new HashSet<>();

    public Particles(String input) {
        String[] split = input.split("\n");

        int i = 0;
        for (String line : split) {
            particles.add(new Particle(line, i++));
        }
    }

    public void doIterations(int count) {
        for (int i = 0; i < count; i++) {
            for (Particle particle : particles ) {
                particle.iterate();
            }
        }
    }

    public void doIterationsWithCollisions(int count) {
        for (int i = 0; i < count; i++) {
            for (Particle particle : particles ) {
                particle.iterate();
            }
            resolveCollisions();
        }
    }

    private void resolveCollisions() {
        Map<Position, List<Particle>> particleMap = new LinkedHashMap<>();
        particles.forEach(p -> {
            List<Particle> particles = particleMap.computeIfAbsent(p.getPosition(), k -> new ArrayList<>());
            particles.add(p);
            particleMap.put(p.getPosition(), particles);
        });

        for (Position key : particleMap.keySet()) {
            List<Particle> particles = particleMap.get(key);
            if (particles.size() > 1) {
                this.particles.removeAll(particles);
            }
        }
    }

    public int getClosestToZero() {
        Optional<Particle> min = particles.stream()
                .min(Comparator.comparingLong(Particle::getSum));
        if (min.isPresent()) {
            return min.get().getId();
        }
        else {
            return 0;
        }
    }

    public int countParticles() {
        return particles.size();
    }
}
