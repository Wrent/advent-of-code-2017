package com.akucera.codeadvent.advent20;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Position {
    public long x;
    public long y;
    public long z;

    public Position(String s) {
        Pattern p = Pattern.compile("^.+=<(-?[0-9]+),(-?[0-9]+),(-?[0-9]+)>.*");

        Matcher matcher = p.matcher(s);
        matcher.find();
        x = Integer.parseInt(matcher.group(1));
        y = Integer.parseInt(matcher.group(2));
        z = Integer.parseInt(matcher.group(3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y &&
                z == position.z;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z);
    }
}
