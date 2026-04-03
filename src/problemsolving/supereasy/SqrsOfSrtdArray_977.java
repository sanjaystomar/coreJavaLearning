package problemsolving.supereasy;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * <p>
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * <p>
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 * <p>
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class SqrsOfSrtdArray_977 {
    static void main() {
        int[] input1 = {-4, -1, 0, 3, 10};
        System.out.println(solution(input1));
    }
    
    static int[] solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.powExact(nums[i], 2);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        return nums;
    }
// TODO: still to work on;;
//    static int[] optimizedApproach(int[] nums) {
//        int lt = 0;
//        int rt = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (Math.powExact(Math.abs(nums[lt]), 2) < Math.powExact(Math.powExact(Math.abs(nums[rt])), 2)) {
////                nums[rt]=
//
//            }
//        }
//    }
}

/**
 * public int[] sortedSquares(int[] nums) {
 *     int n = nums.length;
 *     int[] result = new int[n];
 *     int left = 0;
 *     int right = n - 1;
 *     int pos = n - 1;  // Fill from the end
 *
 *     while (left <= right) {
 *         int leftSquare = nums[left] * nums[left];
 *         int rightSquare = nums[right] * nums[right];
 *
 *         if (leftSquare > rightSquare) {
 *             result[pos] = leftSquare;
 *             left++;
 *         } else {
 *             result[pos] = rightSquare;
 *             right--;
 *         }
 *         pos--;
 *     }
 *     return result;
 * }
 * ```
 *
 * ---
 * ## How It Works
 * **Example:** `nums = [-4, -1, 0, 3, 10]`
 * ```
 * Step 1: left=0(-4), right=4(10) → 16 vs 100 → pick 100
 *         result = [_, _, _, _, 100]
 * Step 2: left=0(-4), right=3(3)  → 16 vs 9   → pick 16
 *         result = [_, _, _, 16, 100]
 * Step 3: left=1(-1), right=3(3)  → 1 vs 9    → pick 9
 *         result = [_, _, 9, 16, 100]
 * Step 4: left=1(-1), right=2(0)  → 1 vs 0    → pick 1
 *         result = [_, 1, 9, 16, 100]
 * Step 5: left=2(0), right=2(0)   → 0 vs 0    → pick 0
 *         result = [0, 1, 9, 16, 100]
 */


/**
 * public int[] sortedSquares(int[] nums) {
 *         ArrayList<Integer> result = new ArrayList<>();
 *         int left = 0;
 *         int right = nums.length - 1;
 *         int[] finalResult = new int[nums.length];
 *         int p = right;
 *         while(left <= right){
 *             // int leftSquare = nums[left] * nums[left];
 *             // int rightSquare = nums[right] * nums[right];
 *             if(Math.abs(nums[left]) < Math.abs(nums[right])){
 *                 finalResult[p] = nums[right] * nums[right];
 *                 right--;
 *             }
 *             else{
 *                 finalResult[p] = nums[left] * nums[left];
 *                 left++;
 *             }
 *             p--;
 *         }
 *         for(int i = 0; i < result.size(); i++){
 *             finalResult[i] = result.get(i);
 *         }
 *         return finalResult;
 *     }
 */