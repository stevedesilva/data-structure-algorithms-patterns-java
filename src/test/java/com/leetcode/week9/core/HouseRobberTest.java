package com.leetcode.week9.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for HouseRobber problem
 */
class HouseRobberTest {
    
    private final HouseRobber solution = new HouseRobber();
    
    @Test
    @DisplayName("Test Example 1: [1,2,3,1]")
    void testExample1() {
        int[] nums = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums));
    }
    
    @Test
    @DisplayName("Test Example 2: [2,7,9,3,1]")
    void testExample2() {
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12, solution.rob(nums));
    }
    
    @Test
    @DisplayName("Test single house")
    void testSingleHouse() {
        int[] nums = {5};
        assertEquals(5, solution.rob(nums));
    }
    
    @Test
    @DisplayName("Test two houses")
    void testTwoHouses() {
        int[] nums = {3, 7};
        assertEquals(7, solution.rob(nums));
    }
    
    @Test
    @DisplayName("Test empty array")
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, solution.rob(nums));
    }
    
    @Test
    @DisplayName("Test null array")
    void testNullArray() {
        assertEquals(0, solution.rob(null));
    }
    
    @Test
    @DisplayName("Test all same values")
    void testAllSameValues() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(10, solution.rob(nums));
    }
    
    @Test
    @DisplayName("Test increasing values")
    void testIncreasingValues() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(9, solution.rob(nums)); // 1 + 3 + 5 = 9
    }
}
