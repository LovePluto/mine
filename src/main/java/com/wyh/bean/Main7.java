package com.wyh.bean;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n + 1;
        while (m < Integer.MAX_VALUE) {
            if (getMin(getArrIndex(n, m)) == getMin(getArr(m))) {
                System.out.println(m);
                break;
            }
            m += 1;
        }

    }

    public static long[] getArr(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static long[] getArrIndex(int start, int end) {
        long[] arr = new long[end - start];
        for (int i = 0; i < end - start; i++) {
            arr[i] = start + i + 1;
        }
        return arr;
    }

    public static long getMin(long[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        long count = 1;
        int min = 2;
        long max = getMax(arr);
        while (min <= max) {
            boolean tag = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= min && arr[i] % min == 0) {
                    arr[i] = arr[i] / min;
                    tag = false;
                    count = count * min;
                    deal(arr, i + 1, min);
                }
            }
            if (tag) {
                min++;
            }
        }
        return count;
    }

    public static void deal(long[] arr, int index, int num) {
        for (int i = index; i < arr.length; i++) {
            if (arr[i] >= num && arr[i] % num == 0) {
                arr[i] = arr[i] / num;
            }
        }
    }

    public static long getMax(long[] arr) {
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
