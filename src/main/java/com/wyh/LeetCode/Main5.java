package com.wyh.LeetCode;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class Main5 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(minPathSum(array));
        System.out.println(minPathSum2(array));
    }

    /**
     * 并不是自己做出来的，大佬直接给出答案
     * 1.求解出递推公式
     * 2.递推求解
     *
     * @param grid
     * @return
     */
    public static int minPathSum(int[][] grid) {
        if (grid == null && grid.length < 1) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int[][] result = new int[row][col];
        result[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < col; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (result[i - 1][j] > result[i][j - 1]) {
                    result[i][j] = result[i][j - 1] + grid[i][j];
                } else {
                    result[i][j] = result[i - 1][j] + grid[i][j];
                }
            }
        }
        return result[row - 1][col - 1];
    }

    public static int minPathSum2(int[][] grid) {
        if (grid.length == 0) {//检测输入参数为空
            return 0;
        }
        int rows = grid.length;//记录数组行数
        int acrosses = grid[0].length;//记录数组列数
        int route[][] = new int[rows][acrosses];//创建数组用于dp，行列数与grid一致，初始化为0

        route[0][0] = grid[0][0];//第一个直接使用数组左上角元素
        for (int i = 1; i < rows; i++) {
            route[i][0] = route[i - 1][0] + grid[i][0];//第1列每个位置的dp值等于上一行的dp值加上grid数组和自己位置一样的数，表示从左上角一直走下来的路径长度（不能向左走）
        }
        for (int j = 1; j < acrosses; j++) {
            route[0][j] = route[0][j - 1] + grid[0][j];//和上面同理，处理第1行
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < acrosses; j++) {
                route[i][j] = (route[i - 1][j] > route[i][j - 1] ? route[i][j - 1] : route[i - 1][j]) + grid[i][j];
            }
        }//对于不是第1行或第1列的元素，dp数组的值等于它上方或左方的两个数中较小那个，加上grid数组中和自己位置一样的那个数，表示来到此格的最短路径长度。
        return route[rows - 1][acrosses - 1];//返回右下角的值
    }

}
