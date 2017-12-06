package com.akucera.codeadvent.advent06;

import java.util.*;

public class MemoryBlocks {

    public int countBlockJumps(String input) {
        int i = 1;
        List<Integer> blocks = parseInput(input);
        Set<String> configurations = new HashSet<>();

        saveConfiguration(blocks, configurations);

        while (true) {
            blocks = redistribute(blocks);

            if (configurations.contains(getSignature(blocks))) {
                return i;
            }
            saveConfiguration(blocks, configurations);
            i++;
        }
    }

    public int countLoopSize(String input) {
        int i = 1;
        List<Integer> blocks = parseInput(input);
        Map<String, Configuration> configurations = new HashMap<>();

        saveConfigurationsForLoopSize(blocks, configurations, i);

        while (true) {
            blocks = redistribute(blocks);

            String signature = getSignature(blocks);
            if (configurations.containsKey(signature)) {
                return i - configurations.get(signature).getOrder();
            }
            saveConfigurationsForLoopSize(blocks, configurations, i);
            i++;
        }
    }

    private List<Integer> redistribute(List<Integer> blocks) {
        int index = getMaxIndex(blocks);
        int toRedistribute = blocks.get(index);
        blocks.set(index, 0);
        int offset = 1;
        while (toRedistribute > 0) {
            blocks.set((index + offset) % blocks.size(), blocks.get((index + offset) % blocks.size()) + 1);
            offset++;
            toRedistribute--;
        }
        return blocks;
    }

    private int getMaxIndex(List<Integer> blocks) {
        int max = -1;
        int maxIndex = -1;
        for (int i = blocks.size() - 1; i >= 0; i--) {
            if (blocks.get(i) >= max) {
                max = blocks.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void saveConfigurationsForLoopSize(List<Integer> blocks, Map<String, Configuration> configurations, int order) {
        String res = getSignature(blocks);
        configurations.put(res, new Configuration(res, order));
    }

    private void saveConfiguration(List<Integer> blocks, Set<String> configurations) {
        String res = getSignature(blocks);
        configurations.add(res);
    }

    private String getSignature(List<Integer> blocks) {
        StringBuilder sb = new StringBuilder();

        for (Integer block : blocks) {
            sb.append(block);
        }

        return sb.toString();
    }

    private List<Integer> parseInput(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input);
        List<Integer> blocks = new ArrayList<>();


        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            token = token.trim();
            blocks.add(Integer.parseInt(token));
        }
        return blocks;
    }
}
