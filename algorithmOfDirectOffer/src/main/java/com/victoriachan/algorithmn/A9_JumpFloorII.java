package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *               求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author: VictoriaChan
 * @create: 2020/03/12 23:43
 **/
public class A9_JumpFloorII {

    public static void main(String[] args) {
        A9_JumpFloorII a9_jumpFloor = new A9_JumpFloorII();
        System.out.println(a9_jumpFloor.jumpFloorII(5));
    }

    public int jumpFloorII(int target) {
        if (target == 1)
            return 1;
        return 2 * jumpFloorII(target - 1);
    }

}
