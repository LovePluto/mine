package com.wyh.interesting;

public class Main {


    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer("1111");
        sb.append("222");
        System.err.println(sb.toString());
    }
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
