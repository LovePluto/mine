package com.wyh.bean;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 图的遍历
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 给定一张包含N个点、N-1条边的无向连通图，节点从1到N编号，每条边的长度均为1。假设你从1号节点出发并打算遍历所有节点，那么总路程至少是多少？
 * <p>
 * 输入
 * 第一行包含一个整数N，1≤N≤105。
 * <p>
 * 接下来N-1行，每行包含两个整数X和Y，表示X号节点和Y号节点之间有一条边，1≤X，Y≤N。
 * <p>
 * 输出
 * 输出总路程的最小值。
 * <p>
 * <p>
 * 样例输入
 * 4
 * 1 2
 * 1 3
 * 3 4
 * 样例输出
 * 4
 * <p>
 * Hint
 * 按1->2->1->3->4的路线遍历所有节点，总路程为4。
 */
public class Main2 {

    public static void main(String[] args) throws Exception {

        System.out.println(checkPerfectNumber(28));
    }


    public static boolean checkPerfectNumber(int num) {
        int res = 1;
        int temp = (int) Math.sqrt(num);
        temp++;
        for (int i = 2; i < temp; i++) {
            if (num % i == 0) {
                res += i;
                res += num / i;
            }
        }
        return res == num;
    }


    public static boolean judgeSquareSum(int c) {
        int j = (int) Math.sqrt(c);
        j++;
        int i = 0;
        while (i <= j) {
            int temp = i * i + j * j;
            if (temp == c) {
                return true;
            }
            if (temp < c) {
                i++;
            } else {
                j--;
            }

        }
        return false;
    }
}
