package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *               假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *               例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author: VictoriaChan
 * @create: 2020/03/14 12:16
 **/
public class A4_ReConstructBinaryTree {

    public static void main(String[] args) {
        A4_ReConstructBinaryTree a4_reConstructBinaryTree = new A4_ReConstructBinaryTree();
        TreeNode treeNode = a4_reConstructBinaryTree.reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode = null;


        return treeNode;
    }

}
