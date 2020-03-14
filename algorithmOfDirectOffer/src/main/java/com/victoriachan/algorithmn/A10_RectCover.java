package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *               请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *               比如n=3时，2*3的矩形块有3种覆盖方法：
 *
 * @author: VictoriaChan
 * @create: 2020/03/12 23:45
 **/
public class A10_RectCover {

    public static void main(String[] args) {
        A10_RectCover a10_rectCover = new A10_RectCover();
        System.out.println(a10_rectCover.rectCover(4));
    }

    public int rectCover(int target) {
        if (target <= 0) return 0;
        if (target == 1 || target == 2) return target;
        else return rectCover(target - 1) + rectCover(target - 2);
    }
}
