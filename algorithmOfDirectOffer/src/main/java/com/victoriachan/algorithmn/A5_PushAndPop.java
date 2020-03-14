package com.victoriachan.algorithmn;

import java.util.Stack;

/**
 * @program: algorithm
 * @description: 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。 队列中的元素为int类型。
 * @author: VictoriaChan
 * @create: 2020/03/12 22:56
 **/
public class A5_PushAndPop {

    Stack<Integer> stack1 = new Stack<Integer>();//push
    Stack<Integer> stack2 = new Stack<Integer>();//pop

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()) return -1;
        else return stack2.pop();
    }


}
