package com.akucera.codeadvent.advent07;

import java.util.*;
import java.util.stream.Collectors;

public class ProgramTower {

    Map<String, Program> programMap = new HashMap<>();
    String bottomName;
    Integer difference;

    public String getBottomProgramName(String input) {
        String[] lines = input.split("\\n");
        Set<String> programNames = new HashSet<>();

        for (String line : lines) {
            Program program = new Program(line);
            programMap.put(program.getName(), program);
            programNames.add(program.getName());
        }

        programMap.values().forEach(program -> programNames.removeAll(program.getChildren()));
        bottomName = programNames.iterator().next();
        return bottomName;
    }

    public int getRequiredWeightChange() {
        processProgram(programMap.get(bottomName));
        return difference;
    }

    private void processProgram(Program program) {
        if (program.getChildren().size() > 0) {
            program.getChildren().forEach(prg -> processProgram(programMap.get(prg)));

            Integer dif = getDifference(program.getChildren());
            if (dif != 0) {
                if (this.difference == null) {
                    this.difference = dif;
                }
            }

            program.sumWeight += program.getChildren().stream()
                    .mapToInt(name -> programMap.get(name).sumWeight)
                    .sum();


        }
        program.sumWeight += program.getWeight();
    }

    private Integer getDifference(List<String> children) {
        List<Program> programs = children.stream().map(name -> programMap.get(name)).collect(Collectors.toList());

        Integer weight = programs.get(0).sumWeight;

        for (int i = 1; i < programs.size(); i++) {
            if (!Objects.equals(weight, programs.get(i).sumWeight)) {
                if (!Objects.equals(weight, programs.get((i + 1) % (programs.size() - 1)).sumWeight)) {
                    return programs.get(0).getWeight() - Math.abs(weight - programs.get(i).sumWeight);
                } else {
                    return programs.get(i).getWeight() - Math.abs(weight - programs.get(i).sumWeight);
                }
            }
        }
        return 0;
    }
}

