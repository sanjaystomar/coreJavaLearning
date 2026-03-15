# 🔴 Hard DSA Problems — 334 Questions

> Advanced topics: Graphs · Dynamic Programming · Segment Trees · Tries · Divide & Conquer · Computational Geometry · String Algorithms · Advanced Data Structures

---

### 1. Median of Two Sorted Arrays
**Topics:** Arrays, Binary Search, Divide and Conquer

**Problem:** Given two sorted arrays `nums1` and `nums2` of size `m` and `n`, return the median of the two sorted arrays. Solution must run in O(log(m+n)).

**Example:**
```
Input:  nums1 = [1, 3], nums2 = [2]
Output: 2.00000
```

---

### 2. Regular Expression Matching
**Topics:** Strings, Dynamic Programming, Recursion

**Problem:** Implement regex matching supporting `.` (any single char) and `*` (zero or more of preceding element). Matching must cover the entire string.

**Example:**
```
Input:  s = "aab", p = "c*a*b"
Output: true
```

---

### 3. Trapping Rain Water
**Topics:** Arrays, Two Pointers, Stack, Dynamic Programming

**Problem:** Given `n` non-negative integers representing an elevation map, compute how much water it can trap after raining.

**Example:**
```
Input:  height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```

---

### 4. Wildcard Matching
**Topics:** Strings, Dynamic Programming, Greedy

**Problem:** Implement wildcard pattern matching with `?` (matches any single char) and `*` (matches any sequence including empty).

**Example:**
```
Input:  s = "adceb", p = "*a*b"
Output: true
```

---

### 5. Jump Game II
**Topics:** Arrays, Greedy, Dynamic Programming

**Problem:** Given an array where `nums[i]` is max jump length, return the minimum number of jumps to reach the last index.

**Example:**
```
Input:  nums = [2,3,1,1,4]
Output: 2
```

---

### 6. Merge K Sorted Lists
**Topics:** Linked List, Divide and Conquer, Heap

**Problem:** Given an array of `k` linked-lists each sorted in ascending order, merge all into one sorted linked list.

**Example:**
```
Input:  lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
```

---

### 7. Largest Rectangle in Histogram
**Topics:** Arrays, Stack, Monotonic Stack

**Problem:** Given an array of integers representing heights of histogram bars, find the area of the largest rectangle.

**Example:**
```
Input:  heights = [2,1,5,6,2,3]
Output: 10
```

---

### 8. Maximal Rectangle
**Topics:** Matrix, Stack, Dynamic Programming

**Problem:** Given a binary matrix, find the largest rectangle containing only 1s and return its area.

**Example:**
```
Input:  matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
```

---

### 9. Word Ladder II
**Topics:** Graphs, BFS, Backtracking

**Problem:** Given `beginWord`, `endWord`, and a word list, return all shortest transformation sequences where each step changes exactly one letter.

**Example:**
```
Input:  beginWord="hit", endWord="cog", wordList=["hot","dot","dog","lot","log","cog"]
Output: [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
```

---

### 10. Serialize and Deserialize Binary Tree
**Topics:** Binary Tree, BFS, DFS, Design

**Problem:** Design an algorithm to serialize a binary tree to a string and deserialize the string back to the tree.

**Example:**
```
Input:  root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]  (same tree reconstructed)
```

---

### 11. Sliding Window Maximum
**Topics:** Arrays, Deque, Sliding Window, Monotonic Queue

**Problem:** Given array `nums` and a sliding window of size `k`, return the max value in each window position.

**Example:**
```
Input:  nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
```

---

### 12. Edit Distance
**Topics:** Strings, Dynamic Programming

**Problem:** Given two words, return the minimum number of single-character operations (insert, delete, replace) to convert `word1` to `word2`.

**Example:**
```
Input:  word1 = "horse", word2 = "ros"
Output: 3
```

---

### 13. Longest Valid Parentheses
**Topics:** Strings, Stack, Dynamic Programming

**Problem:** Given a string containing only `(` and `)`, find the length of the longest valid parentheses substring.

**Example:**
```
Input:  s = ")()())"
Output: 4
```

---

### 14. Distinct Subsequences
**Topics:** Strings, Dynamic Programming

**Problem:** Given strings `s` and `t`, return the number of distinct subsequences of `s` which equals `t`.

**Example:**
```
Input:  s = "rabbbit", t = "rabbit"
Output: 3
```

---

### 15. Best Time to Buy and Sell Stock IV
**Topics:** Arrays, Dynamic Programming

**Problem:** Given integer `k` and array of prices, find the maximum profit with at most `k` transactions.

**Example:**
```
Input:  k = 2, prices = [3,2,6,5,0,3]
Output: 7
```

---

### 16. Minimum Window Substring
**Topics:** Strings, Sliding Window, Hash Map

**Problem:** Given strings `s` and `t`, return the minimum window substring of `s` such that every character in `t` is included.

**Example:**
```
Input:  s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
```

---

### 17. Alien Dictionary
**Topics:** Graphs, Topological Sort, DFS, BFS

**Problem:** Given a list of words sorted lexicographically in an alien language, derive the order of characters. Return `""` if no valid ordering exists.

**Example:**
```
Input:  words = ["wrt","wrf","er","ett","rftt"]
Output: "wertf"
```

---

### 18. Longest Increasing Path in a Matrix
**Topics:** Matrix, DFS, Memoization, Topological Sort

**Problem:** Given an `m x n` integer matrix, return the length of the longest strictly increasing path moving up/down/left/right.

**Example:**
```
Input:  matrix = [[9,9,4],[6,6,8],[2,1,1]]
Output: 4  (path: 1→2→6→9)
```

---

### 19. Count of Smaller Numbers After Self
**Topics:** Arrays, Merge Sort, Binary Indexed Tree, Segment Tree

**Problem:** Return a count array where `counts[i]` is the number of smaller elements to the right of `nums[i]`.

**Example:**
```
Input:  nums = [5,2,6,1]
Output: [2,1,1,0]
```

---

### 20. Remove Duplicate Letters (Lexicographically Smallest)
**Topics:** Strings, Greedy, Stack, Monotonic Stack

**Problem:** Remove duplicate letters so that every letter appears once and the result is the smallest lexicographic subsequence.

**Example:**
```
Input:  s = "cbacdcbc"
Output: "acdb"
```

---

### 21. Maximum Gap
**Topics:** Arrays, Radix Sort, Bucket Sort

**Problem:** Given an unsorted array, find the maximum difference between successive elements in its sorted form. Must run in O(n) time and space.

**Example:**
```
Input:  nums = [3,6,9,1]
Output: 3
```

---

### 22. Find Median from Data Stream
**Topics:** Heap, Design, Two Heaps

**Problem:** Design a data structure that supports adding numbers and finding the median from a data stream.

**Example:**
```
Input:  addNum(1), addNum(2), findMedian(), addNum(3), findMedian()
Output: 1.5, 2.0
```

---

### 23. Burst Balloons
**Topics:** Arrays, Dynamic Programming, Divide and Conquer

**Problem:** Given `n` balloons with numbers, burst all balloons to maximize coins collected. Bursting balloon `i` gives `nums[i-1]*nums[i]*nums[i+1]` coins.

**Example:**
```
Input:  nums = [3,1,5,8]
Output: 167
```

---

### 24. Super Washing Machines
**Topics:** Arrays, Greedy, Dynamic Programming

**Problem:** Given `n` washing machines with dresses, find minimum moves to equalize all machines.

**Example:**
```
Input:  machines = [1,0,5]
Output: 3
```

---

### 25. Word Search II
**Topics:** Trie, Backtracking, DFS, Matrix

**Problem:** Given an `m x n` board and list of words, return all words that can be constructed from sequentially adjacent cells.

**Example:**
```
Input:  board=[["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words=["oath","pea","eat","rain"]
Output: ["eat","oath"]
```

---

### 26. Shortest Palindrome
**Topics:** Strings, KMP, String Hashing

**Problem:** Add characters in front of a string to make it a palindrome. Return the shortest such palindrome.

**Example:**
```
Input:  s = "aacecaaa"
Output: "aaacecaaa"
```

---

### 27. Patching Array
**Topics:** Arrays, Greedy

**Problem:** Given a sorted array and integer `n`, find the minimum number of patches (additions) to make all values in [1,n] representable as sums.

**Example:**
```
Input:  nums = [1,3], n = 6
Output: 1
```

---

### 28. First Missing Positive
**Topics:** Arrays, Hash Map, Cyclic Sort

**Problem:** Given an unsorted array, find the smallest missing positive integer in O(n) time and O(1) space.

**Example:**
```
Input:  nums = [3,4,-1,1]
Output: 2
```

---

### 29. Sudoku Solver
**Topics:** Matrix, Backtracking, Constraint Propagation

**Problem:** Write a program to solve a Sudoku puzzle by filling the empty cells.

**Example:**
```
Input:  board = [["5","3",".",".","7",".",...], ...]
Output: solved board with all cells filled
```

---

### 30. N-Queens II
**Topics:** Backtracking, Recursion

**Problem:** Return the number of distinct solutions to the n-queens puzzle.

**Example:**
```
Input:  n = 4
Output: 2
```

---

### 31. Palindrome Partitioning II
**Topics:** Strings, Dynamic Programming

**Problem:** Given a string `s`, partition it so every substring is a palindrome. Return the minimum cuts needed.

**Example:**
```
Input:  s = "aab"
Output: 1  (["aa","b"])
```

---

### 32. Largest Rectangle in Skyline
**Topics:** Arrays, Stack, Binary Search

**Problem:** Given building heights array, find the largest rectangular area in the skyline.

**Example:**
```
Input:  heights = [2,1,5,6,2,3]
Output: 10
```

---

### 33. Recover Binary Search Tree
**Topics:** Binary Tree, DFS, Morris Traversal

**Problem:** Two nodes in a BST are swapped. Recover the tree without changing its structure.

**Example:**
```
Input:  root = [1,3,null,null,2]
Output: [3,1,null,null,2]
```

---

### 34. Scramble String
**Topics:** Strings, Dynamic Programming, Recursion, Memoization

**Problem:** Determine if string `s2` is a scrambled version of `s1` (recursive partition and optional swap).

**Example:**
```
Input:  s1 = "great", s2 = "rgeat"
Output: true
```

---

### 35. Interleaving String
**Topics:** Strings, Dynamic Programming, BFS

**Problem:** Given strings `s1`, `s2`, `s3`, determine if `s3` is formed by an interleaving of `s1` and `s2`.

**Example:**
```
Input:  s1="aabcc", s2="dbbca", s3="aadbbcbcac"
Output: true
```

---

### 36. Dungeon Game
**Topics:** Matrix, Dynamic Programming

**Problem:** Knight starts at top-left of dungeon grid. Compute minimum initial health needed to reach bottom-right alive.

**Example:**
```
Input:  dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]
Output: 7
```

---

### 37. Binary Tree Maximum Path Sum
**Topics:** Binary Tree, DFS, Dynamic Programming

**Problem:** A path in a binary tree goes from one node to another. Return the maximum sum of any non-empty path.

**Example:**
```
Input:  root = [-10,9,20,null,null,15,7]
Output: 42  (15→20→7)
```

---

### 38. Longest Consecutive Sequence
**Topics:** Arrays, Hash Set, Union-Find

**Problem:** Given an unsorted array, return the length of the longest consecutive elements sequence in O(n).

**Example:**
```
Input:  nums = [100,4,200,1,3,2]
Output: 4  ([1,2,3,4])
```

---

### 39. Max Points on a Line
**Topics:** Geometry, Hash Map, Math, GCD

**Problem:** Given `n` points, return the maximum number of points that lie on the same straight line.

**Example:**
```
Input:  points = [[1,1],[2,2],[3,3]]
Output: 3
```

---

### 40. LRU Cache
**Topics:** Design, Hash Map, Doubly Linked List

**Problem:** Design a data structure implementing LRU (Least Recently Used) cache with O(1) get and put operations.

**Example:**
```
Input:  capacity=2, put(1,1), put(2,2), get(1), put(3,3), get(2)
Output: 1, -1
```

---

### 41. LFU Cache
**Topics:** Design, Hash Map, Doubly Linked List

**Problem:** Design and implement an LFU (Least Frequently Used) cache with O(1) get and put.

**Example:**
```
Input:  capacity=2, put(1,1), put(2,2), get(1), put(3,3), get(2), get(3)
Output: 1, -1, 3
```

---

### 42. Trapping Rain Water II
**Topics:** Matrix, Heap, BFS

**Problem:** Given a 3D elevation matrix, compute total units of water that can be trapped.

**Example:**
```
Input:  heightMap=[[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
Output: 4
```

---

### 43. The Skyline Problem
**Topics:** Arrays, Divide and Conquer, Heap, Segment Tree, BIT

**Problem:** Given buildings as [left, right, height], return the skyline as a list of critical points.

**Example:**
```
Input:  buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
```

---

### 44. Strong Password Checker
**Topics:** Strings, Greedy, Dynamic Programming

**Problem:** Return minimum steps to make a password strong (length 6–20, contains upper/lower/digit, no 3+ repeating).

**Example:**
```
Input:  password = "aaa"
Output: 3
```

---

### 45. Count of Range Sum
**Topics:** Arrays, Merge Sort, Binary Indexed Tree, Segment Tree

**Problem:** Given array `nums` and bounds `[lower, upper]`, return count of range sums that lie in range.

**Example:**
```
Input:  nums=[-2,5,-1], lower=-2, upper=2
Output: 3
```

---

### 46. Reverse Pairs
**Topics:** Arrays, Merge Sort, Binary Indexed Tree

**Problem:** Count pairs `(i, j)` where `i < j` and `nums[i] > 2 * nums[j]`.

**Example:**
```
Input:  nums = [1,3,2,3,1]
Output: 2
```

---

### 47. Create Maximum Number
**Topics:** Arrays, Greedy, Stack, Monotonic Stack

**Problem:** Given arrays of digits of length `m` and `n`, create the maximum number of length `k ≤ m+n` from both arrays maintaining relative order.

**Example:**
```
Input:  nums1=[3,4,6,5], nums2=[9,1,2,5,8,3], k=5
Output: [9,8,6,5,3]
```

---

### 48. Frog Jump
**Topics:** Arrays, Dynamic Programming, Hash Map

**Problem:** Determine if a frog can cross a river by jumping on stones, where each jump can vary by ±1 from the last.

**Example:**
```
Input:  stones = [0,1,3,5,6,8,12,17]
Output: true
```

---

### 49. Split Array Largest Sum
**Topics:** Arrays, Binary Search, Dynamic Programming

**Problem:** Given array and integer `k`, split array into `k` non-empty subarrays to minimize the largest subarray sum.

**Example:**
```
Input:  nums=[7,2,5,10,8], k=2
Output: 18
```

---

### 50. Freedom Trail
**Topics:** Strings, Dynamic Programming, DFS, Circular

**Problem:** Spell all characters in `key` by rotating a ring. Return minimum rotation steps.

**Example:**
```
Input:  ring="godding", key="gd"
Output: 4
```

---

### 51. Student Attendance Record II
**Topics:** Dynamic Programming, Matrix Exponentiation

**Problem:** Count attendance records of length `n` that won't result in reward being withheld (no 2+ A's, no 3+ consecutive L's).

**Example:**
```
Input:  n = 2
Output: 8
```

---

### 52. Minimum Cost to Merge Stones
**Topics:** Arrays, Dynamic Programming, Interval DP

**Problem:** Merge stones with cost equal to sum of merged piles. Merge exactly `k` piles at a time. Return minimum total cost.

**Example:**
```
Input:  stones=[3,2,4,1], k=2
Output: 20
```

---

### 53. Zuma Game
**Topics:** Strings, Dynamic Programming, Memoization

**Problem:** Find minimum moves to clear Zuma board using balls from hand.

**Example:**
```
Input:  board="WRRBBW", hand="RRB"
Output: -1
```

---

### 54. Strange Printer
**Topics:** Strings, Dynamic Programming, Interval DP

**Problem:** A printer can print consecutive same characters. Find minimum turns to print a string.

**Example:**
```
Input:  s = "aaabbb"
Output: 2
```

---

### 55. Stickers to Spell Word
**Topics:** Strings, Dynamic Programming, Bitmask DP

**Problem:** Given stickers with letters, find the minimum stickers needed to spell the target word.

**Example:**
```
Input:  stickers=["with","example","science"], target="thehat"
Output: 3
```

---

### 56. Remove Boxes
**Topics:** Arrays, Dynamic Programming, Memoization, 3D DP

**Problem:** Remove groups of same-colored boxes. Removing `k` boxes of same color scores `k*k` points. Maximize score.

**Example:**
```
Input:  boxes = [1,3,2,2,2,3,4,3,1]
Output: 23
```

---

### 57. Strange Printer II
**Topics:** Matrix, Topological Sort, Graphs

**Problem:** Determine if a target matrix can be printed using a strange printer that prints rectangles of one color per turn.

**Example:**
```
Input:  targetGrid=[[1,1,1,1],[1,2,2,1],[1,2,2,1],[1,1,1,1]]
Output: true
```

---

### 58. Minimum Number of Refueling Stops
**Topics:** Arrays, Greedy, Heap, Dynamic Programming

**Problem:** Car with starting fuel travels to target. Determine minimum refueling stops needed.

**Example:**
```
Input:  target=100, startFuel=10, stations=[[10,60],[20,30],[30,30],[60,40]]
Output: 2
```

---

### 59. K-th Smallest Prime Fraction
**Topics:** Arrays, Binary Search, Heap

**Problem:** Given sorted primes array with 1, return the kth smallest fraction `a/b` where `a` and `b` are elements.

**Example:**
```
Input:  arr=[1,2,3,5], k=3
Output: [2,5]
```

---

### 60. Swim in Rising Water
**Topics:** Matrix, Binary Search, Heap, Union-Find, BFS

**Problem:** Given grid of elevations, find minimum time `t` when you can swim from top-left to bottom-right.

**Example:**
```
Input:  grid=[[0,2],[1,3]]
Output: 3
```

---

### 61. Number of Atoms
**Topics:** Strings, Stack, Hash Map, Recursion

**Problem:** Parse a chemical formula and return the count of each atom as a string.

**Example:**
```
Input:  formula = "K4(ON(SO3)2)2"
Output: "K4N2O14S4"
```

---

### 62. Smallest Sufficient Team
**Topics:** Bitmask, Dynamic Programming, Greedy

**Problem:** Find the smallest team covering all required skills.

**Example:**
```
Input:  req_skills=["java","nodejs","reactjs"], people=[["java"],["nodejs"],["nodejs","reactjs"]]
Output: [0,2]
```

---

### 63. Minimum Cost to Connect Sticks
**Topics:** Heap, Greedy, Huffman Coding

**Problem:** Connect all sticks into one stick. Cost to connect two sticks equals their sum. Minimize total cost.

**Example:**
```
Input:  sticks = [2,4,3]
Output: 14
```

---

### 64. Parallel Courses III
**Topics:** Graphs, Topological Sort, Dynamic Programming, DAG

**Problem:** Find minimum number of months to complete all courses given prerequisites and durations.

**Example:**
```
Input:  n=3, relations=[[1,3],[2,3]], time=[3,2,5]
Output: 8
```

---

### 65. Maximize Score After N Operations
**Topics:** Arrays, Dynamic Programming, Bitmask DP, Math

**Problem:** Perform `n` operations on 2n integers pairing them by GCD. Maximize score.

**Example:**
```
Input:  nums=[1,2]
Output: 1
```

---

### 66. Cherry Pickup II
**Topics:** Matrix, Dynamic Programming, 3D DP

**Problem:** Two robots start at top corners of grid, move down simultaneously. Maximize total cherries collected.

**Example:**
```
Input:  grid=[[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
Output: 24
```

---

### 67. Minimum Score Triangulation of Polygon
**Topics:** Arrays, Dynamic Programming, Interval DP

**Problem:** Triangulate a convex polygon to minimize total score (product of triangulation triplets).

**Example:**
```
Input:  values = [1,3,1,4,1,5]
Output: 13
```

---

### 68. Count All Valid Pickup and Delivery Options
**Topics:** Math, Dynamic Programming, Combinatorics

**Problem:** Count valid sequences to pick up and deliver `n` orders where pickup always comes before delivery.

**Example:**
```
Input:  n = 2
Output: 6
```

---

### 69. Minimum Insertion Steps to Make a String Palindrome
**Topics:** Strings, Dynamic Programming, LCS

**Problem:** Find minimum number of character insertions to make a string a palindrome.

**Example:**
```
Input:  s = "mbadm"
Output: 2
```

---

### 70. Minimum Cost to Cut a Stick
**Topics:** Arrays, Dynamic Programming, Interval DP

**Problem:** Cut a stick at given positions. Cost equals current stick length. Minimize total cutting cost.

**Example:**
```
Input:  n=7, cuts=[1,3,4,5]
Output: 16
```

---

### 71. Painting the Walls
**Topics:** Arrays, Dynamic Programming, Knapsack

**Problem:** Painter paints walls; for each wall painted, free painter paints simultaneously. Minimize cost.

**Example:**
```
Input:  cost=[1,2,3,2], time=[1,2,3,2]
Output: 3
```

---

### 72. Largest Color Value in a Directed Graph
**Topics:** Graphs, Topological Sort, Dynamic Programming, DAG

**Problem:** Find maximum frequency of any single color along any path in a directed graph.

**Example:**
```
Input:  colors="abaca", edges=[[0,1],[0,2],[2,3],[3,4]]
Output: 3
```

---

### 73. Number of Ways to Reorder Array to Get Same BST
**Topics:** Trees, Divide and Conquer, Combinatorics, Math

**Problem:** Count ways to reorder array so resulting BST is identical to BST from original array.

**Example:**
```
Input:  nums = [2,1,3]
Output: 1
```

---

### 74. Minimum XOR Sum of Two Arrays
**Topics:** Arrays, Bitmask DP, Hungarian Algorithm

**Problem:** Assign each element of `nums2` to exactly one of `nums1` to minimize the XOR sum.

**Example:**
```
Input:  nums1=[1,2], nums2=[2,3]
Output: 2
```

---

### 75. Number of Squareful Arrays
**Topics:** Arrays, Backtracking, Graph Hamiltonicity

**Problem:** Count permutations of `nums` where sum of every adjacent pair is a perfect square.

**Example:**
```
Input:  nums = [1,17,8]
Output: 2
```

---

### 76. Find Minimum in Rotated Sorted Array II
**Topics:** Arrays, Binary Search

**Problem:** Find minimum in rotated sorted array that may contain duplicates, in sub-linear time when possible.

**Example:**
```
Input:  nums = [2,2,2,0,1]
Output: 0
```

---

### 77. Recover a Tree From Preorder Traversal
**Topics:** Binary Tree, Strings, DFS, Stack

**Problem:** Recover a binary tree from its depth-first preorder traversal string with depth indicated by dashes.

**Example:**
```
Input:  traversal = "1-2--3--4-5--6--7"
Output: [1,2,5,3,4,6,7]
```

---

### 78. Maximum Profit in Job Scheduling
**Topics:** Arrays, Binary Search, Dynamic Programming, Sorting

**Problem:** Schedule jobs (start, end, profit) without overlap to maximize profit.

**Example:**
```
Input:  startTime=[1,2,3,3], endTime=[3,4,5,6], profit=[50,10,40,70]
Output: 120
```

---

### 79. Minimum Number of Days to Eat N Oranges
**Topics:** Math, Dynamic Programming, Memoization, BFS

**Problem:** Each day eat 1, n/2 (if divisible), or n/3 (if divisible) oranges. Find minimum days to eat all n oranges.

**Example:**
```
Input:  n = 10
Output: 4
```

---

### 80. Minimum Cost to Make Array Equal
**Topics:** Arrays, Binary Search, Prefix Sum

**Problem:** Make all elements equal by incrementing/decrementing. Minimize weighted cost.

**Example:**
```
Input:  nums=[1,3,5,2], cost=[2,3,1,14]
Output: 8
```

---

### 81. Stone Game VIII
**Topics:** Arrays, Dynamic Programming, Prefix Sum

**Problem:** Two players alternately pick prefix of stones; score is prefix sum. Maximize Alice's score difference.

**Example:**
```
Input:  stones = [-1,2,-3,4,-5]
Output: 5
```

---

### 82. Cat and Mouse II
**Topics:** Graphs, Dynamic Programming, Game Theory, Minimax

**Problem:** Cat and mouse on grid. Determine if mouse can win reaching food before being caught.

**Example:**
```
Input:  grid=["####F","#C...","M...."]
Output: true
```

---

### 83. Selling Pieces of Wood
**Topics:** Matrix, Dynamic Programming, 2D DP

**Problem:** Cut wood of size `m x n` horizontally/vertically. Maximize revenue selling pieces at given prices.

**Example:**
```
Input:  m=3, n=5, prices=[[1,4,2],[2,2,7],[2,1,3]]
Output: 19
```

---

### 84. Maximum AND Sum of Array
**Topics:** Arrays, Dynamic Programming, Bitmask DP

**Problem:** Place `n` integers into `numSlots` (each holding at most 2), maximize AND sum of slot·value pairs.

**Example:**
```
Input:  nums=[1,2,3,4,5,6], numSlots=3
Output: 9
```

---

### 85. Number of Good Paths
**Topics:** Graphs, Union-Find, Sorting, Trees

**Problem:** Count paths in tree where start and end nodes have equal and maximum values along the path.

**Example:**
```
Input:  vals=[1,3,2,1,3], edges=[[0,1],[0,2],[2,3],[2,4]]
Output: 6
```

---

### 86. Minimum Number of Visited Cells in a Grid
**Topics:** Matrix, BFS, Heap, Greedy, Segment Tree

**Problem:** Start at top-left, move right or down up to `grid[i][j]` steps. Find minimum cells visited to reach bottom-right.

**Example:**
```
Input:  grid=[[3,4,2,1],[4,2,3,1],[2,1,0,0],[2,4,0,0]]
Output: 4
```

---

### 87. Count Subarrays With Median K
**Topics:** Arrays, Hash Map, Prefix Count

**Problem:** Count subarrays where median equals `k`.

**Example:**
```
Input:  nums=[3,2,1,4,5], k=4
Output: 3
```

---

### 88. Minimum Weighted Subgraph With Required Paths
**Topics:** Graphs, Dijkstra, Shortest Path

**Problem:** Find minimum weight subgraph with paths from src1 and src2 to dest.

**Example:**
```
Input:  n=6, edges=[[0,2,2],[0,5,6],[1,0,3],[1,4,5],[2,1,1],[2,3,3],[2,3,4],[3,4,2],[4,5,1]], src1=0, src2=1, dest=5
Output: 9
```

---

### 89. Minimum Number of Operations to Make Array Continuous
**Topics:** Arrays, Binary Search, Sliding Window

**Problem:** Make array continuous (all distinct, max-min = n-1). Return minimum replacements.

**Example:**
```
Input:  nums=[4,2,5,3]
Output: 0
```

---

### 90. Query Kth Smallest Trimmed Number
**Topics:** Strings, Sorting, Radix Sort, Heap

**Problem:** For each query [k, trim], return kth smallest number after trimming to last `trim` digits.

**Example:**
```
Input:  nums=["102","473","251","814"], queries=[[1,1],[2,3],[4,2],[1,2]]
Output: [2,2,0,0]
```

---

### 91. Number of Pairs of Interchangeable Rectangles
**Topics:** Arrays, Hash Map, Math, GCD

**Problem:** Count pairs of rectangles with same width/height ratio.

**Example:**
```
Input:  rectangles=[[4,8],[3,6],[10,20],[15,30]]
Output: 6
```

---

### 92. Find Minimum Time to Finish All Jobs
**Topics:** Arrays, Backtracking, Bitmask DP, Binary Search

**Problem:** Assign jobs to `k` workers to minimize the maximum working time.

**Example:**
```
Input:  jobs=[3,2,3], k=3
Output: 3
```

---

### 93. Maximum Score Words Formed by Letters
**Topics:** Arrays, Bitmask DP, Backtracking

**Problem:** Find maximum score of any subset of words formable from given letters.

**Example:**
```
Input:  words=["dog","cat","dad","good"], letters=['a','a','c','d','d','d','g','o','o'], score=[1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
Output: 23
```

---

### 94. K-th Largest Sum in a Binary Tree
**Topics:** Binary Tree, BFS, Sorting, Heap

**Problem:** Return kth largest level sum in a binary tree.

**Example:**
```
Input:  root=[5,8,9,2,1,3,7,4,6], k=2
Output: 13
```

---

### 95. Minimum Time to Complete Trips
**Topics:** Arrays, Binary Search

**Problem:** Given bus trip times, find minimum time for all buses to complete at least `totalTrips` trips.

**Example:**
```
Input:  time=[1,2,3], totalTrips=5
Output: 3
```

---

### 96. Minimum Path Cost in a Hidden Grid
**Topics:** Graphs, Dijkstra, Interactive, BFS

**Problem:** Navigate hidden grid using API calls to find minimum cost path to target.

**Example:**
```
Input:  Interactive grid problem
Output: minimum cost path value
```

---

### 97. Minimum Replacements to Sort the Array
**Topics:** Arrays, Greedy, Math

**Problem:** Replace elements by splitting into equal parts to sort array in non-decreasing order. Minimize operations.

**Example:**
```
Input:  nums=[3,9,3]
Output: 2
```

---

### 98. Minimum Obstacle Removal to Reach Corner
**Topics:** Matrix, BFS, Deque, 0-1 BFS, Dijkstra

**Problem:** Find minimum obstacles to remove to travel from top-left to bottom-right of grid.

**Example:**
```
Input:  grid=[[0,1,1],[1,1,0],[1,1,0]]
Output: 2
```

---

### 99. Count Fertile Pyramids in a Land
**Topics:** Matrix, Dynamic Programming

**Problem:** Count pyramidal and inverse pyramidal plots in binary grid.

**Example:**
```
Input:  grid=[[0,1,1,0],[1,1,1,1]]
Output: 2
```

---

### 100. Minimum Interval to Include Each Query
**Topics:** Arrays, Sorting, Heap, Sweep Line

**Problem:** For each query point, find the smallest interval containing it.

**Example:**
```
Input:  intervals=[[1,4],[2,4],[3,6],[4,4]], queries=[2,3,4,5]
Output: [3,3,1,4]
```

---

### 101. Maximum Sum of 3 Non-Overlapping Subarrays
**Topics:** Arrays, Dynamic Programming, Sliding Window

**Problem:** Find 3 non-overlapping subarrays of length `k` with maximum sum.

**Example:**
```
Input:  nums=[1,2,1,2,6,7,5,1], k=2
Output: [0,3,5]
```

---

### 102. Maximum Number of Events That Can Be Attended II
**Topics:** Arrays, Binary Search, Dynamic Programming, Sorting

**Problem:** Attend at most `k` non-overlapping events to maximize total value.

**Example:**
```
Input:  events=[[1,2,4],[3,4,3],[2,3,1]], k=2
Output: 7
```

---

### 103. Online Election
**Topics:** Arrays, Binary Search, Prefix Count

**Problem:** Design system to query who is leading at time `t` given votes over time.

**Example:**
```
Input:  persons=[0,1,1,0,0,1,0], times=[0,5,10,15,20,25,30], query t=3
Output: 0
```

---

### 104. Minimum Cost to Hire K Workers
**Topics:** Arrays, Greedy, Heap, Sorting

**Problem:** Hire exactly `k` workers with minimum total wages, respecting quality-to-wage ratios.

**Example:**
```
Input:  quality=[10,20,5], wage=[70,50,30], k=2
Output: 105.0
```

---

### 105. Binary Tree Cameras
**Topics:** Binary Tree, Greedy, DFS, Dynamic Programming

**Problem:** Place minimum cameras on binary tree nodes to monitor every node.

**Example:**
```
Input:  root=[0,0,null,0,0]
Output: 1
```

---

### 106. Shortest Path Visiting All Nodes
**Topics:** Graphs, BFS, Bitmask, Dynamic Programming

**Problem:** Find shortest path length that visits all nodes in an undirected connected graph.

**Example:**
```
Input:  graph=[[1,2,3],[0],[0],[0]]
Output: 4
```

---

### 107. Minimum Height Trees
**Topics:** Graphs, BFS, Topological Peeling

**Problem:** Find all roots that minimize tree height in an undirected tree.

**Example:**
```
Input:  n=4, edges=[[1,0],[1,2],[1,3]]
Output: [1]
```

---

### 108. Reconstruct Itinerary
**Topics:** Graphs, DFS, Eulerian Path, Hierholzer's Algorithm

**Problem:** Given airline tickets, reconstruct the itinerary in lexicographical order starting from JFK.

**Example:**
```
Input:  tickets=[["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
Output: ["JFK","MUC","LHR","SFO","SJC"]
```

---

### 109. Critical Connections in a Network
**Topics:** Graphs, DFS, Bridges, Tarjan's Algorithm

**Problem:** Find all critical connections (bridges) whose removal disconnects the network.

**Example:**
```
Input:  n=4, connections=[[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
```

---

### 110. Minimum Degree of a Connected Trio
**Topics:** Graphs, Brute Force, Adjacency Matrix

**Problem:** Find the minimum degree of a connected trio (3 nodes all connected to each other).

**Example:**
```
Input:  n=6, edges=[[1,2],[1,3],[3,2],[4,1],[5,2],[3,6]]
Output: 3
```

---

### 111. Maximum Students Taking Exam
**Topics:** Matrix, Bitmask DP, Graph, Maximum Bipartite Matching

**Problem:** Find maximum students that can take exam without cheating given broken seats.

**Example:**
```
Input:  seats=[["#",".","#","#",".","#"],[".","#","#","#","#","."],["#",".","#","#",".","#"]]
Output: 4
```

---

### 112. Number of Ways to Reach a Position After Exactly k Steps
**Topics:** Math, Dynamic Programming, Combinatorics

**Problem:** Count ways to move from `startPos` to `endPos` in exactly `k` steps.

**Example:**
```
Input:  startPos=1, endPos=2, k=3
Output: 3
```

---

### 113. Minimum Number of Lines to Cover Points
**Topics:** Geometry, Bitmask DP, Backtracking

**Problem:** Find minimum lines to cover all points in a plane.

**Example:**
```
Input:  points=[[0,1],[2,3],[4,5],[4,3]]
Output: 2
```

---

### 114. Verbal Arithmetic Puzzle
**Topics:** Strings, Backtracking, Constraint Propagation

**Problem:** Determine if cryptarithmetic equation is solvable by assigning digits to letters.

**Example:**
```
Input:  words=["SEND","MORE"], result="MONEY"
Output: true
```

---

### 115. Maximum Value of K Coins From Piles
**Topics:** Arrays, Dynamic Programming, Prefix Sum, Knapsack

**Problem:** Pick at most `k` coins total from tops of multiple piles. Maximize total value.

**Example:**
```
Input:  piles=[[1,100,3],[7,8,9]], k=2
Output: 101
```

---

### 116. Find the Longest Valid Obstacle Course at Each Position
**Topics:** Arrays, Binary Search, Patience Sorting, BIT

**Problem:** For each obstacle position, find length of longest non-decreasing subsequence ending there.

**Example:**
```
Input:  obstacles=[1,2,3,2]
Output: [1,2,3,3]
```

---

### 117. Selling Pieces of Wood
**Topics:** Matrix, Dynamic Programming, Memoization

**Problem:** Given wood piece and prices for cuts, find maximum revenue from cutting.

**Example:**
```
Input:  m=3, n=5, prices=[[1,4,2],[2,2,7],[2,1,3]]
Output: 19
```

---

### 118. Maximum Total Importance of Roads
**Topics:** Graphs, Greedy, Sorting, Degree Counting

**Problem:** Assign values 1..n to cities to maximize total importance of all roads (sum of endpoints).

**Example:**
```
Input:  n=5, roads=[[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
Output: 43
```

---

### 119. Count Number of Texts (Hard Variant)
**Topics:** Strings, Dynamic Programming

**Problem:** Count possible original messages from phone key presses where keys map to multiple chars.

**Example:**
```
Input:  pressedKeys = "22233"
Output: 8
```

---

### 120. Most Beautiful Item for Each Query
**Topics:** Arrays, Binary Search, Sorting

**Problem:** For each price query, find maximum beauty of an item affordable within budget.

**Example:**
```
Input:  items=[[1,2],[3,2],[2,4],[5,6],[3,5]], queries=[1,2,3,4,5,6]
Output: [2,4,5,5,6,6]
```

---

### 121. Minimum Cost to Reach City With Discounts
**Topics:** Graphs, Dijkstra, Dynamic Programming, Shortest Path

**Problem:** Find cheapest path using at most `discounts` highway discounts (halved toll).

**Example:**
```
Input:  n=5, highways=[[0,1,4],[2,1,3],[1,4,11],[3,2,3],[3,4,2]], discounts=1
Output: 9
```

---

### 122. Maximum Number of Groups Entering a Competition
**Topics:** Arrays, Greedy, Binary Search, Math

**Problem:** Form maximum groups where each group has strictly more members and total grade points than previous.

**Example:**
```
Input:  grades=[10,6,12,7,3,5]
Output: 3
```

---

### 123. Minimum Total Distance Traveled
**Topics:** Arrays, Dynamic Programming, Greedy, Sorting

**Problem:** Assign robots to factories to minimize total distance traveled.

**Example:**
```
Input:  robot=[0,4,6], factory=[[-2,2],[2,2]]
Output: 4
```

---

### 124. Minimum Difficulty of a Job Schedule
**Topics:** Arrays, Dynamic Programming

**Problem:** Schedule jobs over `d` days (at least 1 per day). Day difficulty = max job of that day. Minimize total.

**Example:**
```
Input:  jobDifficulty=[6,5,4,3,2,1], d=2
Output: 7
```

---

### 125. Jump Game VI
**Topics:** Arrays, Dynamic Programming, Deque, Sliding Window Maximum

**Problem:** Move from start to end in steps up to `k`. Maximize sum of visited elements.

**Example:**
```
Input:  nums=[1,-1,-2,4,-7,3], k=2
Output: 7
```

---

### 126. Minimum Number of Visited Cells in a Grid (Hard)
**Topics:** Matrix, BFS, Segment Tree, Greedy

**Problem:** Find minimum cells visited moving right or down up to `grid[i][j]` steps.

**Example:**
```
Input:  grid=[[3,4,2,1],[4,2,3,1],[2,1,0,0],[2,4,0,0]]
Output: 4
```

---

### 127. Sequence Reconstruction
**Topics:** Graphs, Topological Sort, BFS

**Problem:** Check if `org` is the unique shortest supersequence reconstructable from `seqs`.

**Example:**
```
Input:  org=[1,2,3], seqs=[[1,2],[1,3],[2,3]]
Output: true
```

---

### 128. Maximum Frequency Stack
**Topics:** Design, Hash Map, Stack

**Problem:** Design a stack where `pop()` returns the most frequent element (ties broken by recency).

**Example:**
```
Input:  push(5),push(7),push(5),push(7),push(4),push(5), pop(),pop(),pop()
Output: 5, 7, 5
```

---

### 129. Design Search Autocomplete System
**Topics:** Strings, Trie, Design, Priority Queue

**Problem:** Design autocomplete returning top 3 historical sentences by frequency for each input character.

**Example:**
```
Input:  sentences=["i love you","island","iroman","i love leetcode"], times=[5,3,2,2], inputs=['i',' ','a','#']
Output: [["i love you","island","i love leetcode"],["i love you","i love leetcode"],[],[]]
```

---

### 130. Minimum Cost to Connect All Points
**Topics:** Graphs, Minimum Spanning Tree, Prim's, Kruskal's

**Problem:** Connect all points with minimum cost where cost = Manhattan distance. (MST problem)

**Example:**
```
Input:  points=[[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
```

---

### 131. Find Critical and Pseudo-Critical Edges in MST
**Topics:** Graphs, MST, Union-Find, Bridges

**Problem:** Find edges that must be in every MST (critical) and those in at least one MST (pseudo-critical).

**Example:**
```
Input:  n=5, edges=[[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
Output: [[0,1],[2,3,4,5]]
```

---

### 132. Minimum Cost to Make at Least One Valid Path in a Grid
**Topics:** Matrix, 0-1 BFS, Deque, Dijkstra

**Problem:** Grid has directional arrows. Find min cost to change arrows to create valid path top-left to bottom-right.

**Example:**
```
Input:  grid=[[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
Output: 3
```

---

### 133. Number of Increasing Paths in a Grid
**Topics:** Matrix, DFS, Memoization, Topological Sort

**Problem:** Count strictly increasing paths in a grid (any length, any direction).

**Example:**
```
Input:  grid=[[1,1],[3,4]]
Output: 8
```

---

### 134. Maximum Number of Non-Overlapping Substrings
**Topics:** Strings, Greedy, Intervals

**Problem:** Find maximum number of non-overlapping substrings containing all occurrences of its characters.

**Example:**
```
Input:  s = "adefaddaccc"
Output: ["e","f","ccc"]
```

---

### 135. Count Unique Characters of All Substrings of a Given String
**Topics:** Strings, Math, Contribution Technique

**Problem:** Sum the count of unique characters in all substrings of a string.

**Example:**
```
Input:  s = "ABC"
Output: 10
```

---

### 136. Minimum Window Subsequence
**Topics:** Strings, Dynamic Programming, Two Pointers, Sliding Window

**Problem:** Find minimum window in `s` such that `t` appears as a subsequence.

**Example:**
```
Input:  s = "abcdebdde", t = "bde"
Output: "bcde"
```

---

### 137. Closest Nodes Queries in a Binary Search Tree
**Topics:** BST, DFS, Binary Search, Inorder Traversal

**Problem:** For each query, return [floor, ceil] values in BST.

**Example:**
```
Input:  root=[6,2,13,1,4,9,15,null,null,null,null,null,null,14], queries=[2,5,16]
Output: [[2,2],[4,6],[15,-1]]
```

---

### 138. Count Ways to Build Good Strings
**Topics:** Dynamic Programming, Counting

**Problem:** Count strings of length between `low` and `high` formed by appending `zero` zeros or `one` ones.

**Example:**
```
Input:  low=3, high=3, zero=1, one=1
Output: 8
```

---

### 139. Maximum Elegance of a K-Length Subsequence
**Topics:** Arrays, Greedy, Sorting, Stack

**Problem:** Select k items to maximize total profit + (distinct categories)². 

**Example:**
```
Input:  items=[[3,2],[5,1],[10,1]], k=2
Output: 17
```

---

### 140. Number of Black Blocks
**Topics:** Matrix, Hash Map

**Problem:** Count 2x2 blocks with exactly k black cells.

**Example:**
```
Input:  m=3, n=3, coordinates=[[0,0]], k=0
Output: [3,1,0,0,0]
```

---

### 141. Maximum Number of Books You Can Take
**Topics:** Arrays, Stack, Dynamic Programming, Monotonic Stack

**Problem:** Select contiguous books where books[i] < books[i+1] for selected subarray. Maximize count.

**Example:**
```
Input:  books=[8,5,2,7,9]
Output: 12
```

---

### 142. Minimum Cost to Make Array Equalindromic
**Topics:** Arrays, Math, Sorting, Palindromes

**Problem:** Make all elements equal to some palindrome. Minimize total absolute difference.

**Example:**
```
Input:  nums=[1,2,3,4,5]
Output: 6
```

---

### 143. Count Subarrays Where Max Element Appears at Least K Times
**Topics:** Arrays, Sliding Window, Two Pointers

**Problem:** Count subarrays where maximum element appears at least `k` times.

**Example:**
```
Input:  nums=[1,3,2,3,3], k=2
Output: 6
```

---

### 144. Maximum Spending After Buying Items
**Topics:** Arrays, Greedy, Sorting, Heap

**Problem:** Buy one item per day at increasing prices. Maximize total spending.

**Example:**
```
Input:  values=[[8,5,2],[6,4,1],[9,7,3]]
Output: 285
```

---

### 145. Find the Longest Equal Subarray
**Topics:** Arrays, Sliding Window, Hash Map

**Problem:** Delete at most `k` elements. Find longest subarray where all remaining elements are equal.

**Example:**
```
Input:  nums=[1,3,2,3,1,3], k=3
Output: 3
```

---

### 146. Minimum Operations to Form Subsequence With Target Sum
**Topics:** Bit Manipulation, Greedy, Arrays

**Problem:** Find min operations to form target sum as subsequence using bit operations.

**Example:**
```
Input:  nums=[1,2,8], target=7
Output: 1
```

---

### 147. Maximum Subarray Sum With Length Divisible by K
**Topics:** Arrays, Prefix Sum, Hash Map, Dynamic Programming

**Problem:** Find maximum subarray sum where length is divisible by k.

**Example:**
```
Input:  nums=[1,2,3,4,5,6], k=3
Output: 21
```

---

### 148. Minimum Time to Visit a Cell In a Grid
**Topics:** Matrix, Dijkstra, Heap, BFS

**Problem:** Find minimum time to travel from top-left to bottom-right given minimum time constraints per cell.

**Example:**
```
Input:  grid=[[0,1,3,2],[5,1,2,5],[4,3,8,6]]
Output: 7
```

---

### 149. Maximum Points Tourist Can Earn
**Topics:** Dynamic Programming, Matrix

**Problem:** Tourist visits exactly k days, each day choosing a city. Maximize points collected.

**Example:**
```
Input:  n=3, k=4, stayScore=[[2,3],[1,2],[4,1]], travelScore=[[0,2,1],[2,0,4],[3,1,0]]
Output: 24
```

---

### 150. Maximum Balanced Subsequence Sum
**Topics:** Arrays, Binary Search, Segment Tree, Dynamic Programming

**Problem:** Find maximum sum of a balanced subsequence where nums[j]-nums[i] >= j-i for all pairs.

**Example:**
```
Input:  nums=[3,3,5,6]
Output: 14
```

---

### 151. Count the Number of Infection Times
**Topics:** Arrays, Simulation, Binary Search, Segment Tree

**Problem:** Find the time at which the entire array is infected given a starting position and spread rules.

**Example:**
```
Input:  n=5, sick=[0,4]
Output: 4
```

---

### 152. Minimum Number of Groups to Create a Valid Assignment
**Topics:** Arrays, Hash Map, Greedy, Math

**Problem:** Assign array elements to groups with minimum count difference. Minimize total groups.

**Example:**
```
Input:  nums=[3,2,3,2,3]
Output: 2
```

---

### 153. Find Edges in Shortest Paths
**Topics:** Graphs, Dijkstra, BFS, Shortest Path

**Problem:** Find all edges that belong to at least one shortest path from source to every other node.

**Example:**
```
Input:  n=5, edges=[[0,1,1],[1,2,1],[0,3,4],[3,2,2]]
Output: [true,true,false,false]
```

---

### 154. Minimum Cost to Convert String I
**Topics:** Graphs, Dijkstra, Floyd-Warshall, Shortest Path

**Problem:** Convert source to target string with minimum cost using character transformation rules.

**Example:**
```
Input:  source="abcd", target="acbe", original=['a','b','c','c','e','d'], changed=['b','c','b','e','b','e'], cost=[2,5,5,1,2,20]
Output: 28
```

---

### 155. Minimum Moves to Spread Stones Over Grid
**Topics:** Matrix, BFS, Dynamic Programming, Bitmask

**Problem:** Distribute extra stones so each cell in 3x3 grid has exactly 1. Minimize total moves.

**Example:**
```
Input:  grid=[[1,1,0],[1,1,1],[1,2,1]]
Output: 1
```

---

### 156. Minimum Cost to Equalize Array
**Topics:** Arrays, Greedy, Math

**Problem:** Make all elements equal by increasing element costs. Minimize total cost.

**Example:**
```
Input:  nums=[4,1], cost1=5, cost2=2
Output: 15
```

---

### 157. Count K-Reducible Numbers Less Than N
**Topics:** Strings, Dynamic Programming, Combinatorics, Digit DP

**Problem:** Count numbers less than n (in binary) reducible to 1 in at most k steps.

**Example:**
```
Input:  s="111", k=1
Output: 3
```

---

### 158. Maximum Number of K-Divisible Components
**Topics:** Trees, DFS, Dynamic Programming

**Problem:** Find maximum components a tree can be split into where each component's value sum is divisible by k.

**Example:**
```
Input:  n=5, edges=[[0,2],[1,2],[1,3],[2,4]], values=[1,8,1,4,4], k=6
Output: 2
```

---

### 159. Minimum Cost Good Substring
**Topics:** Strings, Sliding Window, Hash Map, Dynamic Programming

**Problem:** Find minimum cost to form a string from given substrings.

**Example:**
```
Input:  target="abcdef", words=["abcd","ef","bc","a","e"], costs=[1,1,2,3,4]
Output: 2
```

---

### 160. Count Paths That Can Form a Palindrome in a Tree
**Topics:** Trees, DFS, Bit Manipulation, Hash Map

**Problem:** Count paths in tree where character XOR allows palindrome formation.

**Example:**
```
Input:  n=3, parent=[-1,0,0], s="aab"
Output: 3
```

---

### 161. Maximum Score of a Node Sequence
**Topics:** Graphs, Sorting, Greedy

**Problem:** Find maximum score of a valid 4-node sequence in an undirected weighted graph.

**Example:**
```
Input:  scores=[5,2,9,8,4], edges=[[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
Output: 24
```

---

### 162. Apply Operations to Maximize Frequency Score
**Topics:** Arrays, Sliding Window, Binary Search, Prefix Sum

**Problem:** Apply at most k operations to maximize the frequency of the most frequent element.

**Example:**
```
Input:  nums=[1,2,6,4], k=3
Output: 3
```

---

### 163. Longest Increasing Subsequence II
**Topics:** Arrays, Segment Tree, Binary Search, Dynamic Programming

**Problem:** Find length of LIS where consecutive elements differ by at most k.

**Example:**
```
Input:  nums=[4,2,1,4,3,4,5,8,15], k=3
Output: 5
```

---

### 164. Best Time to Buy and Sell Stock with Transaction Fees (Hard Variant)
**Topics:** Arrays, Dynamic Programming, Greedy

**Problem:** Maximize profit with unlimited transactions and a transaction fee per transaction.

**Example:**
```
Input:  prices=[1,3,2,8,4,9], fee=2
Output: 8
```

---

### 165. Minimum Number of Coins for Fruits
**Topics:** Arrays, Dynamic Programming, Monotonic Queue, Sliding Window

**Problem:** Buy fruits with minimum coins where buying ith fruit grants next i free.

**Example:**
```
Input:  prices=[3,1,2]
Output: 4
```

---

### 166. Maximum XOR With an Element From Array
**Topics:** Arrays, Trie, Offline Queries, Sorting

**Problem:** For each query [xi, mi], find maximum XOR of xi with any nums[j] <= mi.

**Example:**
```
Input:  nums=[0,1,2,3,4], queries=[[3,1],[1,3],[5,6]]
Output: [3,3,7]
```

---

### 167. Maximum XOR of Two Non-Overlapping Subtrees
**Topics:** Trees, DFS, Trie, XOR

**Problem:** Find max XOR of sums of two non-overlapping subtrees.

**Example:**
```
Input:  n=6, edges=[[0,1],[0,2],[1,3],[1,4],[2,5]], values=[1,8,5,2,4,3]
Output: 0
```

---

### 168. Minimum Time to Remove All Cars Containing Illegal Goods
**Topics:** Strings, Dynamic Programming, Prefix/Suffix

**Problem:** Remove all cars with illegal goods. Removing leftmost/rightmost costs 1, middle costs 2. Minimize time.

**Example:**
```
Input:  s = "1100101"
Output: 5
```

---

### 169. Minimum Weighted Subgraph With Required Paths to Destination
**Topics:** Graphs, Dijkstra, Three-Source Shortest Path

**Problem:** Find subgraph with minimum total weight having paths from src1 and src2 to dest.

**Example:**
```
Input:  n=5, edges=[[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]], src1=0, src2=2, dest=3
Output: 3
```

---

### 170. Minimum Number of Days to Make m Bouquets (Hard Variant)
**Topics:** Arrays, Binary Search

**Problem:** With blooming schedule, find minimum days to make m bouquets each needing k adjacent flowers.

**Example:**
```
Input:  bloomDay=[7,7,7,7,12,7,7], m=2, k=3
Output: 12
```

---

### 171. Minimum Number of Operations to Sort a Binary Tree by Level
**Topics:** Binary Tree, BFS, Cycle Detection, Swaps

**Problem:** Find minimum swap operations per level to sort binary tree values by level.

**Example:**
```
Input:  root=[1,4,3,7,6,8,5,null,null,null,null,9,null,10]
Output: 3
```

---

### 172. Construct Binary Tree from Preorder and Postorder
**Topics:** Binary Tree, DFS, Divide and Conquer

**Problem:** Reconstruct binary tree from preorder and postorder traversal arrays.

**Example:**
```
Input:  preorder=[1,2,4,5,3,6,7], postorder=[4,5,2,6,7,3,1]
Output: [1,2,3,4,5,6,7]
```

---

### 173. Data Stream as Disjoint Intervals
**Topics:** Design, Sorted Set, Binary Search, Intervals

**Problem:** Design a data structure to maintain disjoint intervals from a stream of integers.

**Example:**
```
Input:  addNum(1), addNum(3), addNum(7), addNum(2), addNum(6), getIntervals()
Output: [[1,3],[6,7]]
```

---

### 174. Count of Range Sum (Hard Variant)
**Topics:** Arrays, Merge Sort, Segment Tree, BIT

**Problem:** Count range sums in [lower, upper] using divide and conquer merge sort approach.

**Example:**
```
Input:  nums=[-2,5,-1], lower=-2, upper=2
Output: 3
```

---

### 175. The Number of Weak Characters in the Game
**Topics:** Arrays, Greedy, Sorting, Stack

**Problem:** Count characters strictly weaker than another (both attack and defense lower).

**Example:**
```
Input:  properties=[[5,5],[6,3],[3,6]]
Output: 0
```

---

### 176. Minimum Cost to Make All Characters Equal
**Topics:** Strings, Dynamic Programming, Greedy

**Problem:** Flip prefix or suffix to make all characters equal in minimum cost.

**Example:**
```
Input:  s="0011"
Output: 2
```

---

### 177. Minimum Time to Finish the Race
**Topics:** Arrays, Dynamic Programming

**Problem:** Race for `numLaps` laps choosing tires optimally with a changeTime penalty.

**Example:**
```
Input:  tires=[[2,3],[3,4]], changeTime=5, numLaps=4
Output: 21
```

---

### 178. Count Ways to Build Rooms in an Ant Colony
**Topics:** Trees, Dynamic Programming, Math, Combinatorics

**Problem:** Count valid orderings to build rooms respecting prerequisite tree structure.

**Example:**
```
Input:  prevRoom=[-1,0,1]
Output: 1
```

---

### 179. Maximum Running Time of N Computers
**Topics:** Arrays, Binary Search, Greedy

**Problem:** Find maximum minutes n computers can run simultaneously with given batteries.

**Example:**
```
Input:  n=2, batteries=[3,3,3]
Output: 4
```

---

### 180. Minimum Space Wasted With K Resizing Operations
**Topics:** Arrays, Dynamic Programming

**Problem:** Resize array at most k times. Minimize total wasted space (capacity - actual usage).

**Example:**
```
Input:  nums=[10,20], k=0
Output: 10
```

---

### 181. Minimize the Maximum Difference of Pairs
**Topics:** Arrays, Binary Search, Greedy

**Problem:** Form p pairs minimizing the maximum difference. Return minimum possible maximum difference.

**Example:**
```
Input:  nums=[10,1,2,7,1,3], p=2
Output: 1
```

---

### 182. Maximum Number of Alloys
**Topics:** Arrays, Binary Search

**Problem:** Find maximum alloys produceable given machine compositions, budget, and stock.

**Example:**
```
Input:  n=3, k=2, budget=15, composition=[[1,1,1],[1,1,10]], stock=[0,0,0], cost=[1,2,3]
Output: 2
```

---

### 183. Find Maximum Non-Decreasing Array Length
**Topics:** Arrays, Dynamic Programming, Monotonic Queue, Binary Search

**Problem:** Split array into minimum subarrays and replace each with its sum; maximize resulting array length.

**Example:**
```
Input:  nums=[5,2,2]
Output: 1
```

---

### 184. Maximum Balanced Subsequence Sum
**Topics:** Arrays, Segment Tree, Binary Search, Dynamic Programming

**Problem:** Find max sum balanced subsequence where balance condition nums[j]-j >= nums[i]-i.

**Example:**
```
Input:  nums=[3,3,5,6]
Output: 14
```

---

### 185. Count Subarrays With Fixed Bounds
**Topics:** Arrays, Sliding Window, Two Pointers

**Problem:** Count subarrays with minimum equal to `minK` and maximum equal to `maxK`.

**Example:**
```
Input:  nums=[1,3,5,2,7,5], minK=1, maxK=5
Output: 2
```

---

### 186. Maximum Sum of Distinct Subarrays With Length K
**Topics:** Arrays, Sliding Window, Hash Map

**Problem:** Find maximum sum of subarray of length k with all distinct elements.

**Example:**
```
Input:  nums=[1,5,4,2,9,9,9], k=3
Output: 15
```

---

### 187. Count Subarrays With Score Less Than K
**Topics:** Arrays, Prefix Sum, Binary Search, Two Pointers

**Problem:** Count subarrays where score (sum × length) < k.

**Example:**
```
Input:  nums=[2,1,4,3,5], k=10
Output: 6
```

---

### 188. Maximum Segment Sum After Removals
**Topics:** Arrays, Union-Find, Segment Tree, Reverse Processing

**Problem:** After each removal from array, return maximum segment sum of remaining elements.

**Example:**
```
Input:  nums=[1,2,5,6,1], removeQueries=[0,3,2,4,1]
Output: [14,7,2,2,0]
```

---

### 189. Minimum Operations to Make the Array K-Increasing
**Topics:** Arrays, Binary Search, Longest Non-Decreasing Subsequence

**Problem:** Make array k-increasing with minimum operations (each period of k must be non-decreasing).

**Example:**
```
Input:  arr=[5,4,3,2,1], k=1
Output: 4
```

---

### 190. Minimum Cost to Make Target Array
**Topics:** Arrays, Dynamic Programming, Greedy

**Problem:** Build target array from zeros using increment and copy operations at minimum cost.

**Example:**
```
Input:  target=[1,1,1,2]
Output: 4
```

---

### 191. Number of Ways to Divide a Long Corridor
**Topics:** Strings, Math, Dynamic Programming

**Problem:** Count ways to divide corridor into sections with exactly 2 seats each using dividers.

**Example:**
```
Input:  corridor = "SWSSST"
Output: 2
```

---

### 192. Minimum Number of Lines to Cover Points (Hard)
**Topics:** Geometry, Bitmask DP, Backtracking, Hashing

**Problem:** Find minimum number of lines to cover all 2D points.

**Example:**
```
Input:  points=[[0,1],[2,3],[4,5],[4,3]]
Output: 2
```

---

### 193. Minimum Cost to Connect Sticks (Greedy Hard)
**Topics:** Heap, Huffman Encoding, Greedy

**Problem:** Connect sticks into one with minimum cost using optimal pairing strategy.

**Example:**
```
Input:  sticks=[2,4,3]
Output: 14
```

---

### 194. Design Graph With Shortest Path Calculator
**Topics:** Graphs, Dijkstra, Design

**Problem:** Design graph supporting addEdge and shortestPath operations using Dijkstra.

**Example:**
```
Input:  addEdge([1,2,2]), shortestPath(1,3)
Output: shortest path value
```

---

### 195. Minimum Time to Kill All Monsters
**Topics:** Arrays, Bitmask DP, Dynamic Programming

**Problem:** Each day gain power equal to current level. Kill monster when power >= monster power. Minimize days.

**Example:**
```
Input:  power=[3,1,4]
Output: 4
```

---

### 196. Shortest Path to Get All Keys
**Topics:** Matrix, BFS, Bitmask, State Space Search

**Problem:** Find shortest path to collect all keys in grid, opening corresponding locks.

**Example:**
```
Input:  grid=["@.a.#","###.#","b.A.B"]
Output: 8
```

---

### 197. Parallel Courses II
**Topics:** Graphs, Bitmask DP, Dynamic Programming

**Problem:** Take courses with prerequisites, at most k per semester. Find minimum semesters.

**Example:**
```
Input:  n=4, dependencies=[[2,1],[3,1],[1,4]], k=2
Output: 3
```

---

### 198. Minimum Number of Refueling Stops (Hard Variant)
**Topics:** Arrays, Greedy, Heap, Dynamic Programming

**Problem:** Extended version with variable fuel capacities and distances.

**Example:**
```
Input:  target=100, startFuel=10, stations=[[10,60],[20,30],[30,30],[60,40]]
Output: 2
```

---

### 199. Longest Chunked Palindrome Decomposition
**Topics:** Strings, Greedy, Dynamic Programming, Hashing

**Problem:** Split string into chunks where result is a palindrome. Maximize chunk count.

**Example:**
```
Input:  text = "ghiabcdefhelloadamhelloabcdefghi"
Output: 7
```

---

### 200. Minimum Window Substring (Hard Variant with Distinct)
**Topics:** Strings, Sliding Window, Hash Map

**Problem:** Extended minimum window where window must contain all distinct characters of t.

**Example:**
```
Input:  s="ADOBECODEBANC", t="ABC"
Output: "BANC"
```

---

### 201. Distinct Echo Substrings
**Topics:** Strings, Hashing, Rolling Hash, DP

**Problem:** Return count of distinct non-empty substrings of s that can be written as concatenation of two identical strings.

**Example:**
```
Input:  s = "abcabcabc"
Output: 3
```

---

### 202. Plates Between Candles
**Topics:** Arrays, Binary Search, Prefix Sum

**Problem:** For each query range, count plates between at least one candle on each side.

**Example:**
```
Input:  s="**|**|***|", queries=[[2,5],[5,9]]
Output: [2,3]
```

---

### 203. Number of Subarrays With GCD Equal to K
**Topics:** Arrays, Math, GCD

**Problem:** Count subarrays where GCD of all elements equals k.

**Example:**
```
Input:  nums=[9,3,1,2,6,3], k=3
Output: 4
```

---

### 204. Minimum Cost to Reach Destination in Time
**Topics:** Graphs, Dynamic Programming, Dijkstra

**Problem:** Find minimum fee path from 0 to n-1 within maxTime, summing node fees.

**Example:**
```
Input:  maxTime=30, edges=[[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees=[5,1,2,20,20,3]
Output: 11
```

---

### 205. Stone Game V
**Topics:** Arrays, Dynamic Programming, Interval DP

**Problem:** Alice gets score for each split (sum of smaller half). Maximize Alice's score.

**Example:**
```
Input:  stoneValue=[6,2,3,4,5,5]
Output: 18
```

---

### 206. Stone Game VI
**Topics:** Arrays, Greedy, Sorting

**Problem:** Both players pick from ends. Maximize score difference using optimal strategy.

**Example:**
```
Input:  aliceValues=[1,3], bobValues=[2,1]
Output: 1
```

---

### 207. Minimum Swaps to Make Sequences Increasing
**Topics:** Arrays, Dynamic Programming

**Problem:** Find minimum swaps at same indices to make both arrays strictly increasing.

**Example:**
```
Input:  nums1=[1,3,5,4], nums2=[1,2,3,7]
Output: 1
```

---

### 208. Minimum Domino Rotations For Equal Row
**Topics:** Arrays, Greedy

**Problem:** Minimum rotations to make all tops or bottoms equal on dominoes.

**Example:**
```
Input:  tops=[2,1,2,4,2,2], bottoms=[5,2,6,2,3,2]
Output: 2
```

---

### 209. Minimum Number of Taps to Open to Water a Garden
**Topics:** Arrays, Greedy, Dynamic Programming, Interval Covering

**Problem:** Find minimum taps to open to water entire garden [0,n].

**Example:**
```
Input:  n=5, ranges=[3,4,1,1,0,0]
Output: 1
```

---

### 210. Maximum Performance of a Team
**Topics:** Arrays, Greedy, Sorting, Heap

**Problem:** Select at most k engineers to maximize performance (sum of speeds × min efficiency).

**Example:**
```
Input:  n=6, speed=[2,10,3,1,5,8], efficiency=[5,4,3,9,7,2], k=2
Output: 56
```

---

### 211. Find Minimum in Rotated Sorted Array (Duplicates + Count)
**Topics:** Arrays, Binary Search

**Problem:** Extended version: find count of minimum element in rotated sorted array with duplicates.

**Example:**
```
Input:  nums=[1,3,5,1,1]
Output: 1 (value), 3 (count)
```

---

### 212. Minimum Cost to Make Array Non-Decreasing
**Topics:** Arrays, Dynamic Programming, Slope Trick

**Problem:** Make array non-decreasing with minimum cost using increment operations.

**Example:**
```
Input:  nums=[3,2,4,5,0]
Output: 4
```

---

### 213. Valid Arrangement of Pairs
**Topics:** Graphs, Eulerian Path, DFS, Hierholzer's Algorithm

**Problem:** Arrange pairs so each pair's end equals next pair's start (Eulerian path in directed graph).

**Example:**
```
Input:  pairs=[[5,1],[4,5],[11,9],[9,4]]
Output: [[11,9],[9,4],[4,5],[5,1]]
```

---

### 214. Maximum XOR After Operations
**Topics:** Arrays, Bit Manipulation, Math

**Problem:** Maximize XOR of all array elements after replacing any element with itself AND any integer.

**Example:**
```
Input:  nums=[3,2,4,6]
Output: 7
```

---

### 215. Count Pairs With XOR in a Range
**Topics:** Arrays, Trie, Bit Manipulation

**Problem:** Count pairs whose XOR lies within [low, high].

**Example:**
```
Input:  nums=[1,4,2,7], low=2, high=6
Output: 6
```

---

### 216. Maximum Number of Tasks You Can Assign
**Topics:** Arrays, Binary Search, Greedy, Deque, Sorting

**Problem:** Assign tasks to workers with optional strength pill. Maximize tasks completed.

**Example:**
```
Input:  tasks=[3,2,1], workers=[0,3,3], pills=1, strength=1
Output: 3
```

---

### 217. Find All People With Secret
**Topics:** Graphs, Union-Find, BFS, Sorting

**Problem:** Propagate secret through meetings at same time. Find all people who know the secret.

**Example:**
```
Input:  n=6, meetings=[[1,2,5],[2,3,8],[1,5,10]], firstPerson=1
Output: [0,1,2,3,5]
```

---

### 218. Count Good Numbers
**Topics:** Math, Modular Exponentiation, Combinatorics

**Problem:** Count digit strings of length n where even indices have even digits and odd indices have primes.

**Example:**
```
Input:  n = 1
Output: 5
```

---

### 219. Minimum XOR Sum of Two Arrays (Bitmask)
**Topics:** Arrays, Bitmask DP

**Problem:** Match elements of two arrays to minimize total XOR sum.

**Example:**
```
Input:  nums1=[1,2], nums2=[2,3]
Output: 2
```

---

### 220. Maximum Profit in Job Scheduling (2D)
**Topics:** Arrays, Dynamic Programming, Binary Search, Sorting

**Problem:** Extended job scheduling with 2D constraints (time and location).

**Example:**
```
Input:  startTime=[1,2,3,3], endTime=[3,4,5,6], profit=[50,10,40,70]
Output: 120
```

---

### 221. Minimum Hours of Training to Win a Competition
**Topics:** Arrays, Greedy

**Problem:** Train minimum hours to beat all opponents in energy and experience.

**Example:**
```
Input:  initialEnergy=5, initialExperience=3, energy=[1,4,3,2], experience=[2,6,3,1]
Output: 8
```

---

### 222. Count Integers in Ranges
**Topics:** Segment Tree, BIT, Range Queries, Design

**Problem:** Design structure for range add and range count of specific value queries.

**Example:**
```
Input:  add(1,5,1), count(2,4)
Output: 3
```

---

### 223. Minimum Number of Pushes to Type Word II
**Topics:** Strings, Greedy, Sorting, Hash Map

**Problem:** Remap phone keyboard letters to minimize total key pushes for a word.

**Example:**
```
Input:  word = "aabbccddeeffgghhiiiiii"
Output: 24
```

---

### 224. Find the K-Sum of an Array
**Topics:** Arrays, Sorting, Heap, Priority Queue

**Problem:** Find the kth largest subsequence sum of an array.

**Example:**
```
Input:  nums=[2,4,-2], k=5
Output: 2
```

---

### 225. Stamping the Sequence
**Topics:** Strings, Greedy, Queue, Reverse Engineering

**Problem:** Find sequence of stamp operations to form target string.

**Example:**
```
Input:  stamp="abc", target="ababc"
Output: [0,2]
```

---

### 226. Minimum Cost to Cut a Stick (Hard Variant)
**Topics:** Arrays, Dynamic Programming, Interval DP

**Problem:** Extended version with multiple sticks and complex cutting cost function.

**Example:**
```
Input:  n=7, cuts=[1,3,4,5]
Output: 16
```

---

### 227. Longest Substring With At Most K Distinct Characters
**Topics:** Strings, Sliding Window, Hash Map

**Problem:** Find length of longest substring with at most k distinct characters.

**Example:**
```
Input:  s="eceba", k=2
Output: 3
```

---

### 228. Maximum Sum BST in Binary Tree
**Topics:** Binary Tree, DFS, Dynamic Programming

**Problem:** Find maximum sum of keys of any subtree that is also a BST.

**Example:**
```
Input:  root=[1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
Output: 20
```

---

### 229. Count Subtrees With Max Distance Between Cities
**Topics:** Trees, Bitmask, BFS, DFS, Enumeration

**Problem:** Count subsets of n cities forming a subtree with maximum distance exactly d.

**Example:**
```
Input:  n=4, edges=[[1,2],[2,3],[2,4]]
Output: [3,4,0]
```

---

### 230. Make Array Strictly Increasing
**Topics:** Arrays, Dynamic Programming, Binary Search, Sorting

**Problem:** Minimum operations to make arr1 strictly increasing by replacing elements with arr2 values.

**Example:**
```
Input:  arr1=[1,5,3,6,7], arr2=[1,3,2,4]
Output: 1
```

---

### 231. Maximum Length of Subarray With Positive Product
**Topics:** Arrays, Dynamic Programming

**Problem:** Find maximum length subarray with positive product.

**Example:**
```
Input:  nums=[1,-2,-3,4]
Output: 4
```

---

### 232. Sum of Distances in Tree
**Topics:** Trees, DFS, Re-rooting Technique, Dynamic Programming

**Problem:** Return array where answer[i] = sum of distances from node i to all other nodes.

**Example:**
```
Input:  n=6, edges=[[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
```

---

### 233. Minimum Fuel Cost to Report to the Capital
**Topics:** Trees, DFS, Greedy

**Problem:** Find minimum fuel for all nodes to travel to root 0 with seat-limited cars.

**Example:**
```
Input:  roads=[[0,1],[0,2],[0,3]], seats=5
Output: 3
```

---

### 234. Maximum Path Quality of a Graph
**Topics:** Graphs, DFS, Backtracking, Time-Constrained

**Problem:** Find maximum quality path starting and ending at 0 within maxTime, revisiting allowed.

**Example:**
```
Input:  values=[0,32,10,43], edges=[[0,1,10],[1,2,15],[0,3,10]], maxTime=49
Output: 75
```

---

### 235. Count Nodes Equal to Average of Subtree
**Topics:** Binary Tree, DFS

**Problem:** Count nodes where value equals integer average of subtree.

**Example:**
```
Input:  root=[4,8,5,0,1,null,6]
Output: 5
```

---

### 236. Minimum Cost Homecoming of a Robot in a Grid
**Topics:** Matrix, Greedy

**Problem:** Move robot from start to home minimizing cost (each row/column has different cost).

**Example:**
```
Input:  startPos=[1,0], homePos=[2,3], rowCosts=[5,4,3], colCosts=[8,2,6,7]
Output: 18
```

---

### 237. Minimum Operations to Make the Integer Zero
**Topics:** Bit Manipulation, Math, Greedy

**Problem:** Find minimum operations to reduce num1 to 0 subtracting (2^i + num2) each time.

**Example:**
```
Input:  num1=3, num2=-2
Output: 3
```

---

### 238. Minimum Operations to Make Array Equal II
**Topics:** Arrays, Math, Greedy

**Problem:** Make nums1 equal to nums2 using minimum operations (increment/decrement with step k).

**Example:**
```
Input:  nums1=[4,3,1,4], nums2=[1,3,7,1], k=3
Output: 2
```

---

### 239. Number of Paths With Max Score
**Topics:** Matrix, Dynamic Programming

**Problem:** Find max score path and number of such paths in a matrix with obstacles.

**Example:**
```
Input:  board=["E23","2X2","12S"]
Output: [7,1]
```

---

### 240. Kth Ancestor of a Tree Node
**Topics:** Trees, Binary Lifting, Dynamic Programming

**Problem:** Design structure to query kth ancestor of any node in O(log n).

**Example:**
```
Input:  n=7, parent=[-1,0,0,1,1,2,2], queries: getKthAncestor(3,1)
Output: 1
```

---

### 241. Maximum Number of Achievable Transfer Requests
**Topics:** Graphs, Bitmask, Backtracking

**Problem:** Find maximum requests satisfiable where each building's net change is 0.

**Example:**
```
Input:  n=5, requests=[[0,1],[1,0],[0,1],[1,2],[2,0],[3,4]]
Output: 5
```

---

### 242. Minimum Score After Removals on a Tree
**Topics:** Trees, DFS, XOR, Euler Tour

**Problem:** Remove two edges to form 3 components. Minimize score (max XOR minus min XOR).

**Example:**
```
Input:  nums=[1,5,5,4,11], edges=[[0,1],[1,2],[1,3],[3,4]]
Output: 9
```

---

### 243. Maximum Genetic Difference Query
**Topics:** Trees, Trie, DFS, Offline Queries

**Problem:** For each query (node, val), find maximum XOR of val with any node ancestor value.

**Example:**
```
Input:  parents=[-1,0,1,1], queries=[[0,2],[3,2],[2,5]]
Output: [2,3,7]
```

---

### 244. Number of Ways to Reconstruct a Tree
**Topics:** Trees, Graphs, Prime Factorization

**Problem:** Count ways to reconstruct a rooted tree from ancestor pairs.

**Example:**
```
Input:  pairs=[[1,2],[2,3]]
Output: 1
```

---

### 245. Maximum Sum of 3 Non-Overlapping Intervals
**Topics:** Arrays, Dynamic Programming, Sliding Window

**Problem:** Find 3 non-overlapping intervals of length k maximizing total sum.

**Example:**
```
Input:  nums=[1,2,1,2,6,7,5,1], k=2
Output: [0,3,5]
```

---

### 246. Minimum Interval to Include Each Query (Hard)
**Topics:** Arrays, Sorting, Heap, Sweep Line, Binary Search

**Problem:** For each query, find size of smallest interval [l,r] containing query point.

**Example:**
```
Input:  intervals=[[1,4],[2,4],[3,6],[4,4]], queries=[2,3,4,5]
Output: [3,3,1,4]
```

---

### 247. Count Special Quadruplets
**Topics:** Arrays, Hash Map, Dynamic Programming

**Problem:** Count quadruplets (a,b,c,d) where nums[a]+nums[b]+nums[c] = nums[d].

**Example:**
```
Input:  nums=[1,2,3,6]
Output: 1
```

---

### 248. Minimum Moves to Reach Target Score
**Topics:** Math, Greedy

**Problem:** Reach target from 1 using double or increment operations with limited doubles.

**Example:**
```
Input:  target=19, maxDoubles=2
Output: 7
```

---

### 249. Minimum Number of People to Teach
**Topics:** Graphs, Hash Map, Languages

**Problem:** Find minimum number of language teachings so every pair of friends can communicate.

**Example:**
```
Input:  n=2, languages=[[1],[2],[1,2]], friendships=[[1,2],[1,3],[2,3]]
Output: 1
```

---

### 250. Booking Concert Tickets in Groups
**Topics:** Design, Segment Tree, Binary Search

**Problem:** Design structure for gathering(k, maxRow) and scatter(k, maxRow) operations on concert seats.

**Example:**
```
Input:  gather(4,3), scatter(5,5)
Output: [0,0], true
```

---

### 251. Number of Distinct Roll Sequences
**Topics:** Dynamic Programming, Math, Memoization

**Problem:** Count distinct roll sequences of length n where no two consecutive rolls are equal and no roll divides next.

**Example:**
```
Input:  n = 2
Output: 22
```

---

### 252. Minimum Cost to Separate Sentence Into Rows
**Topics:** Strings, Dynamic Programming

**Problem:** Place words into rows of width k minimizing total cost (extra spaces squared per row, last row excluded).

**Example:**
```
Input:  words=["what","must","be","done","is","done"], k=12
Output: 2
```

---

### 253. Maximum Fruits Harvested After at Most K Steps
**Topics:** Arrays, Sliding Window, Binary Search, Prefix Sum

**Problem:** Harvest max fruits within k steps starting from position, can go left then right or vice versa.

**Example:**
```
Input:  fruits=[[2,8],[6,3],[8,6]], startPos=5, k=4
Output: 9
```

---

### 254. Closest Room
**Topics:** Arrays, Sorting, SortedList, Offline Queries

**Problem:** For each query [preferred, minSize], find room id closest to preferred with size >= minSize.

**Example:**
```
Input:  rooms=[[2,2],[1,2],[3,2]], queries=[[3,1],[3,3],[5,2]]
Output: [3,3,3]
```

---

### 255. Find the Shortest Superstring
**Topics:** Strings, Bitmask DP, Dynamic Programming, Hamiltonian Path

**Problem:** Find shortest superstring containing all given words as substrings.

**Example:**
```
Input:  words=["alex","loves","leetcode"]
Output: "alexlovesleetcode"
```

---

### 256. Minimum Cost to Connect Two Groups of Points
**Topics:** Arrays, Bitmask DP, Dynamic Programming

**Problem:** Connect two groups so each point in both groups has at least one connection. Minimize cost.

**Example:**
```
Input:  cost=[[15,96],[36,2]]
Output: 17
```

---

### 257. Max Sum of Rectangle No Larger Than K
**Topics:** Matrix, Binary Search, Sorted Set, Dynamic Programming

**Problem:** Find maximum sum rectangle in matrix with sum no larger than k.

**Example:**
```
Input:  matrix=[[1,0,1],[0,-2,3]], k=2
Output: 2
```

---

### 258. Minimum Deletion Cost to Avoid Repeating Letters
**Topics:** Strings, Greedy

**Problem:** Remove characters to avoid consecutive duplicates with minimum total deletion cost.

**Example:**
```
Input:  s="abaac", cost=[1,2,3,4,5]
Output: 3
```

---

### 259. Sum of Imbalance Numbers of All Subarrays
**Topics:** Arrays, Math, Contribution Technique, Sorting

**Problem:** Calculate sum of imbalance numbers over all subarrays.

**Example:**
```
Input:  nums=[2,3,1,4]
Output: 3
```

---

### 260. Grid Illumination
**Topics:** Hash Map, Sets, Math, Line Hashing

**Problem:** Toggle lamp illumination when queried; lamps illuminate row/col/diagonal.

**Example:**
```
Input:  n=5, lamps=[[0,0],[4,4]], queries=[[1,1],[1,0]]
Output: [1,0]
```

---

### 261. Number of Squareful Arrays (Hard Variant)
**Topics:** Arrays, Backtracking, Graph, Hamiltonian Path

**Problem:** Find ALL squareful permutations where adjacent sums are perfect squares.

**Example:**
```
Input:  nums=[1,17,8]
Output: [[1,8,17],[17,8,1]]
```

---

### 262. Maximum Trailing Zeros in a Cornered Path
**Topics:** Matrix, Prefix Sum, Greedy

**Problem:** Find path in matrix turning once; maximize trailing zeros in product.

**Example:**
```
Input:  grid=[[23,17,15,3,20],[8,1,20,27,11],[9,4,6,2,21],[40,9,1,10,6],[22,7,4,5,3]]
Output: 3
```

---

### 263. Painting a Grid With Three Different Colors
**Topics:** Dynamic Programming, Bitmask, Column DP

**Problem:** Count ways to color m×n grid with 3 colors so no two adjacent cells have same color.

**Example:**
```
Input:  m=1, n=1
Output: 3
```

---

### 264. Check if There is a Valid Partition For The Array
**Topics:** Arrays, Dynamic Programming

**Problem:** Partition array into groups of 2 equal or 3 equal or 3 consecutive. Check validity.

**Example:**
```
Input:  nums=[4,4,4,5,6]
Output: true
```

---

### 265. Maximize the Profit as the Salesman
**Topics:** Arrays, Dynamic Programming, Binary Search

**Problem:** Select non-overlapping house ranges to maximize gold profit.

**Example:**
```
Input:  n=5, offers=[[0,0,1],[0,2,2],[1,3,2]]
Output: 3
```

---

### 266. Number of Beautiful Partitions
**Topics:** Strings, Dynamic Programming

**Problem:** Count partitions of string into k substrings where each starts with prime digit and ends with non-prime.

**Example:**
```
Input:  s="23542185131", k=3, minLength=2
Output: 3
```

---

### 267. Maximum Tastiness of Candy Basket
**Topics:** Arrays, Binary Search, Greedy

**Problem:** Pick k candies maximizing minimum price difference (tastiness).

**Example:**
```
Input:  price=[13,5,1,8,21,2], k=3
Output: 8
```

---

### 268. Maximum Number of Groups With Increasing Length
**Topics:** Arrays, Greedy, Sorting, Binary Search, Math

**Problem:** Form maximum groups with strictly increasing sizes from element groups.

**Example:**
```
Input:  usageLimits=[1,2,5]
Output: 3
```

---

### 269. Count the Number of Powerful Integers
**Topics:** Strings, Dynamic Programming, Digit DP

**Problem:** Count integers in [start, finish] ending with suffix and having digits <= limit.

**Example:**
```
Input:  start=1, finish=6000, limit=4, suffix="124"
Output: 5
```

---

### 270. Maximum Number of Moves in a Grid
**Topics:** Matrix, Dynamic Programming, BFS

**Problem:** Find maximum moves starting from any cell in column 0, moving right to strictly greater neighbor.

**Example:**
```
Input:  grid=[[2,4,3,5],[5,4,9,3],[3,4,2,11],[10,9,13,15]]
Output: 3
```

---

### 271. Minimum Reverse Operations
**Topics:** Arrays, BFS, Sorted Set, Union-Find

**Problem:** Find minimum reverse operations to move 1 from index 0 to index p, reversing subarrays of length k.

**Example:**
```
Input:  n=4, p=2, banned=[0,1,3], k=4
Output: [-1,-1,0,-1]
```

---

### 272. Find Longest Awesome Substring
**Topics:** Strings, Bit Manipulation, Prefix XOR, Hash Map

**Problem:** Find longest substring that can form a palindrome by rearranging characters.

**Example:**
```
Input:  s="3242415"
Output: 5
```

---

### 273. Minimum Replacements in Array to Make it Sorted
**Topics:** Arrays, Greedy, Math

**Problem:** Replace elements to make array non-decreasing with minimum operations.

**Example:**
```
Input:  nums=[3,9,3]
Output: 2
```

---

### 274. Design Movie Rental System
**Topics:** Design, Sorted Set, Hash Map

**Problem:** Design rental system supporting search, rent, drop, and report operations.

**Example:**
```
Input:  search(5), rent([3,5]), drop([3,5]), report()
Output: [[3,5],[1,5],[2,5]], [], [[3,5]]
```

---

### 275. Minimum Moves to Make Palindrome
**Topics:** Strings, Greedy, BIT, Two Pointers

**Problem:** Find minimum adjacent swaps to make string a palindrome.

**Example:**
```
Input:  s="aabb"
Output: 2
```

---

### 276. Sum of Scores of Built Strings
**Topics:** Strings, Z-Function, String Matching

**Problem:** Sum of Z-function values for all suffixes.

**Example:**
```
Input:  s = "babab"
Output: 9
```

---

### 277. Substring With Largest Variance
**Topics:** Strings, Dynamic Programming, Kadane's Variant

**Problem:** Find substring maximizing variance (max frequency minus min frequency of any two chars).

**Example:**
```
Input:  s = "aababbb"
Output: 3
```

---

### 278. Maximum Number of Robots Within Budget
**Topics:** Arrays, Sliding Window, Deque, Binary Search, Prefix Sum

**Problem:** Find maximum consecutive robots running within budget (max charge + k×sum of running cost).

**Example:**
```
Input:  chargeTimes=[3,6,1,3,4], runningCosts=[2,1,3,4,5], budget=25
Output: 3
```

---

### 279. Total Appeal of A String
**Topics:** Strings, Dynamic Programming, Hash Map, Contribution

**Problem:** Sum appeal (distinct characters) of all substrings of a string.

**Example:**
```
Input:  s = "abbca"
Output: 28
```

---

### 280. Maximum Employees to Be Invited to a Meeting
**Topics:** Graphs, DFS, Topological Sort, Cycles

**Problem:** Find maximum employees invitable to round table where each must sit next to their favorite person.

**Example:**
```
Input:  favorite=[2,2,1,2]
Output: 3
```

---

### 281. Minimum Time to Complete All Tasks
**Topics:** Arrays, Stack, Greedy, Interval Scheduling

**Problem:** Schedule tasks with time intervals; computer runs minimum duration. Find min total run time.

**Example:**
```
Input:  tasks=[[2,3,1],[4,5,1],[1,5,2]]
Output: 2
```

---

### 282. Check if a Parentheses String Can Be Valid
**Topics:** Strings, Greedy, Stack

**Problem:** Check if locked and unlocked parentheses string can form valid sequence.

**Example:**
```
Input:  s="()))", locked="0100"
Output: true
```

---

### 283. Minimum Number of Swaps to Make the String Balanced
**Topics:** Strings, Greedy, Two Pointers

**Problem:** Find minimum swaps to balance a brackets string.

**Example:**
```
Input:  s="][]["
Output: 1
```

---

### 284. Maximum White Tiles Covered by a Carpet
**Topics:** Arrays, Binary Search, Prefix Sum, Greedy

**Problem:** Place carpet of length carpetLen to cover maximum white tiles.

**Example:**
```
Input:  tiles=[[1,5],[10,11],[12,18],[20,25],[30,32]], carpetLen=10
Output: 9
```

---

### 285. Minimum Cost to Make Array Equal
**Topics:** Arrays, Binary Search, Prefix Sum

**Problem:** Make all elements equal to some value minimizing weighted cost.

**Example:**
```
Input:  nums=[1,3,5,2], cost=[2,3,1,14]
Output: 8
```

---

### 286. Kth Smallest Amount With Single Denomination Combination
**Topics:** Math, Binary Search, Inclusion-Exclusion, LCM

**Problem:** Find kth smallest amount payable using given coin denominations.

**Example:**
```
Input:  coins=[3,6,9], k=3
Output: 9
```

---

### 287. Minimum Array Changes to Make Differences Equal
**Topics:** Arrays, Difference Array, Greedy

**Problem:** Change minimum elements to make all adjacent differences equal to k.

**Example:**
```
Input:  nums=[1,0,1,2,4,3,0,2,1,4], k=0
Output: 0
```

---

### 288. Count the Number of Substrings With Dominant Ones
**Topics:** Strings, Sliding Window, Math

**Problem:** Count substrings where number of 1s >= number of 0s squared.

**Example:**
```
Input:  s="00011"
Output: 5
```

---

### 289. Maximum Number of Points From Grid Queries
**Topics:** Matrix, BFS, Union-Find, Offline Processing, Sorting

**Problem:** For each query value, count reachable cells starting from (0,0) with values < query.

**Example:**
```
Input:  grid=[[1,2,3],[2,5,7],[3,5,1]], queries=[5,6,2]
Output: [5,8,1]
```

---

### 290. Minimum Seconds to Equalize a Circular Array
**Topics:** Arrays, Hash Map, Math

**Problem:** Find minimum seconds for all elements to become equal with circular array spreading.

**Example:**
```
Input:  nums=[1,2,1,2]
Output: 1
```

---

### 291. Find the Maximum Sum of Node Values
**Topics:** Trees, Greedy, XOR, Dynamic Programming

**Problem:** Apply XOR operations on tree edges to maximize sum of all node values.

**Example:**
```
Input:  nums=[1,2,1], edges=[[0,1],[0,2]], k=3
Output: 6
```

---

### 292. Minimum Distance to Type a Word Using Two Fingers
**Topics:** Strings, Dynamic Programming, 3D DP

**Problem:** Type word using two fingers on phone keyboard minimizing total movement distance.

**Example:**
```
Input:  word = "CAKE"
Output: 3
```

---

### 293. Number of Ways to Divide a Long Corridor (Hard)
**Topics:** Strings, Dynamic Programming, Math, Modular Arithmetic

**Problem:** Count ways to divide corridor with exactly 2 seats per section.

**Example:**
```
Input:  corridor="SWSSST"
Output: 2
```

---

### 294. Maximum Points in an Archery Competition
**Topics:** Arrays, Bitmask DP, Greedy

**Problem:** Bob scores sections optimally against Alice to maximize total points.

**Example:**
```
Input:  numArrows=9, aliceArrows=[1,1,0,1,0,0,2,1,0,1,2,0]
Output: [0,0,0,0,1,1,0,0,1,2,3,1]
```

---

### 295. Minimum Cost Spanning Tree with Required Edge
**Topics:** Graphs, MST, Union-Find, Kruskal's

**Problem:** Find MST that must include a specific required edge.

**Example:**
```
Input:  n=4, edges=[[0,1,1],[1,2,2],[2,3,3],[0,3,4]], required=[1,2,2]
Output: 6
```

---

### 296. The Number of Weak Characters in the Game (Hard)
**Topics:** Arrays, Greedy, Sorting, Stack

**Problem:** Extended version with multiple attribute comparison dimensions.

**Example:**
```
Input:  properties=[[5,5],[6,3],[3,6]]
Output: 0
```

---

### 297. Number of Unique XOR Triplets I (Hard)
**Topics:** Arrays, Bit Manipulation, Math

**Problem:** Count unique XOR values from triplets (i,j,k) where i < j < k.

**Example:**
```
Input:  nums=[1,2,3,4,5,6,7,8]
Output: 8
```

---

### 298. Sum of Prefix XOR Values
**Topics:** Arrays, XOR, Prefix Sum

**Problem:** Compute prefix XOR array and return sum of all prefix XOR values.

**Example:**
```
Input:  nums=[1,2,3,4]
Output: [1,3,0,4] → sum=8
```

---

### 299. Count the Number of Ideal Arrays
**Topics:** Math, Dynamic Programming, Combinatorics, Number Theory

**Problem:** Count arrays of length n with max value maxValue where each element divides the next.

**Example:**
```
Input:  n=2, maxValue=5
Output: 10
```

---

### 300. Maximum Strictly Increasing Cells in a Matrix
**Topics:** Matrix, Dynamic Programming, Sorting, Binary Search

**Problem:** Find length of longest strictly increasing path where each step goes to a strictly greater cell.

**Example:**
```
Input:  mat=[[3,1],[3,4]]
Output: 2
```

---

### 301. Cut Off Trees for Golf Event
**Topics:** Matrix, BFS, Sorting

**Problem:** Cut trees in ascending order of height. Find minimum steps, return -1 if impossible.

**Example:**
```
Input:  forest=[[1,2,3],[0,0,4],[7,6,5]]
Output: 6
```

---

### 302. Race Car
**Topics:** Dynamic Programming, BFS

**Problem:** Car accelerates or reverses on infinite road. Find minimum instructions to reach target.

**Example:**
```
Input:  target = 6
Output: 5
```

---

### 303. Minimum Number of Increments on Subarrays
**Topics:** Arrays, Greedy, Stack, Monotonic Stack

**Problem:** Find minimum increment operations on subarrays to convert source to target array.

**Example:**
```
Input:  target=[3,1,1,2]
Output: 3
```

---

### 304. Maximum Rectangle Covered by Snow
**Topics:** Matrix, Dynamic Programming, Divide and Conquer

**Problem:** Find largest rectangle of snow in a binary grid using histogram approach.

**Example:**
```
Input:  matrix=[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
```

---

### 305. Minimum Spaceship Fuel
**Topics:** Graphs, Dijkstra, Binary Search, DP

**Problem:** Find minimum fuel to travel graph in constrained time window.

**Example:**
```
Input:  n=4, edges=[[0,1,1],[1,2,2],[0,2,4]], maxFuel=3
Output: 3
```

---

### 306. Painting a Fence With Minimum Colors
**Topics:** Strings, Segment Tree, DP, Range Queries

**Problem:** Paint fence posts with k colors, minimize cost with adjacent same-color constraints.

**Example:**
```
Input:  k=2, posts=3
Output: 6
```

---

### 307. Maximum Sum of an Array After K Negations (Extended)
**Topics:** Arrays, Greedy, Sorting

**Problem:** Negate exactly k elements (can repeat) to maximize array sum.

**Example:**
```
Input:  nums=[3,-1,0,2], k=3
Output: 6
```

---

### 308. Magical String
**Topics:** Strings, Two Pointers, Generation

**Problem:** Count 1s in first n characters of magical self-describing string.

**Example:**
```
Input:  n = 6
Output: 3
```

---

### 309. Optimal Account Balancing
**Topics:** Arrays, Backtracking, Bitmask DP, Graph

**Problem:** Find minimum transactions to settle debts among group.

**Example:**
```
Input:  transactions=[[0,1,10],[2,0,5]]
Output: 2
```

---

### 310. Remove Invalid Parentheses
**Topics:** Strings, BFS, Backtracking, DFS

**Problem:** Remove minimum parentheses to make string valid. Return all unique results.

**Example:**
```
Input:  s = "()())()"
Output: ["()()()", "(())()"]
```

---

### 311. Expression Add Operators
**Topics:** Strings, Backtracking, DFS

**Problem:** Add `+`, `-`, `*` between digits to form expressions equaling target.

**Example:**
```
Input:  num="123", target=6
Output: ["1+2+3","1*2*3"]
```

---

### 312. Concatenated Words
**Topics:** Strings, DFS, Dynamic Programming, Trie

**Problem:** Find all words in array that are concatenations of other words in the array.

**Example:**
```
Input:  words=["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
```

---

### 313. Minimum Unique Word Abbreviation
**Topics:** Strings, Backtracking, Bitmask

**Problem:** Find shortest unique abbreviation of target not matching any word in dictionary.

**Example:**
```
Input:  target="apple", dictionary=["blade"]
Output: "a4"
```

---

### 314. N-Queens
**Topics:** Backtracking, Recursion

**Problem:** Return all distinct solutions to the n-queens puzzle as board configurations.

**Example:**
```
Input:  n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
```

---

### 315. Maximal Square (3D Extension)
**Topics:** Matrix, Dynamic Programming

**Problem:** Find maximum side length of a 3D cube filled with 1s in binary 3D matrix.

**Example:**
```
Input:  matrix=[[[1,1],[1,1]],[[1,1],[1,1]]]
Output: 2
```

---

### 316. Largest Rectangle in Histogram (3D)
**Topics:** Arrays, Stack, Divide and Conquer

**Problem:** Extended to 3D histogram — find largest rectangular area in 3D building silhouette.

**Example:**
```
Input:  heights=[[1,2,3],[4,5,6]]
Output: 12
```

---

### 317. Max Chunks to Make Sorted II
**Topics:** Arrays, Stack, Greedy, Monotonic Stack

**Problem:** Split array into max chunks independently sortable to form fully sorted array (with duplicates).

**Example:**
```
Input:  arr=[5,4,3,2,1]
Output: 1
```

---

### 318. K Empty Slots
**Topics:** Arrays, Sliding Window, Binary Indexed Tree, Ordered Set

**Problem:** Find day when two bloomed flowers have exactly k flowers between them all unbloom.

**Example:**
```
Input:  bulbs=[1,3,2], k=1
Output: 2
```

---

### 319. Minimum Number of Arrows to Burst Balloons (Hard Variant)
**Topics:** Arrays, Greedy, Intervals

**Problem:** Extended variant with vertical arrows and non-overlapping constraint on bursting.

**Example:**
```
Input:  points=[[10,16],[2,8],[1,6],[7,12]]
Output: 2
```

---

### 320. Number of K-Equivalent Permutations
**Topics:** Arrays, Dynamic Programming, Combinatorics, Math

**Problem:** Count permutations of nums reachable from original by swapping exactly k times.

**Example:**
```
Input:  nums=[0,1,2], k=1
Output: 2
```

---

### 321. Stream of Characters
**Topics:** Trie, Streams, Suffix Automaton, Design

**Problem:** Design data structure to query if any word from a list is suffix of characters seen so far.

**Example:**
```
Input:  words=["cd","f","kl"], stream: query('a'),query('c'),query('d')
Output: false, false, true
```

---

### 322. Maximum Number of Non-Overlapping Palindrome Substrings
**Topics:** Strings, Greedy, Dynamic Programming

**Problem:** Find max non-overlapping palindrome substrings each of length >= k.

**Example:**
```
Input:  s="abaccdbbd", k=3
Output: 2
```

---

### 323. Maximum Matrix Sum
**Topics:** Matrix, Greedy, Math

**Problem:** Multiply any adjacent pair by -1 any number of times. Maximize matrix element sum.

**Example:**
```
Input:  matrix=[[1,-1],[-1,1]]
Output: 4
```

---

### 324. Minimum Adjacent Swaps for K Consecutive Ones
**Topics:** Arrays, Prefix Sum, Sliding Window, Greedy, Math

**Problem:** Find minimum swaps to group exactly k ones consecutively.

**Example:**
```
Input:  nums=[1,0,0,1,0,1], k=2
Output: 1
```

---

### 325. Sum of Distances
**Topics:** Arrays, Prefix Sum, Math

**Problem:** For each index, sum of absolute distances to all other indices with same value.

**Example:**
```
Input:  nums=[1,3,1,1,2]
Output: [5,0,3,4,0]
```

---

### 326. Minimum Cost to Reach Destination in Time (Hard)
**Topics:** Graphs, Dynamic Programming, Bellman-Ford

**Problem:** Find minimum-fee path in undirected graph within time limit.

**Example:**
```
Input:  maxTime=30, edges=[[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], fees=[5,1,2,20,20,3]
Output: 11
```

---

### 327. Number of Points in a Unit Circle
**Topics:** Geometry, Math, Brute Force

**Problem:** Given points on a 2D plane, find maximum points within any unit circle.

**Example:**
```
Input:  points=[[1,2],[-1,2],[0,0]]
Output: 2
```

---

### 328. Minimum Cost to Complete Given Tasks (Hard)
**Topics:** Arrays, Greedy, Stack, Counting

**Problem:** Allocate time slots to complete tasks with constraints on consecutive slots.

**Example:**
```
Input:  tasks=[[2,3,1],[4,5,1],[1,5,2]]
Output: 2
```

---

### 329. Maximum Number of Accepted Invitations
**Topics:** Graphs, Bipartite Matching, Hungarian Algorithm

**Problem:** Match boys to girls (each can only invite one opposite-gender friend). Maximize acceptances.

**Example:**
```
Input:  grid=[[1,1,1],[1,0,1],[0,0,1]]
Output: 3
```

---

### 330. Minimum Swaps to Group All 1s Together II
**Topics:** Arrays, Sliding Window

**Problem:** Find minimum swaps to group all 1s in a circular binary array.

**Example:**
```
Input:  nums=[0,1,0,1,1,0,0]
Output: 1
```

---

### 331. Minimum Cost to Make Array Equalindromic (Hard)
**Topics:** Arrays, Math, Binary Search, Palindromes

**Problem:** Find nearest palindrome for each element and equalize to minimize cost.

**Example:**
```
Input:  nums=[1,2,3,4,5]
Output: 6
```

---

### 332. Number of Ways to Form a Target String Given a Dictionary
**Topics:** Strings, Dynamic Programming

**Problem:** Count ways to form target from columns of dictionary words choosing one char per position.

**Example:**
```
Input:  words=["acca","bbbb","caca"], target="aba"
Output: 6
```

---

### 333. Minimum Operations to Make Median of Array Equal to K
**Topics:** Arrays, Greedy, Sorting

**Problem:** Find minimum increment/decrement operations to set median of array to exactly k.

**Example:**
```
Input:  nums=[2,5,6,8,5], k=4
Output: 2
```

---

### 334. Minimum Possible Integer After at Most K Adjacent Swaps On Digits
**Topics:** Strings, BIT, Greedy, Fenwick Tree

**Problem:** Get lexicographically smallest integer string after at most k adjacent swaps.

**Example:**
```
Input:  num="4321", k=4
Output: "1342"
```

---

*Happy Coding! 🚀 Master the patterns, and no problem is too hard.*
