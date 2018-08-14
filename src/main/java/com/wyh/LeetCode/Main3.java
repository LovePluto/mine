package com.wyh.LeetCode;

/**
 * 2018.08.02
 * 9. 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Main3 {


    public static void main(String[] args) {
        System.out.println(isPalindrome(2221));
        System.out.println(isPalindrome2(222));

    }


    /**
     * 借助 String api 直接逆序然后比较
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        String s1 = x + "";
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }

    /**
     * 进阶版本算法，思路来源于 Main2
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome2(int x) {
        int xx = x;
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        int temp = 0;
        int result = 0;
        while (x != 0) {
            temp = x % 10;
            x = x / 10;
            result = result * 10 + temp;

        }
        return result == xx;
    }
}
