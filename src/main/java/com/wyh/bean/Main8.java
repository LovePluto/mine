package com.wyh.bean;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {


    public static int[][] dp;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] arr = input.split(" ");
        if (arr.length != 2) {
            System.exit(0);
        }
        String[] arr1 = arr[0].split(",");
        Integer[] arr2 = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.valueOf(arr1[i]);
        }

        Integer res = Arrays.binarySearch(arr2, Integer.valueOf(arr[1]));

        if (res > -1) {
            System.out.println(res);
        } else {
            res = -res;
            System.out.println(res - 1);
        }


    }
}
