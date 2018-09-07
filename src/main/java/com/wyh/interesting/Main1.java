package com.wyh.interesting;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        foo3();
    }


    /**
     * 又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
     * 牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
     * 在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
     * 牛牛觉得这个问题太简单，所以希望你来替他回答。
     * <p>
     * 输入描述:
     * <p>
     * 第一行一个数n(1 <= n <= 105)。
     * 第二行n个数ai(1 <= ai <= 1000)，表示从左往右数第i堆有多少苹果
     * 第三行一个数m(1 <= m <= 105)，表示有m次询问。
     * 第四行m个数qi，表示小易希望知道第qi个苹果属于哪一堆。
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * m行，第i行输出第qi个苹果属于哪一堆。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 5
     * 2 7 3 4 9
     * 3
     * 1 25 11
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 1
     * 5
     * 3
     */
    public static void foo3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int data = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            a[i] = data + input;
            data = a[i];
        }
        int m = in.nextInt();
        int q[] = new int[m];
        for (int i = 0; i < m; i++) {
            q[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int temp = q[i];
            int index = Arrays.binarySearch(a, temp); //java自带的二分查找，不用自己造轮子了
            if (index > 0) {
                System.out.println(index);
            } else {
                System.out.println(-index);
            }
        }
    }

    /**
     * 小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。
     * 你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。
     * 输入描述:
     * <p>
     * 第一行 n, k (1 <= n, k <= 105) ，表示这堂课持续多少分钟，以及叫醒小易一次使他能够保持清醒的时间。
     * 第二行 n 个数，a1, a2, ... , an(1 <= ai <= 104) 表示小易对每分钟知识点的感兴趣评分。
     * 第三行 n 个数，t1, t2, ... , tn 表示每分钟小易是否清醒, 1表示清醒。
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 小易这堂课听到的知识点的最大兴趣值。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 6 3
     * 1 3 5 2 5 4
     * 1 1 0 1 0 0
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 16
     */
    public static void foo2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1) {
            System.out.println(0);
        }
        int k = in.nextInt();
        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr1[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            arr2[i] = in.nextInt();
            if (arr2[i] == 1) {
                sum += arr1[i];
            }
        }
        int max = 0;
        for (int i = 1; i <= n - k + 1; i++) {
            int m = 0;
            for (int j = 0; j < k; j++) {
                if (arr2[i + j] == 0) {
                    m += arr1[i + j];
                }
            }
            max = max > m ? max : m;
        }

        System.out.println(sum + max);
    }

    public static int[] dp;


    /**
     * 小易有一个古老的游戏机，上面有着经典的游戏俄罗斯方块。因为它比较古老，所以规则和一般的俄罗斯方块不同。
     * 荧幕上一共有 n 列，每次都会有一个 1 x 1 的方块随机落下，在同一列中，后落下的方块会叠在先前的方块之上，当一整行方块都被占满时，这一行会被消去，并得到1分。
     * 有一天，小易又开了一局游戏，当玩到第 m 个方块落下时他觉得太无聊就关掉了，小易希望你告诉他这局游戏他获得的分数。
     * <p>
     * 输入描述:
     * <p>
     * 第一行两个数 n, m
     * 第二行 m 个数，c1, c2, ... , cm ， ci 表示第 i 个方块落在第几列
     * 其中 1 <= n, m <= 1000, 1 <= ci <= n
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 小易这局游戏获得的分数
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 3 9
     * 1 1 2 2 2 3 1 2 3
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 2
     */
    public static void foo1() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (m < n) {
            System.out.println(0);
            return;
        }
        int[] res = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            int c = in.nextInt();
            res[c] += 1;
        }
        int min = res[1];
        for (int i = 2; i <= n; i++) {
            min = min < res[i] ? min : res[i];
        }
        System.out.println(min);
    }
}
