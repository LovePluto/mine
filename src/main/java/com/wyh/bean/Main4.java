package com.wyh.bean;

import java.util.Scanner;

public class Main4 {

    /**
     * 000111
     * 681789
     * 000018
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.length() != 6) {
            System.out.println(0);
            return;
        }
        int[] arrP = new int[3];
        int[] arrN = new int[3];
        for (int i = 0; i < 3; i++) {
            arrP[i] = Integer.valueOf(input.substring(i, i + 1));
            arrN[i] = Integer.valueOf(input.substring(i + 3, i + 4));

        }
        int per = arrP[0] + arrP[1] + arrP[2];
        int next = arrN[0] + arrN[1] + arrN[2];
        if (per == next) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (arrP[i] > arrP[j]) {
                    int temp = arrP[i];
                    arrP[i] = arrP[j];
                    arrP[j] = temp;
                }
                if (arrN[i] > arrN[j]) {
                    int temp = arrN[i];
                    arrN[i] = arrN[j];
                    arrN[j] = temp;
                }
            }
        }

        int minF = 0;
        int minS = 0;
        if (arrN[0] < arrP[0]) {
            minF = arrN[0];
            minS = Math.min(arrP[0], arrN[1]);
        } else {
            minF = arrP[0];
            minS = Math.min(arrP[1], arrN[0]);
        }
        int maxF = 0;
        int maxS = 0;
        if (arrN[2] > arrP[2]) {
            maxF = arrN[2];
            maxS = Math.max(arrN[1], arrP[2]);
        } else {
            maxF = arrP[2];
            maxS = Math.max(arrP[1], arrN[2]);
        }
        int poor = Math.abs(per - next);
        int poorF = 0;
        int poorS = 0;
        if (9 - minF > maxF) {
            poorF = 9 - minF;
            poorS = Math.max(9 - minS, maxF);
        } else {
            poorF = maxF;
            poorS = Math.max(9 - minF, maxS);
        }
        if (poor <= poorF) {
            System.out.println(1);
            return;
        }
        if (poor <= poorF + poorS) {
            System.out.println(2);
            return;
        }
        System.out.println(3);
    }


//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int M = in.nextInt();
//        int P = in.nextInt();
//        int[] Ai = new int[N];
//        for (int i = 0; i < N; i++) {
//            Ai[i] = in.nextInt();
//        }
//        for (int i = 0; i < M; i++) {
//            String op = in.next();
//            int c = in.nextInt();
//            if (op.equals("A")) {
//                Ai[c - 1]++;
//            } else {
//                Ai[c - 1]--;
//            }
//        }
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Ai[i];
//        }
//        for (int i = 0; i < N; i++) {
//            for (int j = i; j < N; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < N; i++) {
//            if (arr[i] == Ai[P - 1]) {
//                System.out.println(i + 1);
//                break;
//            }
//        }
//    }
}
