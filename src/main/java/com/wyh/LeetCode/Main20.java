package com.wyh.LeetCode;


/**
 * 6. 不同的二叉搜索树
 * <p>
 * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出: 5
 * 解释:
 * 给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 */
public class Main20 {


    public static void main(String[] args) throws Exception {

        System.out.println(numTrees(3));
    }

    public static int[] dp;

    public static int numTrees(int n) {

        dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = 1;
        }
        return solve(n, n);
    }

    public static int solve(int current, int n) {

        if (current < 1) {
            return 1;
        }
        if (current > n) {
            return 1;
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += solve(current - i, n) + solve(current + i, n);
        }

        return temp;

    }

    public static int solveLeft(int current, int n) {
        if (current == 1) {
            return 1;
        }
        if (current < 1) {
            return 0;
        }
        return solveLeft(current - 1, n) + solveRight(current + 1, n);
    }

    public static int solveRight(int current, int n) {
        if (current == n) {
            return 1;
        }
        if (current > n) {
            return 0;
        }
        return solveLeft(current - 1, n) + solveRight(current + 1, n);
    }
}
