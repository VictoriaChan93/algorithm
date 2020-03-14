package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description:
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例: 现有矩阵 matrix 如下：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 *
 * @author: VictoriaChan
 * @create: 2020/03/11 23:52
 **/
public class A1_SearchMatrix {

    public static void main(String[] args) {
        A1_SearchMatrix ASearchMatrix = new A1_SearchMatrix();
        System.out.println(ASearchMatrix.searchMatrix(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 20));
    }

    /**
     * 解题思路:
     * 二维数组是有规律的：右上角的数字是一列中最小的、一行中最大的，通过这个数字和 target 进行对比，
     * 可以将一行或者一列作为候选区域排出,那么 target 可能存在的范围缩小，最终得出结果。
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            System.out.println(matrix[row][column]);
            if (target == matrix[row][column])
                return true;
            else if (target < matrix[row][column])
                column--;
            else
                row++;
        }
        return false;
    }



}
