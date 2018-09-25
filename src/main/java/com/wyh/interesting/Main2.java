package com.wyh.interesting;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 8, 9}, {4, 7, 10, 13}};
        Find(7, arr);
    }

    public static boolean Find(int target, int[][] array) {
        if (array.length < 0) {
            return false;
        }
        int i = array[0].length - 1;
        int j = 0;
        while (i >= 0 && j < array[0].length) {
            if (array[i][j] == target) {
                return true;
            }
            if (array[i][j] > target) {
                i--;

            } else {
                j++;
            }
        }
        return false;
    }

    public static void foo3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {

        }

    }

    /**
     * 时间限制：1秒
     * <p>
     * 空间限制：32768K
     * <p>
     * 牛牛和羊羊正在玩一个纸牌游戏。这个游戏一共有n张纸牌, 第i张纸牌上写着数字ai。
     * 牛牛和羊羊轮流抽牌, 牛牛先抽, 每次抽牌他们可以从纸牌堆中任意选择一张抽出, 直到纸牌被抽完。
     * 他们的得分等于他们抽到的纸牌数字总和。
     * 现在假设牛牛和羊羊都采用最优策略, 请你计算出游戏结束后牛牛得分减去羊羊得分等于多少。
     * <p>
     * 输入描述:
     * <p>
     * 输入包括两行。
     * 第一行包括一个正整数n(1 <= n <= 105),表示纸牌的数量。
     * 第二行包括n个正整数ai(1 <= ai <= 109),表示每张纸牌上的数字。
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数, 表示游戏结束后牛牛得分减去羊羊得分等于多少。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 3
     * 2 7 4
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 5
     */
    public static void foo2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        boolean tag = true;
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < n; ++i) {
            if (tag) {
                countA += arr[i];
                tag = false;
            } else {
                countB += arr[i];
                tag = true;
            }
        }
        System.out.println(Math.abs(countA - countB));
    }

    /**
     * 小Q定义了一种数列称为翻转数列:
     * 给定整数n和m, 满足n能被2m整除。对于一串连续递增整数数列1, 2, 3, 4..., 每隔m个符号翻转一次, 最初符号为'-';。
     * 例如n = 8, m = 2, 数列就是: -1, -2, +3, +4, -5, -6, +7, +8.
     * 而n = 4, m = 1, 数列就是: -1, +2, -3, + 4.
     * 小Q现在希望你能帮他算算前n项和为多少。
     * 输入描述:
     * <p>
     * 输入包括两个整数n和m(2 <= n <= 109, 1 <= m), 并且满足n能被2m整除。
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数, 表示前n项和。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 8 2
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 8
     */
    public static void foo1() {
        //8 2   8
        //12 3 18
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        if (n < 1 || m < 1) {
            System.out.println(0);
            return;
        }
        long temp = n / (m * 2);
        System.out.println(temp * m * m);
    }
}
