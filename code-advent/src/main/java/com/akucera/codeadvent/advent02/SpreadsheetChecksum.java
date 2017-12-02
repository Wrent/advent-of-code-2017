package com.akucera.codeadvent.advent02;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
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

    public int calculateDivisibleChecksum(String provided) {
        int sum = 0;

        String[] lines = provided.split("\\n");

        for (String line : lines) {
            sum += processDivisibleLine(line);
        }

        return sum;
    }

    private int processDivisibleLine(String line) {
        final StringTokenizer tokenizer = new StringTokenizer(line);
        final List<Integer> parsedValues = new ArrayList<>();

        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            token = token.trim();
            int value = Integer.parseInt(token);
            parsedValues.add(value);
        }

        for (int i = 0; i < parsedValues.size(); i++) {
            for (int j = i + 1; j < parsedValues.size(); j++) {
                final Integer first = parsedValues.get(i);
                final Integer second = parsedValues.get(j);
                if (first % second == 0 || second % first == 0) {
                    return Math.max(first, second) / Math.min(first, second);
                }
            }
        }
        return 0;
    }
}
