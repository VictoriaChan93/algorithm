package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author: VictoriaChan
 * @create: 2020/03/14 11:01
 **/
public class A16_Merge {

    public static void main(String[] args) {
        A16_Merge a16_merge = new A16_Merge();
        ListNode listNode = a16_merge.merge(ListNode.buildListNode(new int[]{1, 3, 5, 7, 8}), ListNode.buildListNode(new int[]{2, 4, 6, 7, 8}));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("-----------------------");
        ListNode listNodePlanB = a16_merge.mergePlanB(ListNode.buildListNode(new int[]{1, 3, 5, 7, 8}), ListNode.buildListNode(new int[]{2, 4, 6, 7, 8}));
        while (listNodePlanB != null) {
            System.out.println(listNodePlanB.val);
            listNodePlanB = listNodePlanB.next;
        }
    }

    /**
     * 递归调用
     * @param list1
     * @param list2
     * @return
     */
    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode pMergeHead = null;
        if (list1.val < list2.val) {
            pMergeHead = list1;
            pMergeHead.next = merge(list1.next, list2);
        } else {
            pMergeHead = list2;
            pMergeHead.next = merge(list1, list2.next);
        }
        return pMergeHead;
    }

    /**
     * 由于有序，可以用归并排序
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergePlanB(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode pMergeHead = new ListNode(-1);
        ListNode cur = pMergeHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) cur.next = list1;
        if (list2 != null) cur.next = list2;

        return pMergeHead.next;
    }
}
