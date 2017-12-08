package com.akucera.codeadvent.advent08;

import com.akucera.codeadvent.advent07.Program;

import java.util.*;

public class RegisterInstructions {

    Map<String, Integer> registers = new HashMap<>();

    public Integer getHighestRegisterValue(String input) {
        registers.clear();

        String[] lines = input.split("\\n");

        for (String line : lines) {
            processLine(line);
        }

        return registers.values().stream().max(Comparator.comparingInt(val -> val)).get();

    }

    public Integer getHighestHeldValue(String input) {
        registers.clear();

        String[] lines = input.split("\\n");

        int max = Integer.MIN_VALUE;

        for (String line : lines) {
            Integer registerVal = processLine(line);
            if (registerVal > max) {
                max = registerVal;
            }
        }

        return max;
    }

    private Integer processLine(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);
        String name = tokenizer.nextToken().trim();
        Instruction instruction = Instruction.of(tokenizer.nextToken().trim());
        Integer value = Integer.parseInt(tokenizer.nextToken().trim());
        tokenizer.nextToken();
        String condName = tokenizer.nextToken().trim();
        Condition condition = Condition.of(tokenizer.nextToken().trim());
        Integer condValue = Integer.parseInt(tokenizer.nextToken().trim());

        if (condition.checkCondition(readRegister(condName), condValue)) {
            registers.put(name, instruction.run(readRegister(name), value));
        }
        return readRegister(name);
    }

    private Integer readRegister(String condName) {
        Integer val = registers.get(condName);

        return val == null ? 0 : val;
    }
}
