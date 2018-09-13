package com.wyh.bean;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        int[] total = new int[m + 1];
        for (int i = 0; i < n; i++) {
            total[arr[i][0]] += 1;
        }
        int people = 1;
        int num = total[1];
        for (int i = 1; i <= m; i++) {
            if (total[i] >= num) {
                people = i;
                num = total[i];
            }
        }
        if (people == 1) {
            System.out.println(0);
        }
        int poor = num - total[1];
        long res = 0;
        for (int i = 0; i <= poor; i++) {
            int index = 0;
            int min = arr[0][1];
            for (int j = 1; j < n; j++) {
                if (arr[j][1] < min && arr[j][1] != 0 && arr[j][0] != 1) {
                    index = j;
                    min = arr[j][1];
                }
            }
            arr[index][1] = 0;
            res += min;
        }
        System.out.println(res);
    }
//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] arr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = in.nextInt();
//            arr[i][1] = in.nextInt();
//        }
//        int[][] res = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            res[i][0] = 0;
//            if (arr[i][0] < 3) {
//                res[i][1] = 0;
//                continue;
//            }
//            if (arr[i][1] < 2) {
//                res[i][1] = 0;
//                continue;
//            }
//            if (arr[i][1] >= arr[i][0] / 2) {
//                res[i][1] = arr[i][0] - arr[i][1];
//            } else {
//                res[i][1] = arr[i][1] - 1;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(res[i][0] + " " + res[i][1]);
//        }
//    }

//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//        char[] arr = input.toCharArray();
//        int b = 0;
//        int w = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 'b') {
//                b++;
//            } else {
//                w++;
//            }
//        }
//        int min = b > w ? w : b;
//        int res = min * 2 + 1;
//        System.out.println(res);
//    }
}
