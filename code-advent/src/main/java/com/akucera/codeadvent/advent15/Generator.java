package com.akucera.codeadvent.advent15;

import java.math.BigInteger;
import java.util.Objects;

/**
 * Created by akucera on 15.12.17.
 */
public class Generator {
    private BigInteger prev;
    private final BigInteger factor;
    private final BigInteger divisor = new BigInteger("2147483647");

    public Generator(BigInteger prev, BigInteger factor) {
        this.prev = prev;
        this.factor = factor;
    }

    public BigInteger getPrev() {
        return prev;
    }

    public void setPrev(BigInteger prev) {
        this.prev = prev;
    }

    public BigInteger getFactor() {
        return factor;
    }

    public BigInteger getDivisor() {
        return divisor;
    }

    public void generate() {
        BigInteger multiply = prev.multiply(factor);
        this.prev = multiply.mod(divisor);
    }

    public boolean matches(Generator generator) {
        String mine = this.getBits();
        String theirs = generator.getBits();

        return mine.equals(theirs);
    }

    public String getBits() {
        String s = prev.toString(2);
        while (s.length() < 16) {
            s = "0" + s;
        }
        return s.substring(s.length() - 16);
    }

    public void generatePicky(BigInteger modulus) {
        do {
            BigInteger multiply = prev.multiply(factor);
            this.prev = multiply.mod(divisor);
        } while (!Objects.equals(this.prev.mod(modulus), new BigInteger("0")));
    }
}
