package com.wyh.LeetCode;

/**
 * 198. 打家劫舍
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋。
 * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统,
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
public class Main11 {

    private static int[] result;


    public static void main(String[] args) throws Exception {

        int[] array = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] array1 = {2, 2};
        int[] array2 = {1, 2, 3, 1};
        int[] array3 = {2, 7, 9, 3, 1};
        System.out.println(rob1(array2));

    }


    /**
     * 动态规划，自底向上
     *
     * @param nums
     * @return
     */
    public static int rob1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result[i] = Math.max(nums[i] + result[i - 2], result[i - 1]);
        }
        return result[nums.length - 1];
    }

    public static int rob(int[] nums) {

        result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }
        return solve(nums.length - 1, nums);
    }

    /**
     * 暴力搜索，枚举所有情况
     *
     * @param index
     * @param nums
     * @return
     */
    public static int solve(int index, int[] nums) {
        if (index < 0) {
            return 0;
        }
        // 优化过后，记忆搜索的方式
        if (result[index] >= 0) {
            return result[index];
        }
        result[index] = Math.max(nums[index] + solve(index - 2, nums), solve(index - 1, nums));
        return result[index];
//        return  Math.max(nums[index] + solve(index - 2, nums), solve(index - 1, nums));
    }
}
