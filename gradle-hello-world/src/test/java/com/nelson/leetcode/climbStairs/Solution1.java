package com.nelson.leetcode.climbStairs;

/**
 * @author bingbing.xbb
 * @Date 2020-09-22
 */
public class Solution1 {

    /**
     * 数组比递归调用的效率高很多
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        Integer[] nums = new Integer[n + 1];

        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n];
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int i = solution.climbStairs(44);
        System.out.println("====");
        System.out.println(i);
    }
}
