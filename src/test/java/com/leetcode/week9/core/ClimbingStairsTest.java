package com.leetcode.week9.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for ClimbingStairs problem
 */
class ClimbingStairsTest {
    
    private final ClimbingStairs solution = new ClimbingStairs();
    
    @Test
    @DisplayName("Test Example 1: n = 2")
    void testExample1() {
        assertEquals(2, solution.climbStairs(2));
    }
    
    @Test
    @DisplayName("Test Example 2: n = 3")
    void testExample2() {
        assertEquals(3, solution.climbStairs(3));
    }
    
    @Test
    @DisplayName("Test n = 1")
    void testOneStair() {
        assertEquals(1, solution.climbStairs(1));
    }
    
    @Test
    @DisplayName("Test n = 4")
    void testFourStairs() {
        assertEquals(5, solution.climbStairs(4));
        // Ways: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2
    }
    
    @Test
    @DisplayName("Test n = 5")
    void testFiveStairs() {
        assertEquals(8, solution.climbStairs(5));
    }
    
    @Test
    @DisplayName("Test larger n")
    void testLargerN() {
        assertEquals(89, solution.climbStairs(10));
    }
}
