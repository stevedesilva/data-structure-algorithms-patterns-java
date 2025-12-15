package com.leetcode.week2.core;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Problem #3: Longest Substring Without Repeating Characters
 * 
 * Problem Description:
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * 
 * Approach: Sliding Window with HashSet
 * Use two pointers (left and right) to maintain a window of unique characters.
 * Expand right pointer to grow window, shrink left pointer when duplicate found.
 * 
 * Algorithm:
 * 1. Use a HashSet to track characters in current window
 * 2. Expand window by moving right pointer
 * 3. If duplicate found, shrink window from left until duplicate removed
 * 4. Track maximum window size
 * 
 * Time Complexity: O(n) where n is the length of the string
 * - Each character visited at most twice (once by right, once by left)
 * 
 * Space Complexity: O(min(n, m)) where m is charset size
 * - HashSet stores at most min(n, m) characters
 * 
 * Key Insights:
 * - Sliding window technique for substring problems
 * - HashSet for O(1) duplicate detection
 * - Two pointers move independently based on constraints
 */
public class LongestSubstringWithoutRepeatingCharacters {
    
    /**
     * Finds the length of the longest substring without repeating characters.
     * 
     * @param s Input string
     * @return Length of longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If duplicate found, remove characters from left until unique
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // Add current character to set
            charSet.add(currentChar);
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
