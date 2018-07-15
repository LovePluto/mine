package com.wyh.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class AddNum {

    private static final String Add_NUM_FILE = "num.txt";
    private static final String SORT_NUM_FILE = "num_sort.txt";

    private static int[] sortNum = new int[10000000];

    /**
     * 大约6-7秒样子的，百万数据排序问题
     * 算法来源《编程珠玑》
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File file = new File(Add_NUM_FILE);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        Long start = System.currentTimeMillis();
        System.out.println(start);
        while ((line = reader.readLine()) != null) {
            int num = Integer.valueOf(line);
            if (num > 0) {
                sortNum[num] = 1;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        File file1 = new File(SORT_NUM_FILE);
        if (file1.exists()) {
            file1.delete();
            file1.createNewFile();
        }
        FileOutputStream out = new FileOutputStream(file1);
        for (int i = 0; i < sortNum.length; i++) {
            if (sortNum[i] == 1) {
                out.write((i + "").getBytes());
                out.write("\r\n".getBytes());
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    /**
     * 随机生成一百万条数据
     * 数据范围是一百万到一千万之前，也就是七位数的
     *
     * @throws Exception
     */
    public static void addNum() throws Exception {
        File file = new File(Add_NUM_FILE);
        FileOutputStream out = new FileOutputStream(file);
        for (long i = 0; i < 1000000; i++) {
            Long outNum = (long) (Math.random() * (10000000 - 1000000) + 1000000);
            System.out.println(outNum);
            out.write(outNum.toString().getBytes());
            String s = "\r\n";
            out.write(s.getBytes());
        }
        out.flush();
        out.close();
    }

}
