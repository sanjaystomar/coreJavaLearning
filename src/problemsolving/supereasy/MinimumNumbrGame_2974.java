package problemsolving.supereasy;

import java.util.Arrays;

/**
 * You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:
 * <p>
 * Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
 * Now, first Bob will append the removed element in the array arr, and then Alice does the same.
 * The game continues until nums becomes empty.
 * Return the resulting array arr.
 * <p>
 * Example 1:
 * Input: nums = [5,4,2,3]
 * Output: [3,2,5,4]
 * Explanation: In round one, first Alice removes 2 and then Bob removes 3. Then in arr firstly Bob appends 3 and then Alice appends 2. So arr = [3,2].
 * At the begining of round two, nums = [5,4]. Now, first Alice removes 4 and then Bob removes 5. Then both append in arr which becomes [3,2,5,4].
 * <p>
 * Example 2:
 * Input: nums = [2,5]
 * Output: [5,2]
 * Explanation: In round one, first Alice removes 2 and then Bob removes 5. Then in arr firstly Bob appends and then Alice appends. So arr = [5,2].
 * <p>
 * Constraints:
 * 2 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * nums.length % 2 == 0
 */
public class MinimumNumbrGame_2974 {
    
    static void main() {

        solution(new int[]{2,5});
//        solution(new int[]{5, 4, 2, 3});
    }
    
    /*static int[] solution(int[] nums) {
        int[] finished = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int minIndex = getMinimum(nums);
            finished[i] = nums[minIndex];
            nums[minIndex]=Integer.MAX_VALUE;
        }
        System.out.println(Arrays.toString(finished));
        return finished;
    }*/
    
    static int[] solution(int[] nums) {
        int[] finished = new int[nums.length];
        int numOfPlayers = 2;
       
        int x = 0;
        while (x < nums.length) {
            int aliceMin = 0;
            int bobMin = 0;
            int j = 1;
            while (j <= numOfPlayers) {
                
                int minIndex = getMinimum(nums);
                
                if (j == 1) {
                    aliceMin = nums[minIndex];
                    nums[minIndex] = Integer.MAX_VALUE;
                }
                if (j == 2) {
                    bobMin = nums[minIndex];
                    nums[minIndex] = Integer.MAX_VALUE;
                }
                j++;
            }
            finished[x] = bobMin;
            finished[x + 1] = aliceMin;
            x = x + 2;
        }
        System.out.println(Arrays.toString(finished));
        return finished;
    }
    
    static int getMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}

/**
 * class Solution {
 *     static {
 *         Runtime.getRuntime().addShutdownHook(new Thread(() -> { try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) { fw.write("0"); } catch (Exception e) { } }));
 *     }
 *     public int[] numberGame(int[] nums) {
 *         PriorityQueue<Integer> pq=new PriorityQueue<>();
 *         for(int n:nums){
 *             pq.add(n);
 *         }
 *         int[]arr=new int[nums.length];
 *         int index=0;
 *         while(!pq.isEmpty()){
 *             int alice=pq.poll();
 *             int bob=pq.poll();
 *             arr[index++]=bob;
 *             arr[index++]=alice;
 *         }
 *         return arr;
 *     }
 * }
 */
