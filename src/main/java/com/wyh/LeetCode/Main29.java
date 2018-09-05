package com.wyh.LeetCode;

import java.util.Scanner;

/**
 * 美团 2017 年秋招
 */
public class Main29 {

    public static void main(String[] args) throws Exception {

        /**
         * 95164850220
         * 9223372036854775807
         * 2147483647
         * 8328768
         */
//        System.out.println(Integer.MAX_VALUE);
        foo2();
    }


    /**
     * 给定一组非负整数组成的数组h，代表一组柱状图的高度，其中每个柱子的宽度都为1。
     * 在这组柱状图中找到能组成的最大矩形的面积（如图所示）。 入参h为一个整型数组，代表每个柱子的高度，返回面积的值。
     * <p>
     * 输入描述:
     * <p>
     * 输入包括两行,第一行包含一个整数n(1 ≤ n ≤ 10000)
     * 第二行包括n个整数,表示h数组中的每个值,h_i(1 ≤ h_i ≤ 1,000,000)
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数,表示最大的矩阵面积。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 6
     * 2 1 5 6 2 3
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 10
     */
    public static void foo3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1) {
            System.out.println(0);
            return;
        }
        int[] area = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            area[i] = in.nextInt();
        }
        int min;
        long max = 0;
        int i = 1;
        int j = n;
        while (i < j) {
            min = area[i];
            for (int x = i; x <= j; x++) {
                if (area[x] < min) {
                    min = area[x];
                }
            }
            max = Math.max(max, min * (j - i + 1));
            if (area[i] < area[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(max);
    }


    /**
     * 给你六种面额 1、5、10、20、50、100 元的纸币，假设每种币值的数量都足够多，编写程序求组成N元（N为0~10000的非负整数）的不同组合的个数。
     * 输入描述:
     * <p>
     * 输入包括一个整数n(1 ≤ n ≤ 10000)
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数,表示不同的组合方案数
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 1
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 1
     */
    public static void foo2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1) {
            System.out.println(0);
            return;
        }
        if (n == 1 || n == 2) {
            System.out.println(1);
        }
        int[] arr = new int[]{1, 5, 10, 20, 50, 100};
        dp = new long[arr.length][n + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = 1;//第一列为1
        }
        for (int j = 1; j <= n; j++) {
            if (j % arr[0] == 0) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = 0;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= n; j++) {
                int temp = 0;
                for (int k = 0; k * arr[i] <= j; k++) {
                    temp += dp[i - 1][j - k * arr[i]];//累加用k张arr[i]货币后dp[i-1]中组成剩下钱数的方法数
                }
                dp[i][j] = temp;
            }
        }
        System.out.println(dp[arr.length - 1][n]);
//        System.out.println(solve(cc, 0, n));
//        System.out.println();
    }

    private static long[][] dp;

    public static long solve(int[] arr, int index, int money) {
        if (index == arr.length) {
            return money == 0 ? 1 : 0;
        }
        if (dp[index][money] != -1) {
            return dp[index][money];
        }
        int res = 0;
        for (int i = 0; arr[index] * i <= money; i++) {
            res += solve(arr, index + 1, money - arr[index] * i);
        }
        dp[index][money] = res;
        return res;
    }

    /**
     * 大富翁游戏，玩家根据骰子的点数决定走的步数，即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。
     * 输入描述:
     * <p>
     * 输入包括一个整数n,(1 ≤ n ≤ 6)
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数,表示投骰子的方法
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 6
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 32
     */
    public static void foo1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1) {
            System.out.println(0);
            return;
        }
        if (n == 1 || n == 2) {
            System.out.println(n);
            return;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                dp[i] = dp[i] + dp[j];
            }
        }
        System.out.println(dp[n]);
    }


}
