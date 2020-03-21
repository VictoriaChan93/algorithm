package com.victoriachan.algorithmn;

import java.util.*;

/**
 * @program: algorithm
 * @description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author: VictoriaChan
 * @create: 2020/03/14 21:22
 **/
public class A22_PrintFromTopToBottom {

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) return arrayList;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            arrayList.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return arrayList;
    }
}
