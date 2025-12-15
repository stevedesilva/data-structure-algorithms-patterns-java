package com.leetcode.week2.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for ValidPalindrome problem
 */
class ValidPalindromeTest {
    
    private final ValidPalindrome solution = new ValidPalindrome();
    
    @Test
    @DisplayName("Test Example 1: A man, a plan, a canal: Panama")
    void testExample1() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
    
    @Test
    @DisplayName("Test Example 2: race a car")
    void testExample2() {
        assertFalse(solution.isPalindrome("race a car"));
    }
    
    @Test
    @DisplayName("Test Example 3: empty string after cleanup")
    void testExample3() {
        assertTrue(solution.isPalindrome(" "));
    }
    
    @Test
    @DisplayName("Test simple palindrome")
    void testSimplePalindrome() {
        assertTrue(solution.isPalindrome("aba"));
    }
    
    @Test
    @DisplayName("Test not palindrome")
    void testNotPalindrome() {
        assertFalse(solution.isPalindrome("abc"));
    }
    
    @Test
    @DisplayName("Test empty string")
    void testEmptyString() {
        assertTrue(solution.isPalindrome(""));
    }
    
    @Test
    @DisplayName("Test single character")
    void testSingleCharacter() {
        assertTrue(solution.isPalindrome("a"));
    }
    
    @Test
    @DisplayName("Test with numbers")
    void testWithNumbers() {
        assertTrue(solution.isPalindrome("0P0"));
    }
    
    @Test
    @DisplayName("Test null string")
    void testNullString() {
        assertFalse(solution.isPalindrome(null));
    }
}
