package problemsolving.supereasy;

/**
 * You are given a positive integer array nums.
 * The element sum is the sum of all the elements in nums.
 * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
 * Return the absolute difference between the element sum and digit sum of nums.
 * Note that the absolute difference between two integers x and y is defined as |x - y|.
 *
 * Example 1:
 * Input: nums = [1,15,6,3]
 * Output: 9
 * Explanation:
 * The element sum of nums is 1 + 15 + 6 + 3 = 25.
 * The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
 * The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Explanation:
 * The element sum of nums is 1 + 2 + 3 + 4 = 10.
 * The digit sum of nums is 1 + 2 + 3 + 4 = 10.
 * The absolute difference between the element sum and digit sum is |10 - 10| = 0.
 *
 * Constraints:
 * 1 <= nums.length <= 2000
 * 1 <= nums[i] <= 2000
 */

public class ArrayElmntSumNdDgtSumDiff_2535 {
    static void main() {
        int[] nums1 = new int[]{1,15,6,3};
        int[] nums2 = new int[]{1,2,3,4};
        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
    }
    
    static int solution(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i : nums) {
            elementSum = elementSum+i;
            digitSum = digitSum + sumOfDigits(i);
        }
        return Math.abs(elementSum - digitSum);
    }
    
    static int sumOfDigits(int element) {
        int dgtSum=0;
        while (element >0){
            int digit = element%10;
            dgtSum = dgtSum + digit;
            element = element/10;
        }
        return dgtSum;
    }
}

/**
 *  public int differenceOfSum(int[] nums) {
 *         int sum = 0;
 *         for(int v : nums){
 *             sum += v-(v/ 1000 + v/100%10 + v % 100 / 10 + v % 10);
 *         }
 *         return sum > 0 ? sum : -sum;
 *     }
 */
