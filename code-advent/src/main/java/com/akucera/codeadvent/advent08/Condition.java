package com.akucera.codeadvent.advent08;

import java.util.Objects;

public enum Condition {
    GT,
    LT,
    GTE,
    LTE,
    EQ,
    NE;

    public static Condition of(String token) {
        switch (token) {
            case ">":
                return GT;
            case "<":
                return LT;
            case ">=":
                return GTE;
            case "<=":
                return LTE;
            case "==":
                return EQ;
            case "!=":
                return NE;
        }
        throw new RuntimeException();
    }

    public boolean checkCondition(Integer a, Integer b) {
        switch (this) {
            case GT:
                return a > b;
            case LT:
                return a < b;
            case GTE:
                return a >= b;
            case LTE:
                return a <= b;
            case EQ:
                return Objects.equals(a, b);
            case NE:
                return !Objects.equals(a, b);
        }
        throw new RuntimeException();
    }
}
