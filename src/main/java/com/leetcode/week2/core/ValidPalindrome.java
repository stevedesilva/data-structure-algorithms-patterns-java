package com.leetcode.week2.core;

/**
 * LeetCode Problem #125: Valid Palindrome
 * 
 * Problem Description:
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * 
 * Approach:
 * Use two pointers from start and end, moving towards center.
 * Skip non-alphanumeric characters and compare characters case-insensitively.
 * 
 * Time Complexity: O(n) where n is the length of the string
 * - Single pass with two pointers
 * 
 * Space Complexity: O(1)
 * - Only using constant extra space
 * 
 * Key Insights:
 * - Two-pointer technique for in-place comparison
 * - Character.isLetterOrDigit() for alphanumeric check
 * - Character.toLowerCase() for case-insensitive comparison
 */
public class ValidPalindrome {
    
    /**
     * Checks if a string is a palindrome after normalizing.
     * 
     * @param s Input string
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
