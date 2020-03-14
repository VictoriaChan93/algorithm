package com.victoriachan.algorithmn;

import java.util.LinkedList;

/**
 * @program: algorithm
 * @description: 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的 min 函数（时间复杂度应为O（1））。
 * @author: VictoriaChan
 * @create: 2020/03/14 11:49
 **/
public class A20_MinStack {

    private LinkedList<Integer> stack = new LinkedList<>();
    private LinkedList<Integer> min = new LinkedList<>();

    public void push(int node) {
        stack.addLast(node);
        if (min.isEmpty()) {
            min.addLast(node);
            return;
        }

        if (node < min.peekLast()) {
            min.addLast(node);
        } else {
            min.addLast(min.peekLast());
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.removeLast();
        min.removeLast();
    }

    public int top() {
        if (stack.peekLast() == null) {
            return 0;
        }
        return stack.peekLast();
    }

    public int min() {
        if (min.peekLast() == null) {
            return 0;
        }
        return min.peekLast();
    }
}
