package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *               输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 *               例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *               NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author: VictoriaChan
 * @create: 2020/03/12 23:02
 **/
public class A6_MinNumberInRotateArray {

    public static void main(String[] args) {
        A6_MinNumberInRotateArray a6_minNumberInRotateArray = new A6_MinNumberInRotateArray();
        System.out.println(a6_minNumberInRotateArray.minNumberInRotateArray(new int[]{1,0,1,1,1}));
        System.out.println(a6_minNumberInRotateArray.minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }


    /**
     * 解题思路:
     * 1. 旋转之后的数组存在两个上升序列，最小元素在两个上升序列的中间
     * 2. 用两个指针在两个序列中找到最大和最小的值，这样 end 指向的数则为最小
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] < array[j]) {
                return array[i];
            }
            int mid = (i + j) >> 1;
            if (array[mid] > array[i]) {
                i = mid + 1;
            } else if (array[mid] < array[j]) {
                j = mid; // 如果是mid-1，则可能会错过最小值，因为找的就是最小值
            } else i++;  // 巧妙避免了offer书上说的坑点（1 0 1 1 1）
        }
        return array[i];
    }

}
