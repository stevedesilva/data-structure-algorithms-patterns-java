package com.leetcode.week2.core;

import java.util.Arrays;

/**
 * LeetCode Problem #242: Valid Anagram
 * 
 * Problem Description:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * Approach 1: Sorting
 * - Sort both strings and compare
 * - Time: O(n log n), Space: O(n)
 * 
 * Approach 2: Character Count (implemented here)
 * - Count frequency of each character in both strings
 * - Compare the frequency arrays
 * - Time: O(n), Space: O(1) - fixed size array for 26 letters
 * 
 * Algorithm:
 * 1. If lengths differ, return false
 * 2. Count character frequencies in both strings
 * 3. Compare frequency arrays
 * 
 * Time Complexity: O(n) where n is the length of the strings
 * - We iterate through both strings once
 * 
 * Space Complexity: O(1)
 * - Using fixed-size array of 26 characters
 * 
 * Key Insights:
 * - Character frequency counting is more efficient than sorting
 * - Can use array instead of HashMap for lowercase English letters
 * - Early exit if lengths differ
 */
public class ValidAnagram {
    
    /**
     * Checks if two strings are anagrams of each other.
     * 
     * @param s First string
     * @param t Second string
     * @return true if t is an anagram of s, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        
        // Count character frequencies
        int[] charCount = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
