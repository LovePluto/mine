package com.wyh.LeetCode;


/**
 * * 2018.08.01
 * <p>
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * <p>
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * <p>
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * <p>
 * 注意:
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Main2 {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(reverse((int) Math.pow(2, 30)));
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        System.out.println(reverse2((int) Math.pow(2, 30)));
        System.out.println(System.currentTimeMillis() - time);
    }

    /**
     * 自己的算法
     * 借助 String api 直接逆序数字，然后根据规则返回
     *
     * @param x
     * @return
     */
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

    /**
     * 不是我自己想的解法
     *
     * @param x
     * @return
     */
    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
