package com.leetcode.week1.depth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for ProductOfArrayExceptSelf problem
 */
class ProductOfArrayExceptSelfTest {
    
    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
    
    @Test
    @DisplayName("Test Example 1: [1,2,3,4]")
    void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 2: [-1,1,0,-3,3]")
    void testExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with two elements")
    void testTwoElements() {
        int[] nums = {2, 3};
        int[] expected = {3, 2};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with all ones")
    void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with negative numbers")
    void testNegativeNumbers() {
        int[] nums = {-2, -3, -4};
        int[] expected = {12, 8, 6};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with zero at beginning")
    void testZeroAtBeginning() {
        int[] nums = {0, 2, 3};
        int[] expected = {6, 0, 0};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with zero at end")
    void testZeroAtEnd() {
        int[] nums = {2, 3, 0};
        int[] expected = {0, 0, 6};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with multiple zeros")
    void testMultipleZeros() {
        int[] nums = {0, 0, 3};
        int[] expected = {0, 0, 0};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with larger array")
    void testLargerArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {120, 60, 40, 30, 24};
        
        int[] result = solution.productExceptSelf(nums);
        
        assertArrayEquals(expected, result);
    }
}
