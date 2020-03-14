package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 输入一个链表，反转链表后，输出新链表的表头。
 * @author: VictoriaChan
 * @create: 2020/03/14 00:24
 **/
public class A15_ReverseList {

    public static void main(String[] args) {
        A15_ReverseList a15_reverseList = new A15_ReverseList();
        ListNode listNode = a15_reverseList.reverseList(ListNode.buildListNode(new int[]{3, 2, 4, 8, 6, 5, 9, 1}));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head, cur = head.next, next;
        pre.next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;
        }
        return pre;
    }
}
