package com.akucera.codeadvent.advent07;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Program {
    private String name;
    private int weight;
    private List<String> children;
    public Integer sumWeight = 0;

    public Program(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);
        name = tokenizer.nextToken().trim();
        String weightToken = tokenizer.nextToken().trim();
        weight = Integer.parseInt(weightToken.substring(1, weightToken.length() - 1));
        children = new ArrayList<>();


        if (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();

            while (tokenizer.hasMoreTokens()) {
                String childToken = tokenizer.nextToken().trim();
                if (childToken.contains(",")) {
                    childToken = childToken.substring(0, childToken.length() - 1);
                }
                children.add(childToken);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public List<String> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return name +":" + sumWeight +"("+weight+")" + " -> " + children +"\n";
    }
}
