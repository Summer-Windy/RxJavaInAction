package com.nelson.leetcode.climbStairs;

/**
 * @author bingbing.xbb
 * @Date 2020-09-22
 */
public class Solution {

    /**
     * 递归调用的效率低
     * 栈的深度比较高
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (1 == n) {
            return 1;
        }
        if (0 == n){
            return 1;
        }
        for (; n >= 2; n--) {
            return climbStairs(n-1) + climbStairs(n - 2);
        }
        return 0;
    }

    public static void main(String[] args) {
        // 太耗时
        // 堆栈深度太深
        Solution solution = new Solution();
        int i = solution.climbStairs(44);
        System.out.println("====");
        System.out.println(i);
    }
}
