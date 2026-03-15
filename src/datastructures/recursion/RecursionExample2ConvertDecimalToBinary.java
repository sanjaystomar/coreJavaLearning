package datastructures.recursion;

public class RecursionExample2ConvertDecimalToBinary {
    static void main() {
        int decimalNumber1 = 228;
        int decimalNumber2 = 229;
        int decimalNumber3 = 239;
        printAllRemainders(127);
    }

    static String convertDecimalToBinary(int remainder, int decimalNumber) {
//        if(remainder == 0)
            return null;
    }

    static String printAllRemainders(int decimalNumber) {
       String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Expected Binary String: " + binaryString);
        StringBuilder actualBinaryString = new StringBuilder();
        while (decimalNumber != 0) {
           decimalNumber/=2;
           actualBinaryString.append(decimalNumber%2);
           System.out.println(actualBinaryString.toString());
       }
        return actualBinaryString.toString();
    }
}
