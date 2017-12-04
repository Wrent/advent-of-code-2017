package com.akucera.codeadvent.advent04;

import org.springframework.stereotype.Component;

import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

@Component
public class PassPhraseChecker {

    public int checkNumberOfValidPassPhrases(String input) {
        String[] lines = input.split("\\n");

        int sum = 0;

        for (String line : lines) {
            sum += processPassPhrase(line);
        }

        return sum;
    }

    private int processPassPhrase(String line) {
        final StringTokenizer tokenizer = new StringTokenizer(line);
        final Set<String> words = new HashSet<>();

        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            token = token.trim();

            if (words.contains(token)) {
                return 0;
            }

            words.add(token);
        }
        return 1;
    }

    public int checkNumberOfNonAnagrams(String input) {
        String[] lines = input.split("\\n");

        int sum = 0;

        for (String line : lines) {
            sum += processAnagram(line);
        }

        return sum;
    }

    private int processAnagram(String line) {
        final StringTokenizer tokenizer = new StringTokenizer(line);
        final Set<String> words = new HashSet<>();

        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            token = token.trim();

            String[] splitted = token.split("");
            Arrays.sort(splitted, Collator.getInstance());
            String sorted = new String();
            for (String substr : splitted) {
                sorted += substr;
            }

            if (words.contains(sorted)) {
                return 0;
            }

            words.add(sorted);
        }
        return 1;
    }
}
