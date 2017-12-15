package com.akucera.codeadvent.advent15;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Created by akucera on 15.12.17.
 */
public class Generators {
    public int getFinalCount(String s1, String s2) {
        Generator generator1 = new Generator(new BigInteger(s1), new BigInteger("16807"));
        Generator generator2 = new Generator(new BigInteger(s2), new BigInteger("48271"));

        int res = 0;
        for (long i = 0; i < 40000000; i++) {
            generator1.generate();
            generator2.generate();

            if (generator1.matches(generator2)) {
                res++;
            }
        }
        return res;
    }

    public int getPickyCount(String s, String s1) {
        Generator generator1 = new Generator(new BigInteger(s), new BigInteger("16807"));
        Generator generator2 = new Generator(new BigInteger(s1), new BigInteger("48271"));

        int res = 0;
        for (long i = 0; i < 5000000; i++) {
            generator1.generatePicky(new BigInteger("4"));
            generator2.generatePicky(new BigInteger("8"));

            if (generator1.matches(generator2)) {
                res++;
            }
        }
        return res;
    }
}
