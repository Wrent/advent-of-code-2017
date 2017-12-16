package com.akucera.codeadvent.advent16;

import java.security.SecureRandom;
import java.util.*;

/**
 * Created by akucera on 16.12.17.
 */
public class ProgramsDance {
    private char[] characters;
    private int size;
    char[] alphabet = "abcdefghijklmnop".toCharArray();


    public ProgramsDance(int i) {
        size = i;
        characters = new char[i];
        for (int j = 0; j < i; j++) {
            characters[j] = alphabet[j];
        }
    }

    public String getOrder(String input) {
        String[] commands = input.split(",");

        for (String command : commands) {
            char first = command.charAt(0);
            switch (first) {
                case 's':
                    doSpin(command);
                    break;
                case 'x':
                    doExchange(command);
                    break;
                case 'p':
                    doPartner(command);
                    break;
            }
        }
        return new String(characters);
    }

    public String danceBillionCorrectandEffective(String input, long repeat) {
        int i = 0;
        do {
            getOrder(input);
            i++;
        } while (!Arrays.equals(characters, alphabet));

        long residual = repeat % i;

        for (int j = 0; j < residual; j++) {
            getOrder(input);
        }
        return new String(characters);
    }

    public String danceBillionEffective(String input, long repeat) {
        String one = getOrder(input);
        int[] permutation = getPermutation(one);

        for (int j = 0; j < size; j++) {
            characters[j] = alphabet[j];
        }

        for (long i = 1; i < repeat; i++) {
            if (i % 10000000 == 0) {
                System.out.println(i);
            }
            characters = doPermutation(characters, permutation);

        }
        return new String(characters);

    }

    protected char[] doPermutation(char[] characters, int[] permutation) {
        char[] newChars = new char[size];

        int i = 0;
        for (int pos : permutation) {
            newChars[pos] = characters[i];
            i++;
        }

        return newChars;
    }

    protected int[] getPermutation(String one) {
        int[] permutation = new int[size];

        int i = 0;
        for (char c : one.toCharArray()) {
            int pos = getPos(alphabet, c);
            permutation[pos] = i;
            i++;
        }
        return permutation;
    }

    public String danceBillion(String input) {
        String[] commands = input.split(",");

        List<Command> commandList = new ArrayList<>();
        for (String command : commands) {
            char first = command.charAt(0);
            switch (first) {
                case 's':
                    commandList.add(new Spin(command));
                    break;
                case 'x':
                    commandList.add(new Exchange(command));
                    break;
                case 'p':
                    commandList.add(new Partner(command));
                    break;
            }
        }

        for (long i = 0; i < 1000000000; i++) {
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            for (Command command : commandList) {
                characters = command.apply(characters);
            }

        }
        return new String(characters);

    }

    private void doPartner(String command) {
        char first = command.charAt(1);
        char second = command.charAt(3);

        int firstPos = getPos(characters, first);
        int secondPos = getPos(characters, second);

        characters = exchange(characters, firstPos, secondPos);
    }

    private int getPos(char[] array, char c) {
        for (int i = 0; i < size; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }

    private void doExchange(String command) {
        command = command.substring(1);
        String[] positions = command.split("/");
        int first = Integer.parseInt(positions[0]);
        int second = Integer.parseInt(positions[1]);

        characters = exchange(characters, first, second);
    }

    public static char[] exchange(char[] chars, int first, int second) {
        char temp = chars[first];
        chars[first] = chars[second];
        chars[second] = temp;
        return chars;
    }

    private void doSpin(String command) {
        int cnt = Integer.parseInt(command.substring(1));

        char[] newChars = new char[size];

        int j = 0;
        for (int i = size - cnt; i < size; i++) {
            newChars[j] = characters[i];
            j++;
        }
        for (int i = 0; i < size - cnt; i++) {
            newChars[j] = characters[i];
            j++;
        }
        characters = newChars;
    }
}
