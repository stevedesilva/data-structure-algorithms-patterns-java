package com.leetcode.week1.depth;

/**
 * LeetCode Problem #53: Maximum Subarray
 * 
 * Problem Description:
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 * 
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * 
 * Approach:
 * Use Kadane's Algorithm - a dynamic programming approach.
 * 
 * Key insight: At each position, we decide whether to:
 * 1. Extend the current subarray (current_sum + nums[i])
 * 2. Start a new subarray from current position (nums[i])
 * 
 * We take the maximum of these two options.
 * 
 * Algorithm:
 * - Keep track of current subarray sum
 * - Keep track of maximum sum seen so far
 * - For each element:
 *   - Update current sum = max(nums[i], current_sum + nums[i])
 *   - Update max sum if current sum is larger
 * 
 * Time Complexity: O(n) where n is the length of the array
 * - Single pass through the array
 * 
 * Space Complexity: O(1)
 * - Only using constant extra space for variables
 * 
 * Key Insights:
 * - This is Kadane's Algorithm - a classic DP problem
 * - At each step, decide: continue current subarray or start new one
 * - If current sum becomes negative, better to start fresh
 * - Works with all negative numbers too (returns the largest negative)
 */
public class MaximumSubarray {
    
    /**
     * Finds the maximum sum of any contiguous subarray.
     * 
     * @param nums Array of integers
     * @return Maximum sum of any contiguous subarray
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Either extend current subarray or start new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maximum sum if current is larger
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
