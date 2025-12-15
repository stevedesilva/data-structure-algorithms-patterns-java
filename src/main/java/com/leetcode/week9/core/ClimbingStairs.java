package com.leetcode.week9.core;

/**
 * LeetCode Problem #70: Climbing Stairs
 * 
 * Problem Description:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * Approach:
 * This is a classic dynamic programming problem that follows the Fibonacci pattern.
 * 
 * Key insight:
 * - To reach step n, you can come from step (n-1) with 1 step, or step (n-2) with 2 steps
 * - Therefore: ways(n) = ways(n-1) + ways(n-2)
 * - This is the Fibonacci sequence!
 * 
 * Base cases:
 * - ways(1) = 1 (only one way: take 1 step)
 * - ways(2) = 2 (two ways: 1+1 or 2)
 * 
 * We can optimize space by only keeping track of the last two values.
 * 
 * Time Complexity: O(n)
 * - We calculate each step once
 * 
 * Space Complexity: O(1)
 * - Only using constant space (two variables)
 * 
 * Key Insights:
 * - Recognize Fibonacci pattern in problem
 * - Dynamic programming with space optimization
 * - Can also solve with recursion + memoization
 */
public class ClimbingStairs {
    
    /**
     * Calculates the number of distinct ways to climb n stairs.
     * 
     * @param n Number of stairs
     * @return Number of distinct ways to reach the top
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        // Space-optimized DP
        int prev2 = 1; // ways to reach step 1
        int prev1 = 2; // ways to reach step 2
        
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}
