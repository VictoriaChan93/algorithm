package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 * @author: VictoriaChan
 * @create: 2020/03/12 23:31
 **/
public class A7_Fibonacci {

    public static void main(String[] args) {
        A7_Fibonacci a7_fibonacci = new A7_Fibonacci();
        System.out.println(a7_fibonacci.fibonacci(10));
    }

    public int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
