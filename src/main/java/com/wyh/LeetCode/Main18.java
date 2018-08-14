package com.wyh.LeetCode;


/**
 * 121. 买卖股票的最佳时机
 * <p>
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class Main18 {

    public static int[] dp;

    public static void main(String[] args) throws Exception {
        int[] array = {7, 6, 4, 3, 1};
        int[] array1 = {7, 1, 5, 3, 6, 4};
        int[] array2 = {1, 2};
        System.out.println(maxProfit(array2));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }


    //能 a
//    public static int maxProfit(int[] prices) {
//        if (prices.length < 1) {
//            return 0;
//        }
//        int max = 0;
//        dp = new int[prices.length];
//        dp[0] = 0;
//        for (int i = 1; i < prices.length; i++) {
//            dp[i] = Math.max(prices[i] - prices[0], dp[i - 1]);
//            max = Math.max(max, dp[i]);
//        }
//
//        for (int i = 1; i < prices.length; i++) {
//            for (int j = 1; j < prices.length; j++) {
//                if (i < j) {
//                    dp[i] = Math.max(prices[j] - prices[i], dp[i - 1]);
//                    max = Math.max(max, dp[i]);
//                }
//            }
//        }
//        return max;
//    }
}
