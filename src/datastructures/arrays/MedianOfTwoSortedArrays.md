# Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

**Example 1:**
```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

**Example 2:**
```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
```

## Solution Approach (Merge and Find Median)

This solution first merges the two sorted arrays into a single sorted array. Then, it calculates the median based on whether the total number of elements is odd or even.

### Algorithm Steps:

1. **Merge Arrays**:
   - Create a new array `merged` with a size equal to the sum of the lengths of `nums1` and `nums2`.
   - Use three pointers: `i` for `nums1`, `j` for `nums2`, and `k` for `merged`.
   - Iterate while both `i` and `j` are within their respective array bounds:
     - If `nums1[i]` is less than `nums2[j]`, add `nums1[i]` to `merged[k]` and increment `i` and `k`.
     - Otherwise, add `nums2[j]` to `merged[k]` and increment `j` and `k`.
   - After one array is exhausted, copy the remaining elements from the other array into `merged`.

2. **Calculate Median**:
   - Determine the total number of elements `totalLength = m + n`.
   - **If `totalLength` is odd**: The median is the element at index `totalLength / 2` in the `merged` array.
   - **If `totalLength` is even**: The median is the average of the two middle elements: `merged[totalLength / 2 - 1]` and `merged[totalLength / 2]`.

### Time and Space Complexity:

- **Time Complexity**: O(m + n)
  - Merging the two arrays takes O(m + n) time as we iterate through all elements once.
  - Finding the median in the merged array takes O(1) time.
- **Space Complexity**: O(m + n)
  - We create a new `merged` array to store all elements from both input arrays.

## Java Code Implementation

```java
package datastructures.arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        if ((m + n) % 2 == 1) {
            return merged[(m + n) / 2];
        } else {
            int mid1 = merged[(m + n) / 2 - 1];
            int mid2 = merged[(m + n) / 2];
            return (double) (mid1 + mid2) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

        // Test cases
        int[] nums1_1 = {1, 3};
        int[] nums1_2 = {2};
        System.out.println("Median of [1,3] and [2]: " + solution.findMedianSortedArrays(nums1_1, nums1_2)); // Expected: 2.0

        int[] nums2_1 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Median of [1,2] and [3,4]: " + solution.findMedianSortedArrays(nums2_1, nums2_2)); // Expected: 2.5

        int[] nums3_1 = {0, 0};
        int[] nums3_2 = {0, 0};
        System.out.println("Median of [0,0] and [0,0]: " + solution.findMedianSortedArrays(nums3_1, nums3_2)); // Expected: 0.0

        int[] nums4_1 = {};
        int[] nums4_2 = {1};
        System.out.println("Median of [] and [1]: " + solution.findMedianSortedArrays(nums4_1, nums4_2)); // Expected: 1.0

        int[] nums5_1 = {2};
        int[] nums5_2 = {};
        System.out.println("Median of [2] and []: " + solution.findMedianSortedArrays(nums5_1, nums5_2)); // Expected: 2.0
    }
}
```

## Note on Optimal Solution (O(log(m+n)))

The problem statement specifies an optimal runtime complexity of O(log (m+n)). The provided solution has a complexity of O(m+n). 
The optimal solution typically involves a binary search approach on the smaller of the two arrays to find the partition point that would yield the correct median.
This approach is more complex to implement but achieves the desired logarithmic time complexity. The current solution is a straightforward approach for understanding the problem.

