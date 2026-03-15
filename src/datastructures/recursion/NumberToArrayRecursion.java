package datastructures.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NumberToArrayRecursion {

    // Main public method to start the conversion
    public static int[] convertNumberToArray(int number) {
        // Handle the case for zero separately
        if (number == 0) {
            return new int[]{0};
        }
        // Handle negative numbers (optional: converts to positive for digit extraction)
        if (number < 0) {
            number = Math.abs(number);
        }

        List<Integer> digits = new ArrayList<>();
        // Call the recursive helper function
        convertToArrayListRecursive(number, digits);

        // Convert the ArrayList<Integer> to a primitive int[]
        int[] result = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            result[i] = digits.get(i);
        }
        return result;
    }

    // Recursive helper method that builds the list of digits in reverse order
    private static void convertToArrayListRecursive(int number, List<Integer> digits) {
        // Base case: Stop when the number becomes 0
        if (number == 0) {
            return;
        }

        // Recursive step: Call the function with the number divided by 10
        convertToArrayListRecursive(number / 10, digits);

        // Get the last digit (remainder) and add it to the list
        // This operation happens on the "return trip" of the recursion, ensuring correct order
        digits.add(number % 10);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        int number1 = 12345;
        int[] array1 = convertNumberToArray(number1);
        System.out.println("Number: " + number1 + ", Array: " + Arrays.toString(array1));

        int number2 = 0;
        int[] array2 = convertNumberToArray(number2);
        System.out.println("Number: " + number2 + ", Array: " + Arrays.toString(array2));

        int number3 = -987;
        int[] array3 = convertNumberToArray(number3);
        System.out.println("Number: " + number3 + ", Array: " + Arrays.toString(array3));
    }
}
