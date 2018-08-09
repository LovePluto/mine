package com.wyh.LeetCode;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        n += 1;
        int[][] data = new int[n][2];
        data[0][0] = 0;
        data[0][1] = 0;
        for (int i = 1; i < n; ++i) {
            String[] ss = in.nextLine().split(",");
            data[i][0] = Integer.parseInt(ss[0]);
            data[i][1] = Integer.parseInt(ss[1]);
        }
        int[] dis = new int[n];
        for (int i = 0; i < n; i++) {
            dis[i] = data[i][0] + data[i][1];
        }

    }
}
