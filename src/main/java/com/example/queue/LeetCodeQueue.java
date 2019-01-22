package com.example.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author unnamed
 */
class LeetCodeQueue {

    private List<Integer> data;
    private int pStart;

    LeetCodeQueue() {
        data = new ArrayList<>(10);
        pStart = 0;
    }

    boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        pStart++;
        return true;
    }

    int front() {
        return data.get(pStart);
    }

    boolean isEmpty() {
        return pStart >= data.size();
    }
}

