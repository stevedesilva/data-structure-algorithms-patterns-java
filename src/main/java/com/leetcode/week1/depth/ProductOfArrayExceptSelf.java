package com.leetcode.week1.depth;

/**
 * LeetCode Problem #238: Product of Array Except Self
 * 
 * Problem Description:
 * Given an integer array nums, return an array answer such that answer[i] is equal to
 * the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * 
 * Approach:
 * Use two passes to compute products:
 * 1. Left pass: Calculate product of all elements to the left of each index
 * 2. Right pass: Calculate product of all elements to the right and combine with left products
 * 
 * The key insight is that for each position i:
 * answer[i] = (product of all elements to the left) * (product of all elements to the right)
 * 
 * We can do this in O(n) time and O(1) extra space (not counting output array).
 * 
 * Time Complexity: O(n) where n is the length of the array
 * - Two passes through the array
 * 
 * Space Complexity: O(1) extra space (output array doesn't count)
 * - We use the output array itself to store intermediate results
 * - Only a constant amount of extra variables
 * 
 * Key Insights:
 * - Can't use division (otherwise would divide total product by nums[i])
 * - Two-pass approach: left products, then right products
 * - Optimize space by storing left products in result array
 * - Use a variable to track running right product in second pass
 */
public class ProductOfArrayExceptSelf {
    
    /**
     * Returns an array where each element is the product of all other elements.
     * 
     * @param nums Input array of integers
     * @return Array where answer[i] = product of all elements except nums[i]
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // First pass: calculate left products
        // answer[i] contains product of all elements to the left of i
        answer[0] = 1; // No elements to the left of first element
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Second pass: calculate right products and combine with left products
        // Use a variable to track running product from right
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return answer;
    }
}
