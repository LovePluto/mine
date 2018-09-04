package com.wyh.interesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
            "cat cat cat cattie cat";

    public static void main( String args[] ){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }


    public static int foo() {
        int i = 1;

        try {
            return i;
        } finally {
            ++i;
            return i;
        }

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
