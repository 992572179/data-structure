package com.example.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义一个队列
 *
 * @author unnamed
 */
class DefQueue {


    private List<Integer> data;


    DefQueue() {
        this.data = new ArrayList<>(10);
    }

    /**
     * 遍历队列中的元素
     */
    void queueItr() {
        for (Integer i : data) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 添加一个元素到队列中
     *
     * @param in 待添加元素
     */
    void inQueue(Integer in) {
        data.add(in);
    }

    /**
     * 从队列中移除一个元素
     *
     * bool 移除成功返回true，若队列为空则返回false并输出错误提示
     */
    void deQueue() {
        if (data.size() <= 0) {
            System.out.println("队列中已经没有任何元素！");
            return;
        }
        data.remove(data.get(0));
    }
}
