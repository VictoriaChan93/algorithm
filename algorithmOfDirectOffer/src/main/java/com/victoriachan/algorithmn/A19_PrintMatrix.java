package com.victoriachan.algorithmn;

import java.util.ArrayList;

/**
 * @program: algorithm
 * @description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *               例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 *               则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author: VictoriaChan
 * @create: 2020/03/14 11:26
 **/
public class A19_PrintMatrix {

    public static void main(String[] args) {
        A19_PrintMatrix a19_printMatrix = new A19_PrintMatrix();
        a19_printMatrix.printMatrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}).forEach(System.out::println);
    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        //获取数组的列数
        int col = matrix[0].length;
        //获取行数
        int row = matrix.length;
        int x = 0;
        int y = 0;
        list.add(matrix[0][0]);
        for (int i = 0; i < (col + 1) / 2; i++) {
            //从左向右遍历
            for (int i1 = y; i1 < col - i -1; i1++) {
                list.add(matrix[x][++y]);
            }
            //从上到下遍历
            for (int i1 = x; i1 < row - i -1; i1++) {
                list.add(matrix[++x][y]);
            }
            //从右到左遍历
            for (int i1 = y; i1 > i ; i1--) {
                list.add(matrix[x][--y]);
            }
            //从下向上
            for (int i1 = x; i1 > i+1; i1--) {
                list.add(matrix[--x][y]);
            }
        }
        return list;
    }

    /**
     * 对比第一个优化了一点，但还是传统解法
     * @param matrix
     * @return
     */
    public ArrayList<Integer> printMatrixPlanB(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(matrix.length==0)
            return result;
        int n = matrix.length,m = matrix[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) result.add(matrix[i][k]);//左至右
            for(int j=i+1;j<n-i;j++) result.add(matrix[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(matrix[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
        }
        return result;
    }
}
