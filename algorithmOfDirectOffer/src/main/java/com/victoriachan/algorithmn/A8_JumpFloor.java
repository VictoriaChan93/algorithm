package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 *               求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author: VictoriaChan
 * @create: 2020/03/12 23:40
 **/
public class A8_JumpFloor {

    public static void main(String[] args) {
        A8_JumpFloor a8_jumpFloor = new A8_JumpFloor();
        System.out.println(a8_jumpFloor.jumpFloor(5));
    }

    public int jumpFloor(int target) {
        if (target <= 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}
