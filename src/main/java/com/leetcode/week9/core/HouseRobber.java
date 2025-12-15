package com.leetcode.week9.core;

/**
 * LeetCode Problem #198: House Robber
 * 
 * Problem Description:
 * You are a professional robber planning to rob houses along a street. Each house has a certain
 * amount of money stashed, the only constraint stopping you from robbing each of them is that
 * adjacent houses have security systems connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 * 
 * Given an integer array nums representing the amount of money of each house, return the
 * maximum amount of money you can rob tonight without alerting the police.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total = 1 + 3 = 4.
 * 
 * Example 2:
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total = 2 + 9 + 1 = 12.
 * 
 * Approach:
 * Dynamic Programming - at each house, decide whether to rob it or not.
 * 
 * Key insight:
 * - At house i, we have two choices:
 *   1. Rob house i: take nums[i] + max money up to house i-2
 *   2. Don't rob house i: take max money up to house i-1
 * - Take maximum of these two choices
 * 
 * Recurrence relation:
 * dp[i] = max(nums[i] + dp[i-2], dp[i-1])
 * 
 * Space optimization:
 * - We only need the last two values, not entire array
 * 
 * Time Complexity: O(n) where n is the number of houses
 * - Single pass through the array
 * 
 * Space Complexity: O(1)
 * - Only using two variables for previous states
 * 
 * Key Insights:
 * - Classic DP problem with optimal substructure
 * - Each decision depends on previous decisions
 * - Can optimize space from O(n) to O(1)
 */
public class HouseRobber {
    
    /**
     * Calculates maximum money that can be robbed without robbing adjacent houses.
     * 
     * @param nums Array representing money in each house
     * @return Maximum amount that can be robbed
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        // prev2: max money up to i-2
        // prev1: max money up to i-1
        int prev2 = 0;
        int prev1 = 0;
        
        for (int num : nums) {
            // Max of: rob current house + prev2, or skip current house (prev1)
            int current = Math.max(num + prev2, prev1);
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}
