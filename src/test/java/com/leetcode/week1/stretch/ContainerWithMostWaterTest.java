package com.leetcode.week1.stretch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for ContainerWithMostWater problem
 */
class ContainerWithMostWaterTest {
    
    private final ContainerWithMostWater solution = new ContainerWithMostWater();
    
    @Test
    @DisplayName("Test Example 1: [1,8,6,2,5,4,8,3,7]")
    void testExample1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test Example 2: [1,1]")
    void testExample2() {
        int[] height = {1, 1};
        int expected = 1;
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with two different heights")
    void testTwoDifferentHeights() {
        int[] height = {1, 2};
        int expected = 1; // min(1,2) * 1 = 1
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with three elements")
    void testThreeElements() {
        int[] height = {1, 3, 2};
        int expected = 2; // Using indices 0 and 2: min(1,2) * 2 = 2
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with all same heights")
    void testAllSameHeights() {
        int[] height = {5, 5, 5, 5};
        int expected = 15; // min(5,5) * 3 = 15
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with increasing heights")
    void testIncreasingHeights() {
        int[] height = {1, 2, 3, 4, 5};
        int expected = 6; // Using indices 0 and 4: min(1,5) * 4 = 4
                          // Or indices 1 and 4: min(2,5) * 3 = 6
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with decreasing heights")
    void testDecreasingHeights() {
        int[] height = {5, 4, 3, 2, 1};
        int expected = 6; // Using indices 0 and 4: min(5,1) * 4 = 4
                          // Or indices 0 and 3: min(5,2) * 3 = 6
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with tall lines at edges")
    void testTallLinesAtEdges() {
        int[] height = {10, 1, 1, 1, 10};
        int expected = 40; // min(10,10) * 4 = 40
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with zeros")
    void testWithZeros() {
        int[] height = {0, 5, 0, 5};
        int expected = 10; // min(5,5) * 2 = 10 (between indices 1 and 3, distance is 3-1=2)
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with null array")
    void testNullArray() {
        int[] height = null;
        int expected = 0;
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with single element")
    void testSingleElement() {
        int[] height = {5};
        int expected = 0;
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with empty array")
    void testEmptyArray() {
        int[] height = {};
        int expected = 0;
        
        int result = solution.maxArea(height);
        
        assertEquals(expected, result);
    }
}
