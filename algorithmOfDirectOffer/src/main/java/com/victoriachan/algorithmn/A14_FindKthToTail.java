package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 输入一个链表，输出该链表中倒数第k个结点。
 * @author: VictoriaChan
 * @create: 2020/03/14 00:13
 **/
public class A14_FindKthToTail {

    public static void main(String[] args) {
        A14_FindKthToTail a14_findKthToTail = new A14_FindKthToTail();
        ListNode listNode = a14_findKthToTail.findKthToTail(ListNode.buildListNode(new int[]{5, 2, 4, 1, 6, 7, 8}), 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode fast = head, slow = head;
        if (k < 0) return null;
        for (int i = 0; i < k; i++) {
            if(fast==null)
                return null;
            if (fast != null)
                fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
