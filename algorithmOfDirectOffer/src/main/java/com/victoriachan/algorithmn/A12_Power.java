package com.victoriachan.algorithmn;

import java.util.Map;

/**
 * @program: algorithm
 * @description: 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent 。求 base 的 exponent 次方。
 * @author: VictoriaChan
 * @create: 2020/03/13 23:53
 **/
public class A12_Power {

    public static void main(String[] args) {
        A12_Power a12_power = new A12_Power();
        System.out.println(a12_power.power(-2.0,-3));
    }

    /**
     * 常规：时间复杂度O(n)
     * @param base
     * @param exponent
     * @return
     */
    public double power(double base, int exponent) {
        double power = 1.0;
        for(int i=0;i<Math.abs(exponent);i++){
            power *= base;
        }
        return exponent>0?power:1/power;
    }

    /**
     * 要求：时间复杂度 < O(n)
     * @param base
     * @param exponent
     * @return
     */
    public double powerPlanB(double base, int exponent) {
        if (base == 0) return 0;
        if (base == 1) return 1;
        double t = positivePower(base, Math.abs(exponent));
        return exponent > 0 ? t : 1 / t;
    }
    private double positivePower(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        double t = positivePower(base, exponent >> 1);
        t *= t;
        if ((exponent & 0x01) == 1)
            t *= base;
        return t;
    }
}
