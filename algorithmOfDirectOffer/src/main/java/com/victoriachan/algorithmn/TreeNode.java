package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description:
 * @author: VictoriaChan
 * @create: 2020/03/14 11:23
 **/
public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

    public TreeNode() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    private static TreeNode createBinaryTree(Integer[] srcArr) {
        TreeNode treeNode = new TreeNode();
        for(int x=0;x<srcArr.length;x++){
            findBiggerNode(treeNode,srcArr[x]);
        }
        return treeNode;
    }

    private static void findBiggerNode(TreeNode tree,Integer x){
        if(tree ==null){//根节点为空
            tree.setVal(x);
            return;
        }
        //根节点不为空
        if(tree.getVal()>x){//根节点大于目标数
            if(tree.getLeft()==null){//左子树为空
                tree.setLeft(new TreeNode(x));//设置左子树
            }else{//左子树不为空 递归查找
                findBiggerNode(tree.getLeft(),x);
            }
        }else{//目标大于等于 根节点
            if(tree.getRight()==null){//右子树为空 设置右子树
                tree.setRight(new TreeNode(x));
            }else{//右子树不为空 递归查找
                findBiggerNode(tree.getRight(),x);
            }
        }
    }

}