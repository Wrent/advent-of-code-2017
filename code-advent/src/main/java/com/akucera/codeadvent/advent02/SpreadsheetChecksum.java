package com.akucera.codeadvent.advent02;

import org.springframework.stereotype.Component;

import java.util.StringTokenizer;

@Component
public class SpreadsheetChecksum {
    public int calculateChecksum(String input) {
        int sum = 0;

        String[] lines = input.split("\\n");

        for (String line : lines) {
            sum += processLine(line);
        }

        return sum;
    }

    private int processLine(String line) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        StringTokenizer tokenizer = new StringTokenizer(line);

        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            token = token.trim();
            int value = Integer.parseInt(token);

            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        return max - min > 0 ? max - min : 0;
    }
}
