package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description:
 * @author: TracyChan
 * @create: 2020/03/12 22:47
 **/
public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public  static ListNode buildListNode(int[] input) {
        ListNode first = null, last = null, newNode;
        if (input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                newNode = new ListNode(input[i]);
                newNode.next = null;
                if (first == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }

            }
        }
        return first;
    }
}