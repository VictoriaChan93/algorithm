package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *               所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author: VictoriaChan
 * @create: 2020/03/14 00:11
 **/
public class A13_ReOrderArray {
    public static void main(String[] args) {
        A13_ReOrderArray a13_reOrderArray = new A13_ReOrderArray();
        a13_reOrderArray.reOrderArray(new int[]{});
    }
    public void reOrderArray(int[] array) {
        if (array.length <= 1)
            return;

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) swap(array, j, j + 1);
            }
        }
    }

    private void swap(int[] array, int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
}
