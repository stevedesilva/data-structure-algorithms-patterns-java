# FAANG-Level LeetCode Problems in Java

A comprehensive collection of curated FAANG-level LeetCode problems implemented in Java, organized by topic and difficulty across 10 weeks.

## 📋 Overview

This repository contains well-structured Java solutions to classic coding interview problems commonly asked at top tech companies (Facebook, Amazon, Apple, Netflix, Google). Each solution includes:

- **Detailed problem descriptions** with examples
- **Multiple approaches** when applicable
- **Time and space complexity analysis**
- **Algorithmic insights and patterns**
- **Comprehensive JUnit 5 test cases**
- **Edge case handling**

## 🏗️ Project Structure

```
src/
├── main/java/com/leetcode/
│   ├── common/          # Shared data structures (TreeNode, ListNode, etc.)
│   ├── week1/           # Arrays
│   │   ├── core/        # Fundamental problems
│   │   ├── depth/       # Intermediate problems
│   │   └── stretch/     # Advanced problems
│   ├── week2/           # Strings
│   ├── week3/           # Binary Search
│   ├── week4/           # Linked Lists
│   ├── week5/           # Trees (Basic)
│   ├── week6/           # Trees (Advanced)
│   ├── week7/           # Graphs (Basic)
│   ├── week8/           # Graphs (Advanced)
│   ├── week9/           # Dynamic Programming (Basic)
│   └── week10/          # Dynamic Programming (Advanced)
└── test/java/com/leetcode/
    └── [mirrors main structure]
```

## 🚀 Quick Start

### Prerequisites
- Java 11 or higher
- Maven 3.6+

### Building the Project
```bash
mvn clean compile
```

### Running Tests
```bash
# Run all tests
mvn test

# Run tests for a specific week
mvn test -Dtest="com.leetcode.week1.*"
```

## 📚 Problem Categories

### Week 1 - Arrays (Foundation)
**Core:**
- ✅ Two Sum (LeetCode #1)
- ✅ Best Time to Buy and Sell Stock (LeetCode #121)
- ✅ Contains Duplicate (LeetCode #217)

**Depth:**
- ✅ Product of Array Except Self (LeetCode #238)
- ✅ Maximum Subarray (LeetCode #53)

**Stretch:**
- ✅ Container With Most Water (LeetCode #11)

### Week 2 - Strings
**Core:**
- ✅ Valid Anagram (LeetCode #242)
- ✅ Valid Palindrome (LeetCode #125)
- ✅ Longest Substring Without Repeating Characters (LeetCode #3)

### Week 3 - Binary Search
**Core:**
- ✅ Binary Search (LeetCode #704)

### Week 5 - Trees (Basic)
**Core:**
- ✅ Invert Binary Tree (LeetCode #226)

### Week 9 - Dynamic Programming (Basic)
**Core:**
- ✅ Climbing Stairs (LeetCode #70)
- ✅ House Robber (LeetCode #198)

## 💡 Key Patterns & Techniques

### Arrays
- Two Pointers
- Sliding Window
- Hash Maps for O(1) lookups
- Kadane's Algorithm

### Strings
- Two Pointers
- Character Frequency Counting
- Sliding Window

### Binary Search
- Classic Binary Search
- Search Space Reduction
- Rotated Arrays

### Trees
- Recursion
- DFS/BFS Traversal
- Tree Properties

### Dynamic Programming
- Optimal Substructure
- Memoization
- Space Optimization

## 🧪 Testing

All solutions include comprehensive JUnit 5 test suites covering:
- Example test cases from problem descriptions
- Edge cases (null, empty, single element)
- Boundary conditions
- Large inputs
- Special cases specific to each problem

**Current Test Statistics:**
- Total Tests: 113+
- All Passing ✅

## 📝 Code Quality Standards

Each solution follows Java best practices:
- Clear variable naming
- Comprehensive documentation
- Optimal time/space complexity
- No unnecessary dependencies
- Clean, readable code structure

## 🎯 Learning Objectives

This repository helps you:
1. Master common coding patterns
2. Understand time/space complexity analysis
3. Practice problem-solving strategies
4. Prepare for technical interviews
5. Learn Java-specific optimizations

## 🤝 Contributing

This is a structured learning repository. Each problem follows a consistent format:
- Problem statement with examples
- Approach explanation
- Complexity analysis
- Well-documented code
- Comprehensive tests

## 📖 Resources

- [LeetCode](https://leetcode.com/) - Original problem source
- [Java Documentation](https://docs.oracle.com/en/java/)
- [JUnit 5](https://junit.org/junit5/) - Testing framework

## ⚖️ License

This project is for educational purposes. Problem statements are from LeetCode.
