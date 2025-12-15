package com.leetcode.week1.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for ContainsDuplicate problem
 */
class ContainsDuplicateTest {
    
    private final ContainsDuplicate solution = new ContainsDuplicate();
    
    @Test
    @DisplayName("Test Example 1: [1,2,3,1] - contains duplicate")
    void testExample1() {
        int[] nums = {1, 2, 3, 1};
        
        assertTrue(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test Example 2: [1,2,3,4] - no duplicates")
    void testExample2() {
        int[] nums = {1, 2, 3, 4};
        
        assertFalse(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test Example 3: [1,1,1,3,3,4,3,2,4,2] - multiple duplicates")
    void testExample3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        
        assertTrue(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with single element")
    void testSingleElement() {
        int[] nums = {1};
        
        assertFalse(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with empty array")
    void testEmptyArray() {
        int[] nums = {};
        
        assertFalse(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with null array")
    void testNullArray() {
        int[] nums = null;
        
        assertFalse(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with two identical elements")
    void testTwoIdenticalElements() {
        int[] nums = {5, 5};
        
        assertTrue(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with two different elements")
    void testTwoDifferentElements() {
        int[] nums = {3, 7};
        
        assertFalse(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with negative numbers")
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -1};
        
        assertTrue(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with zeros")
    void testZeros() {
        int[] nums = {0, 1, 2, 0};
        
        assertTrue(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with large array no duplicates")
    void testLargeArrayNoDuplicates() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        
        assertFalse(solution.containsDuplicate(nums));
    }
    
    @Test
    @DisplayName("Test with duplicate at end")
    void testDuplicateAtEnd() {
        int[] nums = {1, 2, 3, 4, 5, 1};
        
        assertTrue(solution.containsDuplicate(nums));
    }
}
