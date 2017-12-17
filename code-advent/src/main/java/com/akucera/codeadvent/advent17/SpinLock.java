package com.akucera.codeadvent.advent17;

import java.util.LinkedList;

/**
 * Created by akucera on 17.12.17.
 */
public class SpinLock {
    private final LinkedList<Integer> linkedList = new LinkedList<>();

    public int getNext(int insertions, int steps) {
        int pos = doInsertions(insertions, steps);

        return linkedList.get(pos + 2);
    }

    private int doInsertions(int insertions, int steps) {
        linkedList.clear();
        linkedList.add(0);

        int pos = 0;
        for (int i = 1; i < insertions; i++) {
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            pos = perform(pos + 1, steps);

            linkedList.add(pos + 1, i);
        }
        return pos;
    }

    private Node doInsertionsEffective(int insertions, int steps) {
        Node node = new Node(0);

        int cnt = 1;
        Node other = node;
        for (int i = 1; i < insertions; i++) {
            if (i % 100000 == 0) {
                System.out.println(i);
            }
            for (int j = 0; j < steps; j++) {
                other = other.next;
            }
            Node temp = other.next;
            other.next = new Node(i);
            cnt++;
            other.next.prev = other;
            other.next.next = temp;
            temp.prev = other.next;
        }

        return node;
    }

    public int getValueAfter0(int insertions, int steps) {
        Node node = doInsertionsEffective(insertions, steps);
        System.out.println(node.next.val);
        System.out.println(node.val);
        System.out.println(node.prev.val);
        return node.next.val;
    }

    public int getValueEffective(int insertions, int steps) {
        int seen = 0;
        int pos = 0;
        for (int i = 1; i < insertions; i++) {
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            pos = perform(pos + 1, steps, i);
            if (pos == 0) {
                seen = i;
            }
        }
        return seen;
    }

    private int perform(int pos, int steps) {
        return ((pos + steps) % linkedList.size());
    }

    private int perform(int pos, int steps, int cnt) {
        return ((pos + steps) % cnt);
    }

    public class Node {
        public int val;
        public Node next = this;
        public Node prev = this;

        public Node(int val) {
            this.val = val;
        }
    }
}
