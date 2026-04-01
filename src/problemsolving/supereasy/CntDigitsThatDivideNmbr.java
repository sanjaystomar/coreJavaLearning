package problemsolving.supereasy;

/**
 * Given an integer num, return the number of digits in num that divide num.
 * An integer val divides nums if nums % val == 0.
 * <p>
 * Example 1:
 * Input: num = 7
 * Output: 1
 * Explanation: 7 divides itself, hence the answer is 1.
 * <p>
 * Example 2:
 * Input: num = 121
 * Output: 2
 * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
 * <p>
 * Example 3:
 * Input: num = 1248
 * Output: 4
 * Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 * <p>
 * Constraints:
 * 1 <= num <= 109
 * num does not contain 0 as one of its digits.
 */
public class CntDigitsThatDivideNmbr {
    static void main() {
        int num1 = 121;
        int num2 = 1248;
        System.out.println(solution(num2));
    }
    
    static int solution(int num) {
        int divisor = 0;
        int tempNum = num;
        while (tempNum > 0) {
            int digit = tempNum % 10;
            if ((num % digit) == 0) divisor++;
            tempNum = tempNum / 10;
        }
        return divisor;
    }
}
