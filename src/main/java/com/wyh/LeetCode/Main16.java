package com.wyh.LeetCode;

/**
 * 53. 最大子序和
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * <p>
 * 这道题的难度在于，随着循环的增加，初试的状态会修改
 * 思路从二维数组到一维数组的变化，初试题目是一维数组
 * 就尽量用一维数组的状态表示，不要用二维数组储存中间计算过程
 */
public class Main16 {
    public static void main(String[] args) throws Exception {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] array1 = {-1, -2};
        int[] array2 = {-2, -1};
        int[] array3 = {-2, -3, -1};
        int[] array4 = {2, -1, 1, 1};
        int[] array5 = {-2147483647};
        System.out.println(maxSubArray(array1));
    }

    //    public static int[][] dp;
    public static int[] dp;
    public static int max = 0;


    // 搞定收工
    public static int maxSubArray(int[] nums) {
        //长度 1 就直接返回，没有必要计算
        if (nums.length == 1) {
            return nums[0];
        }
        max = nums[0];
        dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = -10000;
        }
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = dp[i] > max ? dp[i] : max;
        }
        return max;
    }

    //这个版本的算法已经能过所有测试用列了
//    public static int maxSubArray(int[] nums) {
//        //长度 1 就直接返回，没有必要计算
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        max = nums[nums.length - 1];
//        dp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            dp[i] = -10000;
//        }
//        solve(nums.length - 1, nums[nums.length - 1], nums);
//        return max;
//    }
//
//    public static int solve(int index, int total, int[] nums) {
//        if (index < 0) {
//            return -100000;
//        }
//        if (dp[index] != -10000) {
//            return dp[index];
//        }
//        total = Math.max(nums[index] + solve(index - 1, total, nums), nums[index]);
//        dp[index] = total;
//        max = Math.max(max, total);
//        return total;
//    }

    //新版暴力搜索，必须开一个临时记录的空间
//    public static int max = 0;
//
//    public static int maxSubArray(int[] nums) {
//        max = nums[nums.length - 1];
//        solve(nums.length - 1, nums[nums.length - 1], nums);
//        return max;
//    }
//
//    public static int solve(int index, int total, int[] nums) {
//        if (index < 0) {
//            return -100000;
//        }
//        total = Math.max(nums[index] + solve(index - 1, total, nums), nums[index]);
//        max = Math.max(max, total);
//        return total;
//    }


    //多次修改无果，放弃这个版本动态规划，从暴力搜索从新开始
//    public static int maxSubArray(int[] nums) {
//        if (nums.length < 1) {
//            return 0;
//        }
//        dp = new int[nums.length][nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                dp[i][j] = Integer.MIN_VALUE;
//            }
//        }
//        dp[0][0] = nums[0];
//        //这里多次修改无果
//        for (int i = 1; i < nums.length; i++) {
////            dp[0][i] = dp[0][i - 1] + nums[i];
//            dp[0][i] = Math.max(dp[0][i - 1] + nums[i], dp[0][i - 1]);
////            dp[0][i] = dp[0][i-1]+nums[i];
//        }
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (i <= j) {
//                    int total = 0;
//                    for (int x = i; x <= j; x++) {
//                        total += nums[x];
//                    }
//                    total = Math.max(total, dp[i - 1][j]);
//                    total = Math.max(total, dp[i][j - 1]);
//                    dp[i][j] = total;
//                }
//
//            }
//        }
//        return dp[nums.length - 1][nums.length - 1];
//    }


    //换种顺序的记忆搜索
//    public static int maxSubArray(int[] nums) {
//        dp = new int[nums.length][nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                dp[i][j] = Integer.MIN_VALUE;
//            }
//        }
//        int a = solve(nums.length - 1, nums.length - 1, nums);
//        return a;
//    }
//
//    public static int solve(int start, int end, int[] nums) {
//        if (start > end) {
//            return Integer.MIN_VALUE;
//        }
//        if (start < 0) {
//            return Integer.MIN_VALUE;
//        }
//        if (end < 0) {
//            return Integer.MIN_VALUE;
//        }
//        if (dp[start][end] != Integer.MIN_VALUE) {
//            return dp[start][end];
//        }
//        int total = 0;
//        for (int i = start; i <= end; i++) {
//            total += nums[i];
//        }
//        int b = solve(start, end - 1, nums);
//        int a = solve(start - 1, end, nums);
//        total = Math.max(total, a);
//        total = Math.max(total, b);
//        dp[start][end] = total;
//        return total;
//    }

    //记忆搜索，超时
//    public static int maxSubArray(int[] nums) {
//        dp = new int[nums.length][nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                dp[i][j] = Integer.MIN_VALUE;
//            }
//        }
//        int a = solve(0, 0, nums);
//        return a;
//    }
//
//    public static int solve(int start, int end, int[] nums) {
//        if (start > end) {
//            return Integer.MIN_VALUE;
//        }
//        if (start > nums.length - 1) {
//            return Integer.MIN_VALUE;
//        }
//        if (end > nums.length - 1) {
//            return Integer.MIN_VALUE;
//        }
//        if (dp[start][end] != Integer.MIN_VALUE) {
//            return dp[start][end];
//        }
//        int total = 0;
//        for (int i = start; i <= end; i++) {
//            total += nums[i];
//        }
//        int b = solve(start, end + 1, nums);
//        int a = solve(start + 1, end, nums);
//        total = Math.max(total, a);
//        total = Math.max(total, b);
//        dp[start][end] = total;
//        return total;
//    }


    //暴力搜索，超时
//    public static int maxSubArray(int[] nums) {
//        return solve(0, 0, nums);
//    }
//    public static int solve(int start, int end, int[] nums) {
//        if (start > end) {
//            return Integer.MIN_VALUE;
//        }
//        if (start > nums.length - 1) {
//            return Integer.MIN_VALUE;
//        }
//        if (end > nums.length - 1) {
//            return Integer.MIN_VALUE;
//        }
//        int total = 0;
//        for (int i = start; i <= end; i++) {
//            total += nums[i];
//        }
//
//        int b = solve(start, end + 1, nums);
//        int a = solve(start + 1, end, nums);
//        total = Math.max(total, a);
//        total = Math.max(total, b);
//        return total;
//    }
}
