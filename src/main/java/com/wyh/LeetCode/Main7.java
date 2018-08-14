package com.wyh.LeetCode;

/**
 * 11. 盛最多水的容器
 * <p>
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 */
public class Main7 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] arr1 = new int[]{1, 1};
        System.out.println(maxArea(arr));
    }

    /**
     * 坐标对应的值是高，坐标差是宽，计算面积
     * 采用滑动模型，两边朝中间靠拢
     * 因为宽是不断减少，所以每次移动坐标值小的一边的指针
     * 这样采用保证下一个的的面积有可能比之前的面积大
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int max = 0;
        int length = height.length - 1;
        int start = 0;
        int end = height.length - 1;
        int temp = 0;
        while (length > 0 || start > end) {
            temp = Math.min(height[start], height[end]) * length;
            max = max > temp ? max : temp;
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
            length--;
        }
        return max;
    }
}
