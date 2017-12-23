package com.akucera.codeadvent.advent21;

import com.akucera.codeadvent.advent20.Particle;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComputerArt {
    private List<List<Block>> blocks = new ArrayList<>();
    private Set<Pair<Block, Block>> patterns = new HashSet<>();

    public int countPixelsOn(String input, int iterations) {
        String firstBlock = ".#./" +
                "..#/" +
                "###";
        ArrayList<Block> list = new ArrayList<>();
        list.add(parseBlock(firstBlock));
        blocks.add(list);

        String[] lines = input.split("\n");
        for (String line : lines) {
            Pair<Block, Block> pattern = parsePattern(line);
            patterns.add(pattern);
            //possible performance TODO - remove variant calculations on the other place
//            Set<Block> variants = pattern.key.getVariants();
//            Set<Pair<Block, Block>> collect = variants.stream().map(v -> new Pair(v, pattern.value)).collect(Collectors.toSet());
//            patterns.addAll(collect);
        }

        for (int i = 0; i < iterations; i++) {
            for (List<Block> row : blocks) {
                for (Block block : row) {
                    replaceWithPattern(block);
                }
            }
            restructureBlocks();
        }

        return countOn();
    }

    private int countOn() {
        return blocks
                .stream()
                .flatMap(List::stream)
                .mapToInt(Block::countOn)
                .sum();
    }

    /**
     *  111 222 333
     *  111 222 333
     *  111 222 333
     *
     */
    private void restructureBlocks() {
        StringBuilder builder = new StringBuilder();
        for (List<Block> row : blocks) {
            for (int i = 0; i < row.get(0).spaces.length; i++) {
                for (int j = 0; j < row.size(); j++) {
                    builder.append(row.get(j).printRow(i));

                }
                builder.append("/");
            }
        }
        String grid = builder.toString();
        System.out.println(grid.replace("/", "\n"));

        blocks = parseBlocks(grid);
    }

    private List<List<Block>> parseBlocks(String grid) {
        String lines[] = grid.split("/");

        Block.BlockType type;
        if (lines.length % 2 == 0) {
            type = Block.BlockType.TWO;
        } else {
            type = Block.BlockType.THREE;
        }

        List<List<Block>> blocks = new ArrayList<>();
        for (int k = 0; k < lines.length / type.getSize(); k++) {
            List<Block> row = new ArrayList<>();
            for (int l = 0; l < lines.length / type.getSize(); l++) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < type.getSize(); i++) {
                    if (i != 0) {
                        builder.append("/");
                    }
                    for (int j = 0; j < type.getSize(); j++) {
                        builder.append(lines[(k * type.getSize()) + i].charAt((l * type.getSize()) + j));
                    }
                }
                Block b = parseBlock(builder.toString());
                row.add(b);
            }
            blocks.add(row);
        }
        return blocks;
    }

    private void replaceWithPattern(Block block) {
        List<Pair<Block, Block>> collect = patterns.stream()
                .filter(p -> block.getVariants().contains(p.key))
                .collect(Collectors.toList());
        if (collect.size() != 1) {
            throw new RuntimeException("size was "+collect.size());
        }

        block.setType(collect.get(0).value.getType());
        block.setSpaces(collect.get(0).value.getSpaces());
    }

    private Pair<Block, Block> parsePattern(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);

        Block key = parseBlock(tokenizer.nextToken());
        tokenizer.nextToken();
        Block val = parseBlock(tokenizer.nextToken());

        return new Pair<>(key, val);
    }

    private Block parseBlock(String block) {
        String[] lines = block.split("/");
        Block.BlockType type;
        if (lines.length == 2) {
            type = Block.BlockType.TWO;
        } else if (lines.length == 3) {
            type = Block.BlockType.THREE;
        } else {
            type = Block.BlockType.FOUR;
        }
        Block b = new Block(type);

        for (int i = 0; i < lines.length; i++) {
            char[] chars = lines[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                b.setSpaceAt(i, j, Block.Space.of(chars[j]));
            }
        }

        return b;
    }
}
