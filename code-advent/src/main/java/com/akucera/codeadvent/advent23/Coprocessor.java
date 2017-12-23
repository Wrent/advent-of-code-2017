package com.akucera.codeadvent.advent23;

public class Coprocessor {
    public Long getNumberOfMultiplies(String input) {
        CoprocessorState state = new CoprocessorState(input);

        while (state.hasNext()) {
            state.doInstruction();
            if (state.canFinish()) {
                break;
            }
        }

        return state.getNumberOfMultiplies();
    }

    public long getValueH(String coprocessorOptimized) {
        long a = 1;
        long b = 81;
        long c = 0;
        boolean f;
        long d = 0;
        long e = 0;
        long g = 0;
        long h = 0;

        b = 100*b + 100000; // 108100
        c = b + 17000; // 125100
        while (true) {
            f = false;
            d = 2;
            for (long i = d; i * i < b; ++i) {
                if (b % i == 0) {
                    f = true;
                    break;
                }
            }
//            do {
//                e = 2;
//                //2..108100
//                do {
//                    if (d*e == b) { //looking for
//                        f = true;
//                    }
//                    e++;
//                } while (e != b); //do 108098 times
//                d++;
//            } while (d != b);
            if (f) {
                h = h + 1;
            }
            if (b == c) {
                return h;
            }
            b = b + 17; //do 1000 or 1001 times until return
        }
    }
}
