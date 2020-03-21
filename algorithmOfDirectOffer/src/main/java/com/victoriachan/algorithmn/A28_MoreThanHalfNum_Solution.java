package com.victoriachan.algorithmn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * @program: algorithm
 * @description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *               例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 *               由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 *               如果不存在则输出0。
 * @author: VictoriaChan
 * @create: 2020/03/14 23:49
 **/
public class A28_MoreThanHalfNum_Solution {

    public static void main(String[] args) {
        A28_MoreThanHalfNum_Solution a28_moreThanHalfNum_solution = new A28_MoreThanHalfNum_Solution();
        System.out.println(a28_moreThanHalfNum_solution.moreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(a28_moreThanHalfNum_solution.moreThanHalfNum_SolutionPlanB(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }

    public int moreThanHalfNum_Solution(int[] array) {
        int num = 0;
        int halfLength = array.length / 2 + 1;
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i : array) {
            if (hashMap.containsKey(i))
                hashMap.put(i, hashMap.get(i) + 1);
            else
                hashMap.put(i, 1);
        }
        for (Integer in : hashMap.keySet()) {
            if (hashMap.get(in) >= halfLength)
                return in;
        }
        return num;
    }

    /**
     * 解题思路：利用Arrays工具类和IntStream流求解
     * 1.排序，取中间的数字，设为i
     * 2.用i过滤数组，如果为i的个数超过半数，则i为所求，否则结果为0
     * @param array
     * @return  IntStream.of(array).filter(k->k==i).count()>array.length/2?i:0;
     */
    public int moreThanHalfNum_SolutionPlanB(int[] array) {
        Arrays.sort(array);
        int i = array[array.length / 2];
        return IntStream.of(array).filter(k -> k == i).count() > array.length / 2 ? i : 0;
    }
}
