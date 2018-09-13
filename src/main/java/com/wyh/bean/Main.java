package com.wyh.bean;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] arr = new int[n][3];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = in.nextInt();
//            arr[i][1] = in.nextInt();
//            arr[i][2] = in.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i][0] > arr[j][0]) {
//                    int temp = arr[i][0];
//                    arr[i][0] = arr[j][0];
//                    arr[j][0] = temp;
//
//
//                    temp = arr[i][1];
//                    arr[i][1] = arr[j][1];
//                    arr[j][1] = temp;
//
//
//                    temp = arr[i][2];
//                    arr[i][2] = arr[j][2];
//                    arr[j][2] = temp;
//                }
//            }
//        }
//        int res = 0;
//        int aj = arr[n - 1][0];
//        int[] dp = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (dp[i] == 1) {
//                continue;
//            }
//            int bj = arr[i][1];
//            int cj = arr[i][2];
//            for (int j = 0; j < n; j++) {
//
//                if (dp[j] == 1) {
//                    continue;
//                }
//                if (arr[j][0] < aj && arr[j][1] < bj && arr[j][2] < cj) {
//                    res++;
//                    dp[j] = 1;
//                }
//            }
//        }
//        System.out.println(res);
//    }


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == 1) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (dp[i] == 1) {
                    continue;
                }
                if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1] && arr[i][2] > arr[j][2]) {
                    dp[j] = 1;
                    res++;
                }
            }
        }
        System.out.println(res);
    }

//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int[][] arr = new int[m][2];
//            for (int j = 0; j < m; j++) {
//                arr[j][0] = in.nextInt();
//                arr[j][1] = in.nextInt();
//            }
//        }
//        System.out.println("Yes");
//
//    }
}
