package com.akucera.codeadvent.advent13;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by akucera on 13.12.17.
 */
public class Firewall {

    private List<Layer> layers;
    private boolean isCaught;

    public Firewall(String input) {
        String[] lines = input.split("\n");

        layers = processLines(lines);
    }

    public int countSeverity(int delay) {
        int severity = 0;
        int time;

        isCaught = false;

        for (Layer layer : layers) {
            time = delay + layer.getDepth();

            if (layer.isOnTop(time)) {
                isCaught = true;
                severity += layer.getSeverity();
            }
        }

        return severity;
    }

    private List<Layer> processLines(String[] lines) {
        List<Layer> layers = new ArrayList<>();

        for (String line : lines) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            String token = tokenizer.nextToken().trim();
            int depth = Integer.parseInt(token.substring(0, token.length() - 1));
            int range = Integer.parseInt(tokenizer.nextToken().trim());

            layers.add(new Layer(depth, range));
        }

        return layers;
    }

    public int countMinimalDelay() {
        int delay = 0;
        while (true) {
            countSeverity(delay);
            if (!isCaught) {
                return delay;
            }
            delay++;
        }
    }
}
