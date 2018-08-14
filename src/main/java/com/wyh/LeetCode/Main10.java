package com.wyh.LeetCode;

/**
 * 直接看 Main 15 的零钱兑换
 * <p>
 * 给定数组arr，arr中所有的值都为正数且不重复。
 * 每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个整数aim代表要找的钱数，求换钱有多少种方法。
 * <p>
 * arr={5、10、25、1}，aim=1000
 */
public class Main10 {


    public static void main(String[] args) throws Exception {
        int[] arr = {5, 10, 25, 3};
        int aim = 1000;
        System.out.println(coins1(arr, aim));
    }

    public static int coins1(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        return process(arr, 0, aim);
    }


    public static int process(int[] arr, int index, int aim) {
        int res = 0;
        if (arr.length == index) {
            return (aim == 0 ? 1 : 0);
        }
        for (int i = 0; arr[index] * i <= aim; i++) {
            // arr[index]选i张时，让剩下的货币组成aim-arr[index]*i面额的方法数，即res_i
            // 总的方法数即为res_0+res_1+...+res_(aim/arr[index])
            res += process(arr, index + 1, aim - arr[index] * i);
        }
        return res;
    }
}
