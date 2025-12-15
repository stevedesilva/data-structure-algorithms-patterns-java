package com.leetcode.week1.core;

/**
 * LeetCode Problem #121: Best Time to Buy and Sell Stock
 * 
 * Problem Description:
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve
 * any profit, return 0.
 * 
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * 
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 * Approach:
 * Use a single pass through the array, keeping track of:
 * 1. The minimum price seen so far (potential buy price)
 * 2. The maximum profit achievable so far
 * 
 * For each price:
 * - Calculate the profit if we sell at current price (current price - min price)
 * - Update max profit if current profit is higher
 * - Update min price if current price is lower
 * 
 * Time Complexity: O(n) where n is the length of the prices array
 * - Single pass through the array
 * 
 * Space Complexity: O(1)
 * - Only using constant extra space for variables
 * 
 * Key Insights:
 * - We need to buy before we sell (can't sell then buy)
 * - Keep track of the minimum price seen so far as potential buy point
 * - At each step, calculate potential profit and update maximum
 * - This is a classic example of Kadane's algorithm variant
 */
public class BestTimeToBuyAndSellStock {
    
    /**
     * Calculates the maximum profit from a single buy-sell transaction.
     * 
     * @param prices Array of stock prices where prices[i] is the price on day i
     * @return Maximum profit achievable, or 0 if no profit is possible
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // Update minimum price if current price is lower
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Calculate profit if we sell at current price
                int profit = price - minPrice;
                // Update max profit if current profit is higher
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        
        return maxProfit;
    }
}
