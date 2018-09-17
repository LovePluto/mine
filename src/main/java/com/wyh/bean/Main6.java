package com.wyh.bean;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] arr = new int[m][3];
        for (int i = 0; i < m; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            boolean tag = false;
//            int temp = Math.abs(arr[i][0] * arr[i][1]);
            int temp = Math.abs( arr[i][1]);
            for (int j = 1; j < temp; j++) {
                if ((arr[i][0] * j) % arr[i][1] == arr[i][2]) {
                    tag = true;
                    break;
                }
            }
            if (tag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
