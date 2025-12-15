package com.leetcode.week2.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for ValidAnagram problem
 */
class ValidAnagramTest {
    
    private final ValidAnagram solution = new ValidAnagram();
    
    @Test
    @DisplayName("Test Example 1: anagram and nagaram")
    void testExample1() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }
    
    @Test
    @DisplayName("Test Example 2: rat and car")
    void testExample2() {
        assertFalse(solution.isAnagram("rat", "car"));
    }
    
    @Test
    @DisplayName("Test empty strings")
    void testEmptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }
    
    @Test
    @DisplayName("Test single character - same")
    void testSingleCharSame() {
        assertTrue(solution.isAnagram("a", "a"));
    }
    
    @Test
    @DisplayName("Test single character - different")
    void testSingleCharDifferent() {
        assertFalse(solution.isAnagram("a", "b"));
    }
    
    @Test
    @DisplayName("Test different lengths")
    void testDifferentLengths() {
        assertFalse(solution.isAnagram("abc", "abcd"));
    }
    
    @Test
    @DisplayName("Test with repeated characters")
    void testRepeatedCharacters() {
        assertTrue(solution.isAnagram("aabbcc", "abcabc"));
    }
    
    @Test
    @DisplayName("Test null strings")
    void testNullStrings() {
        assertFalse(solution.isAnagram(null, "test"));
        assertFalse(solution.isAnagram("test", null));
        assertFalse(solution.isAnagram(null, null));
    }
}
