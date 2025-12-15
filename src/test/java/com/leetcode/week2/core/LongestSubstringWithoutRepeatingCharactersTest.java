package com.leetcode.week2.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for LongestSubstringWithoutRepeatingCharacters problem
 */
class LongestSubstringWithoutRepeatingCharactersTest {
    
    private final LongestSubstringWithoutRepeatingCharacters solution = 
        new LongestSubstringWithoutRepeatingCharacters();
    
    @Test
    @DisplayName("Test Example 1: abcabcbb")
    void testExample1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }
    
    @Test
    @DisplayName("Test Example 2: bbbbb")
    void testExample2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }
    
    @Test
    @DisplayName("Test Example 3: pwwkew")
    void testExample3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
    
    @Test
    @DisplayName("Test empty string")
    void testEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
    
    @Test
    @DisplayName("Test null string")
    void testNullString() {
        assertEquals(0, solution.lengthOfLongestSubstring(null));
    }
    
    @Test
    @DisplayName("Test single character")
    void testSingleCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }
    
    @Test
    @DisplayName("Test all unique characters")
    void testAllUnique() {
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }
    
    @Test
    @DisplayName("Test with spaces")
    void testWithSpaces() {
        assertEquals(3, solution.lengthOfLongestSubstring("a b c"));
    }
    
    @Test
    @DisplayName("Test with numbers and letters")
    void testMixed() {
        assertEquals(6, solution.lengthOfLongestSubstring("abc123"));
    }
}
