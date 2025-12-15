package com.leetcode.week1.core;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Problem #217: Contains Duplicate
 * 
 * Problem Description:
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 * Approach:
 * Use a HashSet to track elements we've seen as we iterate through the array.
 * If we encounter an element that's already in the set, we've found a duplicate.
 * If we complete the iteration without finding duplicates, return false.
 * 
 * Time Complexity: O(n) where n is the length of the array
 * - We traverse the array once
 * - Each HashSet operation (add, contains) is O(1) average case
 * 
 * Space Complexity: O(n)
 * - In the worst case, we might store all elements in the HashSet
 * 
 * Alternative Approach:
 * - Sort the array first: O(n log n) time, O(1) or O(n) space depending on sort
 * - Then check adjacent elements: O(n) time
 * - Total: O(n log n) time, which is slower than the HashSet approach
 * 
 * Key Insights:
 * - HashSet provides fast lookup and insertion
 * - We can short-circuit as soon as we find a duplicate
 * - Trade space for better time complexity
 */
public class ContainsDuplicate {
    
    /**
     * Checks if the array contains any duplicate elements.
     * 
     * @param nums Array of integers
     * @return true if any value appears at least twice, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If num is already in the set, we found a duplicate
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        // No duplicates found
        return false;
    }
}
