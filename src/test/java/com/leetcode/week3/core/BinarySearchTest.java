package com.leetcode.week3.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for BinarySearch problem
 */
class BinarySearchTest {
    
    private final BinarySearch solution = new BinarySearch();
    
    @Test
    @DisplayName("Test Example 1: target exists")
    void testExample1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, solution.search(nums, 9));
    }
    
    @Test
    @DisplayName("Test Example 2: target does not exist")
    void testExample2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, solution.search(nums, 2));
    }
    
    @Test
    @DisplayName("Test single element - found")
    void testSingleElementFound() {
        int[] nums = {5};
        assertEquals(0, solution.search(nums, 5));
    }
    
    @Test
    @DisplayName("Test single element - not found")
    void testSingleElementNotFound() {
        int[] nums = {5};
        assertEquals(-1, solution.search(nums, 3));
    }
    
    @Test
    @DisplayName("Test target at beginning")
    void testTargetAtBeginning() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(0, solution.search(nums, 1));
    }
    
    @Test
    @DisplayName("Test target at end")
    void testTargetAtEnd() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(4, solution.search(nums, 5));
    }
    
    @Test
    @DisplayName("Test empty array")
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(-1, solution.search(nums, 5));
    }
    
    @Test
    @DisplayName("Test null array")
    void testNullArray() {
        assertEquals(-1, solution.search(null, 5));
    }
}
