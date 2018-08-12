package com.wyh.LeetCode;


/**
 * 70. 爬楼梯
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * <p>
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class Main12 {

    public static int[] temp;


    public static void main(String[] args) throws Exception {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(climbStairs(44));

    }

    //动态规划版本
    public static int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        temp = new int[n + 1];
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }


    //记忆搜索版本
//    public static int climbStairs(int n) {
//        temp = new int[n + 1];
//        for (int i = 0; i < n + 1; i++) {
//            temp[i] = -1;
//        }
//        return solve(n);
//    }
//    public static int solve(int n) {
//        if (n < 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        if (temp[n] != -1) {
//            return temp[n];
//        }
//        temp[n] = solve(n - 1) + solve(n - 2);
//        return temp[n];
//    }


    //第一种暴力搜索版本
//    public static int climbStairs(int n) {
//        return solve(n);
//    }
//    public static int solve(int n) {
//        if (n < 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        int result = solve(n - 1) + solve(n - 2);
//        return result;
//    }
}
