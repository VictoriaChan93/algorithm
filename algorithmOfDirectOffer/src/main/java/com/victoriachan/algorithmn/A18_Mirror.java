package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description:
 * @author: VictoriaChan
 * @create: 2020/03/14 11:24
 **/
public class A18_Mirror {

    public static void main(String[] args) {
        A18_Mirror a18_mirror = new A18_Mirror();
        a18_mirror.mirror(null);
    }
    public void mirror(TreeNode root) {
        if(null == root) return ;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

}
