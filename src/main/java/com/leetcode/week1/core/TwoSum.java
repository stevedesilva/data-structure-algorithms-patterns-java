package com.leetcode.week1.core;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem #1: Two Sum
 * 
 * Problem Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * Approach:
 * Use a HashMap to store each number and its index as we iterate through the array.
 * For each element, check if the complement (target - current number) exists in the map.
 * If it exists, we've found our pair. If not, add the current number to the map.
 * 
 * Time Complexity: O(n) where n is the length of the array
 * - We traverse the list containing n elements only once
 * - Each lookup in the hash table costs O(1) time
 * 
 * Space Complexity: O(n)
 * - The extra space required depends on the number of items stored in the hash table,
 *   which stores at most n elements
 * 
 * Key Insights:
 * - Hash map provides O(1) lookup time, making this approach efficient
 * - By checking for the complement before adding to the map, we avoid using the same element twice
 * - This is a classic example of trading space for time complexity
 */
public class TwoSum {
    
    /**
     * Finds two indices in the array where the values sum to the target.
     * 
     * @param nums   Array of integers
     * @param target Target sum
     * @return Array containing two indices [i, j] where nums[i] + nums[j] == target
     */
    public int[] twoSum(int[] nums, int target) {
        // Map to store number -> index mapping
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Add current number and its index to map
            numMap.put(nums[i], i);
        }
        
        // No solution found (shouldn't reach here based on problem constraints)
        throw new IllegalArgumentException("No two sum solution");
    }
}
