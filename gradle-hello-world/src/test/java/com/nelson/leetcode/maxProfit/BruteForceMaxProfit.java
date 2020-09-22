package com.nelson.leetcode.maxProfit;

/**
 * @author bingbing.xbb
 * @Date 2020-09-22
 */
public class BruteForceMaxProfit implements MaxProfit {
    @Override
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length -1 ; i++) {
            for (int j = i + 1; j <= prices.length-1; j++) {
                int temp = prices[j] - prices[i];
                if (temp > 0 && temp > profit) {
                    profit = temp;
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new BruteForceMaxProfit();
        int profit = maxProfit.maxProfit(new int[]{1, 3, 4, 5, 7});
        System.out.println("++++++");
        System.out.println(profit);
    }
}
