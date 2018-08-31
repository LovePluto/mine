package com.wyh.LeetCode;


/**
 * 5. 最长回文子串
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 * <p>
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Main19 {

    public static String max;

    public static void main(String[] args) throws Exception {

        String s = "babad";
        String s1 = "cbbd";
        String s2 = "bb";
        String s3 = "ac";
        System.out.println(longestPalindrome(s1));
//        System.out.println(solve(s2));
    }

    //能过版本
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        max = s.substring(0, 1);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (j - i >= max.length() && solve(c, i, j)) {
                    max = s.substring(i, j + 1);
                }
            }
        }
        return max;
    }

    public static boolean solve(char[] chars, int i, int j) {
        while (i < j) {
            if (!(chars[i] == chars[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     *   超时 测试用列 1000 aaaaa...
     *   原因：用 substring 对空间开销和时间开销都比较，所说义超时
     *   优化建议：用数组代替，最后转成数组
     *
     */

//    public static String longestPalindrome(String s) {
//        if (s == null || s.length() == 0 || s.length() == 1) {
//            return s;
//        }
//        max = "";
//        for (int i = 0; i < s.length(); ++i) {
//            for (int j = i + 1; j < s.length() + 1; ++j) {
//                if ((j - i) > max.length() && solve(s.substring(i, j))) {
//                    max = s.substring(i, j);
//                }
//            }
//        }
//        return max;
//    }
//
//    public static boolean solve(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j) {
//            if (!s.substring(i, i + 1).equals(s.substring(j, j + 1))) {
//                return false;
//            }
//            ++i;
//            --j;
//        }
//        return true;
//    }
}
