package com.akucera.codeadvent.advent10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by akucera on 10.12.17.
 */
public class KnotHash {
    int curr = 0;
    int skip = 0;

    public int getHash(int size, String input) {
        List<Integer> lengths = new CopyOnWriteArrayList<>();
        List<Integer> rope = new CopyOnWriteArrayList<>();

        String[] split = input.split(",");
        for (String num : split) {
            num = num.trim();
            lengths.add(Integer.parseInt(num));
        }

        for (int i = 0; i < size; i++) {
            rope.add(i);
        }

        int curr = 0;
        int skip = 0;

        for (Integer len : lengths) {
            rope = reverse(rope, curr, len);
            curr = curr + len + skip;
            skip++;
        }

        return rope.get(0) * rope.get(1);
    }

    public String getStringHash(int size, String input) {
        List<Integer> lengths = new CopyOnWriteArrayList<>();
        List<Integer> rope = new CopyOnWriteArrayList<>();

        char[] chars = input.toCharArray();
        for (char c : chars) {
            lengths.add((int) c);
        }
        lengths.add(17);
        lengths.add(31);
        lengths.add(73);
        lengths.add(47);
        lengths.add(23);

        for (int i = 0; i < size; i++) {
            rope.add(i);
        }


        curr = 0;
        skip = 0;
        for (int i = 0; i < 64; i++) {
            for (Integer len : lengths) {
                rope = reverse(rope, curr, len);
                curr = curr + len + skip;
                skip++;
            }
        }

        List<Integer> sparse = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            int res = rope.get(i*16 + 0);
            for (int j = 1; j < 16; j++) {
                res = res ^ rope.get(i*16 + j);
            }
            sparse.add(res);
        }

        StringBuilder builder = new StringBuilder();
        for (Integer num : sparse) {
            if (num < 16) {
                builder.append("0");
            }
            builder.append(Integer.toHexString(num));
        }
        return builder.toString();
    }

    private List<Integer> reverse(List<Integer> rope, int curr, Integer len) {
        int s, e;
        s = m(curr, rope);
        e = m(curr + len, rope);

        //not going through the end
        if (s <= e) {
            List<Integer> prevList = new CopyOnWriteArrayList<>(rope.subList(0, s));
            List<Integer> sublist = new CopyOnWriteArrayList<>(rope.subList(s, e));
            List<Integer> nextList = new CopyOnWriteArrayList<>(rope.subList(e, rope.size()));
            Collections.reverse(sublist);
            List<Integer> newList = Stream.concat(prevList.stream(), sublist.stream())
                    .collect(Collectors.toList());
            return Stream.concat(newList.stream(), nextList.stream()).collect(Collectors.toList());
        } else {
            List<Integer> endList = new CopyOnWriteArrayList<>(rope.subList(s, rope.size()));
            int endSize = endList.size();
            List<Integer> startList = new CopyOnWriteArrayList<>(rope.subList(0, e));
            List<Integer> restList = new CopyOnWriteArrayList<>(rope.subList(e, s));

            endList.addAll(startList);
            Collections.reverse(endList);

            List<Integer> newList = new CopyOnWriteArrayList<>();
            newList.addAll(endList.subList(endSize, endList.size()));
            newList.addAll(restList);
            newList.addAll(endList.subList(0, endSize));
            return newList;
        }
    }

    private int m(int v, List<Integer> list) {
        return v % list.size();
    }
}
