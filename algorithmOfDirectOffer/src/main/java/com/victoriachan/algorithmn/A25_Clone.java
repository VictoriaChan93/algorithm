package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 *               返回结果为复制后复杂链表的head。
 *               （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author: VictoriaChan
 * @create: 2020/03/14 22:57
 **/
public class A25_Clone {

    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode randomListNode = new RandomListNode(-1);
        RandomListNode indexListNode = pHead;
        randomListNode.next = randomListNode;
        randomListNode.random = null;
        while (pHead != null) {
            pHead.next = indexListNode.next;
            pHead.random = indexListNode.random;
            pHead = pHead.next;
            indexListNode = indexListNode.next;
        }
        return randomListNode.next;
    }
}
