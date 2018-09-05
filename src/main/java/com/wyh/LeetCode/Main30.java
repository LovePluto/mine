package com.wyh.LeetCode;


import java.util.Stack;

/**
 * 84. 柱状图中最大的矩形
 * <p>
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * <p>
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * <p>
 * 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。
 * <p>
 * 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。
 * <p>
 * 示例:
 * <p>
 * 输入: [2,1,5,6,2,3]
 * 输出: 10
 */
public class Main30 {
    public static void main(String[] args) throws Exception {

        int[] arr = {2, 1, 5, 6, 2, 3};
        int[] arr1 = {1, 1};
        int[] arr2 = {1};
        System.out.println(largestRectangleArea1(arr));
    }

    /**
     * 有问题的算法
     *
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }
        int[] dp = new int[heights.length + 1];
        for (int i = 0; i < heights.length; i++) {
            dp[i] = heights[i];
        }
        dp[heights.length] = -1;
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int top = 0;
        int temp;
        for (int i = 0; i < heights.length + 1; i++) {
            if (stack.isEmpty() || dp[i] > dp[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && dp[i] <= dp[stack.peek()]) {
                    top = stack.peek();
                    stack.pop();
                    temp = (i - top) * dp[top];
                    res = Math.max(res, temp);
                }
                stack.push(i);
                dp[top] = dp[i];
            }
        }
        return res;
    }

    public static int largestRectangleArea1(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = 1; j <= heights.length; j++) {
                max = Math.max(max, heights[i] * j);
            }
        }
        return max;
    }

}
