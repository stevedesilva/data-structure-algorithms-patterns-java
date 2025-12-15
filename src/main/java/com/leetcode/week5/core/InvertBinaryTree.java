package com.leetcode.week5.core;

import com.leetcode.common.TreeNode;

/**
 * LeetCode Problem #226: Invert Binary Tree
 * 
 * Problem Description:
 * Given the root of a binary tree, invert the tree, and return its root.
 * 
 * Example 1:
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * 
 * Example 2:
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 * 
 * Example 3:
 * Input: root = []
 * Output: []
 * 
 * Approach:
 * Recursively swap left and right children at each node.
 * This is a classic tree traversal problem.
 * 
 * Algorithm:
 * 1. Base case: if node is null, return null
 * 2. Recursively invert left subtree
 * 3. Recursively invert right subtree
 * 4. Swap left and right children
 * 5. Return root
 * 
 * Alternative: Can also use iterative approach with queue (BFS)
 * 
 * Time Complexity: O(n) where n is the number of nodes
 * - Visit each node exactly once
 * 
 * Space Complexity: O(h) where h is the height of the tree
 * - Recursion stack depth equals tree height
 * - O(log n) for balanced tree, O(n) for skewed tree
 * 
 * Key Insights:
 * - Simple recursive solution
 * - Post-order or pre-order traversal both work
 * - This problem became famous when a Google candidate couldn't solve it
 */
public class InvertBinaryTree {
    
    /**
     * Inverts a binary tree by swapping left and right children at each node.
     * 
     * @param root Root of the binary tree
     * @return Root of the inverted tree
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Recursively invert left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        // Swap left and right children
        root.left = right;
        root.right = left;
        
        return root;
    }
}
