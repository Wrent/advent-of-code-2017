package com.akucera.codeadvent.advent23;


import java.util.*;

public class CoprocessorState {
    private final List<Instruction> instructionList = new ArrayList<>();
    private final Map<String, Long> registers = new HashMap<>();

    private int current = 0;
    private boolean jumped = false;
    private long id = 0;
    private boolean stopped = false;

    long mulCnt = 0;
    public CoprocessorState(String input, long i) {
        this(input);
        id = i;
    }

    public CoprocessorState(String input) {
        String[] lines = input.split("\n");
        for (String line : lines) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            String instructionName = tokenizer.nextToken();
            Instruction instruction = null;
            String register;
            String another;
            switch (instructionName) {
                case "set":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new SetFromRegister(register, another);
                    } else {
                        instruction = new SetLiteral(register, Long.parseLong(another));
                    }
                    break;
                case "sub":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new SubFromRegister(register, another);
                    } else {
                        instruction = new SubLiteral(register, Long.parseLong(another));
                    }
                    break;
                case "mul":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new MulFromRegister(register, another);
                    } else {
                        instruction = new MulLiteral(register, Long.parseLong(another));
                    }
                    break;
                case "jnz":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new JgzFromRegister(register, another);
                    } else {
                        instruction = new JgzLiteral(register, Long.parseLong(another));
                    }
                    break;
            }
            instructionList.add(instruction);
        }
    }

    public Long readRegister(String register) {
        if (!registers.containsKey(register)) {
            setToRegister(register, 0L);
        }
        return registers.get(register);
    }

    public void setToRegister(String register, Long value) {
        registers.put(register, value);
    }

    public void jump(Long jumpSize) {
        current += jumpSize;
        jumped = true;
    }

    public boolean hasNext() {
        if (current < 0 || current >= instructionList.size()) {
            return false;
        }
        return true;
    }

    public void doInstruction() {
        Instruction instruction = instructionList.get(current);
        instruction.apply(this);
        instruction.print();
        System.out.println(registers);
        if (!jumped) {
            current++;
        }
        jumped = false;
        stopped = false;
    }

    public boolean canFinish() {
        return !hasNext();
    }

    public long getId() {
        return id;
    }

    public Long getNumberOfMultiplies() {
        return mulCnt;
    }

    public long getH() {
        return registers.get("h");
    }
}
