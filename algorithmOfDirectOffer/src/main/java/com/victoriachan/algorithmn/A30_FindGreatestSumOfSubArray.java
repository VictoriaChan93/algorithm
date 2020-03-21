package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 *               今天测试组开完会后,他又发话了:
 *               在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 *               但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 *               例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 *               给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * @author: VictoriaChan
 * @create: 2020/03/15 00:28
 **/
public class A30_FindGreatestSumOfSubArray {

    public static void main(String[] args) {
        A30_FindGreatestSumOfSubArray a30_findGreatestSumOfSubArray = new A30_FindGreatestSumOfSubArray();
        System.out.println(a30_findGreatestSumOfSubArray.findGreatestSumOfSubArray(new int[]{6,-3,-2,7,-15,1,2,2}));
        System.out.println(a30_findGreatestSumOfSubArray.findGreatestSumOfSubArrayPlanB(new int[]{6,-3,-2,7,-15,1,2,2}));
    }

    public int findGreatestSumOfSubArray(int[] array) {
        if (array.length <= 0) return -1;
        int sum = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index < 0) index = array[i];
            else index += array[i];
            sum = Math.max(sum, index);
        }
        return sum;
    }

    /**
     *
     * 解题思路：典型的动态规划
     * p[n]代表以当前元素为截止点的连续子序列的最大和，如果dp[n-1]>0，dp[n]=dp[n]+dp[n-1]，因为当前数字加上一个正数一定会变大；
     * 如果dp[n-1]<0，dp[n]不变，因为当前数字加上一个负数一定会变小。
     * 使用一个变量max记录最大的dp值返回即可。
     * @param array
     * @return
     */
    public int findGreatestSumOfSubArrayPlanB(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1] > 0 ? array[i - 1] : 0;
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
