package com.leetcode.week1.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for TwoSum problem
 */
class TwoSumTest {
    
    private final TwoSum solution = new TwoSum();
    
    @Test
    @DisplayName("Test Example 1: [2,7,11,15], target=9")
    void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 2: [3,2,4], target=6")
    void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 3: [3,3], target=6")
    void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with negative numbers")
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] result = solution.twoSum(nums, target);
        
        // Verify the sum is correct
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }
    
    @Test
    @DisplayName("Test with zero")
    void testWithZero() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] expected = {0, 3};
        
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with large array")
    void testLargeArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 19;
        int[] result = solution.twoSum(nums, target);
        
        // Verify the sum is correct (should be 9 + 10 = 19)
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }
    
    @Test
    @DisplayName("Test no solution throws exception")
    void testNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        
        assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
    }
}
