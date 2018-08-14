package com.wyh.LeetCode;

/**
 * 2018.08.04
 * 8. 字符串转整数 (atoi)
 * 实现 atoi，将字符串转为整数。
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * <p>
 * 若函数不能执行有效的转换，返回 0。
 * <p>
 * 说明：
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 * <p>
 * 示例 2:
 * <p>
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 * 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * <p>
 * 示例 3:
 * <p>
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * <p>
 * 示例 4:
 * <p>
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 * 因此无法执行有效的转换。
 * <p>
 * 示例 5:
 * <p>
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 * 因此返回 INT_MIN (−231) 。
 */
public class Main4 {

    public static void main(String[] args) {
        System.out.println(myAtoi(".1"));
        System.out.println(myAtoi("  0000000000012345678"));
        System.out.println(myAtoi("   +0 123"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));

    }


    /**
     * 能 A 但是有点复杂，目前没有更好的想法
     * @param str
     * @return
     */
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        String[] ss = str.split("\\s+");
        if (ss == null || ss.length == 0) {
            return 0;
        }
        String s = ss[0];
        if (s == null || s.length() == 0) {
            s = ss[1];
        }
        if (s.length() == 1) {
            switch (s) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    return Integer.valueOf(s);
                default:
                    return 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        switch (s.substring(0, 1)) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "-":
            case "+":
                sb.append(s.substring(0, 1));
                break;
            default:
                return 0;
        }
        String temp;
        boolean status;
        for (int i = 1; i < s.length(); i++) {
            status = false;
            temp = s.substring(i, i + 1);
            switch (temp) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    sb.append(temp);
                    break;
                default:
                    status = true;
            }
            if (status) {
                break;
            }

        }

        if (sb.length() == 0 || sb.length() == 1) {
            switch (sb.toString()) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    return Integer.valueOf(sb.toString());
                default:
                    return 0;
            }
        }
        if (sb.toString().substring(0, 1).equals("-")) {
            try {
                Integer integer = Integer.valueOf(sb.toString());
                return integer;
            } catch (Exception e) {
                return Integer.MIN_VALUE;
            }

        } else {
            try {
                Integer integer = Integer.valueOf(sb.toString());
                return integer;
            } catch (Exception e) {
                return Integer.MAX_VALUE;
            }
        }
    }

}
