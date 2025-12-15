package com.leetcode.week5.core;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for InvertBinaryTree problem
 */
class InvertBinaryTreeTest {
    
    private final InvertBinaryTree solution = new InvertBinaryTree();
    
    @Test
    @DisplayName("Test Example 1: [4,2,7,1,3,6,9]")
    void testExample1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        
        TreeNode inverted = solution.invertTree(root);
        
        assertEquals(4, inverted.val);
        assertEquals(7, inverted.left.val);
        assertEquals(2, inverted.right.val);
        assertEquals(9, inverted.left.left.val);
        assertEquals(6, inverted.left.right.val);
        assertEquals(3, inverted.right.left.val);
        assertEquals(1, inverted.right.right.val);
    }
    
    @Test
    @DisplayName("Test Example 2: [2,1,3]")
    void testExample2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        
        TreeNode inverted = solution.invertTree(root);
        
        assertEquals(2, inverted.val);
        assertEquals(3, inverted.left.val);
        assertEquals(1, inverted.right.val);
    }
    
    @Test
    @DisplayName("Test Example 3: empty tree")
    void testExample3() {
        TreeNode inverted = solution.invertTree(null);
        assertNull(inverted);
    }
    
    @Test
    @DisplayName("Test single node")
    void testSingleNode() {
        TreeNode root = new TreeNode(1);
        TreeNode inverted = solution.invertTree(root);
        
        assertEquals(1, inverted.val);
        assertNull(inverted.left);
        assertNull(inverted.right);
    }
    
    @Test
    @DisplayName("Test left-skewed tree")
    void testLeftSkewed() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        
        TreeNode inverted = solution.invertTree(root);
        
        assertEquals(1, inverted.val);
        assertNull(inverted.left);
        assertEquals(2, inverted.right.val);
        assertEquals(3, inverted.right.right.val);
    }
}
