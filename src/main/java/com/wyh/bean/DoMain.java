package com.wyh.bean;

public class DoMain {

    static {
        System.out.println("静态");
    }

    {
        System.out.println("构造");
    }

    public static DoMain doMain1 = new DoMain();
    public static DoMain doMain2 = new DoMain();

    public static void main(String[] args) {

        System.out.println(((91 % 16) * 5) % 5);
        System.out.println(((4 % 8) * 4) % 4);
        System.out.println(0 % 5);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        long t = sc.nextInt();
//        if (n == 0) {
//            System.out.println("0");
//            return;
//        }
//        if (k == 0) {
//            System.out.println("0");
//            return;
//        }
//        if (t > n) {
//            System.out.println(n);
//            return;
//        }
//        int[] data = new int[n];
//        for (int i = 0; i < n; i++) {
//            data[i] = sc.nextInt();
//        }
//        Queue<Integer> queue = new LinkedList<Integer>();
//        for (int i = 0; i < k; i++) {
//            queue.offer(data[i]);
//        }
//        int[] c = new int[800];
//        int count = 0;
//        for (int i = 0; i <= data.length - k - 1; i++) {
//            for (int x : queue) {
//                c[x] = c[x] + 1;
//            }
//            count++;
//            queue.poll();
//            queue.offer(data[i + k]);
//        }
//        for (int x : queue) {
//            c[x] = c[x] + 1;
//        }
//        long max = 0;
//        for (int i = 0; i < c.length; i++) {
//            max = Math.max(c[i] / t, max);
//        }
//        System.out.println(max);
//    }

}
