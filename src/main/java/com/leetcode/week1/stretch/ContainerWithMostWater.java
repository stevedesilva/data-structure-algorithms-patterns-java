package com.leetcode.week1.stretch;

/**
 * LeetCode Problem #11: Container With Most Water
 * 
 * Problem Description:
 * You are given an integer array height of length n. There are n vertical lines drawn such that
 * the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the container
 * contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Note: You may not slant the container.
 * 
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The vertical lines are at indices 1 and 8, with heights 8 and 7.
 * The area is min(8, 7) * (8 - 1) = 7 * 7 = 49.
 * 
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 * 
 * Approach:
 * Use two pointers - one at the start and one at the end of the array.
 * 
 * Key insight:
 * - Water contained = min(height[left], height[right]) * (right - left)
 * - The width decreases as we move pointers inward
 * - To potentially increase area, we need to increase height
 * - Move the pointer with smaller height inward (the bottleneck)
 * 
 * Algorithm:
 * 1. Start with left = 0, right = n-1
 * 2. Calculate area with current pointers
 * 3. Move the pointer pointing to shorter line inward
 * 4. Repeat until left >= right
 * 5. Return maximum area found
 * 
 * Time Complexity: O(n) where n is the length of the array
 * - We traverse the array once with two pointers
 * 
 * Space Complexity: O(1)
 * - Only using constant extra space for variables
 * 
 * Key Insights:
 * - Two-pointer technique for optimal solution
 * - Greedy approach: always move the shorter line
 * - Width decreases, so we need height increase to potentially beat current max
 * - Moving the taller line can never increase area (width decreases, height can't increase)
 */
public class ContainerWithMostWater {
    
    /**
     * Finds the maximum area of water that can be contained.
     * 
     * @param height Array of line heights
     * @return Maximum water area
     */
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            // Calculate area with current lines
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            
            // Update maximum area
            maxArea = Math.max(maxArea, area);
            
            // Move the pointer with smaller height
            // This is the greedy choice: we want to potentially find a taller line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}
