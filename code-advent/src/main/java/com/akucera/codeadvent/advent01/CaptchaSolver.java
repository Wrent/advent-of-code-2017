package com.akucera.codeadvent.advent01;

import org.springframework.stereotype.Component;

@Component
public class CaptchaSolver {

    public int solve(String input) {

        int sum = 0;

        int prev = Character.getNumericValue(input.charAt(input.length() - 1));

        for (int i = 0; i < input.length(); i++) {
            int current = Character.getNumericValue(input.charAt(i));

            if (current == prev) {
                sum += current;
            }

            prev = current;
        }

        return sum;
    }

}
