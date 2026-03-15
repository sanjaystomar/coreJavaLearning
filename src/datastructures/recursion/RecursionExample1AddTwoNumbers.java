package datastructures.recursion;

import java.util.Arrays;

public class RecursionExample1AddTwoNumbers {


    static void main() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        int[] l1 = {2, 4, 3}, l2 = {5, 6, 4}, l3 = {0}, l4 = {0}, l5 = {9,9,9,9,9,9,9}, l6 = {9,9,9,9}, l7 = {0}, l8 = {2,3};

        System.out.println("TEST-CASE-1 : " + Arrays.toString(addTwoNumbers.finalSolution(l1, l2)));
        System.out.println("TEST-CASE-2 : " + Arrays.toString(addTwoNumbers.finalSolution(l3, l4)));
        System.out.println("TEST-CASE-3 : " + Arrays.toString(addTwoNumbers.finalSolution(l5, l6)));
        System.out.println("TEST-CASE-4 : " + Arrays.toString(addTwoNumbers.finalSolution(l7, l8)));

//        int[] resultedArray = addTwoNumbers.solution(l1, l2);
//        System.out.println(Arrays.toString(resultedArray));
//        System.out.println(addTwoNumbers.calculateNumberLength(789189898));
    }

}

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * 9999999+9999
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
class AddTwoNumbers {
    public int[] solution(int[] a, int[] b) {
        int i = getNumber1(a.length - 1, a);
        int j = getNumber1(b.length - 1, b);

        System.out.println(i + " || " + j + " || " + Math.addExact(i, j));
//        getNumber2(i + j, new int[3],0);
//        return getNumber3(i + j, new int[3],calculateArrLength(new int[3],0));
        return getNumber4(i + j, new int[3], calculateArrLength(new int[3], 0), 0);
    }

    public int getNumber(int index, int[] a) {
        int calculatedNumber = 0;
        if (index < 0)
            return calculatedNumber;

        calculatedNumber = a[index] * Math.powExact(10, index) + getNumber(index - 1, a);
        return calculatedNumber;
    }

    public int getNumber1(int index, int[] a) {
        if (index == 0) {
            return a[index];
        }
        return a[index] * Math.powExact(10, index) + getNumber1(index - 1, a);
    }

    public void getNumber2(int a, int[] ab, int index) {
        if (a == 0) {
            return;
        }

        int arrLength = calculateArrLength(ab, 0);
        System.out.println(arrLength);
        if (arrLength > index)
            ab[index] = a % 10;
        getNumber2(a / 10, ab, index + 1);

        Arrays.stream(ab).forEach(System.out::println);
    }

    public int[] getNumber3(int a, int[] ab, int arrLength) {
        if (a == 0) {
            return ab;
        }

        System.out.println(arrLength);
        if (arrLength - 1 >= 0)
            ab[arrLength - 1] = a % 10;
        return getNumber3(a / 10, ab, arrLength - 1);
    }

    public int[] getNumber4(int a, int[] ab, int arrLength, int index) {
        if (a == 0) {
            return ab;
        }

//        System.out.println(arrLength);
        if (arrLength - 1 >= 0)
            ab[index] = a % 10;
        return getNumber4(a / 10, ab, arrLength - 1, index + 1);
    }

    public int calculateArrLength(int[] inputArr, int index) {
        try {
            int arrElement = inputArr[index];
        } catch (ArrayIndexOutOfBoundsException aIOOBE) {
            return 0;
        }
        return 1 + calculateArrLength(inputArr, index + 1);
    }

    public int calculateNumberLength(int number) {
        if (number == 0)
            return 0;
        return 1 + calculateNumberLength(number / 10);
    }

    public int [] finalSolution(int[] a, int[] b) {
        if (calculateArrLength(a,0) == calculateArrLength(b,0) && calculateArrLength(a,0)==1 && a[0]==b[0] && a[0]==0)
            return a;
        int sumOfArray = getNumber1(a.length - 1, a) + getNumber1(b.length - 1, b);
        int finalArrayLength = calculateNumberLength(sumOfArray);
        return getNumber4(sumOfArray, new int [finalArrayLength], finalArrayLength, 0);
    }
}
