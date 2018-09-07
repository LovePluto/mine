package com.wyh.bean;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DoMain {

    //    public static void main(String[] args) throws Exception {
//        Connection c = DB.getConnection();
//        String sql = " select * from vip_ad where id=? ";
//        PreparedStatement ps = c.prepareStatement(sql);
//        ps.setString(1, "1");
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()){
//            //TODO
//            System.out.println(rs.getString("id"));
//            System.out.println(rs.getString("url"));
//        }
//        System.out.print(rs.getRow());
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long t = sc.nextInt();
        if (n == 0) {
            System.out.println("0");
            return;
        }
        if (k == 0) {
            System.out.println("0");
            return;
        }
        if (t > n) {
            System.out.println(n);
            return;
        }
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            queue.offer(data[i]);
        }
        int[] c = new int[800];
        int count = 0;
        for (int i = 0; i <= data.length - k - 1; i++) {
            for (int x : queue) {
                c[x] = c[x] + 1;
            }
            count++;
            queue.poll();
            queue.offer(data[i + k]);
        }
        for (int x : queue) {
            c[x] = c[x] + 1;
        }
        long max = 0;
        for (int i = 0; i < c.length; i++) {
            max = Math.max(c[i] / t, max);
        }
        System.out.println(max);
    }

}
