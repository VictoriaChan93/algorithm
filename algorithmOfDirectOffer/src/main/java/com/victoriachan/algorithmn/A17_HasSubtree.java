package com.victoriachan.algorithmn;

import java.util.LinkedList;

/**
 * @program: algorithm
 * @description: 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author: VictoriaChan
 * @create: 2020/03/14 11:22
 **/
public class A17_HasSubtree {

    public static void main(String[] args) {
        A17_HasSubtree a17_hasSubtree = new A17_HasSubtree();
        System.out.println(a17_hasSubtree.hasSubtree(null,null));
    }

    /**
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return judgeSubTree(root1, root2) || judgeSubTree(root1.left, root2) || judgeSubTree(root1.right, root2);
    }

    private boolean judgeSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return judgeSubTree(root1.left, root2.left) && judgeSubTree(root1.right, root2.right);
    }
}
