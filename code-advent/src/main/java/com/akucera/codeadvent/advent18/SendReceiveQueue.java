package com.akucera.codeadvent.advent18;

import java.util.concurrent.ConcurrentLinkedQueue;

public class SendReceiveQueue {
    private static SendReceiveQueue instance = null;
    private ConcurrentLinkedQueue<Long> first = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Long> second = new ConcurrentLinkedQueue<>();

    private static Long cnt = 0L;
    private SendReceiveQueue() {};

    public static SendReceiveQueue getInstance() {
        if (instance == null) {
            instance = new SendReceiveQueue();
        }
        return instance;
    }

    public Long readFirst() {
        return first.poll();
    }

    public Long readSecond() {
        return second.poll();
    }

    public void writeFirst(Long val) {
        first.add(val);
        cnt++;
    }

    public void writeSecond(Long val) {
        second.add(val);
    }

    public Long getFirstWrites() {
        return cnt;
    }

    public int getFirstCount() {
        return first.size();
    }

    public int getSecondCount() {
        return second.size();
    }
}
