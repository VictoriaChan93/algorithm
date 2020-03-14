package com.victoriachan.algorithmn;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: algorithm
 * @description: 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author: VictoriaChan
 * @create: 2020/03/12 22:22
 **/
public class A3_PrintListFromTailToHead {

    public static void main(String[] args) {
        A3_PrintListFromTailToHead a3_printListFromTailToHead = new A3_PrintListFromTailToHead();
        ListNode listNode = ListNode.buildListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        a3_printListFromTailToHead.printListFromTailToHead(listNode).forEach(System.out::println);
        System.out.println("--------------------");
        a3_printListFromTailToHead.printListFromTailToHeadPlanB(listNode).forEach(System.out::println);
    }

    /**
     * 解题思路：用栈的后进先出的特性来解反转链表
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if(null == listNode)
            return arrayList;
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }


    /**
     * 采用递归并利用调用Listnode的next获取下一个值，将值递归传递下去
     * 然后利用val获取值，将值传递到数组当中，达到最深层后一层层往外输出内容
     * 也就是实现了从尾到头返回arraylist
     * @param listNode
     * @return
     */
    ArrayList<Integer> arrayList = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHeadPlanB(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHeadPlanB(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

}
