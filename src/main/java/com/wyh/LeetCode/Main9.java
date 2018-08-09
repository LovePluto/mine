package com.wyh.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    private static int result = Integer.MAX_VALUE;

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String[] input = new String[n];
//        for (int i = 0; i < n; i++) {
//            input[i] = in.next();
//        }
//    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] data = new int[n][2];
        for (int i = 0; i < n; ++i) {
            String[] ss = in.nextLine().split(",");
            data[i][0] = Integer.parseInt(ss[0]);
            data[i][1] = Integer.parseInt(ss[1]);
        }
        helper(new ArrayList<>(), n, 0, data);
        System.out.println(result);
    }

    private static void helper(List<Integer> cur, int n, int p, int[][] data) {
        if (p == n) {
            result = Math.min(result, distance(cur, data));
            return;
        }
        for (int i = 0; i <= p; ++i) {
            cur.add(i, p);
            helper(cur, n, p + 1, data);
            cur.remove(i);
        }
    }

    private static int distance(List<Integer> cur, int[][] data) {
        int res = 0;
        int[] pre = new int[]{0, 0};
        for (int i = 0; i < cur.size(); ++i) {
            int[] next = data[cur.get(i)];
            res += Math.abs(next[0] - pre[0]) + Math.abs(next[1] - pre[1]);
            pre = next;
        }
        return res + Math.abs(pre[0]) + Math.abs(pre[1]);
    }
}
