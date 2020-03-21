package com.victoriachan.algorithmn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author: VictoriaChan
 * @create: 2020/03/14 23:59
 **/
public class A29_GetLeastNumbers_Solution {

    public static void main(String[] args) {
        A29_GetLeastNumbers_Solution a29_getLeastNumbers_solution = new A29_GetLeastNumbers_Solution();
        a29_getLeastNumbers_solution.getLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8},4).forEach(System.out::println);
        a29_getLeastNumbers_solution.getLeastNumbers_SolutionPlanB(new int[]{4,5,1,6,2,7,3,8},4).forEach(System.out::println);
    }

    public ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (k <= 0 || input.length <= 0 || k > input.length) return arrayList;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }

    /**
     * 解题思路：快排
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> getLeastNumbers_SolutionPlanB(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (k <= 0 || input.length <= 0 || k > input.length) return arrayList;
        quickSort(input, 0, input.length - 1);
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }
    }

    public static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, more, r);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arra, int i, int j) {
        int temp = arra[i];
        arra[i] = arra[j];
        arra[j] = temp;
    }
}
