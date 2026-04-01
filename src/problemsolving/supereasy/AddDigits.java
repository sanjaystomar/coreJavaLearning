package problemsolving.supereasy;

public class AddDigits {
    /**
     * Example 1:
     * <p>
     * Input: num = 38
     * Output: 2
     * Explanation: The process is
     * 38 --> 3 + 8 --> 11
     * 11 --> 1 + 1 --> 2
     * Since 2 has only one digit, return it.
     * Example 2:
     * <p>
     * Input: num = 0
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= num <= 231 - 1
     * Follow up: Could you do it without any loop/recursion in O(1) runtime?
     */
    
    static void main() {
        int num = 38;
        int sum = 0;
//        System.out.println(breakNum(num));
        System.out.println(recursive(0, num));
        
    }
    
    
    /**
     * below two methods are for iterative approach
     * @param num
     * @return
     */
    static int sumOfDigits(int num) {
        if (num == 0) return 0;
        return num % 10 + sumOfDigits(num / 10);
    }
    
    static int breakNum(int sum) {
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }
        return sum;
    }
    
    /**
     * Recursive
     * @param sum
     * @param num
     * @return
     */
    static int recursive(int sum, int num) {
        if (num == 0) {
            if (sum < 10) return sum;
            return recursive(0, sum);
        }
        
        sum = sum + num % 10;
        return recursive(sum, num / 10);
    }
}
