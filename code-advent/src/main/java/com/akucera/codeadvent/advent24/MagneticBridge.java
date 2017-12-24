package com.akucera.codeadvent.advent24;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MagneticBridge {
    HashMap<Integer, List<Part>> parts = new HashMap<>();

    public int getStrongestStrength(String input) {
        String[] lines = input.split("\n");

        for (String line : lines) {
            String[] ports = line.split("/");
            Part part = new Part(Integer.parseInt(ports[0]), Integer.parseInt(ports[1]));
            savePart(part);
        }

        return bruteForce();
//        return greedy();
    }

    public int getLongestStrength(String input) {
        String[] lines = input.split("\n");

        for (String line : lines) {
            String[] ports = line.split("/");
            Part part = new Part(Integer.parseInt(ports[0]), Integer.parseInt(ports[1]));
            savePart(part);
        }

        return bruteForceLongest().strength;
//        return greedy();
    }

    private BridgeMax bruteForceLongest() {
        return calculateForLongest(0, parts, 0);

    }

    private int bruteForce() {
        return calculateFor(0, parts);
//        int max = Integer.MIN_VALUE;
//        List<Part> parts = this.parts.get(0);
//        for (Part p : parts) {
//            HashMap<Integer, List<Part>> copy = copy(this.parts);
//            setUsed(0, copy, p);
//            int res = calculateFor(p.getUnused(), copy);
//            res += p.getVal();
//            if (res > max) {
//                max = res;
//            }
//        }
//
//        return max;
    }

    private int calculateFor(int port, HashMap<Integer, List<Part>> partsMap) {
//        HashMap<Integer, List<Part>> copy = copy(partsMap);
        int max = 0;
        List<Part> partsWithThisPort = partsMap.get(port);
        if (partsWithThisPort.size() == 0) {
            return -1;
        }
        int i = 0;
        for (Part p : partsWithThisPort) {
            HashMap<Integer, List<Part>> c = copy(partsMap);
            p = c.get(port).get(i++);
            c.get(p.portA).remove(p);
            c.get(p.portB).remove(p);
            int res = calculateFor(p.getOther(port), c);
            if (res == -1) {
                res = p.getVal();
            } else {
                res += p.getVal();
            }
            if (res > max) {
                max = res;
            }
        }

        return max;
    }

    private BridgeMax calculateForLongest(int port, HashMap<Integer, List<Part>> partsMap, int length) {
//        HashMap<Integer, List<Part>> copy = copy(partsMap);
        BridgeMax max = new BridgeMax(0,0);
        List<Part> partsWithThisPort = partsMap.get(port);
        if (partsWithThisPort.size() == 0) {
            return new BridgeMax(-1, 0);
        }
        int i = 0;
        for (Part p : partsWithThisPort) {
            HashMap<Integer, List<Part>> c = copy(partsMap);
            p = c.get(port).get(i++);
            c.get(p.portA).remove(p);
            c.get(p.portB).remove(p);
            BridgeMax res = calculateForLongest(p.getOther(port), c, length + 1);
            if (res.length == -1) {
                res = new BridgeMax(length, p.getVal());
            } else {
                res = new BridgeMax(res.length, res.strength + p.getVal());
            }
            if (res.compareTo(max) > 0) {
                max = res;
            }
        }

        return max;
    }
//
//    private int greedy() {
//        List<Part> bridge = new ArrayList<>();
//        Part max = findMax(0);
//        bridge.add(max);
//
//        while (true) {
//            max = findMax(max.getUnused());
//            if (max == null){
//                break;
//            }
//            bridge.add(max);
//        }
//
//        return bridge.stream().mapToInt(Part::getVal).sum();
//    }

//    private Part findMax(int i) {
//        List<Part> parts = this.parts.get(i);
//        Optional<Part> max = parts.stream().max(Comparator.comparingInt(p -> p.getVal()));
//        if (max.isPresent()) {
//            Part m = max.get();
//            setUsed(i, parts, m);
//            return m;
//        } else {
//            return null;
//        }
//    }

//    private HashMap<Integer, List<Part>> setUsed(int i, HashMap<Integer, List<Part>> parts, int m) {
//        HashMap<Integer, List<Part>> copy = copy(parts);
//        Part part = copy.get(i).get(m);
//        if (part.portA == i) {
//            part.usedA = true;
//        } else {
//            part.usedB = true;
//        }
//        copy.get(part.portA).remove(part);
//        copy.get(part.portB).remove(part);
//        return copy;
//    }


    private void savePart(Part part) {
        putPart(part.portA, part);
        putPart(part.portB, part);
    }

    private void putPart(int portA, Part part) {
        this.parts.computeIfAbsent(portA, k -> new CopyOnWriteArrayList<>());
        this.parts.get(portA).add(part);
    }

    public static HashMap<Integer, List<Part>> copy(
            HashMap<Integer, List<Part>> original)
    {
        HashMap<Integer, List<Part>> copy = new HashMap<Integer, List<Part>>();
        for (Map.Entry<Integer, List<Part>> entry : original.entrySet())
        {
            copy.put(entry.getKey(),
                    new CopyOnWriteArrayList<Part>(entry.getValue()));
        }
        return copy;
    }
}
