package com.akucera.codeadvent.advent18;

import java.util.*;

public class DuetState {
    private final List<Instruction> instructionList = new ArrayList<>();
    private final Map<String, Long> registers = new HashMap<>();
    private final List<Long> played = new ArrayList<>();
    private final List<Long> recovered = new ArrayList<>();

    private int current = 0;
    private boolean jumped = false;
    private long id = 0;
    private boolean stopped = false;

    public DuetState(String input, long i) {
        this(input);
        id = i;
        setToRegister("p", i);
    }

    public DuetState(String input) {
        String[] lines = input.split("\n");
        for (String line : lines) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            String instructionName = tokenizer.nextToken();
            Instruction instruction = null;
            String register;
            String another;
            switch (instructionName) {
                case "snd":
                    instruction = new Snd(tokenizer.nextToken());
                    break;
                case "set":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new SetFromRegister(register, another);
                    } else {
                        instruction = new SetLiteral(register, Long.parseLong(another));
                    }
                    break;
                case "add":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new AddFromRegister(register, another);
                    } else {
                        instruction = new AddLiteral(register, Long.parseLong(another));
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
                case "mod":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new ModFromRegister(register, another);
                    } else {
                        instruction = new ModLiteral(register, Long.parseLong(another));
                    }
                    break;
                case "jgz":
                    register = tokenizer.nextToken();
                    another = tokenizer.nextToken();
                    if (another.matches(".*[a-zA-Z]+.*")) {
                        instruction = new JgzFromRegister(register, another);
                    } else {
                        instruction = new JgzLiteral(register, Long.parseLong(another));
                    }
                    break;
                case "rcv":
                    instruction = new Rcv(tokenizer.nextToken());
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

    public void addToPlayed(Long val) {
        this.played.add(val);
    }

    public void recover() {
        if (played.size() > 0) 
        recovered.add(played.get(played.size() - 1));
    }

    public void jump(Long jumpSize) {
        current += jumpSize;
        jumped = true;
    }

    public Long getFirstReceived() {
        return recovered.get(0);
    }

    public boolean hasNext() {
        if (current < 0 || current >= instructionList.size()) {
            return false;
        }
        return true;
    }

    public void doInstruction() {
        if (current >= instructionList.size()) {
            stopped = true;
            return;
        }
        Instruction instruction = instructionList.get(current);
        if (instruction instanceof Rcv) {
            int cnt = getCnt();
            if (cnt == 0) {
                stopped = true;
                return;
            }
        }
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
        return recovered.size() > 0;
    }

    public boolean isStopped() {
        return stopped;
    }

    public int getCnt() {
        if (id == 0L) {
            return SendReceiveQueue.getInstance().getFirstCount();
        } else {
            return SendReceiveQueue.getInstance().getSecondCount();
        }
    }

    public long getId() {
        return id;
    }
}
