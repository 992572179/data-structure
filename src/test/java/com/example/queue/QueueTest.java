package com.example.queue;


import org.junit.Test;

public class QueueTest {

    @Test
    public void testQueue() {
        DefQueue queue = new DefQueue();
        queue.inQueue(3);
        queue.inQueue(4);
        queue.inQueue(5);
        queue.queueItr();

        queue.deQueue();
        queue.deQueue();
        System.out.println();
        queue.queueItr();
    }

    @Test
    public void testQueueExcepted() {
        DefQueue queue = new DefQueue();
        queue.inQueue(3);

        queue.deQueue();
        queue.deQueue();
        queue.queueItr();
    }

    @Test
    public void testLeetCodeQueue() {
        LeetCodeQueue queue = new LeetCodeQueue();
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testLeetCodeQueueExcepted() {
        LeetCodeQueue queue = new LeetCodeQueue();
        queue.enQueue(3);
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
    }
}
