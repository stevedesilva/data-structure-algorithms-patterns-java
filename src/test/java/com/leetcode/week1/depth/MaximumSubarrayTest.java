package com.leetcode.week1.depth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for MaximumSubarray problem
 */
class MaximumSubarrayTest {
    
    private final MaximumSubarray solution = new MaximumSubarray();
    
    @Test
    @DisplayName("Test Example 1: [-2,1,-3,4,-1,2,1,-5,4]")
    void testExample1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6; // [4,-1,2,1]
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 2: [1]")
    void testExample2() {
        int[] nums = {1};
        int expected = 1;
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 3: [5,4,-1,7,8]")
    void testExample3() {
        int[] nums = {5, 4, -1, 7, 8};
        int expected = 23;
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test all negative numbers")
    void testAllNegative() {
        int[] nums = {-3, -2, -5, -1, -4};
        int expected = -1; // Single element -1
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test all positive numbers")
    void testAllPositive() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15; // Sum of all
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with zeros")
    void testWithZeros() {
        int[] nums = {-2, 0, -1, 0, 3};
        int expected = 3;
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test alternating positive and negative")
    void testAlternating() {
        int[] nums = {5, -3, 5};
        int expected = 7; // [5,-3,5]
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test two elements - both negative")
    void testTwoNegative() {
        int[] nums = {-5, -3};
        int expected = -3;
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test large positive then negatives")
    void testLargePositiveThenNegatives() {
        int[] nums = {8, -19, 5, -4, 20};
        int expected = 21; // [5,-4,20]
        
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test null array throws exception")
    void testNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.maxSubArray(null);
        });
    }
    
    @Test
    @DisplayName("Test empty array throws exception")
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.maxSubArray(new int[]{});
        });
    }
}
