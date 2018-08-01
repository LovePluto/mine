package com.wyh.LeetCode;


/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 *
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Main2 {

    public static void main(String[] args) {

        System.out.println(reverse((int) Math.pow(2, 35)));
    }

    public static int reverse(int x) {
        String num;
        String resultS;
        int result;
        try {
            if (x > 0) {
                num = String.valueOf(x);
                resultS = new StringBuilder(num).reverse().toString();
                result = Integer.valueOf(resultS);
                return result;
            } else {
                num = String.valueOf(x).replace("-", "");
                resultS = new StringBuilder(num).reverse().toString();
                result = Integer.valueOf(resultS);
                return -result;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}
