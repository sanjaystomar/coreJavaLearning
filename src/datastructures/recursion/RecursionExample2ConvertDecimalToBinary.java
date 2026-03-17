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
        System.out.println("====================");
        System.out.println(convertDecimalToBinaryIterative(130));


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

  static String convertDecimalToBinaryIterative(int decimalNumber) {
        String binStr = "";
        while (decimalNumber > 0) {
            binStr = String.valueOf(decimalNumber%2).concat(binStr);
            decimalNumber=decimalNumber/2;
        }
        return binStr;
  }
}
