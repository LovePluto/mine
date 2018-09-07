package com.wyh.interesting;

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
//        foo3();
    }
    /**
     * 牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
     * 例如:s = AGGTCTA
     * 序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。
     * 输入描述:
     * <p>
     * 输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 2000),其中只包含'A','C','G','T'这四种字符。
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个正整数,即最短没有出现在DNA序列s中的DNA片段的长度。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * AGGTCTA
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 2
     * <p>
     * CCATATCTCTATAATTAAGAGTGCACTAGGCACTTCCTAACTTAACTTGGGGAACACCCGCAACACGGAAACCTAAAAGTGACCGTACACGCAATATCTACTCATGTGGGCAATTTTCGGACTTTTAGTACGATGCCGTCGCTCGATAAAGTCATCAGTCC
     * CTTGAATAACTCCTGCACGATCAAGAGATTGCAGTGCAACCCAGACATCAACGAGGTGAGGATAAACTTGACGCGTCCGTCGTTAGTCTGTCAATATTCCGCATAGTATACTGCTGCGATGGGACTCGCGGAACGGGAGCCTATGATCAGCCATGAGCCCAGAACCTCACGACAGACGGGC
     * CCACCGCGTTCGATGACGTGATCTAGTACAATCTCATTTAAAGAGATAGGTGTTTGGCGTATTCCTATTGAAGGCTTTGTAAGTACAAAGTCCTCAAAGGCTTTCGATTTACAGGTGAAGGTTTTATAGCAGGCGTAACACATCGACTGAACGGCTTTACCCTATCA
     * GGAATGTTTTTCTTGACAGGATCGCGACAACATCCCAAACATCGCATCCCCCGCGAGCCGGATTAAATTTGGCCAAGACGACAGATTTCTAGGGACGCACCACGAAAAGCCCGCCGACTAGCTACTCGACGGTTCCCTTCTGCTTGCCGAATGGCTATAATTAAAAACTT
     * GCGAAGGACCATATGTGAACTGCACGCGAACTCTTCGGGTTTACGGCTATGCCGTGTATACTGCCTACTCCCGGATCTTATTTACTCAGTGCCGATGGCGTGACACTTTGGGCGTGCAGTTCCTAGGATTGCTGAGGCTTGTGATTTTGGCGTCAAGAGAGTGGTGCGCA
     * CGCACAATCCAAACCCAAGCGTTAGCCTCTGAACAGATATGTTGTGCTCATTCTGACAAAGGAACAAGGGGTGGTTGGAGAAATACACGATGTCAACACCCAGTATTTGGGCCCTAAAACTCGCCTTAGTGTCTAGGCGAAAGGATAAGCACCGCTTTCGGTCCTGGAGATTC
     * CCTCGTGTCGGCACGAGTCCCACTATACCAAAATGCTAACTACAAAAATAATCAATGTACGTCCGGACAGTTTTCATTCTGGGCAAGGATGTAAACTTTTGTAATCTGCACCATGTAAGGGGTTGGACTGTTCGGACGGAGCAATCTTAATCTCCGCTGATAAACAAACGGGCCT
     * TTTGGATGCGTTTGTCAAGCTACCAAGGGGAAAACCTGCCTGGATATGAACCTATACACTGCGAGGTAGCCTAAAAGGAAGCTGGAGTAGGGGGGAAGTAGGTTCGTAACAACTTTTAGAGGCTTCAACTTAAGTTTCACAAAGTGGCTGTTTAGACGCGAAGCTTGGATGCAAAA
     * ATCTGCGCTCTTTGGTAAATAGTTGTAAATTGCTCCCAGGAACTGATAAGTCCATTCCCAGTGCGACTAACAGACGCTGTCGTCGCTTGAGCTCAGGAAAGTCGTCGGGGACCCACAGTACGATCAATAGCACTATCAAGACCATTGGTTGCCTCCAGTTCAGAGGGAGTTTA
     * TCGTCCCATGATGTCTTAAAAGCAATATTATAACCCAGGTGTTTAGTCTCGTAGTCCGAGCAATGGCTTCAATCAGGGATCGTTATTCCATAGAAGTACCTGTATGTTTGCGGGCGAGTTGGGGCGTTCTCGCATATAGAGGACGAGCGGCTCGTATGGTATACACGCAGTTAG
     * AATCGGCTTCAAGACGTGGACTGAACACGACGACACGGAACAATCCAGCCGTTTCGGTACGAATCTACCGAT
     * CAGCGTGAATTACGACCGGCCCGAGCCATTTCCCATGATTGGATGTACATGCAGCATAATACGAACCCCCGTGTGGCCCCGACTGCCCCCAAAGGTCCCACACCATCCGGAGCCATAGCCAAGATTCCGCACCCCCTACGGTAGCAGCGGATCCAGTTAGGCCTGGGACGAGATGGCCAATAGGGGGTGAGCGGCGTTTGGTCTCCAG
     */
    public static void foo3() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] arr = input.toCharArray();
        int a = 0;
        int c = 0;
        int g = 0;
        int t = 0;
        char temp = 'a';
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                if (arr[i] == temp) {
                    count++;
                } else {
                    count = 1;
                    temp = 'A';
                }
                a = count > a ? count : a;
                continue;
            }

            if (arr[i] == 'C') {
                if (arr[i] == temp) {
                    count++;
                } else {
                    count = 1;
                    temp = 'C';
                }
                c = count > c ? count : c;
                continue;
            }

            if (arr[i] == 'G') {
                if (arr[i] == temp) {
                    count++;
                } else {
                    count = 1;
                    temp = 'G';
                }
                g = count > g ? count : g;
                continue;
            }

            if (arr[i] == 'T') {
                if (arr[i] == temp) {
                    count++;
                } else {
                    count = 1;
                    temp = 'T';
                }
                t = count > t ? count : t;
                continue;

            }
        }
        int res = a < c ? a : c;
        res = res < g ? res : g;
        res = res < t ? res : t;
        System.out.println(res + 1);
    }

    /**
     * 一个完整的括号字符串定义规则如下:
     * 1、空字符串是完整的。
     * 2、如果s是完整的字符串，那么(s)也是完整的。
     * 3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
     * 例如，"(()())", ""和"(())()"是完整的括号字符串，"())(", "()(" 和 ")"是不完整的括号字符串。
     * 牛牛有一个括号字符串s,现在需要在其中任意位置尽量少地添加括号,将其转化为一个完整的括号字符串。请问牛牛至少需要添加多少个括号。
     * 输入描述:
     * <p>
     * 输入包括一行,一个括号序列s,序列长度length(1 ≤ length ≤ 50).
     * s中每个字符都是左括号或者右括号,即'('或者')'.
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数,表示最少需要添加的括号数
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * (()(()
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 2
     */
    public static void foo2() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] arr = input.toCharArray();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i] + "");
            } else {
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    stack.push(arr[i] + "");
                }
            }
        }
        System.out.println(stack.size());
    }


    /**
     * 牛牛举办了一场数字游戏,有n个玩家参加这个游戏,游戏开始每个玩家选定一个数,然后将这个数写在纸上(十进制数,无前缀零),
     * 然后接下来对于每一个数字将其数位按照非递减顺序排列,得到新的数,新数的前缀零将被忽略。得到最大数字的玩家赢得这个游戏。
     * 输入描述:
     * <p>
     * 输入包括两行,第一行包括一个整数n(1 ≤ n ≤ 50),即玩家的人数
     * 第二行n个整数x[i](0 ≤ x[i] ≤ 100000),即每个玩家写下的整数。
     * <p>
     * <p>
     * <p>
     * 输出描述:
     * <p>
     * 输出一个整数,表示赢得游戏的那个玩家获得的最大数字是多少。
     * <p>
     * <p>
     * 输入例子1:
     * <p>
     * 3
     * 9638 8210 331
     * <p>
     * <p>
     * 输出例子1:
     * <p>
     * 3689
     */
    public static void foo() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            char[] temp = new String(arr[i] + "").toCharArray();
            for (int x = 0; x < temp.length; x++) {
                for (int j = 0; j < x; j++) {
                    if (temp[x] < temp[j]) {
                        char c = temp[x];
                        temp[x] = temp[j];
                        temp[j] = c;
                    }
                }
            }
            Integer integer = Integer.valueOf(new String(temp));
            max = max > integer ? max : integer;
        }
        System.out.println(max);
    }
}
