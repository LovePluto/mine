package com.wyh.bean;

import java.util.Scanner;

public class Main8 {


    public static int[][] dp;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[]{1, 5, 10, 20, 50};
        dp = new int[5][n + 1];
        for (int i = 0; i < 5; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j - arr[i]) >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - arr[i]];
                }
                int temp = 0;
                for (int x = 0; j - arr[i] * x >= 0; x++) {
                    temp += dp[i - 1][j - arr[i] * x];
                }
                dp[i][j] = temp;
            }
        }
        System.out.println(dp[4][n]);
    }

//    public static int solve(int[] arr, int index, int money) {
//
//        if (money < 0) {
//            return 0;
//        }
//        if (money == 0) {
//            return 1;
//        }
//        if (index > 4) {
//            return 0;
//        }
//        if (dp[index][money] != -1) {
//            return dp[index][money];
//        }
//        int res = 0;
//        for (int i = 0; i * arr[index] <= money; i++) {
//            res += solve(arr, index + 1, money - i * arr[index]);
//        }
//        return res;
//    }
}
