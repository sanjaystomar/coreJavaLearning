# 📚 Data Structures & Algorithms — Problem Solving Question List

> A curated collection of DSA problems grouped by difficulty, with topic tags, problem descriptions, and input/output examples.

---

## 🟢 Easy

---

### 1. Two Sum
**Topic:** Arrays, Hash Map

**Problem:**  
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers that add up to `target`. You may assume each input has exactly one solution, and you may not use the same element twice.

**Example:**
```
Input:  nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

---

### 2. Reverse a String
**Topic:** Strings, Two Pointers

**Problem:**  
Write a function that reverses a string. The input is given as an array of characters `s`. Modify the array in-place with O(1) extra memory.

**Example:**
```
Input:  s = ['h', 'e', 'l', 'l', 'o']
Output: ['o', 'l', 'l', 'e', 'h']
```

---

### 3. Valid Parentheses
**Topic:** Stack, Strings

**Problem:**  
Given a string `s` containing only `(`, `)`, `{`, `}`, `[`, `]`, determine if the input string is valid. An input string is valid if every open bracket is closed by the same type of bracket in the correct order.

**Example:**
```
Input:  s = "()[]{}"
Output: true

Input:  s = "(]"
Output: false
```

---

### 4. Find the Maximum Element
**Topic:** Arrays

**Problem:**  
Given an unsorted array of integers, return the maximum element.

**Example:**
```
Input:  nums = [3, 1, 4, 1, 5, 9, 2, 6]
Output: 9
```

---

### 5. Palindrome Check
**Topic:** Strings, Two Pointers

**Problem:**  
Given a string `s`, return `true` if it is a palindrome (reads the same forward and backward), otherwise return `false`. Consider only alphanumeric characters and ignore case.

**Example:**
```
Input:  s = "A man, a plan, a canal: Panama"
Output: true

Input:  s = "race a car"
Output: false
```

---

### 6. Merge Two Sorted Lists
**Topic:** Linked List

**Problem:**  
Given the heads of two sorted linked lists `list1` and `list2`, merge them into one sorted list and return the head of the merged list.

**Example:**
```
Input:  list1 = [1, 2, 4], list2 = [1, 3, 4]
Output: [1, 1, 2, 3, 4, 4]
```

---

### 7. Climbing Stairs
**Topic:** Dynamic Programming, Recursion

**Problem:**  
You are climbing a staircase with `n` steps. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

**Example:**
```
Input:  n = 3
Output: 3
Explanation: 1+1+1, 1+2, 2+1
```

---

### 8. Binary Search
**Topic:** Arrays, Binary Search

**Problem:**  
Given a sorted array of integers `nums` and a `target`, return the index of `target` if found, otherwise return `-1`.

**Example:**
```
Input:  nums = [-1, 0, 3, 5, 9, 12], target = 9
Output: 4

Input:  nums = [-1, 0, 3, 5, 9, 12], target = 2
Output: -1
```

---

### 9. Count Occurrences in Array
**Topic:** Arrays, Hash Map

**Problem:**  
Given an array of integers, return a dictionary/map with each unique element as the key and its frequency as the value.

**Example:**
```
Input:  nums = [1, 2, 2, 3, 3, 3, 4]
Output: {1: 1, 2: 2, 3: 3, 4: 1}
```

---

### 10. Invert a Binary Tree
**Topic:** Binary Tree, Recursion

**Problem:**  
Given the root of a binary tree, invert it (mirror it) and return the root.

**Example:**
```
Input:
        4
       / \
      2   7
     / \ / \
    1  3 6  9

Output:
        4
       / \
      7   2
     / \ / \
    9  6 3  1
```

---

## 🟡 Medium

---

### 11. Longest Substring Without Repeating Characters
**Topic:** Strings, Sliding Window, Hash Map

**Problem:**  
Given a string `s`, find the length of the longest substring without repeating characters.

**Example:**
```
Input:  s = "abcabcbb"
Output: 3
Explanation: "abc" is the longest substring without repeating characters.

Input:  s = "bbbbb"
Output: 1
```

---

### 12. Product of Array Except Self
**Topic:** Arrays, Prefix/Suffix Products

**Problem:**  
Given an integer array `nums`, return an array `answer` such that `answer[i]` equals the product of all elements of `nums` except `nums[i]`. You must not use division and solve it in O(n).

**Example:**
```
Input:  nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]
```

---

### 13. Level Order Traversal of Binary Tree
**Topic:** Binary Tree, BFS, Queue

**Problem:**  
Given the root of a binary tree, return the level order traversal of its nodes' values (i.e., from left to right, level by level).

**Example:**
```
Input:
        3
       / \
      9  20
        /  \
       15   7

Output: [[3], [9, 20], [15, 7]]
```

---

### 14. Find All Permutations
**Topic:** Recursion, Backtracking

**Problem:**  
Given an array of distinct integers `nums`, return all possible permutations.

**Example:**
```
Input:  nums = [1, 2, 3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

---

### 15. Coin Change
**Topic:** Dynamic Programming

**Problem:**  
Given an array of coin denominations `coins` and an integer `amount`, return the minimum number of coins needed to make up that amount. Return `-1` if it is not possible.

**Example:**
```
Input:  coins = [1, 5, 6, 9], amount = 11
Output: 2
Explanation: 5 + 6 = 11

Input:  coins = [2], amount = 3
Output: -1
```

---

### 16. Number of Islands
**Topic:** Graphs, BFS/DFS, Matrix

**Problem:**  
Given a 2D binary grid of `'1'` (land) and `'0'` (water), return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.

**Example:**
```
Input:
  grid = [
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
  ]
Output: 3
```

---

### 17. Validate Binary Search Tree
**Topic:** Binary Tree, DFS, Recursion

**Problem:**  
Given the root of a binary tree, determine if it is a valid BST.

**Example:**
```
Input:
        5
       / \
      3   7
     / \
    2   4

Output: true

Input:
        5
       / \
      3   7
     / \
    2   6

Output: false (6 is in left subtree but > 5)
```

---

### 18. Top K Frequent Elements
**Topic:** Arrays, Hash Map, Heap

**Problem:**  
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

**Example:**
```
Input:  nums = [1, 1, 1, 2, 2, 3], k = 2
Output: [1, 2]
```

---

### 19. Subarray Sum Equals K
**Topic:** Arrays, Prefix Sum, Hash Map

**Problem:**  
Given an integer array `nums` and an integer `k`, return the total number of subarrays whose sum equals `k`.

**Example:**
```
Input:  nums = [1, 1, 1], k = 2
Output: 2

Input:  nums = [1, 2, 3], k = 3
Output: 2  (subarray [1,2] and [3])
```

---

### 20. Course Schedule (Cycle Detection)
**Topic:** Graphs, Topological Sort, DFS

**Problem:**  
There are `numCourses` courses labeled from `0` to `numCourses - 1`. Given a list of `prerequisites` where `prerequisites[i] = [a, b]` means you must take course `b` before course `a`, determine if it is possible to finish all courses.

**Example:**
```
Input:  numCourses = 2, prerequisites = [[1, 0]]
Output: true

Input:  numCourses = 2, prerequisites = [[1, 0], [0, 1]]
Output: false  (circular dependency)
```

---

### 21. Longest Palindromic Substring
**Topic:** Strings, Dynamic Programming / Expand Around Center

**Problem:**  
Given a string `s`, return the longest palindromic substring.

**Example:**
```
Input:  s = "babad"
Output: "bab" (or "aba")

Input:  s = "cbbd"
Output: "bb"
```

---

### 22. 3Sum
**Topic:** Arrays, Two Pointers, Sorting

**Problem:**  
Given an integer array `nums`, return all unique triplets `[nums[i], nums[j], nums[k]]` such that `i != j != k` and `nums[i] + nums[j] + nums[k] == 0`.

**Example:**
```
Input:  nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
```

---

## 🔴 Hard

---

### 23. Median of Two Sorted Arrays
**Topic:** Arrays, Binary Search, Divide and Conquer

**Problem:**  
Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n`, return the median of the two sorted arrays. The solution must run in `O(log(m+n))`.

**Example:**
```
Input:  nums1 = [1, 3], nums2 = [2]
Output: 2.00000

Input:  nums1 = [1, 2], nums2 = [3, 4]
Output: 2.50000
```

---

### 24. Trapping Rain Water
**Topic:** Arrays, Two Pointers, Stack

**Problem:**  
Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

**Example:**
```
Input:  height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
```

---

### 25. Word Ladder
**Topic:** Graphs, BFS

**Problem:**  
Given two words `beginWord` and `endWord`, and a dictionary `wordList`, return the number of words in the shortest transformation sequence from `beginWord` to `endWord`, where each step changes exactly one letter. Return `0` if no such sequence exists.

**Example:**
```
Input:  beginWord = "hit", endWord = "cog",
        wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: hit → hot → dot → dog → cog
```

---

### 26. Serialize and Deserialize Binary Tree
**Topic:** Binary Tree, DFS/BFS, Strings

**Problem:**  
Design an algorithm to serialize (convert to string) and deserialize (convert back to tree) a binary tree. There is no restriction on how your serialization/deserialization algorithm should work.

**Example:**
```
Input Tree:
        1
       / \
      2   3
         / \
        4   5

Serialized: "1,2,null,null,3,4,null,null,5,null,null"
Deserialized: Same tree as above
```

---

### 27. Sliding Window Maximum
**Topic:** Arrays, Deque, Sliding Window

**Problem:**  
Given an integer array `nums` and a sliding window of size `k`, return the maximum element in each window as it slides from left to right.

**Example:**
```
Input:  nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [3, 3, 5, 5, 6, 7]
```

---

### 28. Edit Distance (Levenshtein Distance)
**Topic:** Strings, Dynamic Programming

**Problem:**  
Given two strings `word1` and `word2`, return the minimum number of operations (insert, delete, replace) required to convert `word1` to `word2`.

**Example:**
```
Input:  word1 = "horse", word2 = "ros"
Output: 3
Explanation:
  horse → rorse (replace 'h' with 'r')
  rorse → rose  (delete 'r')
  rose  → ros   (delete 'e')
```

---

### 29. Merge K Sorted Lists
**Topic:** Linked List, Heap (Priority Queue), Divide and Conquer

**Problem:**  
Given an array of `k` linked-lists, each sorted in ascending order, merge all into one sorted linked list and return its head.

**Example:**
```
Input:  lists = [[1,4,5], [1,3,4], [2,6]]
Output: [1, 1, 2, 3, 4, 4, 5, 6]
```

---

### 30. Longest Increasing Path in a Matrix
**Topic:** Matrix, DFS, Dynamic Programming / Memoization

**Problem:**  
Given an `m x n` integer matrix, return the length of the longest increasing path. You can move up, down, left, or right but not diagonally, and you cannot move to equal or smaller values.

**Example:**
```
Input:
  matrix = [
    [9, 9, 4],
    [6, 6, 8],
    [2, 1, 1]
  ]
Output: 4
Explanation: Longest path is [1, 2, 6, 9]
```

---

### 31. Alien Dictionary (Topological Sort)
**Topic:** Graphs, Topological Sort, DFS

**Problem:**  
Given a list of words sorted lexicographically in an alien language, derive the order of characters in that language. Return a string of unique characters in the correct order. Return `""` if no valid ordering exists.

**Example:**
```
Input:  words = ["wrt", "wrf", "er", "ett", "rftt"]
Output: "wertf"
```

---

### 32. Regular Expression Matching
**Topic:** Strings, Dynamic Programming, Recursion

**Problem:**  
Given an input string `s` and a pattern `p`, implement regular expression matching with support for `.` (any single character) and `*` (zero or more of the preceding element). The matching should cover the entire input string.

**Example:**
```
Input:  s = "aa", p = "a*"
Output: true  (a* matches zero or more 'a')

Input:  s = "mississippi", p = "mis*is*p*."
Output: false
```

---

## 📊 Summary Table

| #  | Problem                            | Difficulty | Topics                          |
|----|------------------------------------|------------|---------------------------------|
| 1  | Two Sum                            | 🟢 Easy    | Arrays, Hash Map                |
| 2  | Reverse a String                   | 🟢 Easy    | Strings, Two Pointers           |
| 3  | Valid Parentheses                  | 🟢 Easy    | Stack, Strings                  |
| 4  | Find Maximum Element               | 🟢 Easy    | Arrays                          |
| 5  | Palindrome Check                   | 🟢 Easy    | Strings, Two Pointers           |
| 6  | Merge Two Sorted Lists             | 🟢 Easy    | Linked List                     |
| 7  | Climbing Stairs                    | 🟢 Easy    | Dynamic Programming             |
| 8  | Binary Search                      | 🟢 Easy    | Arrays, Binary Search           |
| 9  | Count Occurrences in Array         | 🟢 Easy    | Arrays, Hash Map                |
| 10 | Invert a Binary Tree               | 🟢 Easy    | Binary Tree, Recursion          |
| 11 | Longest Substring No Repeat        | 🟡 Medium  | Strings, Sliding Window         |
| 12 | Product of Array Except Self       | 🟡 Medium  | Arrays, Prefix Products         |
| 13 | Level Order Traversal              | 🟡 Medium  | Binary Tree, BFS                |
| 14 | Find All Permutations              | 🟡 Medium  | Backtracking                    |
| 15 | Coin Change                        | 🟡 Medium  | Dynamic Programming             |
| 16 | Number of Islands                  | 🟡 Medium  | Graphs, BFS/DFS                 |
| 17 | Validate BST                       | 🟡 Medium  | Binary Tree, DFS                |
| 18 | Top K Frequent Elements            | 🟡 Medium  | Heap, Hash Map                  |
| 19 | Subarray Sum Equals K              | 🟡 Medium  | Prefix Sum, Hash Map            |
| 20 | Course Schedule                    | 🟡 Medium  | Graphs, Topological Sort        |
| 21 | Longest Palindromic Substring      | 🟡 Medium  | Strings, DP                     |
| 22 | 3Sum                               | 🟡 Medium  | Arrays, Two Pointers            |
| 23 | Median of Two Sorted Arrays        | 🔴 Hard    | Binary Search                   |
| 24 | Trapping Rain Water                | 🔴 Hard    | Arrays, Two Pointers            |
| 25 | Word Ladder                        | 🔴 Hard    | Graphs, BFS                     |
| 26 | Serialize/Deserialize Binary Tree  | 🔴 Hard    | Binary Tree, Strings            |
| 27 | Sliding Window Maximum             | 🔴 Hard    | Arrays, Deque                   |
| 28 | Edit Distance                      | 🔴 Hard    | Strings, DP                     |
| 29 | Merge K Sorted Lists               | 🔴 Hard    | Linked List, Heap               |
| 30 | Longest Increasing Path in Matrix  | 🔴 Hard    | Matrix, DFS, Memoization        |
| 31 | Alien Dictionary                   | 🔴 Hard    | Graphs, Topological Sort        |
| 32 | Regular Expression Matching        | 🔴 Hard    | Strings, DP, Recursion          |

---

*Happy Coding! 🚀 Practice consistently, understand the patterns, and the solutions will come naturally.*
