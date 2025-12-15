package com.leetcode.week3.core;

/**
 * LeetCode Problem #704: Binary Search
 * 
 * Problem Description:
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index.
 * Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * 
 * Example 2:
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * 
 * Approach:
 * Classic binary search algorithm.
 * Repeatedly divide the search space in half by comparing target with middle element.
 * 
 * Algorithm:
 * 1. Initialize left = 0, right = nums.length - 1
 * 2. While left <= right:
 *    - Calculate mid = left + (right - left) / 2
 *    - If nums[mid] == target, return mid
 *    - If nums[mid] < target, search right half (left = mid + 1)
 *    - If nums[mid] > target, search left half (right = mid - 1)
 * 3. Return -1 if not found
 * 
 * Time Complexity: O(log n) where n is the length of the array
 * - We halve the search space in each iteration
 * 
 * Space Complexity: O(1)
 * - Only using constant extra space
 * 
 * Key Insights:
 * - Use (left + right) / 2 carefully to avoid overflow; prefer left + (right - left) / 2
 * - Ensure loop condition is left <= right (not left < right)
 * - Classic divide and conquer algorithm
 */
public class BinarySearch {
    
    /**
     * Searches for target in a sorted array using binary search.
     * 
     * @param nums   Sorted array of integers
     * @param target Value to search for
     * @return Index of target if found, -1 otherwise
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
