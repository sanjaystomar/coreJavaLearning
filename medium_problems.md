# 🟡 Medium DSA Problems (334–666)

> 333 Medium-level Data Structures & Algorithm problems with descriptions and input/output examples.

---

### 334. Longest Substring Without Repeating Characters
**Topic:** Strings, Sliding Window, Hash Map
**Problem:** Find length of longest substring without repeating characters.
```
Input:  "abcabcbb"
Output: 3
```

---

### 335. Product of Array Except Self
**Topic:** Arrays, Prefix/Suffix Product
**Problem:** Return array where each element is product of all others. No division, O(n).
```
Input:  [1,2,3,4]
Output: [24,12,8,6]
```

---

### 336. Level Order Traversal of Binary Tree
**Topic:** Binary Tree, BFS
**Problem:** Return level-by-level node values.
```
Input:  [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
```

---

### 337. All Permutations
**Topic:** Backtracking, Recursion
**Problem:** Return all permutations of a distinct integer array.
```
Input:  [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

---

### 338. Coin Change
**Topic:** Dynamic Programming
**Problem:** Minimum coins to make amount. Return -1 if not possible.
```
Input:  coins=[1,5,6,9], amount=11
Output: 2
```

---

### 339. Number of Islands
**Topic:** Graphs, BFS/DFS, Matrix
**Problem:** Count connected components of '1's in binary grid.
```
Input:  [["1","1","0"],["1","1","0"],["0","0","1"]]
Output: 2
```

---

### 340. Validate Binary Search Tree
**Topic:** Binary Tree, DFS
**Problem:** Determine if binary tree is a valid BST.
```
Input:  [2,1,3]
Output: true
```

---

### 341. Top K Frequent Elements
**Topic:** Arrays, Hash Map, Heap
**Problem:** Return k most frequent elements.
```
Input:  [1,1,1,2,2,3], k=2
Output: [1,2]
```

---

### 342. Subarray Sum Equals K
**Topic:** Arrays, Prefix Sum, Hash Map
**Problem:** Count subarrays with sum equal to k.
```
Input:  [1,1,1], k=2
Output: 2
```

---

### 343. Course Schedule I
**Topic:** Graphs, Topological Sort, DFS
**Problem:** Can you finish all courses given prerequisites?
```
Input:  numCourses=2, prerequisites=[[1,0]]
Output: true
```

---

### 344. Longest Palindromic Substring
**Topic:** Strings, DP / Expand Around Center
**Problem:** Return the longest palindromic substring.
```
Input:  "babad"
Output: "bab"
```

---

### 345. 3Sum
**Topic:** Arrays, Two Pointers, Sorting
**Problem:** Find all unique triplets summing to zero.
```
Input:  [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

---

### 346. Binary Tree Right Side View
**Topic:** Binary Tree, BFS
**Problem:** Return values visible from right side.
```
Input:  [1,2,3,null,5,null,4]
Output: [1,3,4]
```

---

### 347. Search in Rotated Sorted Array
**Topic:** Arrays, Binary Search
**Problem:** Search in rotated sorted array without duplicates.
```
Input:  nums=[4,5,6,7,0,1,2], target=0
Output: 4
```

---

### 348. Container With Most Water
**Topic:** Arrays, Two Pointers
**Problem:** Find two lines that together with x-axis forms a container holding most water.
```
Input:  [1,8,6,2,5,4,8,3,7]
Output: 49
```

---

### 349. Jump Game
**Topic:** Arrays, Greedy
**Problem:** Can you reach the last index given max jump lengths?
```
Input:  [2,3,1,1,4]
Output: true
Input:  [3,2,1,0,4]
Output: false
```

---

### 350. Spiral Matrix
**Topic:** Arrays, Matrix, Simulation
**Problem:** Return all elements of matrix in spiral order.
```
Input:  [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
```

---

### 351. Rotate Image
**Topic:** Arrays, Matrix, Math
**Problem:** Rotate an n×n matrix 90 degrees in-place.
```
Input:  [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
```

---

### 352. Word Search
**Topic:** Graphs, Backtracking, DFS
**Problem:** Find if word exists in grid by adjacent cells.
```
Input:  board=[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word="ABCCED"
Output: true
```

---

### 353. Group Anagrams
**Topic:** Strings, Hash Map, Sorting
**Problem:** Group strings that are anagrams of each other.
```
Input:  ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

---

### 354. Find Duplicate Number
**Topic:** Arrays, Floyd's Cycle Detection
**Problem:** Find the duplicate in n+1 integers (values 1..n).
```
Input:  [1,3,4,2,2]
Output: 2
```

---

### 355. Kth Largest Element
**Topic:** Arrays, Heap, QuickSelect
**Problem:** Find kth largest element in unsorted array.
```
Input:  [3,2,1,5,6,4], k=2
Output: 5
```

---

### 356. Unique Paths
**Topic:** DP, Math
**Problem:** Count paths from top-left to bottom-right in m×n grid, moving only right/down.
```
Input:  m=3, n=7
Output: 28
```

---

### 357. Minimum Path Sum
**Topic:** DP, Matrix
**Problem:** Find minimum sum path from top-left to bottom-right.
```
Input:  [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
```

---

### 358. Letter Combinations of a Phone Number
**Topic:** Backtracking, Strings
**Problem:** Return all possible letter combinations from digit string.
```
Input:  "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

---

### 359. Generate Parentheses
**Topic:** Backtracking, Strings
**Problem:** Generate all valid combinations of n pairs of parentheses.
```
Input:  n=3
Output: ["((()))","(()())","(())()","()(())","()()()"]
```

---

### 360. Number of Subsets with Sum K
**Topic:** DP, Arrays
**Problem:** Count subsets summing to k.
```
Input:  nums=[1,1,1,1,1], k=3
Output: 10
```

---

### 361. House Robber
**Topic:** DP
**Problem:** Rob houses in a row; can't rob adjacent houses. Maximize money.
```
Input:  [1,2,3,1]
Output: 4
```

---

### 362. House Robber II
**Topic:** DP
**Problem:** Houses in a circle. Can't rob adjacent. Maximize money.
```
Input:  [2,3,2]
Output: 3
```

---

### 363. Decode Ways
**Topic:** DP, Strings
**Problem:** Count ways to decode digit string to letters (A=1, B=2, ..., Z=26).
```
Input:  "226"
Output: 3
```

---

### 364. Longest Increasing Subsequence
**Topic:** DP, Binary Search
**Problem:** Find length of longest strictly increasing subsequence.
```
Input:  [10,9,2,5,3,7,101,18]
Output: 4
```

---

### 365. Clone Graph
**Topic:** Graphs, DFS/BFS, Hash Map
**Problem:** Deep copy an undirected graph.
```
Input:  node with val=1, neighbors=[[2,4],[1,3],[2,4],[1,3]]
Output: deep copy
```

---

### 366. Course Schedule II
**Topic:** Graphs, Topological Sort
**Problem:** Return valid order to take all courses, or [] if impossible.
```
Input:  numCourses=4, prerequisites=[[1,0],[2,0],[3,1],[3,2]]
Output: [0,2,1,3]
```

---

### 367. Pacific Atlantic Water Flow
**Topic:** Graphs, BFS/DFS, Matrix
**Problem:** Find cells that can flow to both Pacific and Atlantic oceans.
```
Input:  [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
```

---

### 368. Rotting Oranges
**Topic:** Graphs, BFS, Matrix
**Problem:** Minutes until all fresh oranges rot (rotten spreads to adjacent each minute). Return -1 if impossible.
```
Input:  [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
```

---

### 369. Daily Temperatures
**Topic:** Arrays, Monotonic Stack
**Problem:** For each day, find how many days until a warmer temperature.
```
Input:  [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
```

---

### 370. Evaluate Reverse Polish Notation
**Topic:** Stack
**Problem:** Evaluate arithmetic expression in RPN.
```
Input:  ["2","1","+","3","*"]
Output: 9
```

---

### 371. Min Stack
**Topic:** Stack Design
**Problem:** Stack with O(1) push, pop, top, and getMin.
```
Input:  push(-2), push(0), push(-3), getMin()→-3, pop(), top()→0, getMin()→-2
Output: as described
```

---

### 372. LRU Cache
**Topic:** Design, Hash Map, Doubly Linked List
**Problem:** Implement LRU cache with O(1) get and put.
```
Input:  capacity=2, put(1,1), put(2,2), get(1)→1, put(3,3) (evicts 2), get(2)→-1
Output: as described
```

---

### 373. Implement Trie
**Topic:** Trie, Design
**Problem:** Implement insert, search, and startsWith.
```
Input:  insert("apple"), search("apple")→true, search("app")→false, startsWith("app")→true
Output: as described
```

---

### 374. Add Two Numbers (Linked List)
**Topic:** Linked List, Math
**Problem:** Add two numbers stored in reverse in linked lists.
```
Input:  [2,4,3] + [5,6,4]
Output: [7,0,8]  (342+465=807)
```

---

### 375. Reorder List
**Topic:** Linked List, Two Pointers
**Problem:** Reorder L0→Ln→L1→Ln-1→...
```
Input:  [1,2,3,4,5]
Output: [1,5,2,4,3]
```

---

### 376. Remove Nth Node From End
**Topic:** Linked List, Two Pointers
**Problem:** Remove the nth node from the end of the list.
```
Input:  [1,2,3,4,5], n=2
Output: [1,2,3,5]
```

---

### 377. Construct Binary Tree from Preorder and Inorder
**Topic:** Binary Tree, Recursion, Hash Map
**Problem:** Build binary tree from preorder and inorder traversals.
```
Input:  preorder=[3,9,20,15,7], inorder=[9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

---

### 378. Binary Tree Zigzag Level Order Traversal
**Topic:** Binary Tree, BFS, Deque
**Problem:** Level order but alternate left-right and right-left.
```
Input:  [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
```

---

### 379. Binary Tree Maximum Path Sum
**Topic:** Binary Tree, DFS
**Problem:** Find maximum path sum in binary tree (path can start/end anywhere).
```
Input:  [-10,9,20,null,null,15,7]
Output: 42
```

---

### 380. Kth Smallest in BST
**Topic:** BST, DFS, Inorder
**Problem:** Find kth smallest element in BST.
```
Input:  [3,1,4,null,2], k=1
Output: 1
```

---

### 381. Lowest Common Ancestor of BST
**Topic:** BST, DFS
**Problem:** Find LCA of two nodes in a BST.
```
Input:  root=[6,2,8,0,4,7,9], p=2, q=8
Output: 6
```

---

### 382. Implement Queue Using Two Stacks
**Topic:** Stack, Queue Design
**Problem:** O(1) amortized FIFO queue using two stacks.
```
Input:  push(1),push(2),peek()→1,pop()→1
Output: as described
```

---

### 383. Find Median from Data Stream
**Topic:** Design, Heap
**Problem:** Median from running stream of numbers using two heaps.
```
Input:  addNum(1), addNum(2), findMedian()→1.5, addNum(3), findMedian()→2.0
Output: as described
```

---

### 384. Word Break
**Topic:** DP, Hash Set
**Problem:** Can the string be segmented into dictionary words?
```
Input:  s="leetcode", wordDict=["leet","code"]
Output: true
```

---

### 385. Combination Sum
**Topic:** Backtracking
**Problem:** Find all unique combinations summing to target (reuse allowed).
```
Input:  candidates=[2,3,6,7], target=7
Output: [[2,2,3],[7]]
```

---

### 386. Combination Sum II
**Topic:** Backtracking
**Problem:** Find unique combinations (no reuse), candidates may have duplicates.
```
Input:  candidates=[10,1,2,7,6,1,5], target=8
Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
```

---

### 387. Subsets
**Topic:** Backtracking, Bit Manipulation
**Problem:** Return all subsets of a set of distinct integers.
```
Input:  [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
```

---

### 388. Subsets II
**Topic:** Backtracking, Sorting
**Problem:** Return all unique subsets (input may contain duplicates).
```
Input:  [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
```

---

### 389. Permutations II
**Topic:** Backtracking, Sorting
**Problem:** Return all unique permutations (input may contain duplicates).
```
Input:  [1,1,2]
Output: [[1,1,2],[1,2,1],[2,1,1]]
```

---

### 390. Find All Anagrams in a String
**Topic:** Strings, Sliding Window, Hash Map
**Problem:** Return start indices of anagrams of p in s.
```
Input:  s="cbaebabacd", p="abc"
Output: [0,6]
```

---

### 391. Minimum Window Substring
**Topic:** Strings, Sliding Window, Hash Map
**Problem:** Find minimum window in s containing all chars of t.
```
Input:  s="ADOBECODEBANC", t="ABC"
Output: "BANC"
```

---

### 392. Longest Repeating Character Replacement
**Topic:** Strings, Sliding Window
**Problem:** Replace at most k chars; find longest substring with one repeated char.
```
Input:  s="AABABBA", k=1
Output: 4
```

---

### 393. Permutation in String
**Topic:** Strings, Sliding Window
**Problem:** Check if s2 contains a permutation of s1.
```
Input:  s1="ab", s2="eidbaooo"
Output: true
```

---

### 394. Minimum Number of Arrows to Burst Balloons
**Topic:** Arrays, Greedy, Intervals
**Problem:** Minimum arrows to burst all balloons (intervals).
```
Input:  [[10,16],[2,8],[1,6],[7,12]]
Output: 2
```

---

### 395. Non-overlapping Intervals
**Topic:** Arrays, Greedy, Intervals
**Problem:** Minimum removals to make intervals non-overlapping.
```
Input:  [[1,2],[2,3],[3,4],[1,3]]
Output: 1
```

---

### 396. Meeting Rooms II
**Topic:** Arrays, Heap, Sorting, Intervals
**Problem:** Minimum conference rooms required for all meetings.
```
Input:  [[0,30],[5,10],[15,20]]
Output: 2
```

---

### 397. Insert Interval
**Topic:** Arrays, Intervals
**Problem:** Insert new interval into sorted non-overlapping list, merge if needed.
```
Input:  intervals=[[1,3],[6,9]], newInterval=[2,5]
Output: [[1,5],[6,9]]
```

---

### 398. Merge Intervals
**Topic:** Arrays, Sorting, Intervals
**Problem:** Merge all overlapping intervals.
```
Input:  [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
```

---

### 399. Jump Game II
**Topic:** Arrays, Greedy
**Problem:** Minimum jumps to reach last index.
```
Input:  [2,3,1,1,4]
Output: 2
```

---

### 400. Gas Station
**Topic:** Arrays, Greedy
**Problem:** Find starting gas station to complete circuit, or -1.
```
Input:  gas=[1,2,3,4,5], cost=[3,4,5,1,2]
Output: 3
```

---

### 401. Hand of Straights
**Topic:** Arrays, Greedy, Hash Map
**Problem:** Can cards be arranged into groups of groupSize consecutive cards?
```
Input:  hand=[1,2,3,6,2,3,4,7,8], groupSize=3
Output: true
```

---

### 402. Task Scheduler
**Topic:** Arrays, Greedy, Heap
**Problem:** Schedule tasks with cooldown n between same tasks. Minimum intervals.
```
Input:  tasks=["A","A","A","B","B","B"], n=2
Output: 8
```

---

### 403. Design Twitter
**Topic:** Design, Hash Map, Heap
**Problem:** Design Twitter with postTweet, getNewsFeed, follow, unfollow.
```
Input:  postTweet(1,5), getNewsFeed(1)→[5], follow(1,2), postTweet(2,6), getNewsFeed(1)→[6,5]
Output: as described
```

---

### 404. Kth Largest Element in Stream
**Topic:** Design, Heap
**Problem:** Design class that finds kth largest element in stream.
```
Input:  k=3, nums=[4,5,8,2], add(3)→4, add(5)→5, add(10)→5, add(9)→8, add(4)→8
Output: as described
```

---

### 405. Time Based Key-Value Store
**Topic:** Design, Binary Search, Hash Map
**Problem:** Store key-value at timestamp, retrieve closest past value.
```
Input:  set("foo","bar",1), get("foo",1)→"bar", get("foo",3)→"bar"
Output: as described
```

---

### 406. Number of Connected Components in Undirected Graph
**Topic:** Graphs, Union Find, DFS
**Problem:** Count connected components.
```
Input:  n=5, edges=[[0,1],[1,2],[3,4]]
Output: 2
```

---

### 407. Graph Valid Tree
**Topic:** Graphs, Union Find, DFS
**Problem:** Return true if edges form a valid tree (connected, no cycle).
```
Input:  n=5, edges=[[0,1],[0,2],[0,3],[1,4]]
Output: true
```

---

### 408. Walls and Gates
**Topic:** Graphs, BFS, Matrix
**Problem:** Fill -1 empty rooms with distance to nearest gate (0). Walls are INT_MAX-wait, walls = -1 here: use BFS from gates.
```
Input:  [[-1,-1,-1],[-1,0,-1],[-1,-1,-1]]
Output: [[-1,1,-1],[1,0,1],[-1,1,-1]]
```

---

### 409. Surrounded Regions
**Topic:** Graphs, BFS/DFS, Matrix
**Problem:** Capture all 'O' regions not connected to boundary.
```
Input:  [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
```

---

### 410. Redundant Connection
**Topic:** Graphs, Union Find
**Problem:** Find the edge that creates a cycle in an undirected graph.
```
Input:  [[1,2],[1,3],[2,3]]
Output: [2,3]
```

---

### 411. Network Delay Time
**Topic:** Graphs, Dijkstra, BFS
**Problem:** Min time for signal to reach all nodes from node k.
```
Input:  times=[[2,1,1],[2,3,1],[3,4,1]], n=4, k=2
Output: 2
```

---

### 412. Cheapest Flights Within K Stops
**Topic:** Graphs, DP, Bellman-Ford
**Problem:** Cheapest price from src to dst with at most k stops.
```
Input:  n=4, flights=[[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src=0, dst=3, k=1
Output: 700
```

---

### 413. Longest Consecutive Sequence
**Topic:** Arrays, Hash Set
**Problem:** Find length of longest consecutive integer sequence.
```
Input:  [100,4,200,1,3,2]
Output: 4 (1,2,3,4)
```

---

### 414. 4Sum
**Topic:** Arrays, Two Pointers, Sorting
**Problem:** Find all unique quadruplets summing to target.
```
Input:  nums=[1,0,-1,0,-2,2], target=0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

---

### 415. Next Permutation
**Topic:** Arrays, Two Pointers
**Problem:** Rearrange numbers into lexicographically next greater permutation.
```
Input:  [1,2,3]
Output: [1,3,2]
Input:  [3,2,1]
Output: [1,2,3]
```

---

### 416. Find Peak Element
**Topic:** Arrays, Binary Search
**Problem:** Find any peak element (neighbors are smaller).
```
Input:  [1,2,3,1]
Output: 2
```

---

### 417. Search a 2D Matrix
**Topic:** Arrays, Binary Search, Matrix
**Problem:** Search in matrix where each row is sorted and first element of row > last of previous.
```
Input:  matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]], target=3
Output: true
```

---

### 418. Set Matrix Zeros
**Topic:** Arrays, Matrix
**Problem:** If element is 0, set its entire row and column to 0 (in-place).
```
Input:  [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
```

---

### 419. Partition Equal Subset Sum
**Topic:** DP, Arrays
**Problem:** Can the array be partitioned into two equal-sum subsets?
```
Input:  [1,5,11,5]
Output: true
```

---

### 420. Target Sum
**Topic:** DP, Backtracking
**Problem:** Assign + or - to each number to reach target. Count ways.
```
Input:  nums=[1,1,1,1,1], target=3
Output: 5
```

---

### 421. Coin Change II
**Topic:** DP
**Problem:** Count number of combinations to make amount.
```
Input:  amount=5, coins=[1,2,5]
Output: 4
```

---

### 422. Longest Common Subsequence
**Topic:** DP, Strings
**Problem:** Length of longest subsequence common to both strings.
```
Input:  text1="abcde", text2="ace"
Output: 3
```

---

### 423. Edit Distance
**Topic:** DP, Strings
**Problem:** Minimum operations (insert/delete/replace) to convert word1 to word2.
```
Input:  word1="horse", word2="ros"
Output: 3
```

---

### 424. Distinct Subsequences
**Topic:** DP, Strings
**Problem:** Count distinct subsequences of t in s.
```
Input:  s="rabbbit", t="rabbit"
Output: 3
```

---

### 425. Interleaving String
**Topic:** DP, Strings
**Problem:** Check if s3 is formed by interleaving s1 and s2.
```
Input:  s1="aabcc", s2="dbbca", s3="aadbbcbcac"
Output: true
```

---

### 426. Maximum Product Subarray
**Topic:** DP, Arrays
**Problem:** Find contiguous subarray with largest product.
```
Input:  [2,3,-2,4]
Output: 6
```

---

### 427. Word Search II
**Topic:** Trie, Backtracking, DFS
**Problem:** Find all words from dictionary in board.
```
Input:  board=[["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words=["oath","pea","eat","rain"]
Output: ["eat","oath"]
```

---

### 428. Design Add and Search Words Data Structure
**Topic:** Trie, Backtracking
**Problem:** Trie supporting '.' wildcard in search.
```
Input:  addWord("bad"), addWord("dad"), search(".ad")→true
Output: as described
```

---

### 429. Maximum Width of Binary Tree
**Topic:** Binary Tree, BFS
**Problem:** Find maximum width at any level of binary tree.
```
Input:  [1,3,2,5,3,null,9]
Output: 4
```

---

### 430. Path Sum II
**Topic:** Binary Tree, Backtracking, DFS
**Problem:** Find all root-to-leaf paths summing to target.
```
Input:  tree=[5,4,8,11,null,13,4,7,2,null,null,5,1], target=22
Output: [[5,4,11,2],[5,8,4,5]]
```

---

### 431. Count Good Nodes in Binary Tree
**Topic:** Binary Tree, DFS
**Problem:** Count nodes where no node on path from root is greater than current node.
```
Input:  [3,1,4,3,null,1,5]
Output: 4
```

---

### 432. Diameter of Binary Tree
**Topic:** Binary Tree, DFS
**Problem:** Longest path between any two nodes (doesn't need to pass through root).
```
Input:  [1,2,3,4,5]
Output: 3
```

---

### 433. Lowest Common Ancestor of Binary Tree
**Topic:** Binary Tree, DFS
**Problem:** LCA in any binary tree (not just BST).
```
Input:  root=[3,5,1,6,2,0,8,null,null,7,4], p=5, q=1
Output: 3
```

---

### 434. Flatten Binary Tree to Linked List
**Topic:** Binary Tree, DFS
**Problem:** Flatten to linked list in-place using preorder traversal.
```
Input:  [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
```

---

### 435. Delete Node in BST
**Topic:** BST, Recursion
**Problem:** Delete a node from BST and return the root.
```
Input:  root=[5,3,6,2,4,null,7], key=3
Output: [5,4,6,2,null,null,7]
```

---

### 436. Inorder Successor in BST
**Topic:** BST, DFS
**Problem:** Find the inorder successor of a given node.
```
Input:  root=[2,1,3], p with val=1
Output: node with val=2
```

---

### 437. Recover Binary Search Tree
**Topic:** BST, DFS
**Problem:** Two nodes are swapped. Recover the BST without changing structure.
```
Input:  [1,3,null,null,2]
Output: [3,1,null,null,2]
```

---

### 438. Vertical Order Traversal
**Topic:** Binary Tree, BFS, Sorting
**Problem:** Return node values grouped by vertical column.
```
Input:  [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
```

---

### 439. Serialize and Deserialize BST
**Topic:** BST, Strings, DFS
**Problem:** Encode BST to string and decode back.
```
Input:  [2,1,3]
Output: "2,1,3" (or any valid encoding)
```

---

### 440. Binary Tree Cameras
**Topic:** Binary Tree, Greedy, DFS
**Problem:** Minimum cameras to monitor all nodes.
```
Input:  [0,0,null,0,0]
Output: 1
```

---

### 441. All Nodes Distance K in Binary Tree
**Topic:** Binary Tree, BFS, Graph
**Problem:** Find all nodes at distance k from target node.
```
Input:  root=[3,5,1,6,2,0,8,null,null,7,4], target=5, k=2
Output: [7,4,1]
```

---

### 442. Count Good Pairs
**Topic:** Arrays, Hash Map
**Problem:** Count pairs where swapping elements of pair makes both arrays equal.
```
Input:  nums1=[1,2,4,4,7], nums2=[1,2,4]
Output: false
```

---

### 443. Maximum Sum of Distinct Subarrays With Length K
**Topic:** Arrays, Sliding Window, Hash Map
**Problem:** Max sum of length-k subarray with all distinct elements.
```
Input:  nums=[1,5,4,2,9,9,9], k=3
Output: 15
```

---

### 444. Longest Subarray of 1s After Deleting One Element
**Topic:** Arrays, Sliding Window
**Problem:** Delete exactly one element; find longest subarray of 1s.
```
Input:  [1,1,0,1]
Output: 3
```

---

### 445. Maximum Average Subarray II
**Topic:** Arrays, Binary Search, Sliding Window
**Problem:** Find max average of subarray with length ≥ k.
```
Input:  nums=[1,12,-5,-6,50,3], k=4
Output: 12.75
```

---

### 446. Minimum Size Subarray Sum
**Topic:** Arrays, Sliding Window, Two Pointers
**Problem:** Find minimum length subarray with sum ≥ target.
```
Input:  target=7, nums=[2,3,1,2,4,3]
Output: 2
```

---

### 447. Longest Mountain in Array
**Topic:** Arrays, Two Pointers
**Problem:** Find longest mountain subarray (ascending then descending).
```
Input:  [2,1,4,7,3,2,5]
Output: 5 ([1,4,7,3,2])
```

---

### 448. Subarrays with K Different Integers
**Topic:** Arrays, Sliding Window, Hash Map
**Problem:** Count subarrays with exactly k distinct integers.
```
Input:  nums=[1,2,1,2,3], k=2
Output: 7
```

---

### 449. Minimum Operations to Reduce Array to Zero
**Topic:** Arrays, Hash Map, Prefix Sum
**Problem:** Min ops removing from left/right to make sum = target.
```
Input:  nums=[3,2,20,1,1,3], x=10
Output: 5
```

---

### 450. K Closest Points to Origin
**Topic:** Arrays, Heap, QuickSelect
**Problem:** Find k closest points to origin.
```
Input:  points=[[1,3],[-2,2]], k=1
Output: [[-2,2]]
```

---

### 451. Reorganize String
**Topic:** Strings, Greedy, Heap
**Problem:** Rearrange string so no two adjacent chars are the same. Return "" if impossible.
```
Input:  "aab"
Output: "aba"
```

---

### 452. Last Stone Weight II
**Topic:** DP, Arrays
**Problem:** Smash stones; minimize remaining weight. Like partition equal subset.
```
Input:  [2,7,4,1,8,1]
Output: 1
```

---

### 453. Maximize Happiness of Selected Children
**Topic:** Arrays, Greedy, Sorting
**Problem:** Select k children; happiness decreases by 1 per prior selection. Maximize sum.
```
Input:  happiness=[1,2,3], k=2
Output: 4
```

---

### 454. Partition Labels
**Topic:** Strings, Greedy
**Problem:** Partition string so each letter appears in at most one part. Maximize parts.
```
Input:  "ababcbacadefegdehijhklij"
Output: [9,7,8]
```

---

### 455. Valid Sudoku
**Topic:** Arrays, Hash Set, Matrix
**Problem:** Determine if 9x9 Sudoku board is valid.
```
Input:  board = (standard valid partial sudoku)
Output: true
```

---

### 456. Candy
**Topic:** Arrays, Greedy
**Problem:** Distribute minimum candies: each child gets at least 1, higher rating gets more than neighbors.
```
Input:  [1,0,2]
Output: 5
```

---

### 457. Trapping Rain Water
**Topic:** Arrays, Two Pointers, Stack
**Problem:** Compute trapped rainwater from elevation map.
```
Input:  [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```

---

### 458. Largest Rectangle in Histogram
**Topic:** Stack, Monotonic Stack
**Problem:** Find largest rectangle in histogram.
```
Input:  [2,1,5,6,2,3]
Output: 10
```

---

### 459. Maximal Square
**Topic:** DP, Matrix
**Problem:** Find area of largest square containing only 1s.
```
Input:  [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 4
```

---

### 460. Range Sum Query 2D - Immutable
**Topic:** DP, Prefix Sum, Matrix
**Problem:** Precompute 2D prefix sums for range queries.
```
Input:  matrix=[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]], sumRegion(2,1,4,3)
Output: 8
```

---

### 461. Count Inversions
**Topic:** Arrays, Merge Sort
**Problem:** Count pairs (i,j) where i < j and arr[i] > arr[j].
```
Input:  [2,4,1,3,5]
Output: 3
```

---

### 462. Rotate Array
**Topic:** Arrays, Two Pointers
**Problem:** Rotate array right by k steps.
```
Input:  [1,2,3,4,5,6,7], k=3
Output: [5,6,7,1,2,3,4]
```

---

### 463. Find Minimum in Rotated Sorted Array
**Topic:** Arrays, Binary Search
**Problem:** Find minimum element in rotated sorted array.
```
Input:  [3,4,5,1,2]
Output: 1
```

---

### 464. Sort Colors
**Topic:** Arrays, Two Pointers (Dutch National Flag)
**Problem:** Sort array of 0s, 1s, 2s in-place.
```
Input:  [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

---

### 465. Increasing Triplet Subsequence
**Topic:** Arrays, Greedy
**Problem:** Return true if exists i<j<k with nums[i]<nums[j]<nums[k].
```
Input:  [1,2,3,4,5]
Output: true
Input:  [5,4,3,2,1]
Output: false
```

---

### 466. Flatten Nested List Iterator
**Topic:** Design, Stack, Recursion
**Problem:** Implement iterator for nested list that flattens it.
```
Input:  [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
```

---

### 467. Decode String
**Topic:** Strings, Stack, Recursion
**Problem:** Decode encoded string k[encoded_string].
```
Input:  "3[a]2[bc]"
Output: "aaabcbc"
```

---

### 468. Accounts Merge
**Topic:** Graphs, Union Find
**Problem:** Merge email accounts belonging to same person.
```
Input:  [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"]]
Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"]]
```

---

### 469. Largest Component Size by Common Factor
**Topic:** Graphs, Union Find, Math
**Problem:** Find size of largest connected component where edges link numbers sharing a factor.
```
Input:  [4,6,15,35]
Output: 4
```

---

### 470. Minimum Height Trees
**Topic:** Graphs, Topological Sort, BFS
**Problem:** Find roots that minimize tree height.
```
Input:  n=4, edges=[[1,0],[1,2],[1,3]]
Output: [1]
```

---

### 471. Count Sub Islands
**Topic:** Graphs, DFS, Matrix
**Problem:** Count islands in grid2 where every cell is also land in grid1.
```
Input:  grid1=[[1,1,1],[0,1,0],[0,1,0]], grid2=[[1,1,1],[0,0,0],[0,1,0]]
Output: 1
```

---

### 472. Path With Maximum Probability
**Topic:** Graphs, Dijkstra, BFS
**Problem:** Find path from start to end maximizing product of edge probabilities.
```
Input:  n=3, edges=[[0,1],[1,2],[0,2]], succProb=[0.5,0.5,0.2], start=0, end=2
Output: 0.25
```

---

### 473. Swim in Rising Water
**Topic:** Graphs, Binary Search, Dijkstra, Union Find
**Problem:** Find minimum time to swim from (0,0) to (n-1,n-1).
```
Input:  [[0,2],[1,3]]
Output: 3
```

---

### 474. Keys and Rooms
**Topic:** Graphs, DFS/BFS
**Problem:** Can you visit all rooms? Each room has keys to other rooms.
```
Input:  [[1],[2],[3],[]]
Output: true
```

---

### 475. Number of Provinces
**Topic:** Graphs, Union Find, DFS
**Problem:** Count number of provinces (groups of directly/indirectly connected cities).
```
Input:  [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
```

---

### 476. Max Area of Island
**Topic:** Graphs, DFS, Matrix
**Problem:** Find the maximum area island in binary matrix.
```
Input:  [[0,0,1,0,0],[0,1,1,0,0],[0,1,0,0,1],[0,0,0,1,1]]
Output: 4
```

---

### 477. Reachable Nodes In Subdivided Graph
**Topic:** Graphs, Dijkstra
**Problem:** Count reachable nodes after subdividing edges.
```
Input:  edges=[[0,1,10],[0,2,1],[1,2,2]], maxMoves=6, n=3
Output: 13
```

---

### 478. Find the Town Judge
**Topic:** Graphs, Arrays
**Problem:** Find person trusted by everyone but trusting no one.
```
Input:  n=3, trust=[[1,3],[2,3]]
Output: 3
```

---

### 479. Minimum Genetic Mutation
**Topic:** Graphs, BFS
**Problem:** Minimum mutations to reach end gene string (each mutation one char, must be in bank).
```
Input:  startGene="AACCGGTT", endGene="AACCGGTA", bank=["AACCGGTA"]
Output: 1
```

---

### 480. Satisfiability of Equality Equations
**Topic:** Graphs, Union Find
**Problem:** Given "==" and "!=" equations, return true if satisfiable.
```
Input:  ["a==b","b!=c","c==a"]
Output: false
```

---

### 481. Find Eventual Safe States
**Topic:** Graphs, DFS, Cycle Detection
**Problem:** Return all safe nodes (won't get stuck in a cycle).
```
Input:  [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
```

---

### 482. Is Graph Bipartite
**Topic:** Graphs, BFS/DFS
**Problem:** Return true if graph can be 2-colored (bipartite).
```
Input:  [[1,3],[0,2],[1,3],[0,2]]
Output: true
```

---

### 483. Partition to K Equal Sum Subsets
**Topic:** DP, Backtracking, Bit Masking
**Problem:** Can array be partitioned into k equal-sum subsets?
```
Input:  nums=[4,3,2,3,5,2,1], k=4
Output: true
```

---

### 484. Maximum Points on a Line
**Topic:** Geometry, Hash Map, Math
**Problem:** Find max number of points on a single line.
```
Input:  [[1,1],[2,2],[3,3]]
Output: 3
```

---

### 485. Pow(x, n)
**Topic:** Math, Recursion, Binary Exponentiation
**Problem:** Implement pow(x, n).
```
Input:  x=2.0, n=10
Output: 1024.0
Input:  x=2.0, n=-2
Output: 0.25
```

---

### 486. Excel Sheet Column to Number and Back
**Topic:** Strings, Math
**Problem:** Convert between Excel column letters and column number.
```
Input:  "ZY"
Output: 701
```

---

### 487. Find K Pairs with Smallest Sums
**Topic:** Arrays, Heap
**Problem:** Find k pairs (u,v) with smallest sum from two sorted arrays.
```
Input:  nums1=[1,7,11], nums2=[2,4,6], k=3
Output: [[1,2],[1,4],[1,6]]
```

---

### 488. Kth Smallest Element in Sorted Matrix
**Topic:** Arrays, Heap, Binary Search
**Problem:** Find kth smallest in n×n sorted matrix.
```
Input:  matrix=[[1,5,9],[10,11,13],[12,13,15]], k=8
Output: 13
```

---

### 489. Kth Smallest Number in Multiplication Table
**Topic:** Binary Search, Math
**Problem:** Find kth smallest in m×n multiplication table.
```
Input:  m=3, n=3, k=5
Output: 3
```

---

### 490. Find K Closest Elements
**Topic:** Arrays, Binary Search, Two Pointers
**Problem:** Find k closest elements to x in sorted array.
```
Input:  arr=[1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
```

---

### 491. Top K Frequent Words
**Topic:** Strings, Heap, Hash Map
**Problem:** Return k most frequent words, sorted by frequency then lexicographically.
```
Input:  words=["i","love","leetcode","i","love","coding"], k=2
Output: ["i","love"]
```

---

### 492. Sort Characters By Frequency
**Topic:** Strings, Heap, Hash Map
**Problem:** Sort string by character frequency (descending).
```
Input:  "tree"
Output: "eert"
```

---

### 493. Integer to Roman
**Topic:** Strings, Math
**Problem:** Convert integer to Roman numeral.
```
Input:  1994
Output: "MCMXCIV"
```

---

### 494. Zigzag Conversion
**Topic:** Strings, Simulation
**Problem:** Write string in zigzag pattern on numRows rows, read line by line.
```
Input:  s="PAYPALISHIRING", numRows=3
Output: "PAHNAPLSIIGYIR"
```

---

### 495. String Compression
**Topic:** Strings, Two Pointers
**Problem:** Compress string in-place, e.g. "aabccc" → "a2bc3".
```
Input:  ['a','a','b','b','c','c','c']
Output: 6, array becomes ['a','2','b','2','c','3']
```

---

### 496. Count and Say
**Topic:** Strings, Simulation
**Problem:** Generate nth term of count-and-say sequence.
```
Input:  n=4
Output: "1211"
```

---

### 497. Multiply Strings
**Topic:** Strings, Math
**Problem:** Multiply two non-negative integers as strings.
```
Input:  num1="123", num2="456"
Output: "56088"
```

---

### 498. Add Strings
**Topic:** Strings, Math
**Problem:** Add two non-negative integers as strings.
```
Input:  "11", "123"
Output: "134"
```

---

### 499. Reverse Words in a String
**Topic:** Strings
**Problem:** Reverse word order in a string (clean up extra spaces).
```
Input:  "  the sky is blue  "
Output: "blue is sky the"
```

---

### 500. Compare Version Numbers
**Topic:** Strings, Two Pointers
**Problem:** Compare two version strings "1.01" and "1.001".
```
Input:  version1="1.01", version2="1.001"
Output: 0
```

---

### 501. Integer Break
**Topic:** DP, Math
**Problem:** Break integer n into at least 2 positive parts; maximize product.
```
Input:  n=10
Output: 36
```

---

### 502. Perfect Squares
**Topic:** DP, BFS, Math
**Problem:** Least number of perfect squares summing to n.
```
Input:  12
Output: 3 (4+4+4)
```

---

### 503. Largest Divisible Subset
**Topic:** DP, Sorting
**Problem:** Find largest subset where every pair satisfies divisibility.
```
Input:  [1,2,3]
Output: [1,2] or [1,3]
```

---

### 504. Triangle
**Topic:** DP
**Problem:** Find minimum path sum from top to bottom of triangle.
```
Input:  [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
```

---

### 505. Palindrome Partitioning
**Topic:** Backtracking, DP
**Problem:** Partition string so every part is a palindrome; return all such partitions.
```
Input:  "aab"
Output: [["a","a","b"],["aa","b"]]
```

---

### 506. Maximum Length of Repeated Subarray
**Topic:** DP, Sliding Window
**Problem:** Find max length of subarray appearing in both arrays.
```
Input:  A=[1,2,3,2,1], B=[3,2,1,4,7]
Output: 3
```

---

### 507. Count Vowels Permutation
**Topic:** DP
**Problem:** Count strings of length n following vowel adjacency rules.
```
Input:  n=2
Output: 10
```

---

### 508. Maximal Network Rank
**Topic:** Graphs
**Problem:** Network rank of two cities = sum of roads connected to either.
```
Input:  n=4, roads=[[0,1],[0,3],[1,2],[1,3]]
Output: 4
```

---

### 509. Sentence Screen Fitting
**Topic:** Strings, Simulation, DP
**Problem:** Count how many times sentence fits on screen of rows×cols.
```
Input:  sentence=["hello","world"], rows=2, cols=8
Output: 1
```

---

### 510. Brick Wall
**Topic:** Arrays, Hash Map
**Problem:** Find the line crossing fewest bricks.
```
Input:  [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
Output: 2
```

---

### 511. Spiral Matrix II
**Topic:** Arrays, Matrix, Simulation
**Problem:** Generate n×n matrix filled with 1..n² in spiral order.
```
Input:  n=3
Output: [[1,2,3],[8,9,4],[7,6,5]]
```

---

### 512. Rotate List
**Topic:** Linked List, Two Pointers
**Problem:** Rotate linked list to right by k places.
```
Input:  [1,2,3,4,5], k=2
Output: [4,5,1,2,3]
```

---

### 513. Odd Even Linked List
**Topic:** Linked List
**Problem:** Group odd-indexed then even-indexed nodes.
```
Input:  [1,2,3,4,5]
Output: [1,3,5,2,4]
```

---

### 514. Swap Nodes in Pairs
**Topic:** Linked List, Recursion
**Problem:** Swap every two adjacent nodes.
```
Input:  [1,2,3,4]
Output: [2,1,4,3]
```

---

### 515. Reverse Linked List II
**Topic:** Linked List
**Problem:** Reverse portion from position left to right.
```
Input:  [1,2,3,4,5], left=2, right=4
Output: [1,4,3,2,5]
```

---

### 516. Copy List with Random Pointer
**Topic:** Linked List, Hash Map
**Problem:** Deep copy linked list with next and random pointers.
```
Input:  [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: deep copy
```

---

### 517. Sort List
**Topic:** Linked List, Merge Sort
**Problem:** Sort linked list in O(n log n) time and O(1) space.
```
Input:  [4,2,1,3]
Output: [1,2,3,4]
```

---

### 518. Flatten a Multilevel Doubly Linked List
**Topic:** Linked List, DFS
**Problem:** Flatten multilevel doubly linked list.
```
Input:  [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
Output: [1,2,3,7,8,11,12,9,10,4,5,6]
```

---

### 519. Intersection of Two Linked Lists
**Topic:** Linked List, Two Pointers
**Problem:** Find intersection node of two linked lists.
```
Input:  listA=[4,1,8,4,5], listB=[5,6,1,8,4,5] (intersect at 8)
Output: node with value 8
```

---

### 520. Longest Word in Dictionary
**Topic:** Trie, Strings, Hash Set
**Problem:** Find longest word built one char at a time from dictionary.
```
Input:  ["w","wo","wor","worl","world"]
Output: "world"
```

---

### 521. Design HashMap
**Topic:** Design, Arrays, Hashing
**Problem:** Implement HashMap with put, get, remove.
```
Input:  put(1,1), put(2,2), get(1)→1, get(3)→-1, put(2,1), get(2)→1, remove(2), get(2)→-1
Output: as described
```

---

### 522. Design HashSet
**Topic:** Design, Arrays, Hashing
**Problem:** Implement HashSet with add, remove, contains.
```
Input:  add(1), add(2), contains(1)→true, contains(3)→false, add(2), contains(2)→true, remove(2), contains(2)→false
Output: as described
```

---

### 523. Max Stack
**Topic:** Stack, Design
**Problem:** Stack with push, pop, top, peekMax, popMax.
```
Input:  push(5), push(1), push(5), top()→5, popMax()→5, top()→1, peekMax()→5, pop()→1
Output: as described
```

---

### 524. Continuous Subarray Sum
**Topic:** Arrays, Prefix Sum, Hash Map
**Problem:** Return true if there's a subarray of length ≥ 2 with sum as multiple of k.
```
Input:  [23,2,4,6,7], k=6
Output: true
```

---

### 525. Contiguous Array
**Topic:** Arrays, Prefix Sum, Hash Map
**Problem:** Find max length subarray with equal 0s and 1s.
```
Input:  [0,1,0]
Output: 2
```

---

### 526. Find Duplicate Subtrees
**Topic:** Binary Tree, DFS, Hash Map
**Problem:** Find all duplicate subtrees in binary tree.
```
Input:  [1,2,3,4,null,2,4,null,null,4]
Output: [[2,4],[4]]
```

---

### 527. Construct Binary Tree from Inorder and Postorder
**Topic:** Binary Tree, Recursion, Hash Map
**Problem:** Build binary tree from inorder and postorder traversals.
```
Input:  inorder=[9,3,15,20,7], postorder=[9,15,7,20,3]
Output: [3,9,20,null,null,15,7]
```

---

### 528. Check if Array Pairs Are Divisible by k
**Topic:** Arrays, Hash Map, Math
**Problem:** Pair up array (even length) so each pair's sum divisible by k.
```
Input:  arr=[1,2,3,4,5,10,6,7,8,9], k=5
Output: true
```

---

### 529. Count Ways to Make Array with Product
**Topic:** DP, Math
**Problem:** Count ways to fill n elements with product exactly k.
```
Input:  queries=[[1,1],[2,6],[3,4]]
Output: [1,4,4]
```

---

### 530. Maximum Points You Can Obtain from Cards
**Topic:** Arrays, Sliding Window
**Problem:** Pick exactly k cards from left or right end; maximize score.
```
Input:  cardPoints=[1,2,3,4,5,6,1], k=3
Output: 12
```

---

### 531. Boats to Save People
**Topic:** Arrays, Greedy, Two Pointers
**Problem:** Min boats with capacity limit=2 people and weight limit.
```
Input:  people=[1,2], limit=3
Output: 1
Input:  people=[3,2,2,1], limit=3
Output: 3
```

---

### 532. Queue Reconstruction by Height
**Topic:** Arrays, Greedy, Sorting
**Problem:** Reconstruct queue from height and count-of-taller pairs.
```
Input:  [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
Output: [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
```

---

### 533. Meeting Scheduler
**Topic:** Arrays, Sorting, Two Pointers
**Problem:** Find earliest common free slot of duration duration for two people.
```
Input:  slots1=[[10,50],[60,120],[140,210]], slots2=[[0,15],[60,70]], duration=8
Output: [60,68]
```

---

### 534. Maximum Number of Eaten Apples
**Topic:** Arrays, Greedy, Heap
**Problem:** Eat max apples; each day may produce some apples expiring after some days.
```
Input:  apples=[1,2,3,5,2], days=[3,2,1,4,2]
Output: 7
```

---

### 535. Minimum Number of Refueling Stops
**Topic:** Arrays, Greedy, Heap, DP
**Problem:** Min stops to reach target with car starting with startFuel.
```
Input:  target=100, startFuel=10, stations=[[10,60],[20,30],[30,30],[60,40]]
Output: 2
```

---

### 536. Find the Longest Substring Containing Vowels in Even Counts
**Topic:** Strings, Bit Masking, Hash Map
**Problem:** Longest substring with each vowel appearing even number of times.
```
Input:  "eleetminicoworoep"
Output: 13
```

---

### 537. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
**Topic:** Arrays, Sliding Window
**Problem:** Count length-k subarrays with average ≥ threshold.
```
Input:  arr=[2,2,2,2,5,5,5,8], k=3, threshold=4
Output: 3
```

---

### 538. Arithmetic Slices
**Topic:** Arrays, DP
**Problem:** Count arithmetic slices (≥3 consecutive elements with constant difference).
```
Input:  [1,2,3,4]
Output: 3
```

---

### 539. Check If a String Can Break Another String
**Topic:** Strings, Greedy, Sorting
**Problem:** String s1 breaks s2 if sorted s1[i]≥sorted s2[i] for all i.
```
Input:  s1="abc", s2="xya"
Output: true
```

---

### 540. Find the Duplicate Numbers (no extra space)
**Topic:** Arrays, Floyd's Cycle
**Problem:** Find duplicate in [1..n] array of n+1 elements using O(1) space.
```
Input:  [1,3,4,2,2]
Output: 2
```

---

### 541. String Without AAA or BBB
**Topic:** Strings, Greedy
**Problem:** Interleave a and b characters so no three identical consecutive chars.
```
Input:  a=1, b=2
Output: "bba"
```

---

### 542. 01 Matrix
**Topic:** Graphs, BFS, Matrix
**Problem:** Find distance to nearest 0 for each cell.
```
Input:  [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
```

---

### 543. Shortest Path in Binary Matrix
**Topic:** Graphs, BFS
**Problem:** Shortest 8-directional path from (0,0) to (n-1,n-1) through 0s.
```
Input:  [[0,1],[1,0]]
Output: 2
```

---

### 544. Shortest Path with Alternating Colors
**Topic:** Graphs, BFS
**Problem:** Shortest path alternating edge colors (red/blue).
```
Input:  n=3, redEdges=[[0,1],[1,2]], blueEdges=[]
Output: [0,1,-1]
```

---

### 545. Minimum Obstacles to Reach Corner
**Topic:** Graphs, BFS/Dijkstra, Matrix
**Problem:** Min obstacles to remove traveling from top-left to bottom-right.
```
Input:  [[0,1,1],[1,1,0],[1,1,0]]
Output: 2
```

---

### 546. Find Closest BST Value II
**Topic:** BST, DFS, Heap
**Problem:** Find k values closest to target in BST.
```
Input:  root=[4,2,5,1,3], target=3.714286, k=2
Output: [4,3]
```

---

### 547. Count Nodes Equal to Average of Subtree
**Topic:** Binary Tree, DFS
**Problem:** Count nodes where value equals integer average of subtree.
```
Input:  [4,8,5,0,1,null,6]
Output: 5
```

---

### 548. Kth Largest Sum in Binary Tree
**Topic:** Binary Tree, BFS, Heap
**Problem:** Find kth largest level sum.
```
Input:  root=[5,8,9,2,1,3,7,4,6], k=2
Output: 13
```

---

### 549. Pseudo-Palindromic Paths in Binary Tree
**Topic:** Binary Tree, DFS, Bit Manipulation
**Problem:** Count root-to-leaf paths with rearrangeable palindrome.
```
Input:  [2,3,1,3,1,null,1]
Output: 2
```

---

### 550. Minimum Fuel Cost to Report to the Capital
**Topic:** Graphs, DFS, Trees
**Problem:** Min fuel (seat capacity = seats) for representatives to reach capital (node 0).
```
Input:  roads=[[0,1],[0,2],[0,3]], seats=5
Output: 3
```

---

### 551. Find City With Smallest Number of Neighbors at Threshold Distance
**Topic:** Graphs, Floyd-Warshall, DP
**Problem:** Find city with fewest cities reachable within distance threshold.
```
Input:  n=4, edges=[[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold=4
Output: 3
```

---

### 552. Evaluate Division
**Topic:** Graphs, BFS/DFS, Union Find
**Problem:** Given equations like a/b=2.0, answer division queries.
```
Input:  equations=[["a","b"],["b","c"]], values=[2.0,3.0], queries=[["a","c"],["b","a"]]
Output: [6.0,0.5]
```

---

### 553. Minimum Cost to Connect Sticks
**Topic:** Greedy, Heap
**Problem:** Connect all sticks into one; cost = sum of lengths. Minimize total cost.
```
Input:  [2,4,3]
Output: 14
```

---

### 554. Minimum Cost to Hire K Workers
**Topic:** Arrays, Greedy, Heap, Sorting
**Problem:** Hire k workers minimizing total cost (wages proportional to quality).
```
Input:  quality=[10,20,5], wage=[70,50,30], k=2
Output: 105.0
```

---

### 555. Minimum Number of Swaps to Make String Balanced
**Topic:** Strings, Greedy, Stack
**Problem:** Min swaps to balance bracket string.
```
Input:  "][]["
Output: 1
```

---

### 556. Minimum Total Space Wasted with K Resizing Operations
**Topic:** DP, Arrays
**Problem:** Resize array at most k times to minimize wasted space.
```
Input:  nums=[10,20], k=0
Output: 10
```

---

### 557. Find Minimum in Rotated Sorted Array II
**Topic:** Arrays, Binary Search
**Problem:** Find minimum in rotated sorted array with duplicates.
```
Input:  [2,2,2,0,1]
Output: 0
```

---

### 558. Search in Rotated Sorted Array II
**Topic:** Arrays, Binary Search
**Problem:** Search in rotated sorted array with duplicates.
```
Input:  nums=[2,5,6,0,0,1,2], target=0
Output: true
```

---

### 559. Bitwise AND of Numbers Range
**Topic:** Bit Manipulation
**Problem:** Return bitwise AND of all numbers from left to right inclusive.
```
Input:  left=5, right=7
Output: 4
```

---

### 560. Number of 1s in Range
**Topic:** Math, Digit DP
**Problem:** Count 1s in decimal representations of all numbers from 1 to n.
```
Input:  n=13
Output: 6
```

---

### 561. Count Sorted Vowel Strings
**Topic:** DP, Math
**Problem:** Count lexicographically sorted strings of length n using vowels.
```
Input:  n=2
Output: 15
```

---

### 562. Decode XOR'd Permutation
**Topic:** Arrays, Bit Manipulation
**Problem:** Recover permutation from XOR-encoded array and known constraints.
```
Input:  encoded=[3,1]
Output: [1,2,3]
```

---

### 563. Minimum Absolute Sum Difference
**Topic:** Arrays, Sorting, Binary Search
**Problem:** Replace one element in nums1 to minimize absolute sum difference.
```
Input:  nums1=[1,7,5], nums2=[2,3,5]
Output: 3
```

---

### 564. Minimize Maximum Pair Sum in Array
**Topic:** Arrays, Greedy, Sorting
**Problem:** Pair up elements to minimize max pair sum.
```
Input:  [3,5,2,3]
Output: 7
```

---

### 565. Maximum Difference in Increasing Elements
**Topic:** Arrays
**Problem:** Max nums[j]-nums[i] where i<j and nums[i]<nums[j].
```
Input:  [7,1,5,4]
Output: 4
```

---

### 566. Number of Pairs of Strings With Concatenation Equal to Target
**Topic:** Strings, Hash Map
**Problem:** Count pairs (i,j) where nums[i]+nums[j] == target.
```
Input:  nums=["777","7","77","77"], target="7777"
Output: 4
```

---

### 567. Minimum Deletions to Make Character Frequencies Unique
**Topic:** Strings, Greedy, Sorting
**Problem:** Minimum deletions to make all character frequencies unique.
```
Input:  "aaabbbcc"
Output: 2
```

---

### 568. Maximum Number of Vowels in a Substring of Given Length
**Topic:** Strings, Sliding Window
**Problem:** Max vowels in any substring of length k.
```
Input:  s="abciiidef", k=3
Output: 3
```

---

### 569. Jump Game III
**Topic:** Arrays, BFS/DFS
**Problem:** From index i, jump to i+arr[i] or i-arr[i]. Can you reach a 0?
```
Input:  arr=[4,2,3,0,3,1,2], start=5
Output: true
```

---

### 570. Jump Game IV
**Topic:** Graphs, BFS
**Problem:** Jump +1, -1, or to any equal-value index. Min jumps to reach last index.
```
Input:  [100,-23,-23,404,100,23,23,23,3,404]
Output: 3
```

---

### 571. Maximum Nesting Depth of Parentheses
**Topic:** Strings, Stack
**Problem:** Return max nesting depth of valid parentheses string.
```
Input:  "(1+(2*3)+((8)/4))+1"
Output: 3
```

---

### 572. Remove All Adjacent Duplicates in String II
**Topic:** Strings, Stack
**Problem:** Remove k adjacent duplicate characters, repeat until no k-duplicates.
```
Input:  s="deeedbbcccbdaa", k=3
Output: "aa"
```

---

### 573. Sum of Subarray Minimums
**Topic:** Arrays, Monotonic Stack, DP
**Problem:** Sum of minimums of every subarray.
```
Input:  [3,1,2,4]
Output: 17
```

---

### 574. Online Stock Span
**Topic:** Stack, Design
**Problem:** Return number of consecutive days with price ≤ today's.
```
Input:  prices=[100,80,60,70,60,75,85]
Output: [1,1,1,2,1,4,6]
```

---

### 575. Score of Parentheses
**Topic:** Strings, Stack
**Problem:** () = 1, AB = A+B, (A) = 2A. Compute score.
```
Input:  "(()(()))"
Output: 6
```

---

### 576. 132 Pattern
**Topic:** Arrays, Monotonic Stack
**Problem:** Return true if nums[i] < nums[k] < nums[j] for some i<j<k.
```
Input:  [3,1,4,2]
Output: true
```

---

### 577. Buildings With an Ocean View
**Topic:** Arrays, Monotonic Stack
**Problem:** Find indices of buildings with ocean view (no taller building to the right).
```
Input:  [4,2,3,1]
Output: [0,2,3]
```

---

### 578. Car Fleet
**Topic:** Arrays, Stack, Sorting
**Problem:** Count car fleets arriving at destination.
```
Input:  target=12, position=[10,8,0,5,3], speed=[2,4,1,1,3]
Output: 3
```

---

### 579. Design Browser History
**Topic:** Design, Arrays, Stack
**Problem:** Browser with visit, back, forward.
```
Input:  visit("leetcode"), visit("google"), back(1)→"leetcode", forward(1)→"google"
Output: as described
```

---

### 580. Design Circular Queue
**Topic:** Design, Arrays
**Problem:** Implement circular queue with enqueue, dequeue, front, rear.
```
Input:  capacity=3, enQueue(1)→true, enQueue(2)→true, enQueue(3)→true, enQueue(4)→false
Output: as described
```

---

### 581. Shortest Unsorted Continuous Subarray
**Topic:** Arrays, Sorting, Two Pointers
**Problem:** Find shortest subarray to sort to make whole array sorted.
```
Input:  [2,6,4,8,10,9,15]
Output: 5
```

---

### 582. Find the Duplicate Number (Fast/Slow Pointers)
**Topic:** Arrays, Floyd's Cycle
**Problem:** Find duplicate in O(n) time O(1) space.
```
Input:  [1,3,4,2,2]
Output: 2
```

---

### 583. Unique Binary Search Trees
**Topic:** DP, Math (Catalan Numbers)
**Problem:** Count structurally unique BSTs with n nodes.
```
Input:  n=3
Output: 5
```

---

### 584. Unique Binary Search Trees II
**Topic:** DP, Binary Tree, Recursion
**Problem:** Generate all structurally unique BSTs with n nodes.
```
Input:  n=3
Output: all 5 unique BSTs
```

---

### 585. Binary Search Tree Iterator
**Topic:** BST, Stack, Inorder
**Problem:** Implement iterator over BST that returns values in sorted order.
```
Input:  next()→3, next()→7, hasNext()→true, next()→9
Output: as described
```

---

### 586. Insert into a Binary Search Tree
**Topic:** BST, Recursion
**Problem:** Insert a value into BST and return root.
```
Input:  root=[4,2,7,1,3], val=5
Output: [4,2,7,1,3,5]
```

---

### 587. Range Sum of BST
**Topic:** BST, DFS
**Problem:** Sum of values in range [low, high] in BST.
```
Input:  root=[10,5,15,3,7,null,18], low=7, high=15
Output: 32
```

---

### 588. Two Sum IV - Input is BST
**Topic:** BST, DFS, Hash Set
**Problem:** Return true if two nodes sum to k in BST.
```
Input:  root=[5,3,6,2,4,null,7], k=9
Output: true
```

---

### 589. Convert BST to Greater Tree
**Topic:** BST, Reverse Inorder
**Problem:** Convert BST where each key is replaced by sum of all greater keys.
```
Input:  [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
```

---

### 590. Balance a Binary Search Tree
**Topic:** BST, Inorder, Recursion
**Problem:** Convert BST to height-balanced BST.
```
Input:  [1,null,2,null,3,null,4]
Output: [2,1,3,null,null,null,4]
```

---

### 591. Maximum Width of Binary Tree
**Topic:** Binary Tree, BFS
**Problem:** Max width of binary tree at any level.
```
Input:  [1,3,2,5,3,null,9]
Output: 4
```

---

### 592. Path Sum III
**Topic:** Binary Tree, DFS, Prefix Sum
**Problem:** Count paths summing to target (any start, any end downward).
```
Input:  root=[10,5,-3,3,2,null,11,3,-2,null,1], target=8
Output: 3
```

---

### 593. Distribute Coins in Binary Tree
**Topic:** Binary Tree, DFS
**Problem:** Distribute coins so each node has exactly 1. Count moves.
```
Input:  [3,0,0]
Output: 2
```

---

### 594. Longest ZigZag Path in Binary Tree
**Topic:** Binary Tree, DFS, DP
**Problem:** Longest zigzag path (alternating left/right).
```
Input:  [1,null,1,1,1,null,null,1,1,null,1]
Output: 3
```

---

### 595. Minimum Depth of Binary Tree (BFS)
**Topic:** Binary Tree, BFS
**Problem:** Find minimum depth using BFS.
```
Input:  [2,null,3,null,4]
Output: 3
```

---

### 596. Count Univalue Subtrees
**Topic:** Binary Tree, DFS
**Problem:** Count subtrees where all nodes have the same value.
```
Input:  [5,1,5,5,5,null,5]
Output: 4
```

---

### 597. Step-By-Step Directions From a Binary Tree Node
**Topic:** Binary Tree, DFS, LCA
**Problem:** Find shortest path directions from startValue to destValue.
```
Input:  root=[5,1,2,3,null,6,4], startValue=3, destValue=6
Output: "UURL"
```

---

### 598. Maximum Number of Events That Can Be Attended
**Topic:** Arrays, Greedy, Heap
**Problem:** Attend one event per day; maximize attended count.
```
Input:  [[1,2],[2,3],[3,4]]
Output: 3
```

---

### 599. Minimum Interval to Include Each Query
**Topic:** Arrays, Sorting, Heap
**Problem:** For each query point, find smallest interval containing it.
```
Input:  intervals=[[1,4],[2,4],[3,6],[4,4]], queries=[2,3,4,5]
Output: [3,3,1,4]
```

---

### 600. Maximum Performance of a Team
**Topic:** Arrays, Greedy, Heap, Sorting
**Problem:** Pick at most k engineers to maximize min speed × total efficiency.
```
Input:  n=6, speed=[2,10,3,1,5,8], efficiency=[5,4,3,9,7,2], k=2
Output: 56
```

---

### 601. Minimum Cost For Tickets
**Topic:** DP
**Problem:** Min cost covering all travel days with 1/7/30-day passes.
```
Input:  days=[1,4,6,7,8,20], costs=[2,7,15]
Output: 11
```

---

### 602. Decode Ways II
**Topic:** DP, Strings
**Problem:** Count decoding ways with '*' wildcard (represents 1-9).
```
Input:  "1*"
Output: 18
```

---

### 603. Count Numbers with Unique Digits
**Topic:** Math, DP, Backtracking
**Problem:** Count numbers with all unique digits in range [0, 10^n).
```
Input:  n=2
Output: 91
```

---

### 604. Lexicographical Numbers
**Topic:** DFS, Math
**Problem:** Return numbers 1..n in lexicographic order.
```
Input:  n=13
Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
```

---

### 605. Maximum Gap
**Topic:** Arrays, Sorting (Bucket/Radix Sort)
**Problem:** Find maximum gap between successive elements in sorted order.
```
Input:  [3,6,9,1]
Output: 3
```

---

### 606. Contains Duplicate III
**Topic:** Arrays, Sliding Window, Sorted Set
**Problem:** Any i≠j: |i-j|≤k and |nums[i]-nums[j]|≤t.
```
Input:  nums=[1,2,3,1], k=3, t=0
Output: true
```

---

### 607. Minimum Number of Days to Disconnect Island
**Topic:** Graphs, BFS/DFS
**Problem:** Minimum days to make island disconnected (flip land to water).
```
Input:  [[0,1,1,0],[0,1,1,0],[0,0,0,0]]
Output: 2
```

---

### 608. Number of Nodes in the Sub-Tree With the Same Label
**Topic:** Binary Tree/Trees, DFS
**Problem:** Count same-label nodes in each node's subtree.
```
Input:  n=7, edges=[[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], labels="abaedcd"
Output: [2,1,1,1,1,1,1]
```

---

### 609. Sum of Distances in Tree
**Topic:** Trees, DFS, DP
**Problem:** Find sum of distances from each node to all others in tree.
```
Input:  n=6, edges=[[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
```

---

### 610. Determine if a Cell Is Reachable at a Given Time
**Topic:** Math
**Problem:** Can you move from (sx,sy) to (fx,fy) in exactly t steps (8-directional)?
```
Input:  sx=2, sy=4, fx=7, fy=7, t=6
Output: true
```

---

### 611. Minimum Number of Operations to Make Array XOR Equal to K
**Topic:** Arrays, Bit Manipulation
**Problem:** Min bit flips on any element to make XOR of array equal k.
```
Input:  nums=[2,1,3,4], k=1
Output: 2
```

---

### 612. Put Marbles in Bags
**Topic:** Arrays, Greedy, Sorting
**Problem:** Distribute marbles optimally to minimize/maximize cost difference.
```
Input:  weights=[1,3,5,1], k=2
Output: 4
```

---

### 613. Maximum Sum Circular Subarray
**Topic:** Arrays, DP, Kadane's
**Problem:** Maximum subarray sum in circular array.
```
Input:  [1,-2,3,-2]
Output: 3
```

---

### 614. Odd Even Jump
**Topic:** Arrays, DP, Monotonic Stack
**Problem:** Count starting indices from which you can reach the end via odd/even jumps.
```
Input:  [10,13,12,14,15]
Output: 2
```

---

### 615. Minimum Cost to Reach Destination in Time
**Topic:** DP, Graphs
**Problem:** Min cost to travel from 0 to n-1 within maxTime using given edges.
```
Input:  maxTime=29, edges=[[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees=[5,1,2,20,20,3]
Output: 11
```

---

### 616. Minimum Score of a Path Between Two Cities
**Topic:** Graphs, Union Find, BFS
**Problem:** Min score of any path from 1 to n (score = min edge on path).
```
Input:  n=4, roads=[[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
Output: 5
```

---

### 617. Count Pairs of Nodes
**Topic:** Graphs, Sorting, Two Pointers
**Problem:** Count pairs with sum of degrees + shared edges > queries[j].
```
Input:  n=4, edges=[[1,2],[2,4],[1,3],[2,3],[2,1]], queries=[2,3]
Output: [6,5]
```

---

### 618. Kth Ancestor of a Tree Node
**Topic:** Trees, Binary Lifting, DP
**Problem:** Find kth ancestor of node in tree using binary lifting.
```
Input:  n=7, parent=[-1,0,0,1,1,2,2], queries [(3,1),(5,2),(6,3)]
Output: [1,0,-1]
```

---

### 619. Number of Ways to Reconstruct a Tree
**Topic:** Trees, Graphs
**Problem:** Count ways to reconstruct rooted tree from pairs.
```
Input:  pairs=[[1,2],[2,3]]
Output: 1
```

---

### 620. Maximum Trailing Zeros in a Cornered Path
**Topic:** Arrays, Prefix Sum
**Problem:** Find max trailing zeros in a cornered (L-shaped) path.
```
Input:  [[23,17,15,3,20],[8,1,20,27,11],[9,4,6,2,21],[40,9,1,10,6],[22,7,4,5,3]]
Output: 3
```

---

### 621. Minimum Operations to Make Array Equal to Target
**Topic:** Arrays, Greedy, Stack
**Problem:** Min operations to make array equal to target using ±1 on subarrays.
```
Input:  nums=[3,5,1,2], target=[4,6,2,4]
Output: 2
```

---

### 622. Minimum Weighted Subgraph With Required Paths
**Topic:** Graphs, Dijkstra
**Problem:** Min weight subgraph containing paths from src1, src2 to dest.
```
Input:  n=6, edges=[[0,2,2],[0,5,6],[1,0,3],[1,4,5],[2,1,1],[2,5,3],[3,4,2],[4,5,1],[5,3,1]], src1=0, src2=1, dest=5
Output: 9
```

---

### 623. Find All Pairs With a Given Difference
**Topic:** Arrays, Hash Set
**Problem:** Find all pairs with difference exactly k.
```
Input:  nums=[1,7,5,9,2,12,3], k=2
Output: [[1,3],[3,5],[5,7]]
```

---

### 624. Minimum Time to Complete All Tasks
**Topic:** Arrays, Greedy, Sorting
**Problem:** Schedule tasks with intervals to minimize total run time.
```
Input:  tasks=[[2,3,1],[4,5,1],[1,5,2]]
Output: 2
```

---

### 625. Find the Minimum and Maximum Number of Nodes Between Critical Points
**Topic:** Linked List
**Problem:** Find min and max distances between critical points (local min/max).
```
Input:  [3,1]
Output: [-1,-1]
Input:  [5,3,1,2,5,1,2]
Output: [1,3]
```

---

### 626. Minimum Cost to Cut a Stick
**Topic:** DP, Arrays
**Problem:** Min cost to cut stick at given positions (cost = length of stick being cut).
```
Input:  n=7, cuts=[1,3,4,5]
Output: 16
```

---

### 627. Count of Interesting Subarrays
**Topic:** Arrays, Hash Map, Prefix Sum
**Problem:** Count subarrays where count of elements with nums[i]%modulo==k equals modulo.
```
Input:  nums=[3,2,4], modulo=2, k=1
Output: 3
```

---

### 628. Maximum Sum of Subsequence With Non-adjacent Elements
**Topic:** DP, Arrays
**Problem:** Max sum subsequence with no two adjacent elements.
```
Input:  [2,1,6,4]
Output: 8
```

---

### 629. Minimum Equal Sum of Two Arrays After Replacing Zeros
**Topic:** Arrays, Greedy
**Problem:** Replace zeros in both arrays to make equal sums; find minimum.
```
Input:  nums1=[3,2,0,1,0], nums2=[6,5,0]
Output: 12
```

---

### 630. Find Minimum Time to Finish All Jobs
**Topic:** Backtracking, Bit Masking, DP
**Problem:** Assign jobs to k workers to minimize max work time.
```
Input:  jobs=[3,2,3], k=3
Output: 3
```

---

### 631. Maximize Score After N Operations
**Topic:** DP, Bit Masking
**Problem:** Pair 2n numbers in n operations to maximize sum of i*gcd(pair).
```
Input:  nums=[1,2]
Output: 1
```

---

### 632. Smallest Range Covering Elements from K Lists
**Topic:** Heap, Sliding Window
**Problem:** Find smallest range [a,b] containing at least one element from each list.
```
Input:  [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
```

---

### 633. Maximum Frequency Stack
**Topic:** Stack, Design, Hash Map
**Problem:** Push elements, pop most frequent (if tie, pop most recently pushed).
```
Input:  push(5),push(7),push(5),push(7),push(4),push(5), pop()→5, pop()→7, pop()→5, pop()→4
Output: as described
```

---

### 634. Exam Room
**Topic:** Design, Set, Greedy
**Problem:** Assign seats maximizing distance to nearest student.
```
Input:  seat()→0, seat()→9, seat()→4, seat()→2, leave(4), seat()→5
Output: as described
```

---

### 635. Stock Price Fluctuation
**Topic:** Design, Hash Map, Sorted Set
**Problem:** Stock prices with corrections. Track max, min, current.
```
Input:  update(1,10), update(2,5), getCurrent()→5, getMax()→10, getMin()→5, update(1,3), getMax()→5
Output: as described
```

---

### 636. Design Underground System
**Topic:** Design, Hash Map
**Problem:** Track check-ins/outs, calculate average travel time.
```
Input:  checkIn(45,"Leyton",3), checkIn(32,"Paradise",8), checkOut(45,"Waterloo",15), checkOut(32,"Cambridge",22), getAverageTime("Paradise","Cambridge")→14.0
Output: as described
```

---

### 637. Design Skiplist
**Topic:** Design, Linked List
**Problem:** Implement skiplist with add, erase, search.
```
Input:  add(1), add(2), add(3), search(0)→false, add(4), search(1)→true, erase(0)→false, erase(1)→true, search(1)→false
Output: as described
```

---

### 638. Maximum Sum of Two Non-Overlapping Subarrays
**Topic:** Arrays, DP, Sliding Window
**Problem:** Max sum of two non-overlapping subarrays of lengths L and M.
```
Input:  nums=[0,6,5,2,2,5,1,9,4], L=1, M=2
Output: 20
```

---

### 639. Flip String to Monotone Increasing
**Topic:** Strings, DP
**Problem:** Min flips to make binary string monotone increasing.
```
Input:  "00110"
Output: 1
```

---

### 640. Minimum Swaps to Group All 1s Together II
**Topic:** Arrays, Sliding Window
**Problem:** Circular array: min swaps to group all 1s.
```
Input:  [0,1,0,1,1,0,0]
Output: 1
```

---

### 641. Check Completeness of Binary Tree
**Topic:** Binary Tree, BFS
**Problem:** Return true if binary tree is complete.
```
Input:  [1,2,3,4,5,6]
Output: true
Input:  [1,2,3,4,5,null,7]
Output: false
```

---

### 642. Construct Binary Search Tree from Preorder Traversal
**Topic:** BST, Recursion, Monotonic Stack
**Problem:** Build BST from preorder traversal.
```
Input:  [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]
```

---

### 643. Find Leaves of Binary Tree
**Topic:** Binary Tree, DFS
**Problem:** Collect leaves layer by layer, removing each leaf.
```
Input:  [1,2,3,4,5]
Output: [[4,5,3],[2],[1]]
```

---

### 644. All Possible Full Binary Trees
**Topic:** Binary Tree, Recursion, Memoization
**Problem:** Return all full binary trees with n nodes.
```
Input:  n=3
Output: all 1 full binary tree
```

---

### 645. Count Complete Tree Nodes (Log²n)
**Topic:** Binary Tree, Binary Search
**Problem:** Count nodes in complete binary tree in O(log²n).
```
Input:  [1,2,3,4,5,6]
Output: 6
```

---

### 646. Maximum Binary Tree
**Topic:** Binary Tree, Recursion, Monotonic Stack
**Problem:** Build max binary tree: root = max, left subtree from left, right from right.
```
Input:  [3,2,1,6,0,5]
Output: [6,3,5,null,2,0,null,null,1]
```

---

### 647. Sum of Subsets XOR
**Topic:** Arrays, Backtracking
**Problem:** Sum XOR values of all subsets.
```
Input:  [5,1,6]
Output: 28
```

---

### 648. Next Greater Node in Linked List
**Topic:** Linked List, Monotonic Stack
**Problem:** For each node, find value of next greater node.
```
Input:  [2,1,5]
Output: [5,5,0]
```

---

### 649. Sort Linked List
**Topic:** Linked List, Merge Sort
**Problem:** Sort linked list in ascending order.
```
Input:  [4,2,1,3]
Output: [1,2,3,4]
```

---

### 650. Merge Nodes in Between Zeros
**Topic:** Linked List, Simulation
**Problem:** Sum values between zeros, replace with sum nodes.
```
Input:  [0,3,1,0,4,5,2,0]
Output: [4,11]
```

---

### 651. Maximum Twin Sum of Linked List
**Topic:** Linked List, Two Pointers
**Problem:** Max sum of twin pairs (i + (n-1-i)).
```
Input:  [5,4,2,1]
Output: 6
```

---

### 652. Rotate Right a Linked List by K
**Topic:** Linked List
**Problem:** Rotate list to right by k places.
```
Input:  [1,2,3,4,5], k=2
Output: [4,5,1,2,3]
```

---

### 653. Delete the Middle Node of Linked List
**Topic:** Linked List, Two Pointers
**Problem:** Delete middle node.
```
Input:  [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
```

---

### 654. Find the Duplicate Number (LL cycle)
**Topic:** Linked List, Floyd's
**Problem:** Treat array as linked list; find cycle entry = duplicate.
```
Input:  [3,1,3,4,2]
Output: 3
```

---

### 655. Spiral Matrix III
**Topic:** Arrays, Simulation
**Problem:** Visit matrix cells in spiral order starting from (r,c).
```
Input:  rows=1, cols=4, rStart=0, cStart=0
Output: [[0,0],[0,1],[0,2],[0,3]]
```

---

### 656. Design a Number Container System
**Topic:** Design, Hash Map, Sorted Set
**Problem:** System to store index-number mappings; find smallest index for given number.
```
Input:  change(2,10), change(1,10), change(5,10), change(2,20), find(10)→1, find(20)→2
Output: as described
```

---

### 657. Minimum Time to Kill All Monsters
**Topic:** Bit Masking, DP
**Problem:** Gain power over time; kill monsters requiring specific power.
```
Input:  power=[3,1,4], daily=1, initialPower=4
Output: 4
```

---

### 658. Count of Smaller Numbers After Self
**Topic:** Arrays, Merge Sort, BIT, Segment Tree
**Problem:** For each element, count smaller elements to its right.
```
Input:  [5,2,6,1]
Output: [2,1,1,0]
```

---

### 659. Queue using Two Stacks (Amortized Analysis)
**Topic:** Stack, Queue, Design
**Problem:** FIFO queue with O(1) amortized push and pop.
```
Input:  push(1),push(2),pop()→1,push(3),pop()→2,pop()→3
Output: as described
```

---

### 660. Word Ladder I (BFS)
**Topic:** Graphs, BFS
**Problem:** Min transformations from beginWord to endWord (one letter at a time, must be in wordList).
```
Input:  beginWord="hit", endWord="cog", wordList=["hot","dot","dog","lot","log","cog"]
Output: 5
```

---

### 661. Most Stones Removed with Same Row or Column
**Topic:** Graphs, Union Find
**Problem:** Max stones removable if two stones share row/column.
```
Input:  [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
Output: 5
```

---

### 662. Longest Common Subsequence of Three Strings
**Topic:** DP, Strings
**Problem:** LCS of three strings.
```
Input:  s1="geeks", s2="geeksfor", s3="geeksforgeeks"
Output: 5
```

---

### 663. Wildcard Matching
**Topic:** DP, Strings
**Problem:** Pattern matching with '?' (any single char) and '*' (any sequence).
```
Input:  s="adceb", p="*a*b"
Output: true
```

---

### 664. Burst Balloons
**Topic:** DP, Divide and Conquer
**Problem:** Burst balloons in order to maximize coins.
```
Input:  [3,1,5,8]
Output: 167
```

---

### 665. Strange Printer
**Topic:** DP
**Problem:** Print string with a printer that prints same character runs. Find min turns.
```
Input:  "aaabbb"
Output: 2
```

---

### 666. Palindrome Pairs
**Topic:** Strings, Trie, Hash Map
**Problem:** Find all pairs (i,j) where s[i]+s[j] is a palindrome.
```
Input:  ["abcd","dcba","lls","s","sssll"]
Output: [[0,1],[1,0],[3,2],[2,4]]
```

---

## 📊 Medium Summary

| Range | Topics Covered |
|-------|---------------|
| 334–370 | Sliding Window, Prefix Sum, BFS, Backtracking, DP Intro |
| 371–410 | Stack, Heap, Design, Graph Traversal, Intervals |
| 411–450 | BST, Binary Tree Operations, Two Pointers, Greedy |
| 451–490 | Trie, Sliding Window Advanced, Bit Manipulation, Heaps |
| 491–530 | Union Find, Matrix DP, Monotonic Stack, String DP |
| 531–599 | Linked List, Graph Algorithms, Sorting, Segment Trees |
| 600–666 | Advanced DP, Complex Design, Specialized Algorithms |
