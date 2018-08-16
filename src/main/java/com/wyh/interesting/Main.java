package com.wyh.interesting;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Main {


    public static void main(String[] args) throws Exception {
//        StringBuffer sb = new StringBuffer("1111");
//        sb.append("222");
//        System.err.println(sb.toString());
//        System.out.println(fibonacci(6));

        final long count = Stream.of(1, 2, 3, 4, 5).filter(integer -> integer > 1)
                .count();
//        assertEquals(4, count);
    }

//    public static int[] dp;
//
//    public static int fibonacci(int n) {
//        dp = new int[n + 1];
//        for (int i = 0; i < n + 1; i++) {
//            dp[i] = -1;
//        }
//        dp[1] = 1;
//        dp[2] = 1;
//        for (int i = 3; i < n + 1; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
//    }
//
//    public static int solve(int n) {
//        if (n < 1) {
//            return 0;
//        }
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        if (dp[n] != -1) {
//            return dp[n];
//        }
//        dp[n] = solve(n - 1) + solve(n - 2);
//        return dp[n];
//    }


    //    public static void main(String[] args) throws Exception {
//        String s = new String("Hello word");
//        WeakReference<String> weakReference = new WeakReference<>(s);
//        System.gc();
//        Thread.sleep(10 * 1000);
//        System.out.println(weakReference.get());
//    }


//    public static void main(String[] args) throws Exception {
//       byte[] b = new byte[1024 * 1024 * 5];
//        SoftReference<String> softReference = new SoftReference<>(new String("Hello SoftReference"));
//        WeakReference<String> weakReference = new WeakReference<>(new String("Hello WeakReference"));
//        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
//        PhantomReference<String> phantomReference = new PhantomReference<>(new String("Hello PhantomReference"), referenceQueue);
//        System.out.println("GC 之前：softReference：" + softReference.get() + "，weakReference：" + weakReference.get() + "，phantomReference：" + phantomReference.get());
//        System.gc();
//        Thread.sleep(1000);
//        System.out.println("第一次 GC 之后：softReference：" + softReference.get() + "，weakReference：" + weakReference.get() + "，phantomReference：" + phantomReference.get());
//        //模拟内存占用
//        SoftReference[] softArr = new SoftReference[5];
//        softArr[0] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        softArr[1] = new SoftReference<byte[]>(new byte[1024 * 1024 * 1]);
//        softArr[2] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        System.out.println("内存满了之后：softReference：" + softReference.get() + "，weakReference：" + weakReference.get() + "，phantomReference：" + phantomReference.get());
//    }


//    public static void main(String[] args) throws Exception {
//       byte[] b = new byte[1024 * 1024 * 5];
//        SoftReference<String> softReference = new SoftReference<>(new String("Hello SoftReference"));
//        WeakReference<String> weakReference = new WeakReference<>(new String("Hello WeakReference"));
//        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
//        PhantomReference<String> phantomReference = new PhantomReference<>(new String("Hello PhantomReference"), referenceQueue);
//        System.out.println("GC 之前：softReference：" + softReference.get() + "，weakReference：" + weakReference.get() + "，phantomReference：" + phantomReference.get());
//        System.gc();
//        Thread.sleep(1000);
//        System.out.println("第一次 GC 之后：softReference：" + softReference.get() + "，weakReference：" + weakReference.get() + "，phantomReference：" + phantomReference.get());
//        //模拟内存占用
//        SoftReference[] softArr = new SoftReference[5];
//        softArr[0] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        softArr[1] = new SoftReference<byte[]>(new byte[1024 * 1024 * 1]);
//        softArr[2] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        System.out.println("内存满了之后：softReference：" + softReference.get() + "，weakReference：" + weakReference.get() + "，phantomReference：" + phantomReference.get());
//    }

//    public static void main(String[] args) {
//        SoftReference[] softArr = new SoftReference[5];
//        softArr[0] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        System.out.println("GC 前===>" + softArr[0].get());
//        System.gc();
//        System.out.println("第一次GC后：===>" + softArr[0].get());
//        softArr[1] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        System.gc();
//        System.out.println("第二次GC后===>" + softArr[0].get());
//        softArr[2] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        System.gc();
//        System.out.println("第三次GC后===>" + softArr[0].get());
//        softArr[3] = new SoftReference<byte[]>(new byte[1024 * 1024 * 2]);
//        //System.gc();  这里都不需要显示执行，因为堆内存已经满了，虚拟机自己会执行。
//        System.out.println("第四次GC后===>" + softArr[0].get());

//        WeakReference<Integer> weak = new WeakReference<Integer>(new Integer(100));
//        System.out.println("GC 前===>"+weak.get());
//        System.gc();
//        System.out.println("GC 后===>"+weak.get());

//    }
}
