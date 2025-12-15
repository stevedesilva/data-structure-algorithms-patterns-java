package com.leetcode.week1.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for BestTimeToBuyAndSellStock problem
 */
class BestTimeToBuyAndSellStockTest {
    
    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
    
    @Test
    @DisplayName("Test Example 1: [7,1,5,3,6,4]")
    void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 2: [7,6,4,3,1] - decreasing prices")
    void testExample2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with increasing prices")
    void testIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4; // Buy at 1, sell at 5
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with single price")
    void testSinglePrice() {
        int[] prices = {5};
        int expected = 0;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with two prices - profit possible")
    void testTwoPricesProfit() {
        int[] prices = {1, 5};
        int expected = 4;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with two prices - no profit")
    void testTwoPricesNoProfit() {
        int[] prices = {5, 1};
        int expected = 0;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with null array")
    void testNullArray() {
        int[] prices = null;
        int expected = 0;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with empty array")
    void testEmptyArray() {
        int[] prices = {};
        int expected = 0;
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with valley and peak pattern")
    void testValleyPeakPattern() {
        int[] prices = {5, 2, 8, 1, 9};
        int expected = 8; // Buy at 1, sell at 9
        
        int result = solution.maxProfit(prices);
        
        assertEquals(expected, result);
    }
}
