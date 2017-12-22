package com.akucera.codeadvent.advent20;

import com.akucera.codeadvent.advent19.PacketMaze;

import java.util.StringTokenizer;

public class Particle {
    private long sum = 0;
    private int id;
    private Position position;
    private Position velocity;
    private Position acceleration;

    public Particle(String line, int id) {
        this.id = id;
        StringTokenizer tokenizer = new StringTokenizer(line);
        position = new Position(tokenizer.nextToken());
        velocity = new Position(tokenizer.nextToken());
        acceleration = new Position(tokenizer.nextToken());
    }

    public Position getPosition() {
        return position;
    }

    public Position getVelocity() {
        return velocity;
    }

    public Position getAcceleration() {
        return acceleration;
    }

    public void iterate() {
        velocity.x += acceleration.x;
        velocity.y += acceleration.y;
        velocity.z += acceleration.z;
        position.x += velocity.x;
        position.y += velocity.y;
        position.z += velocity.z;

        sum = Math.abs(position.x) + Math.abs(position.y) + Math.abs(position.z);
    }

    public long getSum() {
        return sum;
    }

    public int getId() {
        return id;
    }
}
