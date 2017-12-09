package com.akucera.codeadvent.advent09;

import java.util.*;

public class GarbageStream {

    private int garbageCnt = 0;

    public int getScoreOfGroups(String stream) {
        List<Group> groupList = parseGroups(stream);

        return groupList.stream()
                .mapToInt(group -> group.calculateScore(0))
                .sum();
    }

    public int countGarbage(String stream) {
        garbageCnt = 0;

        List<Group> groupList = parseGroups(stream);

        return garbageCnt;
    }

    private List<Group> parseGroups(String stream) {
        List<Group> groups = new ArrayList<>();
        Iterator<Character> iterator = characters(stream).iterator();

        while (iterator.hasNext()) {
            Character c = iterator.next();
            if (c == '{') {
                groups.add(parseNewGroup(iterator, null));
            } else if (c == '<') {
                parseGarbage(iterator);
            }
        }
        return groups;
    }

    private Group parseNewGroup(Iterator<Character> iterator, Group parent) {
        Group group = new Group(parent);

        while(iterator.hasNext()) {
            Character c = iterator.next();

            if (c == '!') {
                iterator.next();
            } else if (c == '<') {
                parseGarbage(iterator);
            } else if (c == '}') {
                return group;
            } else if (c == '{') {
               group.add(parseNewGroup(iterator, group));
            }
        }
        throw new RuntimeException();
    }

    private void parseGarbage(Iterator<Character> iterator) {
        while(iterator.hasNext()) {
            Character c = iterator.next();

            if (c == '!') {
                iterator.next();
            } else if (c == '>') {
                return;
            } else {
                garbageCnt++;
            }
        }
    }

    public static List<Character> characters(final String string) {
        return new AbstractList<Character>() {
            @Override
            public Character get(int index) {
                return string.charAt(index);
            }

            @Override
            public int size() {
                return string.length();
            }
        };
    }
}
