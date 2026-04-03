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

