package datastructures.recursion;

public class RecursionExample2ConvertDecimalToBinary {
    static void main() {
        int decimalNumber1 = 228;
        int decimalNumber2 = 229;
        int decimalNumber3 = 239;
        convertDecimalToBinary(130);
        String reverseBinaryString = sb.reverse().toString();
        System.out.println(reverseBinaryString);
        System.out.println("====================");
        System.out.println(convertDecimalToBinaryAppr2("",130));

    }
    static StringBuilder sb = new StringBuilder();
    static void convertDecimalToBinary(int decimalNumber) {
        if(decimalNumber == 0)
            return ;
        sb.append(String.valueOf(decimalNumber%2));
        convertDecimalToBinary(decimalNumber/2);
    }

    /**
     * Has incorrect usage of stack while pushing in stack the call birStr is constructing correctly but while pop of stack
     * its reducing it back to initial birStr i.e. 1
     * @param binStr
     * @param decimalNumber
     * @return
     */
    @Deprecated
    static String convertDecimalToBinaryApprIncorrect(String binStr,int decimalNumber) {
        if(decimalNumber == 0)
            return binStr;
        binStr = binStr.concat(String.valueOf(decimalNumber%2));
        convertDecimalToBinaryAppr2(binStr,decimalNumber/2);
        return binStr;
    }

    /**
     * The bug was that the recursive call's result is never used — binStr is reassigned locally but the updated value from the recursion is discarded.
     *
     * buggy Impl:
     * fix this method =>
     *
     * ```
     * static String convertDecimalToBinaryApprIncorrect(String binStr,int decimalNumber) {
     *     if(decimalNumber == 0)
     *         return binStr;
     *     binStr = binStr.concat(String.valueOf(decimalNumber%2));
     *     convertDecimalToBinaryAppr2(binStr,decimalNumber/2);
     *     return binStr;
     * }
     * ```
     * @param binStr
     * @param decimalNumber
     * @return
     */
    static String convertDecimalToBinaryAppr2(String binStr,int decimalNumber) {
        if(decimalNumber == 0)
            return binStr;
        return convertDecimalToBinaryAppr2(String.valueOf(decimalNumber%2),decimalNumber/2).concat(binStr);
    }

   /* static String printAllRemainders(int decimalNumber) {
       String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Expected Binary String: " + binaryString);
        StringBuilder actualBinaryString = new StringBuilder();
        while (decimalNumber != 0) {
           decimalNumber/=2;
           actualBinaryString.append(decimalNumber%2);
           System.out.println(actualBinaryString.toString());
       }
        return actualBinaryString.toString();
    }*/
}
