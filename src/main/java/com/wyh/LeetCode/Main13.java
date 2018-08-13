package com.wyh.LeetCode;

/**
 * 62. 不同路径
 * <p>
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 问总共有多少条不同的路径？
 * <p>
 * 例如，上图是一个7 x 3 的网格。有多少可能的路径？
 * <p>
 * 说明：m 和 n 的值均不超过 100。
 * <p>
 * 示例 1:
 * <p>
 * 输入: m = 3, n = 2
 * 输出: 3
 * 解释:
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向右 -> 向下
 * 2. 向右 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向右
 * <p>
 * 示例 2:
 * <p>
 * 输入: m = 7, n = 3
 * 输出: 28
 */
public class Main13 {
    public static void main(String[] args) throws Exception {
        System.out.println(uniquePaths(7, 3));
    }

    public static int[][] temp;

    //动态规划
    public static int uniquePaths(int m, int n) {

        temp = new int[m][n];

        if (m < 0 || n < 0) {
            return 0;
        }
        if (m == 0 || n == 0) {
            return 1;
        }
        for (int i = 0; i < m; i++) {
            temp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            temp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
            }
        }

        return temp[m - 1][n - 1];
    }


    //记忆搜索版本
//    public static int uniquePaths(int m, int n) {
//
//        temp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                temp[i][j] = -1;
//            }
//        }
//        return solve(m - 1, n - 1);
//    }
//
//    public static int solve(int i, int j) {
//        if (i < 1 || j < 1) {
//            return 1;
//        }
//        if (temp[i][j] != -1) {
//            return temp[i][j];
//        }
//        temp[i][j] = solve(i - 1, j) + solve(i, j - 1);
//        return temp[i][j];
//    }

    //暴力搜索版本
//    public static int uniquePaths(int m, int n) {
//
//        return solve(m - 1, n - 1);
//    }
//    public static int solve(int i, int j) {
//
//        if (i == 0 || j == 0) {
//            return 0;
//        }
//        if (i == 1 || j == 1) {
//            return 1;
//        }
//        int count = solve(i - 1, j) + solve(i, j - 1);
//        return count;
//    }
}
